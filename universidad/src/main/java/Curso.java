public class Curso {
    //Atributos
    private String nombre;
    private String horario;
    private int codigo;

    //Relación de Curso con Modalidad
    private Modalidad modalidad;

    public Curso(String nombre, String horario, int codigo, Modalidad modalidad) {
        this.nombre = nombre;
        this.horario = horario;
        this.codigo = codigo;
        this.modalidad= modalidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Modalidad getModalidad() {
        return modalidad;
    }

    public void setModalidad(Modalidad modalidad) {
        this.modalidad = modalidad;
    }

    @Override
    public String toString() {
        return nombre +
                ", horario: " + horario +
                ", codigo: " + codigo+
                ", modalidad: "+modalidad;
    }
}
