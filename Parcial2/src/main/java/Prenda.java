import java.util.ArrayList;
import java.util.List;

public class Prenda {
    private String codigo;
    private String nombre;
    private String marca;
    private double precioBase;
    private CategoriaPrenda categoria;
    // Relaciones con los inventarios de las diferentes sucursales.
    private List<Inventario> listaInventarios;

    public Prenda(String codigo, String nombre, String marca, double precioBase, CategoriaPrenda categoria) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.marca = marca;
        this.precioBase = precioBase;
        this.categoria = categoria;
        listaInventarios = new ArrayList<>();
    }

    public String getCodigo() { return codigo; }
    public void setCodigo(String codigo) { this.codigo = codigo; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }
    public double getPrecioBase() { return precioBase; }
    public void setPrecioBase(double precioBase) { this.precioBase = precioBase; }
    public CategoriaPrenda getCategoria() { return categoria; }
    public void setCategoria(CategoriaPrenda categoria) { this.categoria = categoria; }
    public List<Inventario> getListaInventarios() { return listaInventarios; }

    public double calcularPrecioConRecargo() {
        double precio = precioBase + precioBase * categoria.getRecargo();
        return precio;
    }

    public boolean validarTalla(String talla) {
        boolean valida = false;
        if (categoria == CategoriaPrenda.CALZADO) {
            for (int numero = 35; numero <= 44; numero++) {
                if (talla.equals(String.valueOf(numero))) {
                    valida = true;
                }
            }
        } else {
            if (talla.equalsIgnoreCase("XS") || talla.equalsIgnoreCase("S")
                    || talla.equalsIgnoreCase("M") || talla.equalsIgnoreCase("L")
                    || talla.equalsIgnoreCase("XL")) {
                valida = true;
            }
        }
        return valida;
    }

    // Mantener la relación Prenda-Inventario sin agregar registros repetidos.
    public boolean agregarInventario(Inventario inventario) {
        boolean agregado = false;
        boolean existe = false;
        for (Inventario actual : listaInventarios) {
            if (actual == inventario) {
                existe = true;
            }
        }
        if (!existe && inventario.getPrenda() == this) {
            listaInventarios.add(inventario);
            agregado = true;
        }
        return agregado;
    }

    public int calcularUnidadesVendidas() {
        int cantidad = 0;
        for (Inventario inventario : listaInventarios) {
            for (DetalleVenta detalle : inventario.getListaDetallesVendidos()) {
                cantidad += detalle.getCantidadComprada();
            }
        }
        return cantidad;
    }

    public String toString() {
        return codigo + " - " + nombre + " - " + categoria + " - $" + precioBase;
    }
}
