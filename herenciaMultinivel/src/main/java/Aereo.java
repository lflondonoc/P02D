public class Aereo extends Vehiculo{
    private double altitud;

    public Aereo(String marca, double altitud) {
        super(marca);
        this.altitud = altitud;
    }

    public double getAltitud() {
        return altitud;
    }

    public void setAltitud(double altitud) {
        this.altitud = altitud;
    }
    public void volar(){
        System.out.println("Altitud máxima: "+altitud);
    }
}
