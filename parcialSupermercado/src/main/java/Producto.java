public class Producto {

    private String codigo;
    private String nombre;
    private Categoria categoria;
    private double precioUnitario;
    private int cantidadDisponible;
    private int cantidadCompra;


    public Producto(String codigo, String nombre, Categoria categoria, double precioUnitario, int cantidadDisponible) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.categoria = categoria;
        this.precioUnitario = precioUnitario;
        this.cantidadDisponible = cantidadDisponible;
        this.cantidadCompra = 0;
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

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public int getCantidadDisponible() {
        return cantidadDisponible;
    }

    public void setCantidadDisponible(int cantidadDisponible) {
        this.cantidadDisponible = cantidadDisponible;
    }

    public int getCantidadCompra() {
        return cantidadCompra;
    }

    public void setCantidadCompra(int cantidadCompra) {
        this.cantidadCompra = cantidadCompra;
    }


    // Verificar disponibilidad del producto
    public boolean verificarDisponibilidad(int cantidad) {
        boolean disponible = false;
        if(cantidadDisponible >= cantidad) {
            disponible = true;
        }
        return disponible;
    }

    // Actualizar inventario después de la compra
    public void actualizarDisponibilidad(int cantidad) {
        if(cantidadDisponible >= cantidad) {
            cantidadDisponible = cantidadDisponible - cantidad;
        }
    }

    @Override
    public String toString() {

        return "Código: " + codigo +
                "\nNombre: " + nombre +
                "\nCategoría: " + categoria +
                "\nPrecio unitario: $" + precioUnitario +
                "\nCantidad comprada: " + cantidadCompra +
                "\nCantidad disponible: " + cantidadDisponible;

    }

}