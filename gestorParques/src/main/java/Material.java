public enum Material {

    ARENA(10000),
    GRAMA_SINTETICA(35000),
    GRAMA_NATURAL(20000),
    ASFALTO(40000);

    private double valorMetroCuadrado;

    Material(double valorMetroCuadrado) {
        this.valorMetroCuadrado = valorMetroCuadrado;
    }

    public double getValorMetroCuadrado() {
        return valorMetroCuadrado;
    }
}
