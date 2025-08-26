package institucionCursos;

import java.lang.classfile.constantpool.PoolEntry;

public class Profesor {
    private String nombre;
    private String email;
    private String legajo;

    public Profesor (String nombre, String email, String legajo){
        this.nombre = nombre;
        this.email = email;
        this.legajo = legajo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    public String getLegajo() {
        return legajo;
    }
}
