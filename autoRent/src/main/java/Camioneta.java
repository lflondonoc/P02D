public class Camioneta extends Vehiculo{
    private int capacidadCarga;

    public Camioneta(String placa, String marca, String modelo, String anio, EstadoVehiculo estadoVehiculo, int capacidadCarga) {
        super(placa, marca, modelo, anio, estadoVehiculo);
        this.capacidadCarga = capacidadCarga;
    }

    public int getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(int capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    @Override
    public double calcularTarifa(int dias) {
        double tarifa= (TARIFA+50000)*dias;
        return tarifa;
    }

    @Override
    public String toString() {
        return "Camioneta: "+super.toString()+
                ", capacidad de carga: "+capacidadCarga+" kg.";
    }
}
