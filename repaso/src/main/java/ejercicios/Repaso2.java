package ejercicios;

import javax.swing.*;

public class Repaso2 {
    static void main() {
        int numero= Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número: "));
        JOptionPane.showMessageDialog(null, determinarNumero(numero));


    }
    public static String determinarNumero(int num){
        String mensaje="El número es: ";
        if (num>0){
            mensaje+="mayor a 0";
        }else if(num<0){
            mensaje+="menor a 0";
        }else if(num==0){
            mensaje+="igual a 0";
        }
        return  mensaje;
    }
}
