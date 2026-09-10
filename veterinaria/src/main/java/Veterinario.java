public class Veterinario {
    //Atributos
    private String nombre;
    private int numLicencia;
    private TipoEspecialidad tipoEspecialidad;

    //Constructor
    public Veterinario(String nombre, int numLicencia, TipoEspecialidad tipoEspecialidad) {
        this.nombre = nombre;
        this.numLicencia = numLicencia;
        this.tipoEspecialidad= tipoEspecialidad;
    }

    //Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumLicencia() {
        return numLicencia;
    }

    public void setNumLicencia(int numLicencia) {
        this.numLicencia = numLicencia;
    }

    public TipoEspecialidad getTipoEspecialidad() {
        return tipoEspecialidad;
    }

    public void setTipoEspecialidad(TipoEspecialidad tipoEspecialidad) {
        this.tipoEspecialidad = tipoEspecialidad;
    }

    //Mostrar la información del veterinario
    @Override
    public String toString() {
        return "Veterinario: " +
                "nombre: '" + nombre +
                ", numLicencia:" + numLicencia+
                ", tipo de especialidad: "+tipoEspecialidad;
    }
}
