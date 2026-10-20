public class Moto extends Terrestre{
    private double cilindraje;

    public Moto(String marca, int numeroRuedas, double cilindraje) {
        super(marca, numeroRuedas);
        this.cilindraje = cilindraje;
    }

    public double getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(double cilindraje) {
        this.cilindraje = cilindraje;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("----Datos de la moto---");
        System.out.println("Cilindraje: "+cilindraje);
    }
}
