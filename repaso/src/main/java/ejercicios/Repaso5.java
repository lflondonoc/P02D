package ejercicios;

import java.util.Scanner;

public class Repaso5 {
    static void main() {
        //Invocar las funciones
        int cantidad= ingresarNumero("Ingrese la cantidad de productos: ");
        String [] productos= ingresarArregloTexto(cantidad, "Ingrese el nombre del producto ");
        String nombreMasLargo= determinarNombreMasLargo(productos);
        System.out.println("El nombre más largo del arreglo es: "+nombreMasLargo);


    }
    // Función que ingresa el número entero
    public static int ingresarNumero(String mensaje) {
        Scanner sc = new Scanner(System.in);
        System.out.print(mensaje);
        int numero = sc.nextInt();
        return numero;
    }

    //Función para ingresar el arreglo de productos(String)
    public static String[] ingresarArregloTexto(int cantidad, String mensaje){
        String [] productos= new String[cantidad];
        for( int i=0; i<cantidad; i++){
            productos[i]= ingresarTexto(mensaje);
        }
        return  productos;
    }


    //Función para ingresar una cadena de texto
    public static String ingresarTexto(String mensaje) {
        Scanner sc = new Scanner(System.in);
        System.out.print(mensaje);
        String texto = sc.nextLine();
        return texto;
    }

    //Función que determine el nombre más largo de un arreglo(parámetro)
    public static String determinarNombreMasLargo(String[] productos) {
        String nombreMasLargo = productos[0];
        for (int i = 1; i < productos.length; i++) {
            if (productos[i].length() > nombreMasLargo.length()) {
                nombreMasLargo = productos[i];
            }
        }
        return nombreMasLargo;
    }
}
