package ejercicio3;

public class Main {
    public static void main(String[] args) {
        Editorial editorial = new Editorial("La mejor editorial", "calle 123");
        Autor autor = new Autor("Pepito", "Argentina");
        Libro libro1 = new Libro("Martin Fierro", "456789", editorial, autor);

        System.out.println(libro1);
    }
}
