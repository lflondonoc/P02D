public class Gato {

    // Atributos de mi clase gato
    private String nombre;
    private int edad;
    private String raza;
    private String genero;

    //Constructor
    public Gato(String nombre, int edad, String raza, String genero){
        this.nombre= nombre;
        this.edad= edad;
        this.raza= raza;
        this.genero= genero;
    }

    //toString
    @Override
    public String toString(){
        return "Nombre: "+nombre+
                ", edad: "+edad+
                ", raza: "+raza+
                ", genero: "+genero;
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
}
