import java.util.Scanner;

public class MatricesAsesoria {

    static void main() {
        //Invocación de funciones
        int filas= ingresarEntero("Ingrese la cantidad de filas: ");
        int columnas= ingresarEntero("Ingrese la cantidad de columnas: ");
        int [][] numeros= ingresarMatrizEnteros(filas, columnas, "Ingrese el número");
        mostrarMatriz(numeros);
    }

    //Función para ingresar filas y columnnas
    public static int ingresarEntero (String mensaje){
        Scanner sc= new Scanner(System.in);
        System.out.print(mensaje);
        int numero= sc.nextInt();
        return numero;
    }

    //Función para llenar una matriz de números enteros
    public static int[][] ingresarMatrizEnteros(int filas, int columnas, String mensaje){
        int [][] numeros= new int[filas][columnas];
        for(int i=0; i<numeros.length; i++){ //filas
            for(int j=0; j<numeros[i].length; j++){ //columnas
                numeros[i][j]= ingresarEntero(mensaje+" en la posición ("+i+","+j+"): ");
            }
        }
        return numeros;
    }

    //Función para recorrer la matriz
    public static void mostrarMatriz (int[][]numeros){
        for(int i=0; i<numeros.length; i++) { //filas
            for (int j = 0; j < numeros[i].length; j++) { //columnas
                System.out.print(numeros[i][j]+" ");
            }
            System.out.println();
        }
    }


}
