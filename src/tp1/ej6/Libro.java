package tp1.ej6;

import java.util.ArrayList;

public class Libro {
    private String titulo;
    private String autor;
    private String isbn;
    private int paginas;
    private ArrayList <Ejemplar> ejemplares;

    public Libro (String titulo, String autor, String isbn, int paginas){
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.paginas = paginas;
    }

    // Disponibilidad de ejemplares
    public int ejemplaresDisponibles (Ejemplar ejemplar){
        int cont = 0;
        for (int i = 0; i < ejemplares.size(); i++) {
            if (ejemplar.isDisponible()){
                cont++;
            }
        }
        return cont;
    }

    // Cantidad de prestados
    public int ejemplaresPrestados (Ejemplar ejemplar){
        int cont = 0;
        for (int i = 0; i < ejemplares.size(); i++) {
            if (!ejemplar.isDisponible()){
                cont++;
            }
        }
        return cont;
    }

    // Es posible prestar?
    public boolean posiblePrestar (Ejemplar ejemplar){
        if (ejemplaresDisponibles(ejemplar) == 1){
            System.out.println("No es posible prestar este libro.");
            return false;
        }
        System.out.println("Es posible prestar es libro");
        return true;
    }
}
