/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_03;

/**
 *
 * @author matia
 */
public class Main {
    public static void main(String[] args) {
        Libro martinFierro = new Libro();
        System.out.println("Modificando año con dato invalido-");
        martinFierro.setAñopublicacion(3125);
        
        System.out.println("Modificando año valido---");
        martinFierro.setAñopublicacion(1985);
        martinFierro.setAutor("Jose Hernandez");
        martinFierro.setTitulo("Martin Fierro");
        martinFierro.mostrarInfo();
        
    }
}
