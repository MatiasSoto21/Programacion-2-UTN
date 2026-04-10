/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP2;

/**
 *
 * @author matia
 */
public class Ejercicio_12 {

    public static void main(String[] args) {
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};

        System.out.println("Precios originales:");
        for (double i : precios) {
            System.out.println("Precio: $" + i);
        }

        precios[0] = 1;
        precios[1] = 22.51;

        System.out.println("Precios modificados:");
        for (double i : precios) {
            System.out.println("Precio: $" + i);
        }
    }
}
