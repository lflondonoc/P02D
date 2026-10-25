public class Alquiler {
    private String fecha;
    private int codigo;
    private int dias;
    private Vehiculo vehiculo;
    private Persona persona;

    public Alquiler(String fecha, int codigo, int dias, Vehiculo vehiculo, Persona persona) {
        this.fecha = fecha;
        this.codigo = codigo;
        this.dias = dias;
        this.vehiculo = vehiculo;
        this.persona = persona;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }
    //Método para calcular el total del alquiler
    public double calcularTotalAlquiler(){
        double totalAlquiler= vehiculo.calcularTarifa(dias);
        return totalAlquiler;
    }

    @Override
    public String toString() {
        return "Alquiler: " +
                "fecha: " + fecha +
                ", codigo: " + codigo +
                ", dias: " + dias +
                ", vehiculo: " + vehiculo +
                ", persona: " + persona;
    }
}
