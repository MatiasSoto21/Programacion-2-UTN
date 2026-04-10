/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_03;

/**
 *
 * @author matia
 */
public class Libro {

    private String titulo;
    private String autor;
    private int añoPublicacion;

    public Libro() {
    }

    //titulo
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

    //autor
    public String getAutor() {
        return titulo;
    }

    public void setAutor(String autor) {
        if (autor != null && !autor.trim().isEmpty()) {
            this.autor = autor;
        } else {
            System.out.println("El autor no puede estar vacio");
        }
    }

    //añoPublicacion
    public int getAñoPublicacion() {
        return añoPublicacion;
    }

    public void setAñopublicacion(int añoPublicacion) {
        if (añoPublicacion > 0 && añoPublicacion <= 2026) {
            this.añoPublicacion = añoPublicacion;
        } else {
            System.out.println("Año invalido");
        }
    }

    public void mostrarInfo() {
        System.out.println("Titulo: " + titulo
                + "\nautor: " + autor
                + "\nAñoPublicacion: " + añoPublicacion);
    }
}
