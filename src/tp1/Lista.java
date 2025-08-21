package tp1;

public class Lista {
    private Nodo nodo;

    public Lista() {
        this.nodo = null;
    }

    public void agregarAlPrincipio(int valor) {
        Nodo nuevo = new Nodo(valor);
        nuevo.setNodoSiguiente(nodo);
        nodo = nuevo;
    }

    public boolean listaNulo() {
        if (nodo == null)
            return true;
        return false;
    }

    public void agregarAlFinal(int valor) {
        Nodo nuevo = new Nodo(valor);
        if (nodo == null) {
            this.agregarAlPrincipio(valor);
            return;
        }
        Nodo actual = nodo;
        while (actual.getNodoSiguiente() != null) {
            actual = actual.getNodoSiguiente();
        }
        actual.setNodoSiguiente(nuevo);
    }

    public void eliminar(int valor) {
        Nodo actual = nodo;
        while (actual != null) {
            if (actual.getNodoSiguiente().getValorActual() == valor) {
                Nodo nuevo = actual.getNodoSiguiente().getNodoSiguiente();
                actual.setNodoSiguiente(nuevo);
                return;
            }
            actual = actual.getNodoSiguiente();
        }
    }

    public int longitud() {
        if (listaNulo()) {
            System.out.println("La lista esta vacía");
            return 0;
        }
        int contador = 0;
        Nodo actual = nodo;
        while (actual != null) {
            contador++;
            actual = actual.getNodoSiguiente();
        }
        return contador;
    }

    // Devolver elemento en posicion x
    public Integer recuperar(int pos) {
        if (listaNulo()) {
            System.out.println("La lista esta vacía");
            return null;
        }
        if (pos > this.longitud()) {
            System.out.println("La posicion esta fuera de la lista");
            return null;
        }
        int contador = 0;
        Nodo actual = nodo;
        while (contador < pos) {
            contador++;
            actual = actual.getNodoSiguiente();
        }
        return actual.getValorActual();
    }

    // Devolver pos del elemento x
    public int recuperarIndice (int valor){
        if (listaNulo()) {
            System.out.println("La lista esta vacía");
            return -1;
        }
        int contador = 0;
        Nodo actual = nodo;
        while (actual != null){
            if (actual.getValorActual() == valor) {
                return contador;
            }
            contador++;
            actual = actual.getNodoSiguiente();
        }
        System.out.println("El elemento no esta en la lista");
        return -1;
    }

    public void insertar (int valor, int pos) {
        if (listaNulo() || pos == 0) {
            this.agregarAlPrincipio(valor);
            return;
        }
        if (pos >= this.longitud()){
            this.agregarAlFinal(valor);
        }
        int cont = 0;
        Nodo actual = nodo;
        while (actual != null){
            if (cont +1 == pos){
                Nodo nuevo = actual.getNodoSiguiente();
                Nodo nodoinser = new Nodo (valor);
                actual.setNodoSiguiente(nodoinser);
                nodoinser.setNodoSiguiente(nuevo);
            }
            cont++;
            actual = actual.getNodoSiguiente();
        }
    }

    public void mostrar() {
        Nodo actual = nodo;
        while (actual != null) {
            System.out.print(actual.getValorActual() + " ");
            actual = actual.getNodoSiguiente();
        }
        System.out.println();
    }
}
