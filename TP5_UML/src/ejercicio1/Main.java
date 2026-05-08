package ejercicio1;

public class Main {
    public static void main(String[] args) {
        Foto foto = new Foto("img123", "jpg");
        Titular titular = new Titular("Matias", "12345678");
        Pasaporte pasaporte = new Pasaporte("A123", "2024-01-01", foto, titular);

        System.out.println(pasaporte);
    }
}
