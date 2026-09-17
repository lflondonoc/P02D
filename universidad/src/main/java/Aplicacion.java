import java.time.LocalDate;
import java.util.Scanner;

public class Aplicacion {
    static void main() {

        //Menú interactivo

        Scanner sc= new Scanner(System.in);

        Universidad universidad= new Universidad("Universidad del Quindío", "Carrera 15", "Armenia", 31242526);

        int opcion;
        do{
            System.out.println("====== Menú Universidad =======");
            System.out.println("1. Agregar profesor.");
            System.out.println("2. Actualizar profesor.");
            System.out.println("3. Eliminar profesor.");
            System.out.println("4. Mostrar profesores.");

            System.out.println("------------------------------");
            System.out.println("5. Agregar estudiantes.");
            System.out.println("6. Actualizar estudiantes.");
            System.out.println("7. Eliminar estudiantes.");
            System.out.println("8. Mostrar estudiantes.");

            System.out.println("------------------------------");
            System.out.println("9. Agregar cursos.");
            System.out.println("10. Actualizar cursos.");
            System.out.println("11. Eliminar cursos.");
            System.out.println("12. Mostrar cursos.");


            System.out.println("0. Salir.");

            System.out.print("Seleccione la opción: ");
            opcion= sc.nextInt();
            sc.nextLine();

            switch (opcion){

                //=============Profesor
                case 1:
                    System.out.println("------Agregar profesor----");

                    System.out.print("Nombre: ");
                    String nombre= sc.nextLine();

                    System.out.print("Documento: ");
                    int documento= sc.nextInt();

                    System.out.print("Edad: ");
                    int edad= sc.nextInt();

                    System.out.print("Salario: ");
                    double salario= sc.nextDouble();

                    Profesor profesor = new Profesor(nombre, documento,edad,salario);

                    if(universidad.agregarProfesor(profesor)){
                        System.out.println("Profesor agregado correctamente: ");
                    }else{
                        System.out.println("El profesor ya existe..");
                    }
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;

                case 0:
                    System.out.println("Programa finalizado.....");
                    break;
                default:
                    System.out.println("Opción no válida....");
            }

        }while (opcion!=0);

        sc.close();


    }
}
