public class Aplicacion {
    static void main() {
        Camion camion= new Camion(120, 230, 120,2,"manual");
        Motocicleta motocicleta= new Motocicleta(120, 230, 2, "tipo");
        Automovil automovil= new Automovil(120, 230, 2, TipoTransicion.MANUAL);

        System.out.println(camion.toString());;
        System.out.println(camion.arrancarVehiculo());
    }
}
