public class Aplicacion {
    static void main() {

        Cliente cliente= new Cliente("Ana", "123",20, "ana@gmail.com");

        Empleado empleado= new Empleado("Juan", "456", 25,230000, CargoEmpleado.CAJERO);

        ClienteEmpleado clienteEmpleado= new ClienteEmpleado("Martín", "789",28,"mt@gmail.com", CargoEmpleado.GERENTE);

        System.out.println("===Cliente===");
        System.out.println(cliente.toString());

        System.out.println("===Empleado===");
        System.out.println(empleado.toString());

        System.out.println("===Cliente Empleado===");
        System.out.println(clienteEmpleado.toString());

    }
}
