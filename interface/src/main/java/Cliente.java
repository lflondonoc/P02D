public class Cliente extends Persona implements ICliente{
    private String correo;

    public Cliente(String nombre, String cedula, int edad, String correo) {
        super(nombre, cedula, edad);
        this.correo = correo;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public int maximoComprasDiarias() {
        return ICliente.MAXIMA_COMPRAS_DIARIAS;
    }

    @Override
    public String toString() {
        return "Cliente: " +super.toString()+
                ", correo: " + correo+
                ", Máximo de compras diarias: "+maximoComprasDiarias();
    }
}
