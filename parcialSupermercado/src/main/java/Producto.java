public class Producto {
    private String codigo;
    private String nombre;
    private double precioUnitario;
    private int cantidadDisponible;
    private CategoriaProducto categoriaProducto;
    private int cantidadCompra;

    public Producto(String codigo, String nombre, double precioUnitario, int cantidadDisponible, CategoriaProducto categoriaProducto) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precioUnitario = precioUnitario;
        this.cantidadDisponible = cantidadDisponible;
        this.categoriaProducto = categoriaProducto;
        this.cantidadCompra= cantidadCompra;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public int getCantidad() {
        return cantidadDisponible;
    }

    public void setCantidad(int cantidadDisponible) {
        this.cantidadDisponible = cantidadDisponible;
    }

    public CategoriaProducto getCategoriaProducto() {
        return categoriaProducto;
    }

    public void setCategoriaProducto(CategoriaProducto categoriaProducto) {
        this.categoriaProducto = categoriaProducto;
    }

    public int getCantidadCompra() {
        return cantidadCompra;
    }

    public void setCantidadCompra(int cantidadCompra) {
        this.cantidadCompra = cantidadCompra;
    }

    public int getCantidadDisponible() {
        return cantidadDisponible;
    }

    public void setCantidadDisponible(int cantidadDisponible) {
        this.cantidadDisponible = cantidadDisponible;
    }

    @Override
    public String toString() {
        return  "codigo: " + codigo +
                ", nombre: " + nombre +
                ", precioUnitario: " + precioUnitario +
                ", cantidad: " + cantidadDisponible +
                ", categoriaProducto: " + categoriaProducto;
    }
}
