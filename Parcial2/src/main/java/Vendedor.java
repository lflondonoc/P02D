import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Vendedor extends Persona {
    private String codigoEmpleado;
    private LocalDate fechaContratacion;
    private double salarioBasico;
    private Sucursal sucursal;
    private List<Venta> listaVentas;

    public Vendedor(String documento, String nombre, String correo, String telefono,
                    String codigoEmpleado, LocalDate fechaContratacion,
                    double salarioBasico, Sucursal sucursal) {
        super(documento, nombre, correo, telefono);
        this.codigoEmpleado = codigoEmpleado;
        this.fechaContratacion = fechaContratacion;
        this.salarioBasico = salarioBasico;
        this.sucursal = sucursal;
        listaVentas = new ArrayList<>();
    }

    public String getCodigoEmpleado() { return codigoEmpleado; }
    public void setCodigoEmpleado(String codigoEmpleado) { this.codigoEmpleado = codigoEmpleado; }
    public LocalDate getFechaContratacion() { return fechaContratacion; }
    public void setFechaContratacion(LocalDate fechaContratacion) { this.fechaContratacion = fechaContratacion; }
    public double getSalarioBasico() { return salarioBasico; }
    public void setSalarioBasico(double salarioBasico) { this.salarioBasico = salarioBasico; }
    public Sucursal getSucursal() { return sucursal; }
    public List<Venta> getListaVentas() { return listaVentas; }

    public boolean agregarVenta(Venta venta) {
        boolean agregada = false;
        boolean repetida = false;
        for (Venta actual : listaVentas) {
            if (actual == venta) {
                repetida = true;
            }
        }
        if (!repetida && venta.getVendedor() == this && venta.isConfirmada()) {
            listaVentas.add(venta);
            agregada = true;
        }
        return agregada;
    }
}
