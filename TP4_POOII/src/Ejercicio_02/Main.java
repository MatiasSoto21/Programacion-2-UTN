/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_02;

/**
 *
 * @author matia
 */
public class Main {

    public static void main(String[] args) {
        Libro prueba = new Libro("Librox", "Pepito");
        Libro prueba2 = new Libro("Harry Potter", "J.K Rowling", "Editorial de magia");
        
        prueba.actualizarTitulo("");
        prueba2.actualizarTitulo("Harry Potter 3");

        prueba.actualizarTitulo("Remake", "LibroX");
        prueba.actualizarTitulo("", "Harry Potter 3");
        
        System.out.println(prueba);
        System.out.println(prueba2);
        System.out.println("Cambiando editorial------");
        Libro.cambiarEditorial("Altos libros");
        
        System.out.println(prueba);
        System.out.println(prueba2);
    }
}
