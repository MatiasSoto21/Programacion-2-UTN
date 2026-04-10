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
        Mascota ejemplo = new Mascota();

        ejemplo.setEdad(-5);

        System.out.println("Asignando datos validos..");
        ejemplo.setNombre("Bruno");
        ejemplo.setEdad(5);
        ejemplo.setEspecie("Boxer");
        ejemplo.mostrarInfo();

        ejemplo.cumplirAnios();
        ejemplo.cumplirAnios();
        ejemplo.cumplirAnios();
        
        System.out.println("Informacion final--");
        ejemplo.mostrarInfo();
    }
}
