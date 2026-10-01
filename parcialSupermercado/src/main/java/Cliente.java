import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nombre;
    private String documento;
    private String telefono;
    private String correo;

    private List<Compra> listaCompras;

    public Cliente(String nombre, String documento, String telefono, String correo) {
        this.nombre = nombre;
        this.documento = documento;
        this.telefono = telefono;
        this.correo = correo;

        listaCompras= new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
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

    public List<Compra> getListaCompras() {
        return listaCompras;
    }

    public void setListaCompras(List<Compra> listaCompras) {
        this.listaCompras = listaCompras;
    }

    @Override
    public String toString() {
        return  "nombre: " + nombre +
                ", documento: " + documento +
                ", telefono: " + telefono +
                ", correo: " + correo +
                ", listaCompras: " + listaCompras;
    }
}
