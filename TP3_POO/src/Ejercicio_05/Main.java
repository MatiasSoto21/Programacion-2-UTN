/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_05;

/**
 *
 * @author matia
 */
public class Main {
    public static void main(String[] args) {
        NaveEspacial artemis = new NaveEspacial();
        artemis.setCombustible(50);
        
        System.out.println("Intento avanzar mas de lo que se puede con 200km...");
        artemis.avanzar(200);
        
        System.out.println("Intento cargar mas de la capacidad maxima...");
        artemis.recargarCombustible(100);
        
        artemis.setNombre("Artemis 2");
        artemis.avanzar(12);
        artemis.mostrarEstado();
        
    }
}
