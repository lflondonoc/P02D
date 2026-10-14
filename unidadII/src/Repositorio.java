import java.util.Locale;
import java.util.Scanner;

public class Repositorio {

    //Función para ingresar un número entero
    public static int ingresarEntero(String mensaje){
        Scanner sc= new Scanner(System.in);
        System.out.print(mensaje);
        int numero= sc.nextInt();
        return numero;
    }
    //Función para ingresar un número decimal
    public static double ingresarDecimal(String mensaje){
        Scanner sc= new Scanner(System.in);
        System.out.print(mensaje);
        double numero= sc.nextDouble();
        return numero;
    }
    //Función para ingresar una cadena de texto
    public static String ingresarTexto(String mensaje){
        Scanner sc= new Scanner(System.in);
        System.out.print(mensaje);
        String texto= sc.nextLine().toLowerCase();
        return texto;
    }
    //Función para ingresa un caracter
    public static char ingresarCaracter(String mensaje){
        Scanner sc= new Scanner(System.in);
        System.out.print(mensaje);
        char caracter= sc.nextLine().charAt(0);
        return caracter;
    }

    //Función para ingresar valor booleano
    public static boolean ingresarBooleano(String mensaje){
        Scanner sc= new Scanner(System.in);
        System.out.print(mensaje);
        boolean dato= sc.nextBoolean();
        return dato;
    }
    //Función para imprimir un mensaje
    public static void mostrarMensaje(String mensaje){
        System.out.println(mensaje);
    }

}

