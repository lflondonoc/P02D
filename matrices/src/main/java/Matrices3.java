public class Matrices3 {
    static void main() {
        //Crear una matriz de nombres
        String[][]nombres= {{"luisa","maria","pedro"},{"juan","camilo","sara"}, {"martin","mateo","melanie"}};

        //¿cuál es el nombre más largo de la matriz?
        String nombreMasLargo= nombres[0][0];
        for(int i=0; i<nombres.length; i++){ //filas
            for(int j=0; j<nombres[i].length; j++){ //columnas
                if(nombres[i][j].length()>nombreMasLargo.length()){
                    nombreMasLargo=nombres[i][j];
                }

            }
        }
        System.out.println("El nombre más largo es: "+nombreMasLargo);
    }
}
