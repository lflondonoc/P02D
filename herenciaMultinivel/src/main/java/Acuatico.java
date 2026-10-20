public class Acuatico extends Vehiculo{
    private double profundidad;

    public Acuatico(String marca, double profundidad) {
        super(marca);
        this.profundidad = profundidad;
    }
    public void navegar(){
        System.out.println("Profundidad máxima: "+profundidad);
    }
}
