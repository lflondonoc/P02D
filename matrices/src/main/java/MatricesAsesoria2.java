import java.util.Scanner;

public class MatricesAsesoria2 {
    static void main() {
        //Invocación de funciones
        int filas= ingresarEntero("Ingrese la cantidad de filas: ");
        int columnas= ingresarEntero("Ingrese la cantidad de columnas: ");
        int [][] numeros= ingresarMatrizEnteros(filas, columnas, "Ingrese el número");
        String resultado= determinarNumerosSumaPar(numeros);
        System.out.println(resultado);

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
    //Función para determinar los números cuya suma de sus digitos es par
    public static String determinarNumerosSumaPar(int[][] numeros){
        String resultado= "Los números que al sumar sus digitos son pares: \n";
        for(int i=0; i<numeros.length; i++){
            for(int j=0; j<numeros[i].length; j++){
                int suma=0;
                for(int k=numeros[i][j]; k>0; k/=10){
                    int ultimoNumero= k%10;
                    suma+=ultimoNumero;
                }
                if(suma%2==0){
                    resultado+= numeros[i][j]+"\n";
                }
            }
        }
        return resultado;
    }
}
