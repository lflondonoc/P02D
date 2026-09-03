public class Matrices2 {

    static void main() {

        //Crear una matriz de nombres
        String[][]nombres= {{"luisa","maria","pedro"},{"juan","camilo","sara"}, {"martin","mateo","melanie"}};

        //Recorrer la matriz
        int cantidadNombresM=0;
        for(int i=0; i<nombres.length; i++){ //filas
            for(int j=0; j<nombres[i].length; j++){ //columnas
                if(nombres[i][j].charAt(0)=='m'){
                    cantidadNombresM++;
                }
            }
        }

        System.out.println("La cantidad de nombres que empiezan por la letra m son: "+cantidadNombresM);
    }
}
