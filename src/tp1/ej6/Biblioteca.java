package tp1.ej6;

import java.util.ArrayList;

public class Biblioteca {
    private int prestamosTotal;
    private ArrayList<Libro> libros;

    public Biblioteca (int prestamosTotal){
        this.prestamosTotal = prestamosTotal;
        this.libros = new ArrayList<>();
    }

    // Agregar nuevo libro

    // Buscar libro por titulo

    // Buscar libro por autor

    // Buscar libro por isbn

    // Registrar un nuevo prestamo


    public int getPrestamosTotal() {
        return prestamosTotal;
    }
}
