public abstract class Vehiculo {
    private int velocidad;
    private double capacidadCombustible;

    public Vehiculo(int velocidad, double capacidadCombustible) {
        this.velocidad = velocidad;
        this.capacidadCombustible = capacidadCombustible;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public double getCapacidadCombustible() {
        return capacidadCombustible;
    }

    public void setCapacidadCombustible(double capacidadCombustible) {
        this.capacidadCombustible = capacidadCombustible;
    }

    @Override
    public String toString() {
        return "velocidad: " + velocidad +
                ", capacidadCombustible: " + capacidadCombustible;
    }
    public abstract String arrancarVehiculo();
}
