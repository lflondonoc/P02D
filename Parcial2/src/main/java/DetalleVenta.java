public class DetalleVenta {
    private Inventario inventario;
    private Venta venta;
    private int cantidadComprada;
    private double precioUnitarioFinal;
    private double subtotal;

    public DetalleVenta(Inventario inventario, Venta venta, int cantidadComprada) {
        this.inventario = inventario;
        this.venta = venta;
        this.cantidadComprada = cantidadComprada;
        precioUnitarioFinal = venta.getCliente().calcularPrecioFinal(
                inventario.getPrenda().calcularPrecioConRecargo());
        subtotal = calcularSubtotal();
    }

    public Inventario getInventario() { return inventario; }
    public Venta getVenta() { return venta; }
    public int getCantidadComprada() { return cantidadComprada; }
    public double getPrecioUnitarioFinal() { return precioUnitarioFinal; }
    public double getSubtotal() { return subtotal; }

    public double calcularSubtotal() {
        double valor = precioUnitarioFinal * cantidadComprada;
        return valor;
    }

    public String toString() {
        return inventario.getPrenda().getNombre() + " - " + inventario.getTalla()
                + " - " + inventario.getColor() + " - " + cantidadComprada
                + " unidades - subtotal: $" + subtotal;
    }
}
