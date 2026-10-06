public class Camion extends Vehiculo{
    private double capacidadCarga;
    private int numeroEjes;
    private String tipoCarga;

    public Camion(int velocidad, double capacidadCombustible, double capacidadCarga, int numeroEjes, String tipoCarga) {
        super(velocidad, capacidadCombustible);
        this.capacidadCarga = capacidadCarga;
        this.numeroEjes = numeroEjes;
        this.tipoCarga = tipoCarga;
    }

    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(double capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    public int getNumeroEjes() {
        return numeroEjes;
    }

    public void setNumeroEjes(int numeroEjes) {
        this.numeroEjes = numeroEjes;
    }

    public String getTipoCarga() {
        return tipoCarga;
    }

    public void setTipoCarga(String tipoCarga) {
        this.tipoCarga = tipoCarga;
    }

    @Override
    public String arrancarVehiculo() {
        return "El camión arrancó.....";
    }

    @Override
    public String toString() {
        return super.toString()+
                ", capacidadCarga: " + capacidadCarga +
                ", numeroEjes: " + numeroEjes +
                ", tipoCarga: " + tipoCarga;
    }
}
