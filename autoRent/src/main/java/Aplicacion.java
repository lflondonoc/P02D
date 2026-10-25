public class Aplicacion {
    static void main() {

        //Crear empresa
        Empresa empresa= new Empresa("AutoRent","Armenia");

        //Registrar clientes y turistas
        Turista turista= new Turista("Carlos","Carlos@gmail.com", "123", "Turista");

        Residente residente= new Residente("Ana", "ana@gmaill.com","456", "Armenia");

        empresa.agregarPersona(turista);
        empresa.agregarPersona(residente);

        //Registrar vehiculos
        Automovil automovil= new Automovil("ABC123", "Toyota","2023", "Corolla",EstadoVehiculo.BUENO ,4);

        Motocicleta motocicleta= new Motocicleta("DFC453", "Yamaha", "fz", "2022", EstadoVehiculo.BUENO, 900);

        Camioneta camioneta= new Camioneta("ETR602", "Ford", "Ranger", "2024", EstadoVehiculo.MALO, 1000);

        empresa.agregarVehiculo(automovil);
        empresa.agregarVehiculo(motocicleta);
        empresa.agregarVehiculo(camioneta);

        //Consultar clientes y vehiculos
        System.out.println("===Cientes===");
        for (Persona persona: empresa.consultarPersonas()){
            System.out.println(persona);
        }
        System.out.println("===Vehiculos===");
        for(Vehiculo vehiculo: empresa.consultarVehiculos()){
            System.out.println(vehiculo);
        }

        //Registrar alquileres
        Alquiler alquiler1= new Alquiler("21/10/2016", 101,3, automovil, turista);

        Alquiler alquiler2= new Alquiler("21/10/2016", 102,5, motocicleta, residente);

        Alquiler alquiler3= new Alquiler("21/10/2016", 103,10, camioneta, turista);

        empresa.agregarAlquiler(alquiler1);
        empresa.agregarAlquiler(alquiler2);
        empresa.agregarAlquiler(alquiler3);

        //Consultar y moctrar el costo total de los alquileres
        System.out.println("===Alquileres===");
        for (Alquiler alquiler: empresa.consultarAlquiler()){
            System.out.println(alquiler);
        }

        //Consultar los alquileres de un cliente
        System.out.println("===Alquileres de un cliente===");
        for (Alquiler alquiler: empresa.consultarAlquilerCliente("123")){
            System.out.println(alquiler);
        }

    }
}
