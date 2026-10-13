import com.sun.source.doctree.EscapeTree;

import java.util.Scanner;

public class Aplicacion {
    static void main() {

        Scanner sc= new Scanner(System.in);

        Proyecto proyecto= new Proyecto("Parques del Quindío....");

        Parque parque1= new Parque("Parque de la vida","recreativo", Municipio.ARMENIA);
        Parque parque2= new Parque("Parque fundadores","familiar", Municipio.ARMENIA);
        Parque parque3= new Parque("Parque del café","recreativo", Municipio.MONTENEGRO);

        proyecto.agregarParque(parque1);
        proyecto.agregarParque(parque2);
        proyecto.agregarParque(parque3);

        int opcion;
        do {
            System.out.println("======PARQUES DEL QUINDÍO======");
            System.out.println("1. Agregar zonas a un parque.");
            System.out.println("2. Listar parques de un municipio.");
            System.out.println("3. Consultar parques por nombre.");
            System.out.println("4. Mostrar valor de un parque.");
            System.out.println("5. Calcular valor total del proyecto.");
            System.out.println("0. Salir.");

            opcion= sc.nextInt();
            sc.nextLine();

            switch (opcion){
                case 1:
                    System.out.println("¿Cuál es el parque?: ");
                    String nombreParque= sc.nextLine();
                    boolean parqueEncontrado=false;

                    for(Parque parque: proyecto.getListaParques()){
                        if(parque.getNombre().equalsIgnoreCase(nombreParque)){
                            parqueEncontrado=true;

                            System.out.println("¿Cuál es el nombre de la zona?:");
                            String nombreZona= sc.nextLine();

                            if(!parque.verificarZona(nombreZona)){
                                System.out.println("¿Qué tipo de figura es la zona?: ");
                                System.out.println("1. Circulo.");
                                System.out.println("2.Cuadrado.");
                                System.out.println("3. Triangulo.");
                                int tipoFigura= sc.nextInt();

                                if(tipoFigura>=1 && tipoFigura<=3){

                                    switch (tipoFigura){
                                        case 1:

                                            break;
                                        case 2:
                                            
                                            break;
                                        default:

                                            break;
                                    }
                                }

                            }






                        }else{
                            System.out.println("El parque no existe...");
                        }
                    }

            }




        }while(opcion!=0);

    }
}
