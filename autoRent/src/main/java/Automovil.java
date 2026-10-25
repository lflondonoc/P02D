public class Automovil extends Vehiculo{
    private int numeroPuertas;

    public Automovil(String placa, String marca, String modelo, String anio, EstadoVehiculo estadoVehiculo, int numeroPuertas) {
        super(placa, marca, modelo, anio, estadoVehiculo);
        this.numeroPuertas = numeroPuertas;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    @Override
    public double calcularTarifa(int dias) {
        double tarifa= (TARIFA+20000)*dias;
        return tarifa;
    }

    @Override
    public String toString() {
        return "Automovil: "+super.toString()+
                ", número de puertas: "+numeroPuertas;
    }
}
