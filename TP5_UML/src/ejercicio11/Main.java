package ejercicio11;

public class Main {
    public static void main(String[] args) {
        Artista artista = new Artista("Michael Jackson", "Pop");
        Cancion cancion = new Cancion("Smooth Criminal", artista);
        Reproductor reproductor = new Reproductor();

        reproductor.reproducir(cancion);
    }
}
