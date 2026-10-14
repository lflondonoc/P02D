import java.util.ArrayList;
import java.util.List;

public class Parque {
    private String nombre;
    private String descripcion;

    //Relaciones
    private Municipio municipio;

    //Listas
    private List<Zona> listaZonas;

    public Parque(String nombre, String descripcion, Municipio municipio) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.municipio = municipio;

        listaZonas= new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Municipio getMunicipio() {
        return municipio;
    }

    public void setMunicipio(Municipio municipio) {
        this.municipio = municipio;
    }

    public List<Zona> getListaZonas() {
        return listaZonas;
    }

    public void setListaZonas(List<Zona> listaZonas) {
        this.listaZonas = listaZonas;
    }

    //Método para verificar una zona
    public boolean verificarZona(String nombreZona){
        boolean existe= false;
        for(Zona zona: listaZonas){
            if(zona.getNombre().equalsIgnoreCase(nombreZona)){
                existe= true;
            }
        }
        return existe;
    }

    //Método para agregar una zona
    public boolean agregarZona(Zona zona){
        boolean zonaAgregada= false;
        boolean zonaVerificada= verificarZona(zona.getNombre());
        if(!zonaVerificada){
            listaZonas.add(zona);
            zonaAgregada=true;
        }
        return zonaAgregada;
    }

    //Método para calcular el valor total del parque
    public double calcularValorParque (){
        double valorTotalParque= 0;
        for( Zona zonas: listaZonas){
            valorTotalParque += zonas.calcularValorZona();
        }
        valorTotalParque += municipio.getSobreCosto();
        return valorTotalParque;
    }

    @Override
    public String toString() {
        return "Parque: " + nombre +
                ", descripcion: " + descripcion +
                ", municipio: " + municipio +
                ", listaZonas: " + listaZonas;
    }
}
