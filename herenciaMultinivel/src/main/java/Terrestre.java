public class Terrestre extends Vehiculo{
    private int numeroRuedas;

    public Terrestre(String marca, int numeroRuedas) {
        super(marca);
        this.numeroRuedas = numeroRuedas;
    }
    public void conducir(){
        System.out.println("Número de ruedas: "+numeroRuedas);
    }

}
