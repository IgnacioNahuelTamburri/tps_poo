package tp1.ej6;

public class Main {
    public static void main(String[] args) {
        Ejemplar ejemplar1 = new Ejemplar(1999, true);
        Ejemplar ejemplar2 = new Ejemplar(2001, true);
        Ejemplar ejemplar3 = new Ejemplar(4099, false);
        Ejemplar ejemplar4 = new Ejemplar(4099, true);
        System.out.println(ejemplar1);
        System.out.println(ejemplar2);
        ejemplar1.prestarLibro();
        System.out.println(ejemplar1);
    }
}
