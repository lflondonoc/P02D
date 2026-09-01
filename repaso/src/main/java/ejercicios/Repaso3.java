package ejercicios;

public class Repaso3 {

    static void main() {
        //Invocar las funciones

    }
    //Función que ingresar el número entero


    //Función que sume los números impares del 1 hasta el número ingresado(parámetro)
    public static int sumarImpares(int numero){
        int sumaImpares=0;
        for(int i=1; i<=numero; i+=2){
            sumaImpares+=i;
        }
        return sumaImpares;
    }
}
