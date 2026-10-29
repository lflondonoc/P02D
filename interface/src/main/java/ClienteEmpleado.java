public class ClienteEmpleado extends Cliente implements IEmpleado{
    private CargoEmpleado cargoEmpleado;

    public ClienteEmpleado(String nombre, String cedula, int edad, String correo, CargoEmpleado cargoEmpleado) {
        super(nombre, cedula, edad, correo);
        this.cargoEmpleado= cargoEmpleado;
    }

    @Override
    public double calcularSalario() {
        return cargoEmpleado.getSalarioBase();
    }

    @Override
    public String toString() {
        return super.toString()+
                ", cargo empleado: " + cargoEmpleado +
                ", salario base: "+calcularSalario();
    }
}
