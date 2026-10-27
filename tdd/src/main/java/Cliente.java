public class Cliente extends Persona{
    private String correo;

    public Cliente(String nombre, String cedula, int edad, String correo) {
        super(nombre, cedula, edad);
        this.correo = correo;
        if(edad<=18){
            throw new IllegalArgumentException("El cliente no puede ser menor de edad");
        }
        if(!correo.contains("@")){
            throw new IllegalArgumentException("El correo del cliente debe contener arroba");
        }
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "correo='" + correo + '\'' +
                '}';
    }
}
