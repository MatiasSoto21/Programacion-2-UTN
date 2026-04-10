/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_04;

/**
 *
 * @author matia
 */
public class Main {

    public static void main(String[] args) {
        Gallina gallinaA = new Gallina();
        Gallina gallinaB = new Gallina();

        System.out.println("Intento edad negativa--");
        gallinaA.setEdad(-2);

        gallinaA.setIdGallina(1);
        gallinaA.setEdad(5);
        gallinaA.ponerHuevo();

        gallinaB.setIdGallina(2);
        gallinaB.envejecer();
        gallinaB.ponerHuevo();
        gallinaB.ponerHuevo();

        System.out.println("Gallina A--");
        gallinaA.mostrarEstado();

        System.out.println("Gallina B--");
        gallinaB.mostrarEstado();

    }
}
