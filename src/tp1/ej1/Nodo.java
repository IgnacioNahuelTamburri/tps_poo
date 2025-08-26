package tp1.ej1;

public class Nodo {
    private int valorActual;
    private Nodo nodoSiguiente;

    public Nodo(int valorActual) {
        this.valorActual = valorActual;
        this.nodoSiguiente = null;
    }

    public int getValorActual() {
        return valorActual;
    }

    public Nodo getNodoSiguiente() {
        return nodoSiguiente;
    }

    public void setNodoSiguiente(Nodo nodoSiguiente){
        this.nodoSiguiente = nodoSiguiente;
    }
}