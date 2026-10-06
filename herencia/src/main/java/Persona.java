public abstract class Persona {

    private String nombre;
    private int edad;
    private String numeroDocumento;

    public Persona(String nombre, int edad, String numeroDocumento) {
        this.nombre = nombre;
        this.edad = edad;
        this.numeroDocumento = numeroDocumento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }
    public void mostrarNombre(){
        System.out.println("Nombre: "+nombre);
    }
}
