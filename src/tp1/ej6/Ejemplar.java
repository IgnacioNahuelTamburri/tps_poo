package tp1.ej6;

public class Ejemplar {
    private int codigo;
    private boolean disponible;

    public Ejemplar (int codigo, boolean disponible){
        this.codigo = codigo;
        this.disponible = disponible;
    }

    public int getCodigo() {
        return codigo;
    }

    public boolean isDisponible() {
        return disponible;
    }

    // Prestar un libro
    public boolean prestarLibro () {
        if (disponible) {
            disponible = false;
            System.out.println("El libro se presto exitosamente!!!");
        }
        return true;
    }

    // Devolver un libro
    public void devolverLibro(){
        disponible = true;
        System.out.println("El libro fue devuelto exitosamente!!!");
        return;
    }

    @Override
    public String toString(){
        return "Ejemplar{" + " Codigo= " + codigo + ", disponible= " + disponible + "}";
    }
}
