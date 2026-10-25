public class Motocicleta extends Vehiculo{
    private int cilindraje;

    public Motocicleta(String placa, String marca, String modelo, String anio, EstadoVehiculo estadoVehiculo, int cilindraje) {
        super(placa, marca, modelo, anio, estadoVehiculo);
        this.cilindraje = cilindraje;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }

    @Override
    public double calcularTarifa(int dias) {
        double tarifa= (TARIFA*dias)-((TARIFA*dias)*0.10);
        return tarifa;
    }

    @Override
    public String toString() {
        return "Motocicleta: "+super.toString()+
                ", cilindraje: "+cilindraje;
    }
}
