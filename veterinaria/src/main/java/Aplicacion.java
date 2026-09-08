public class Aplicacion {

    static void main() {
        //Crear los objetos de mi clase gato
        //Crear a Katty
        Gato katty= new Gato("Katty", 12, "criolla", "hembra");
        System.out.println(katty);

        //Consultar el nombre de mi objeto Katty
        System.out.println(katty.getNombre());

        //Cambiemos el nombre de Katty
        katty.setNombre("felix");
        System.out.println(katty);


    }
}
