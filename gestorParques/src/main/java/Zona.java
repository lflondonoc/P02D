public class Zona {
    private String nombre;
    private String tipoZona;

    //Relaciones
    private Material material;
    private FiguraGeometrica figuraGeometrica;

    public Zona(String nombre, String tipoZona, Material material, FiguraGeometrica figuraGeometrica) {
        this.nombre = nombre;
        this.tipoZona = tipoZona;
        this.material = material;
        this.figuraGeometrica = figuraGeometrica;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoZona() {
        return tipoZona;
    }

    public void setTipoZona(String tipoZona) {
        this.tipoZona = tipoZona;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public FiguraGeometrica getFiguraGeometrica() {
        return figuraGeometrica;
    }

    public void setFiguraGeometrica(FiguraGeometrica figuraGeometrica) {
        this.figuraGeometrica = figuraGeometrica;
    }
    public double calcularValorZona(){
        double valorZona= figuraGeometrica.calcularArea()*material.getValorMetroCuadrado();
        return valorZona;
    }
}
