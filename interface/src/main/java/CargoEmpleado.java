public enum CargoEmpleado {
    VENDEDOR(2000000),
    DOMICILIARIO(1500000),
    CAJERO(1700000),
    GERENTE(5000000);

    private final double salarioBase;

    CargoEmpleado(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getSalarioBase() {
        return salarioBase;
    }
}
