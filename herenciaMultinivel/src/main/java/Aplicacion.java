public class Aplicacion {
    static void main() {

        Vehiculo v1= new Carro("Ferrarri",4,2);
        System.out.println("------CARRO-----");
        v1.arrancar();
        v1.mostrarDatos();

        System.out.println();

        Barco v3= new Barco("Yamaha",23.6, 200);
        System.out.println("------BARCO------");
        v3.arrancar();
        v3.mostrarDatos();

        System.out.println();

        Vehiculo v4= new Moto("KTM",2, 890);
        System.out.println("------MOTO------");
        v4.mostrarDatos();
        v4.arrancar();
    }
}
