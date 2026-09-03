public class Matrices {
    static void main() {
        //Crear una matriz de edades
        int[][] edades= new int[2][3];

        //LLenar la matriz
        edades[0][0]= 23;
        edades[0][1]= 12;
        edades[0][2]= 18;

        edades[1][0]= 32;
        edades[1][1]= 15;
        edades[1][2]= 26;

        //Recorrer la matriz
        for(int i=0; i<edades.length; i++){ //filas
            for(int j=0; j<edades[i].length; j++){ //columnas
                System.out.print(edades[i][j]+" ");
            }
            System.out.println();
        }



    }
}
