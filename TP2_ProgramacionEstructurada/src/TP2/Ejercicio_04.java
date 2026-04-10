/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP2;

import java.util.Scanner;

/**
 *
 * @author matia
 */
public class Ejercicio_04 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese el precio del producto: ");
        int precio = scan.nextInt();
        scan.nextLine();
        
        System.out.println("Ingrese la categoria del producto: ");
        String categoria = scan.nextLine();

        switch (categoria) {
            case "A" -> {
                System.out.println("Descuento aplicado: 10%");
                System.out.println("Precio final: " + (precio - (precio * 0.10)));
            }
            case "B" -> {
                System.out.println("Descuento aplicado: 15%");
                System.out.println("Precio final: " + (precio - (precio * 0.15)));
            }

            case "C" -> {
                System.out.println("Descuento aplicado: 20%");
                System.out.println("Precio final: " + (precio - (precio * 0.20)));
            }

        }
    }
}
