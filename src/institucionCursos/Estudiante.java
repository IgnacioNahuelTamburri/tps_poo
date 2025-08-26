package institucionCursos;

import java.util.ArrayList;

public class Estudiante {
    private String nombre;
    private String legajo;
    private ArrayList<Inscripcion> inscripciones;

    public Estudiante (String nombre, String legajo){
        this.nombre = nombre;
        this.legajo = legajo;
        this.inscripciones = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void inscribirCurso (Curso curso){
        Inscripcion inscripcion = new Inscripcion(this,curso);
        inscripciones.add(inscripcion);
    }
}
