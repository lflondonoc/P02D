public class Residente extends Persona{
    private String direccion;

    public Residente(String nombre, String email, String documento, String direccion) {
        super(nombre, email, documento);
        this.direccion = direccion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Residente: "+super.toString()+
                ", dirección: "+direccion;
    }
}
