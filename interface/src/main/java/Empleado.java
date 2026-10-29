public class Empleado extends Persona implements IEmpleado{
    private double comision;
    private CargoEmpleado cargoEmpleado;

    public Empleado(String nombre, String cedula, int edad, double comision, CargoEmpleado cargoEmpleado) {
        super(nombre, cedula, edad);
        this.comision = comision;
        this.cargoEmpleado= cargoEmpleado;
    }

    public double getSalario() {
        return comision;
    }

    public void setSalario(double comision) {
        this.comision = comision;
    }

    @Override
    public double calcularSalario() {
        return cargoEmpleado.getSalarioBase()+comision;
    }

    @Override
    public String toString() {
        return "Empleado: " +super.toString()+
                ", comision: " + comision +
                ", cargoEmpleado: " + cargoEmpleado+
                ", salario total: "+calcularSalario();
    }
}
