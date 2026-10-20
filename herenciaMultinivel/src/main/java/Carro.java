public class Carro extends Terrestre{
    private int numeroPuertas;

    public Carro(String marca, int numeroRuedas, int numeroPuertas) {
        super(marca, numeroRuedas);
        this.numeroPuertas = numeroPuertas;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    @Override
    public void arrancar() {
        System.out.println("El carro esta arrancando.....");
    }

    @Override
    public void mostrarDatos() {
        System.out.println("----Datos del carro----");
        System.out.println("Marca: "+getMarca());
        System.out.println("Número puertas: "+numeroPuertas);
    }
}
