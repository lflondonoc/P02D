import java.time.LocalDate;
import java.util.LinkedList;

public class Supermercado {

    private String nombreComercial;
    private String direccion;
    private String telefono;

    private LinkedList<Cliente> clientes;
    private LinkedList<Producto> productos;
    private LinkedList<Compra> compras;


    public Supermercado(String nombreComercial, String direccion, String telefono) {
        this.nombreComercial = nombreComercial;
        this.direccion = direccion;
        this.telefono = telefono;

        clientes = new LinkedList<>();
        productos = new LinkedList<>();
        compras = new LinkedList<>();
    }


    public String getNombreComercial() {
        return nombreComercial;
    }

    public void setNombreComercial(String nombreComercial) {
        this.nombreComercial = nombreComercial;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public LinkedList<Cliente> getClientes() {
        return clientes;
    }

    public LinkedList<Producto> getProductos() {
        return productos;
    }

    public LinkedList<Compra> getCompras() {
        return compras;
    }

    // ==========================
    // CLIENTES
    // ==========================

    public boolean verificarCliente(String documento) {
        boolean existe = false;
        for(Cliente cliente : clientes) {
            if(cliente.getDocumento().equals(documento)) {
                existe = true;
                break;
            }
        }
        return existe;
    }

    public boolean agregarCliente(Cliente cliente) {
        boolean agregado = false;
        boolean existe = verificarCliente(cliente.getDocumento());
        if(existe == false) {
            clientes.add(cliente);
            agregado = true;
        }
        return agregado;
    }

    // ==========================
    // PRODUCTOS
    // ==========================
    public boolean verificarProducto(String codigo) {
        boolean existe = false;
        for(Producto producto : productos) {
            if(producto.getCodigo().equals(codigo)) {
                existe = true;
                break;
            }
        }
        return existe;
    }

    public boolean agregarProducto(Producto producto) {
        boolean agregado = false;
        boolean existe = verificarProducto(producto.getCodigo());
        if(existe == false) {
            productos.add(producto);
            agregado = true;
        }
        return agregado;
    }

    // ==========================
    // COMPRAS
    // ==========================
    public boolean verificarCompra(String codigo) {
        boolean existe = false;
        for(Compra compra : compras) {
            if(compra.getCodigo().equals(codigo)) {
                existe = true;
                break;
            }
        }
        return existe;
    }

    public boolean agregarCompra(Compra compra) {
        boolean agregado = false;
        boolean existe = verificarCompra(compra.getCodigo());
        if(existe == false) {
            compras.add(compra);
            agregado = true;
        }
        return agregado;
    }

    // ==========================
    // REPORTES
    // ==========================
    public double calcularVentasFecha(LocalDate fecha) {
        double total = 0;
        for(Compra compra : compras) {
            if(compra.getFecha().equals(fecha)) {
                total += compra.getValorTotal();
            }
        }
        return total;
    }

    @Override
    public String toString() {

        return "Supermercado: " + nombreComercial +
                "\nDirección: " + direccion +
                "\nTeléfono: " + telefono +
                "\nClientes registrados: " + clientes.size() +
                "\nProductos registrados: " + productos.size() +
                "\nCompras registradas: " + compras.size();
    }
}