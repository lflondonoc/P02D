public class Propietario {
    //Atributos
    private String nombre;
    private String telefono;
    private String correo;

    //Constructor
    public Propietario(String nombre, String telefono, String correo) {
        this.nombre= nombre;
        this.telefono= telefono;
        this.correo=correo;
    }

    //Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    //Mostrar la información del propietario
    @Override
    public String toString() {
        return "Propietario: " +
                ", nombre='" + nombre +
                ", telefono='" + telefono +
                ", correo='" + correo;
    }
}
