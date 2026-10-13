import java.util.ArrayList;
import java.util.List;

public class Proyecto {
    private String nombre;

    //Listas
    private List<Parque> listaParques;

    public Proyecto(String nombre) {
        this.nombre = nombre;

        listaParques= new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Parque> getListaParques() {
        return listaParques;
    }

    public void setListaParques(List<Parque> listaParques) {
        this.listaParques = listaParques;
    }

    //Método para verificar el parque
    public boolean verificarParque(String nombre){
        boolean existe= false;
        for(Parque parque: listaParques){
            if(parque.getNombre().equalsIgnoreCase(nombre)){
                existe=true;
            }
        }
        return  existe;
    }

    //Método para agregar parque
    public boolean agregarParque (Parque parque){
        boolean parqueAgregado= false;
        boolean verificarParque= verificarParque(parque.getNombre());
        if(!verificarParque){
            listaParques.add(parque);
            parqueAgregado= true;
        }
        return parqueAgregado;
    }
    //Método para calcular el valor toal del proyecto
    public double calcularValorProyecto(){
        double valorProyecto=0;
        for(Parque parque: listaParques){
            valorProyecto += parque.calcularValorParque();
        }
        return  valorProyecto;
    }
}
