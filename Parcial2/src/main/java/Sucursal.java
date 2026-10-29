import java.util.ArrayList;
import java.util.List;

public class Sucursal {
    private String codigo;
    private String nombre;
    private String direccion;
    private String ciudad;
    private List<Inventario> listaInventarios;
    private List<Vendedor> listaVendedores;
    private List<Venta> listaVentas;

    public Sucursal(String codigo, String nombre, String direccion, String ciudad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.direccion = direccion;
        this.ciudad = ciudad;
        listaInventarios = new ArrayList<>();
        listaVendedores = new ArrayList<>();
        listaVentas = new ArrayList<>();
    }

    public String getCodigo() { return codigo; }
    public String getNombre() { return nombre; }
    public String getDireccion() { return direccion; }
    public String getCiudad() { return ciudad; }
    public List<Inventario> getListaInventarios() { return listaInventarios; }
    public List<Vendedor> getListaVendedores() { return listaVendedores; }
    public List<Venta> getListaVentas() { return listaVentas; }

    public boolean verificarInventario(Prenda prenda, String talla, String color) {
        boolean existe = false;
        for (Inventario inventario : listaInventarios) {
            if (inventario.getPrenda().getCodigo().equalsIgnoreCase(prenda.getCodigo())
                    && inventario.getTalla().equalsIgnoreCase(talla)
                    && inventario.getColor().equalsIgnoreCase(color)) {
                existe = true;
            }
        }
        return existe;
    }

    public boolean agregarInventario(Prenda prenda, String talla, String color, int cantidad) {
        boolean agregado = false;
        boolean inventarioRepetido = verificarInventario(prenda, talla, color);
        boolean tallaValida = prenda.validarTalla(talla);
        if (!inventarioRepetido && tallaValida && cantidad > 0) {
            Inventario inventario = new Inventario(prenda, this, talla, color, cantidad);
            listaInventarios.add(inventario);
            prenda.agregarInventario(inventario);
            agregado = true;
        }
        return agregado;
    }

    public boolean verificarVendedor(String documento) {
        boolean existe = false;
        for (Vendedor vendedor : listaVendedores) {
            if (vendedor.getDocumento().equalsIgnoreCase(documento)) {
                existe = true;
            }
        }
        return existe;
    }

    public boolean agregarVendedor(Vendedor vendedor) {
        boolean agregado = false;
        boolean vendedorRepetido = verificarVendedor(vendedor.getDocumento());
        if (!vendedorRepetido && vendedor.getSucursal() == this) {
            listaVendedores.add(vendedor);
            agregado = true;
        }
        return agregado;
    }

    public boolean verificarVenta(String codigoVenta) {
        boolean existe = false;
        for (Venta venta : listaVentas) {
            if (venta.getCodigo().equalsIgnoreCase(codigoVenta)) {
                existe = true;
            }
        }
        return existe;
    }

    public boolean registrarVenta(Venta venta) {
        boolean registrada = false;
        boolean ventaRepetida = verificarVenta(venta.getCodigo());
        if (!ventaRepetida && venta.getSucursal() == this) {
            registrada = venta.confirmar();
        }
        return registrada;
    }

    public List<Inventario> consultarDisponibles() {
        List<Inventario> disponibles = new ArrayList<>();
        for (Inventario inventario : listaInventarios) {
            if (inventario.getCantidadDisponible() > 0) {
                disponibles.add(inventario);
            }
        }
        return disponibles;
    }

    public List<Inventario> consultarAgotados() {
        List<Inventario> agotados = new ArrayList<>();
        for (Inventario inventario : listaInventarios) {
            if (inventario.getCantidadDisponible() == 0) {
                agotados.add(inventario);
            }
        }
        return agotados;
    }

    public double calcularIngresos() {
        double ingresos = 0;
        for (Venta venta : listaVentas) {
            ingresos += venta.calcularTotal();
        }
        return ingresos;
    }

    public String toString() {
        return codigo + " - " + nombre + " (" + ciudad + ")";
    }
}
