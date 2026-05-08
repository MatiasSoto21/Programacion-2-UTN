package ejercicio14;

public class Main {
    public static void main(String[] args) {
        EditorVideo editor = new EditorVideo();
        Proyecto proyecto = new Proyecto("Pelicula", 124);
        Render render = new Render("MP4", proyecto);

        System.out.println("Primer render");
        System.out.println(render);
        System.out.println("Segundo render");
        editor.exportar("MP3", proyecto);
    }
}
