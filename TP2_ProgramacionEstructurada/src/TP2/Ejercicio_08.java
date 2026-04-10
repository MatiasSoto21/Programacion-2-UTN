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
public class Ejercicio_08 {

    public static double calcularPrecioFinal(double precioBase, double impuesto, double descuento) {
        double precioFinal = precioBase + (precioBase * impuesto) - (precioBase * descuento);
        
        return precioFinal;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese el precio base del producto: ");
        double precioBase = scan.nextDouble();

        System.out.println("Ingrese el impuesto del producto(Ejemplo: 10 para 10%): ");
        double impuesto = scan.nextDouble() / 100;

        System.out.println("Ingrese el descuento del producto(Ejemplo: 5 para 5%): ");
        double descuento = scan.nextDouble() / 100;

        double resultado = calcularPrecioFinal(precioBase, impuesto, descuento);
        
        System.out.println("El precio final del producto es de: " + resultado);
    }

}
