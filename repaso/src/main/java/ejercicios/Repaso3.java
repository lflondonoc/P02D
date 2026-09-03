package ejercicios;

import java.util.Scanner;

public class Repaso3 {

    static void main(String[] args) {
        // Invocar las funciones
        int numero = ingresarNumero("Ingrese un número: ");
        int suma = sumarImpares(numero);
        System.out.println("La suma de los números impares: " + suma);
    }

    // Función que ingresa el número entero
    public static int ingresarNumero(String mensaje) {
        Scanner sc = new Scanner(System.in);
        System.out.print(mensaje);
        int numero = sc.nextInt();
        return numero;
    }

    // Función que suma los números impares del 1 hasta el número ingresado
    public static int sumarImpares(int numero) {
        int sumaImpares = 0;
        for (int i = 1; i <= numero; i += 2) {
            sumaImpares += i;
        }
        return sumaImpares;
    }
}