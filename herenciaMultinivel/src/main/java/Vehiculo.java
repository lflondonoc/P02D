public class Vehiculo {
    private String marca;

    public Vehiculo(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void arrancar(){
        System.out.println("El vehiculo esta arrancando.....");
    }

    public void mostrarDatos(){
        System.out.println("Mostrando datos.....");
    }
}
