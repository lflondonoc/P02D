package ejercicios;

import java.util.Scanner;

public class Repaso4 {

    static void main() {
        //Invocar las funciones
        int numero = ingresarNumero("Ingrese un número: ");
        boolean esAbundante= determinarAbundante(numero);
        System.out.println("¿El número es abundante?:"+esAbundante);
    }
    // Función que ingresa el número entero
    public static int ingresarNumero(String mensaje) {
        Scanner sc = new Scanner(System.in);
        System.out.print(mensaje);
        int numero = sc.nextInt();
        return numero;
    }

    //Función que determine si un número es abundante o no
    public static boolean determinarAbundante(int numero){
        boolean esAbundante= false;
        int suma=0;
        for(int i=1; i<=numero; i++){
            if(numero%i==0){
                suma+=i;
            }
        }
        if(suma > numero){
            esAbundante= true;
        }
        return esAbundante;
    }

}
