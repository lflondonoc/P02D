public class Cliente extends Persona{
    private String correo;

    public Cliente(String nombre, int edad, String numeroDocumento, String correo){
        super(nombre, edad, numeroDocumento);
        this.correo=correo;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public void mostrarNombre() {
        super.mostrarNombre();
    }
}
