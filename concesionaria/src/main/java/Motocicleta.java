public class Motocicleta extends Vehiculo{
    private int numeroRuedad;
    private String tipoManillar;

    public Motocicleta(int velocidad, double capacidadCombustible, int numeroRuedad, String tipoManillar) {
        super(velocidad, capacidadCombustible);
        this.numeroRuedad = numeroRuedad;
        this.tipoManillar = tipoManillar;
    }

    public int getNumeroRuedad() {
        return numeroRuedad;
    }

    public void setNumeroRuedad(int numeroRuedad) {
        this.numeroRuedad = numeroRuedad;
    }

    public String getTipoManillar() {
        return tipoManillar;
    }

    public void setTipoManillar(String tipoManillar) {
        this.tipoManillar = tipoManillar;
    }

    @Override
    public String arrancarVehiculo() {
        return "La motocicleta arrancó....";
    }

    @Override
    public String toString() {
        return super.toString()+
                ", numeroRuedas: " + numeroRuedad +
                ", tipoManillar: " + tipoManillar;
    }
}
