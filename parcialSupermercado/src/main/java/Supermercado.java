import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Supermercado {
    private String nombre;
    private String direccion;
    private String telefono;

    private List<Cliente> listaClientes;
    private List<Producto> listaProductos;
    private List<Compra> listaCompras;

    public Supermercado(String nombre, String direccion, String telefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;

        listaClientes= new LinkedList<>();
        listaProductos= new LinkedList<>();
        listaCompras= new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public List<Cliente> getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(List<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }

    public List<Producto> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(List<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }

    public List<Compra> getListaCompras() {
        return listaCompras;
    }

    public void setListaCompras(List<Compra> listaCompras) {
        this.listaCompras = listaCompras;
    }
    //======Clientes=======
    public boolean verificarCliente(String documento){
        boolean existeCliente= false;
        for (Cliente cliente: listaClientes){
            if(cliente.getDocumento().equals(documento)){
                existeCliente= true;
                break;
            }
        }
        return existeCliente;
    }
    public boolean agregarCliente(Cliente cliente){
        boolean clienteAgregado= false;
        boolean existeCliente= verificarCliente(cliente.getDocumento());
        if (!existeCliente){
            listaClientes.add(cliente);
            clienteAgregado=true;
        }
        return clienteAgregado;
    }

    //=====Productos=======
    public boolean verificarProducto(String codigo){
        boolean existeCliente= false;
        for (Producto producto: listaProductos){
            if(producto.getCodigo().equals(codigo)){
                existeCliente= true;
                break;
            }
        }
        return existeCliente;
    }
    public boolean agregarProducto(Producto producto){
        boolean productoAgregado= false;
        boolean existeProducto= verificarProducto(producto.getCodigo());
        if (!existeProducto){
            listaProductos.add(producto);
            productoAgregado=true;
        }
        return productoAgregado;
    }
    //======Compras========
    public boolean verificarCompra(String codigo){
        boolean existeCompra= false;
        for (Compra compra: listaCompras){
            if(compra.getCodigo().equals(codigo)){
                existeCompra= true;
                break;
            }
        }
        return existeCompra;
    }
    public boolean agregarCompra(Compra compra){
        boolean compraAgregado= false;
        boolean existeCompra= verificarCompra(compra.getCodigo());
        if (!existeCompra){
            listaCompras.add(compra);
            compraAgregado=true;
        }
        return compraAgregado;
    }
    @Override
    public String toString() {
        return "Supermercado: '" + nombre +
                ", direccion: " + direccion +
                ", telefono: " + telefono +
                ", listaClientes: " + listaClientes +
                ", listaProductos: " + listaProductos +
                ", listaCompras: " + listaCompras;
    }
}
