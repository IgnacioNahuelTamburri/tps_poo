package institucionCursos;

import java.awt.*;
import java.util.ArrayList;

public class Curso {
    private String nombre;
    private String descripcion;
    private String codigo;
    private Profesor profesor;
    private ArrayList<Estudiante> estudiantes;

    public Curso (String nombre, String descripcion, String codigo, Profesor profesor){
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.codigo = codigo;
        this.profesor = profesor;
        this.estudiantes = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public Profesor getProfesor() {
        return profesor;
    }
}
