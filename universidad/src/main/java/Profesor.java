public class Profesor {
    //Atributos
    private String nombre;
    private int documento;
    private int edad;
    private double salario;

    public Profesor(String nombre, int documento, int edad, double salario) {
        this.nombre = nombre;
        this.documento = documento;
        this.edad = edad;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return nombre +
                ", documento: " + documento +
                ", edad: " + edad +
                ", salario: " + salario;
    }
}
