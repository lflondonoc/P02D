public class Aplicacion {

    static void main() {

        //Crear los objetos de mi clase propietario
        Propietario alejandro= new Propietario("Alejandro", "12345", "aljandro@gmail.com");

        //Crear los objetos de mi clase veterinario
        Veterinario juan= new Veterinario("Juan Pablo", 456, TipoEspecialidad.NEUROLOGIA);

        //Crear los objetos de mi clase gato
        //Crear a Katty
        Gato katty= new Gato("Katty", 12, "criolla", "hembra", alejandro, juan);
        System.out.println(katty);


    }
}
