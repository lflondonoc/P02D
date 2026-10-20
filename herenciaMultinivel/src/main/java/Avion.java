public class Avion extends Aereo{
    private int capacidadPasajeros;

    public Avion(String marca, double altitud, int capacidadPasajeros) {
        super(marca, altitud);
        this.capacidadPasajeros = capacidadPasajeros;
    }

    public int getCapacidadPasajeros() {
        return capacidadPasajeros;
    }

    public void setCapacidadPasajeros(int capacidadPasajeros) {
        this.capacidadPasajeros = capacidadPasajeros;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("-----Mostrando datos del avión-----");
        System.out.println("Altitud: "+getAltitud());
    }
}
