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
public class Ejercicio_11 {

    static double DESCUENTO_ESPECIAL = 0.10;

    public static double calcularDescuentoEspecial(double precio) {
        double descuentoAplicado = precio * DESCUENTO_ESPECIAL;
        System.out.println("El descuento especial aplicado es: " + descuentoAplicado);
        return precio - descuentoAplicado;

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese el precio del producto: ");
        double precio = scan.nextDouble();

        double precioFinal = calcularDescuentoEspecial(precio);

        System.out.println("El precio final con descuento es: " + precioFinal);
    }
}
