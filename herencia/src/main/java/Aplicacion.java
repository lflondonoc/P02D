public class Aplicacion {
    static void main() {

        Cliente cliente= new Cliente("Juan", 20, "123","juan@gmail.com");

        Empleado empleado= new Empleado("Camila",18,"456",3500000);

        cliente.mostrarNombre();
        empleado.mostrarNombre();

    }


}
