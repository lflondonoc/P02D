import java.util.LinkedList;

public class Cliente {

    private String nombreCompleto;
    private String documento;
    private String telefono;
    private String correo;

    private LinkedList<Compra> compras;

    public Cliente(String nombreCompleto, String documento, String telefono, String correo) {

        this.nombreCompleto = nombreCompleto;
        this.documento = documento;
        this.telefono = telefono;
        this.correo = correo;

        compras = new LinkedList<>();
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
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

    public LinkedList<Compra> getCompras() {
        return compras;
    }

    // Verificar si ya existe una compra
    public boolean verificarCompra(String codigo) {
        boolean existe = false;
        for (Compra compra : compras) {
            if (compra.getCodigo().equals(codigo)) {
                existe = true;
                break;
            }
        }
        return existe;
    }

    // Agregar compra
    public boolean agregarCompra(Compra compra) {
        boolean agregado = false;
        boolean existe = verificarCompra(compra.getCodigo());
        if (existe == false) {
            compras.add(compra);
            agregado = true;
        }
        return agregado;
    }

    @Override
    public String toString() {

        return "Nombre completo: " + nombreCompleto +
                "\nDocumento: " + documento +
                "\nTeléfono: " + telefono +
                "\nCorreo: " + correo +
                "\nCantidad de compras: " + compras.size();
    }
}