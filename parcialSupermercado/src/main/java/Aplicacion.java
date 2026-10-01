import java.util.Scanner;

public class Aplicacion {
    static void main() {

        Scanner sc= new Scanner(System.in);

        Supermercado supermercado= new Supermercado("Marketplus", "Armenia", "31234543223");

        int opcion;
        do{
            System.out.println("==========MENÚ MARKETPLUS==========");

            System.out.println("\n ----Clientes-----");
            System.out.println("1. Agregar clientes.");
            System.out.println("2. Mostrar clientes.");

            System.out.println("\n ----Productos-----");
            System.out.println("3. Agregar productos.");
            System.out.println("4. Mostrar productos.");

            System.out.println("\n ----Compras-----");
            System.out.println("5. Crear compra.");
            System.out.println("6. Agregar producto a compra.");
            System.out.println("7. Calcular total de la compra.");
            System.out.println("8. Mostrar compras.");

            System.out.println("\n ----Reportes-----");
            System.out.println("9. Calcular ventas por fecha.");

            System.out.println("\n0. Salir.");

            System.out.println("\n Seleccione una opción: ");
            opcion= sc.nextInt();
            sc.nextLine();

            switch (opcion){
                case 1:
                    System.out.println("====CLiente=====");
                    System.out.print("Documento: ");
                    String documento= sc.nextLine();

                    System.out.print("Nombre: ");
                    String nombre= sc.nextLine();

                    System.out.print("Teléfono: ");
                    String telefono= sc.nextLine();

                    System.out.print("Correo: ");
                    String correo= sc.nextLine();

                    Cliente cliente= new Cliente(nombre, documento,telefono,correo);
                    if(supermercado.agregarCliente(cliente)){
                        System.out.println("El cliente fue agregado correctamente.");
                    }else{
                        System.out.println("El cliente ya existe.");
                    }
                    break;

                case 2:
                    if(supermercado.getListaClientes().size()==0){
                        System.out.println("No existen clientes registrados.");
                    }else{
                        for(Cliente listaCliente: supermercado.getListaClientes()){
                            System.out.println(listaCliente);
                            System.out.println("----------------");
                        }
                    }
                    break;

                case 3:

                    break;

                case 4:

                    break;
                case 5:

                    break;
                case 6:

                    break;
                case 7:

                    break;
                case 8:

                    break;
                case 9:

                    break;
                case 0:
                    System.out.println("Programa finalizado.");
                    break;
                default:
                    System.out.println("Opción no vpalida.");
            }
        }while (opcion!=0);
        sc.close();

    }
}
