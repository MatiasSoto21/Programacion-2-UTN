/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp;

import java.util.Scanner;

/**
 *
 * @author matia
 */
public class Ejercicio_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingresa tu nombre");
        String nombre = scan.nextLine();

        System.out.println("Ingresa tu edad");
        int edad = scan.nextInt();

        System.out.println(nombre);
        System.out.println(edad);

    }
}
