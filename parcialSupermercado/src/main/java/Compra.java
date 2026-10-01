import java.time.LocalDate;
import java.util.List;

public class Compra {
    private String codigo;
    private LocalDate fecha;
    private MetodoPago metodoPago;
    private double valor;

    private List<Producto> listaProductos;

    public Compra(String codigo, LocalDate fecha, MetodoPago metodoPago, double valor, List<Producto> listaProductos) {
        this.codigo = codigo;
        this.fecha = fecha;
        this.metodoPago = metodoPago;
        this.valor = valor;
        this.listaProductos = listaProductos;
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

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public List<Producto> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(List<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }
}
