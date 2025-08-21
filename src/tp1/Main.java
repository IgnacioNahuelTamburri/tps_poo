package tp1;

public class Main {
    public static void main (String [] args) {
        Lista lista = new Lista();

        System.out.println("Agregar al principio");
        lista.agregarAlPrincipio(10);
        lista.agregarAlPrincipio(11);
        lista.agregarAlPrincipio(12);

        System.out.println("Agregar al final");
        lista.agregarAlFinal(10);
        lista.agregarAlFinal(11);
        lista.agregarAlFinal(12);

        // lista.eliminar(11);

        lista.mostrar();

        // System.out.println(lista.listaNulo());

        // System.out.println("El elemento en la posicion 3 es:" + lista.recuperar(3));

        // System.out.println("El numero 12 se encuentra en la posicion: " + lista.recuperarIndice(12));

        System.out.println("La longitud de la lista es: " + lista.longitud());

        lista.insertar(28559, 44);
        lista.insertar(-2594, 0);
        lista.insertar(14, 4);

        lista.mostrar();

        // Prueba de push

    }
}
