package tp1.ej6;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Prestamo {
    private String fecha;
    private Ejemplar ejemplar;

    public Prestamo (String fecha, Ejemplar ejemplar){
        LocalDateTime hora = LocalDateTime.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.fecha = hora.format(formato);
        this.ejemplar = ejemplar;
    }

    public String getFecha() {
        return fecha;
    }

    public Ejemplar getEjemplar() {
        return ejemplar;
    }
}
