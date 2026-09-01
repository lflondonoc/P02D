package ejercicios;

public class Repaso4 {

    static void main() {
        //Invocar las funciones

    }
    //Función para ingresar el número

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
