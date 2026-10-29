import java.util.ArrayList;
import java.util.List;

public class Inventario {
    private Prenda prenda;
    private Sucursal sucursal;
    private String talla;
    private String color;
    private int cantidadDisponible;
    private List<DetalleVenta> listaDetallesVendidos;

    public Inventario(Prenda prenda, Sucursal sucursal, String talla, String color, int cantidadDisponible) {
        this.prenda = prenda;
        this.sucursal = sucursal;
        this.talla = talla;
        this.color = color;
        this.cantidadDisponible = cantidadDisponible;
        listaDetallesVendidos = new ArrayList<>();
    }

    public Prenda getPrenda() { return prenda; }
    public Sucursal getSucursal() { return sucursal; }
    public String getTalla() { return talla; }
    public String getColor() { return color; }
    public int getCantidadDisponible() { return cantidadDisponible; }
    public List<DetalleVenta> getListaDetallesVendidos() { return listaDetallesVendidos; }

    public boolean verificarDisponibilidad(int cantidad) {
        boolean disponible = false;
        if (cantidad > 0 && cantidad <= cantidadDisponible) {
            disponible = true;
        }
        return disponible;
    }

    public void descontarCantidad(int cantidad) {
        if (verificarDisponibilidad(cantidad)) {
            cantidadDisponible -= cantidad;
        }
    }

    // Conservar los detalles de las ventas efectivamente confirmadas.
    public boolean agregarDetalleVendido(DetalleVenta detalle) {
        boolean agregado = false;
        boolean repetido = false;
        for (DetalleVenta actual : listaDetallesVendidos) {
            if (actual == detalle) {
                repetido = true;
            }
        }
        if (!repetido && detalle.getInventario() == this
                && detalle.getVenta().isConfirmada()) {
            listaDetallesVendidos.add(detalle);
            agregado = true;
        }
        return agregado;
    }

    @Override
    public String toString() {
        return prenda.getCodigo() + " - " + prenda.getNombre() + " - " + talla
                + " - " + color + " - unidades: " + cantidadDisponible;
    }
}
