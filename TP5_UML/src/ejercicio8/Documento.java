package ejercicio8;

public class Documento {
    private String titulo;
    private String contenido;
    private FirmaDigital firma;
    private Usuario usuario;

    public Documento(String titulo, String contenido, FirmaDigital firma, Usuario usuario) {
        this.titulo = titulo;
        this.contenido = contenido;
        this.firma = firma;
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "Documento{" +
                "titulo='" + titulo + '\'' +
                ", contenido='" + contenido + '\'' +
                ", firma=" + firma +
                ", usuario=" + usuario +
                '}';
    }
}
