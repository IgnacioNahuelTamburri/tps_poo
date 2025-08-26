package institucionCursos;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Inscripcion {
    private String fecha;
    private Estudiante estudiante;
    private Curso curso;

    public Inscripcion (Estudiante estudiante, Curso curso){
        LocalDateTime hora = LocalDateTime.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.fecha = hora.format(formato);
        this.estudiante = estudiante;
        this.curso = curso;
        this.curso.inscribirEstudiante(estudiante);
    }

    public String getNombre (){
        return estudiante.getNombre();
    }

    public Profesor getProfesor(){
        return curso.getProfesor();
    }

    @Override
    public String toString (){
        return fecha + " " + estudiante.getNombre() + " " + curso.getNombre();
    }
}