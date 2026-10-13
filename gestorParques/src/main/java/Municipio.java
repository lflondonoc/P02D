public enum Municipio {
    ARMENIA(0),
    CALARCA(10000),
    MONTENEGRO(20000),
    QUIMBAYA(30000),
    TEBAIDA(15000),
    CIRCASIA(18000),
    FILANDIA(22000),
    GENOVA(70000),
    SALENTO(50000),
    PIJAO(40000),
    CORDOBA(30000),
    BUENAVISTA(35000);

    private double sobreCosto;

    Municipio(double sobreCosto) {
        this.sobreCosto = sobreCosto;
    }

    public double getSobreCosto() {
        return sobreCosto;
    }
}
