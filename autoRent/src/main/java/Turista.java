public class Turista extends Persona{
    private String visa;

    public Turista(String nombre, String email, String documento, String visa) {
        super(nombre, email, documento);
        this.visa = visa;
    }

    public String getVisa() {
        return visa;
    }

    public void setVisa(String visa) {
        this.visa = visa;
    }

    @Override
    public String toString() {
        return "Visitante: "+super.toString()+
                ", número de visa: "+visa;
    }
}
