import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;

public class Estudiante {
    //Atributos
    private String nombre;
    private int documentoIdentidad;
    private LocalDate fechaNacimiento;

    public Estudiante(String nombre, int documentoIdentidad, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.documentoIdentidad = documentoIdentidad;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDocumentoIdentidad() {
        return documentoIdentidad;
    }

    public void setDocumentoIdentidad(int documentoIdentidad) {
        this.documentoIdentidad = documentoIdentidad;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return nombre +
                ", documentoIdentidad: " + documentoIdentidad +
                ", fechaNacimiento: " + fechaNacimiento;
    }
}
