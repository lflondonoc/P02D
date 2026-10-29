import java.util.ArrayList;
import java.util.List;

public class Cliente extends Persona {
    private String codigoAfiliacion;
    private CategoriaCliente categoria;
    private List<Venta> listaCompras;

    public Cliente(String documento, String nombre, String correo, String telefono,
                   String codigoAfiliacion, CategoriaCliente categoria) {
        super(documento, nombre, correo, telefono);
        this.codigoAfiliacion = codigoAfiliacion;
        this.categoria = categoria;
        listaCompras = new ArrayList<>();
    }

    public String getCodigoAfiliacion() { return codigoAfiliacion; }
    public void setCodigoAfiliacion(String codigoAfiliacion) { this.codigoAfiliacion = codigoAfiliacion; }
    public CategoriaCliente getCategoria() { return categoria; }
    public void setCategoria(CategoriaCliente categoria) { this.categoria = categoria; }
    public List<Venta> getListaCompras() { return listaCompras; }

    public boolean agregarCompra(Venta venta) {
        boolean agregada = false;
        boolean repetida = false;
        for (Venta compra : listaCompras) {
            if (compra == venta) {
                repetida = true;
            }
        }
        if (!repetida && venta.getCliente() == this && venta.isConfirmada()) {
            listaCompras.add(venta);
            agregada = true;
        }
        return agregada;
    }

    public double calcularPrecioFinal(double precioConRecargo) {
        double precio = precioConRecargo * (1 - categoria.getDescuento());
        return precio;
    }
}
