public class Gato {

    // Atributos de mi clase gato
    private String nombre;
    private int edad;
    private String raza;
    private String genero;

    //Relaciones
    private Propietario propietario;
    private Veterinario veterinario;

    //Constructor
    public Gato(String nombre, int edad, String raza, String genero, Propietario propietario, Veterinario veterinario){
        this.nombre= nombre;
        this.edad= edad;
        this.raza= raza;
        this.genero= genero;
        this.propietario= propietario;
        this.veterinario= veterinario;
    }

    //Getters y setters
    //Getter: consultar los datos
    // Setter: modificar los datos
    public String getNombre(){
        return  nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public int getEdad(){
        return edad;
    }
    public void getEdad(int edad){
        this.edad=edad;
    }
    public String getRaza(){
        return raza;
    }
    public void setRaza(String raza){
        this.raza=raza;
    }
    public String getGenero(){
        return genero;
    }
    public void setGenero(String genero){
        this.genero= genero;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

    public Veterinario getVeterinario() {
        return veterinario;
    }

    public void setVeterinario(Veterinario veterinario) {
        this.veterinario = veterinario;
    }

    //toString
    @Override
    public String toString(){
        return "Nombre de la mascota: "+nombre+
                ", edad: "+edad+
                ", raza: "+raza+
                ", genero: "+genero+
                "\n propietario: "+propietario+
                "\n veterinario: "+veterinario;
    }

    // Métodos propios del gato
    public void maullar(){
        System.out.println("Miau.....");
    }
    public void comer(){
        System.out.println("El gato está comiendo....");
    }
    public void dormir(){
        System.out.println("El gato está durmiendo zzzzzz.");
    }
}
