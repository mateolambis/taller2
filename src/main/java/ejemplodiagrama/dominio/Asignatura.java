package ejemplodiagrama.dominio;

import java.util.ArrayList;
import java.util.List;

public class Asignatura {

    private String nombre;
    private int numeroCreditos;
    private Docente docente;
    private List<Estudiante> estudiantes;

    public Asignatura(String nombre) {
        this.nombre = nombre;
        this.estudiantes = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumeroCreditos() {
        return numeroCreditos;
    }

    public Docente getDocente() {
        return docente;
    }

    public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNumeroCreditos(int numeroCreditos) {
        this.numeroCreditos = numeroCreditos;
    }

    public void setDocente(Docente docente) {
        this.docente = docente;
    }

    public void setEstudiantes(List<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }
}
