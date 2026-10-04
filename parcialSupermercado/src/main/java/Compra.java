import java.time.LocalDate;
import java.util.LinkedList;


public class Compra {


    private String codigo;
    private LocalDate fecha;
    private MetodoPago metodoPago;
    private double valorTotal;

    private LinkedList<Producto> productos;


    public Compra(String codigo, LocalDate fecha, MetodoPago metodoPago) {
        this.codigo = codigo;
        this.fecha = fecha;
        this.metodoPago = metodoPago;
        this.valorTotal = 0;

        productos = new LinkedList<>();

    }

    public String getCodigo() {
        return codigo;
    }


    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public MetodoPago getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(MetodoPago metodoPago) {
        this.metodoPago = metodoPago;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public LinkedList<Producto> getProductos() {
        return productos;
    }

    // Verificar si el producto ya está en la compra
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

    // Agregar producto a la compra con cantidad
    public boolean agregarProducto(Producto producto, int cantidad) {
        boolean agregado = false;
        boolean existe = verificarProducto(producto.getCodigo());
        if(!existe) {
            if(producto.verificarDisponibilidad(cantidad)) {
                producto.setCantidadCompra(cantidad);
                producto.actualizarDisponibilidad(cantidad);
                productos.add(producto);
                agregado = true;
            }
        }
        return agregado;
    }


    // Calcular valor total de la compra
    public double calcularTotal() {
        double total = 0;
        for(Producto producto : productos) {
            total += producto.getPrecioUnitario() * producto.getCantidadCompra();
        }
        valorTotal = total;
        return valorTotal;
    }


    @Override
    public String toString() {
        String informacion =
                "Código: " + codigo +
                        "\nFecha: " + fecha +
                        "\nMétodo de pago: " + metodoPago +
                        "\nValor total: $" + valorTotal +
                        "\nProductos:";

        for(Producto producto : productos) {
            informacion +=  "\n- " + producto.getNombre() +
                            " | Cantidad: " + producto.getCantidadCompra()
                            + " | Subtotal: $" + (producto.getPrecioUnitario() * producto.getCantidadCompra());
        }
        return informacion;
    }


}