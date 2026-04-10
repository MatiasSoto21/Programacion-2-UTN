/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TP2;

import java.util.Scanner;

/**
 *
 * @author matia
 */
public class Ejercicio_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        System.out.println("Buenas! Ingresa un año para determinar si es bisiesto.");
        int año = scan.nextInt();

        if ((año % 400 == 0) || (año % 4 == 0 && año % 100 != 0)) {
            System.out.println("Es bisiesto");
        } else {
            System.out.println("No es bisiesto :(");
        }
    }
}
