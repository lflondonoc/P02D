public class Automovil extends Vehiculo{
    private int numeroPuertas;
    private TipoTransicion tipoTransicion;

    public Automovil(int velocidad, double capacidadCombustible, int numeroPuertas, TipoTransicion tipoTransicion) {
        super(velocidad, capacidadCombustible);
        this.numeroPuertas = numeroPuertas;
        this.tipoTransicion = tipoTransicion;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    @Override
    public String toString() {
        return super.toString()+
                ", numeroPuertas: " + numeroPuertas +
                ", tipoTransicion: " + tipoTransicion;
    }

    @Override
    public String arrancarVehiculo() {
        return "EL automovil arrancó....";
    }
}
