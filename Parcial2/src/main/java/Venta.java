import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Venta {
    private String codigo;
    private LocalDate fecha;
    private Sucursal sucursal;
    private Cliente cliente;
    private Vendedor vendedor;
    private boolean confirmada;
    private List<DetalleVenta> listaDetalles;

    public Venta(String codigo, LocalDate fecha, Sucursal sucursal, Cliente cliente, Vendedor vendedor) {
        this.codigo = codigo;
        this.fecha = fecha;
        this.sucursal = sucursal;
        this.cliente = cliente;
        this.vendedor = vendedor;
        confirmada = false;
        listaDetalles = new ArrayList<>();
    }

    public String getCodigo() { return codigo; }
    public LocalDate getFecha() { return fecha; }
    public Sucursal getSucursal() { return sucursal; }
    public Cliente getCliente() { return cliente; }
    public Vendedor getVendedor() { return vendedor; }
    public boolean isConfirmada() { return confirmada; }
    public List<DetalleVenta> getListaDetalles() { return listaDetalles; }

    public int calcularCantidadSolicitada(Inventario inventario) {
        int cantidad = 0;
        for (DetalleVenta detalle : listaDetalles) {
            if (detalle.getInventario() == inventario) {
                cantidad += detalle.getCantidadComprada();
            }
        }
        return cantidad;
    }

    public boolean verificarInventario(Inventario inventarioBuscado) {
        boolean existe = false;
        for (Inventario inventario : sucursal.getListaInventarios()) {
            if (inventario == inventarioBuscado) {
                existe = true;
            }
        }
        return existe;
    }

    public boolean verificarVendedor() {
        boolean valido = false;
        for (Vendedor actual : sucursal.getListaVendedores()) {
            if (actual == vendedor && vendedor.getSucursal() == sucursal) {
                valido = true;
            }
        }
        return valido;
    }

    public boolean agregarDetalle(Inventario inventario, int cantidad) {
        boolean agregado = false;
        boolean inventarioRegistrado = verificarInventario(inventario);
        if (!confirmada && cantidad > 0 && inventario.getSucursal() == sucursal
                && inventarioRegistrado) {
            DetalleVenta detalle = new DetalleVenta(inventario, this, cantidad);
            listaDetalles.add(detalle);
            agregado = true;
        }
        return agregado;
    }

    public boolean verificarExistencias() {
        boolean valida = true;
        boolean vendedorValido = verificarVendedor();
        if (confirmada || listaDetalles.size() == 0 || !vendedorValido) {
            valida = false;
        }
        for (DetalleVenta detalle : listaDetalles) {
            Inventario inventario = detalle.getInventario();
            int totalSolicitado = calcularCantidadSolicitada(inventario);
            if (detalle.getCantidadComprada() <= 0 || inventario.getSucursal() != sucursal
                    || !verificarInventario(inventario)
                    || !inventario.verificarDisponibilidad(totalSolicitado)) {
                valida = false;
            }
        }
        return valida;
    }

    public double calcularTotal() {
        double total = 0;
        for (DetalleVenta detalle : listaDetalles) {
            total += detalle.getSubtotal();
        }
        return total;
    }

    // Solo Sucursal debe confirmar la compra una vez revisadas todas las condiciones.
    public boolean confirmar() {
        boolean registrada = false;
        if (verificarExistencias()) {
            // Primero validar toda la venta, luego descontar y registrar.
            for (DetalleVenta detalle : listaDetalles) {
                detalle.getInventario().descontarCantidad(detalle.getCantidadComprada());
            }
            // Se confirma una sola vez y luego se actualizan los historiales.
            confirmada = true;
            for (DetalleVenta detalle : listaDetalles) {
                detalle.getInventario().agregarDetalleVendido(detalle);
            }
            sucursal.getListaVentas().add(this);
            cliente.agregarCompra(this);
            vendedor.agregarVenta(this);
            registrada = true;
        }
        return registrada;
    }

    public String toString() {
        return "Venta " + codigo + " - " + fecha + " - total: $" + calcularTotal();
    }
}
