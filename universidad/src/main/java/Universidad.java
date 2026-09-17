import java.util.ArrayList;
import java.util.List;

public class Universidad {
    //Atributos
    private String nombre;
    private String direccion;
    private String ciudad;
    private int telefono;

    //Creación listas
    private List<Estudiante> listaEstudiantes;
    private List<Profesor> listaProfesores;
    private List<Curso> listaCursos;

    public Universidad(String nombre, String direccion, String ciudad, int telefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.telefono = telefono;

        //Inicializar las listas
        listaEstudiantes= new ArrayList<>();
        listaProfesores= new ArrayList<>();
        listaCursos= new ArrayList<>();

    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public List<Estudiante> getListaEstudiantes() {
        return listaEstudiantes;
    }

    public void setListaEstudiantes(List<Estudiante> listaEstudiantes) {
        this.listaEstudiantes = listaEstudiantes;
    }

    public List<Profesor> getListaProfesores() {
        return listaProfesores;
    }

    public void setListaProfesores(List<Profesor> listaProfesores) {
        this.listaProfesores = listaProfesores;
    }

    public List<Curso> getListaCursos() {
        return listaCursos;
    }

    public void setListaCursos(List<Curso> listaCursos) {
        this.listaCursos = listaCursos;
    }

    @Override
    public String toString() {
        return nombre + '\'' +
                ", direccion: " + direccion +
                ", ciudad: " + ciudad +
                ", telefono: " + telefono+
                ", lista de profesores: "+listaProfesores+
                ", lista de estudiantes: "+listaEstudiantes+
                ", lista de cursos: "+listaCursos;
    }
    //Método para verificar estudiantes
    public boolean verificarEstudiantes (int documentoIdentidad){
        boolean existe= false;
        for(Estudiante estudiante: listaEstudiantes){
            if(estudiante.getDocumentoIdentidad()== documentoIdentidad){
                existe= true;
                break;
            }
        }
        return existe;
    }

    //Método agregar estudiantes
    public boolean agregarEstudiantes(Estudiante estudiante){
        boolean agregado= false;
        boolean existe= verificarEstudiantes(estudiante.getDocumentoIdentidad());
        if(existe==false){
            listaEstudiantes.add(estudiante);
            agregado= true;
        }
        return agregado;
    }
    //Método para verificar profesores
    public boolean verificarProfesor (int documento){
        boolean existe= false;
        for(Profesor profesor: listaProfesores){
            if(profesor.getDocumento()== documento){
                existe= true;
                break;
            }
        }
        return existe;
    }

    //Método agregar estudiantes
    public boolean agregarProfesor(Profesor profesor){
        boolean agregado= false;
        boolean existe= verificarProfesor(profesor.getDocumento());
        if(existe==false){
            listaProfesores.add(profesor);
            agregado= true;
        }
        return agregado;
    }
}
