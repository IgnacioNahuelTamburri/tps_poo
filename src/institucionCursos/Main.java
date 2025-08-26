package institucionCursos;

public class Main {
    public static void main(String[] args) {
        Profesor profesor1 = new Profesor("Pablo Chale","pcchale@unlu.edu.com.ar", "465");
        Profesor profesor2 = new Profesor("Jorge Enrique Sagula", "jes@gmail.com", "1");
        Estudiante estudiante1 = new Estudiante("Bautista Pereyra Buch", "193177");
        Estudiante estudiante2 = new Estudiante("Ignacio Nahuel Tamburri", "165046");
        Estudiante estudiante3 = new Estudiante("Franco Helguera","154722");
        Curso curso1 = new Curso("POO", "Programacion Orientada a Objetos", "11076");
        Curso curso2 = new Curso("BD1", "Base de Datos 1", "11077");
        Curso curso3 = new Curso("MDyTD", "Modelo, Simulacion y Teoria de la Decision", "41408");

    }
}
