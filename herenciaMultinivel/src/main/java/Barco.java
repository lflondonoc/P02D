public class Barco extends Acuatico{
    private int cantidadPasajeros;

    public Barco(String marca, double profundidad, int cantidadPasajeros) {
        super(marca, profundidad);
        this.cantidadPasajeros = cantidadPasajeros;
    }

    public int getCantidadPasajeros() {
        return cantidadPasajeros;
    }

    public void setCantidadPasajeros(int cantidadPasajeros) {
        this.cantidadPasajeros = cantidadPasajeros;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("---Mostrando datos del barco---");
        System.out.println("Marca: "+getMarca());
        System.out.println("Cantidad de pasajeros: "+cantidadPasajeros);
    }

    @Override
    public void arrancar() {
        System.out.println("El barco esta arrancando....");
    }
}
