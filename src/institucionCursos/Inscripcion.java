package institucionCursos;

import java.time.LocalDateTime;

public class Inscripcion {
    private LocalDateTime fecha;
    private Estudiante estudiante;
    private Curso curso;

    public Inscripcion (Estudiante estudiante, Curso curso){
        this.fecha = LocalDateTime.now();
        this.estudiante = estudiante;
        this.curso = curso;
    }

    public String getNombre (){
        return estudiante.getNombre();
    }

    public Profesor getProfesor(){
        return curso.getProfesor();
    }
}