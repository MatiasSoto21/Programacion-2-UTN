/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_02;

/**
 *
 * @author matia
 */
public class Libro {

    private String titulo;
    private String autor;
    private static String editorial = "Independiente";

    public Libro(String titulo, String autor) {
        if (titulo != null && !titulo.trim().isEmpty()) {
            this.titulo = titulo;
        } else {
            System.out.println("El titulo no puede estar vacio, se asigna 'Sin titulo'");
            this.titulo = "Sin titulo";
        }
        if (autor != null && !autor.trim().isEmpty()) {
            this.autor = autor;
        } else {
            System.out.println("El autor no puede estar vacio, se asigna 'Desconocido'");
            this.autor = "Desconocido";
        }
    }

    public Libro(String titulo, String autor, String editorial) {
        this(titulo, autor);
        Libro.editorial = editorial;

    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        if (titulo != null && !titulo.trim().isEmpty()) {
            this.titulo = titulo;
        } else {
            System.out.println("El titulo no puede estar vacio");
        }
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        if (autor != null && !autor.trim().isEmpty()) {
            this.autor = autor;
        } else {
            System.out.println("El autor no puede estar vacio");
        }
    }

    public static String getEditorial() {
        return editorial;
    }

    public void actualizarTitulo(String titulo) {
        setTitulo(titulo);
    }

    public void actualizarTitulo(String prefijo, String titulo) {
        if (prefijo == null || prefijo.trim().isEmpty()) {
            System.out.println("El prefijo no puede estar vacio");
            return;
        }
        if (titulo == null || titulo.trim().isEmpty()) {
            System.out.println("El titulo no puede estar vacio");
            return;
        }
        this.titulo = prefijo + " " + titulo;
    }

    public static void cambiarEditorial(String nuevaEditorial) {
        if (nuevaEditorial != null && !nuevaEditorial.trim().isEmpty()) {
            editorial = nuevaEditorial;
        } else {
            System.out.println("La editorial no puede estar vacia");
        }
    }

    @Override
    public String toString() {
        return "Titulo: " + titulo
                + "\nAutor: " + autor
                + "\nEditorial: " + editorial;
    }

}
