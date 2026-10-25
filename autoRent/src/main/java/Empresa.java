import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private String nombre;
    private String ciudad;

    //Listas
    private List<Persona> listaPersonas;
    private List<Vehiculo> listaVehiculos;
    private List<Alquiler> listaAlquiler;

    public Empresa(String nombre, String ciudad) {
        this.nombre = nombre;
        this.ciudad = ciudad;

        listaPersonas= new ArrayList<>();
        listaVehiculos= new ArrayList<>();
        listaAlquiler= new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    //Agregar persona
    public void agregarPersona(Persona persona){
        listaPersonas.add(persona);
    }
    //Agregar vehiculo
    public void agregarVehiculo(Vehiculo vehiculo){
        listaVehiculos.add(vehiculo);
    }
    //Agregar alquiler
    public void agregarAlquiler(Alquiler alquiler){
        listaAlquiler.add(alquiler);
    }
    //Consultar personas
    public List<Persona> consultarPersonas(){
        return listaPersonas;
    }
    //Consultar vehiculos
    public List<Vehiculo> consultarVehiculos(){
        return listaVehiculos;
    }
    //Consultar alquiler
    public List<Alquiler> consultarAlquiler(){
        return listaAlquiler;
    }
    //Consultar alquiler de un cliente
    public List<Alquiler> consultarAlquilerCliente(String documento){
        List<Alquiler> alquileresCliente= new ArrayList<>();

        for(Alquiler alquiler: listaAlquiler){
            if(alquiler.getPersona().getDocumento().equals(documento)){
                alquileresCliente.add(alquiler);
            }
        }
        return alquileresCliente;
    }
}
