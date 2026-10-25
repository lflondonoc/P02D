public class Persona {
    private String nombre;
    private String email;
    private String documento;

    public Persona(String nombre, String email, String documento) {
        this.nombre = nombre;
        this.email = email;
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre: " + nombre +
                ", email: " + email +
                ", documento: " + documento;
    }
}
