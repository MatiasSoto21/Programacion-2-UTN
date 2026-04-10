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
public class Ejercicio_09 {

    public static double calcularCostoEnvio(double peso, String zona) {
        double costo;
        if (zona.equals("Nacional")) {
            costo = peso * 5;
        } else {
            costo = peso * 10;
        }
        return costo;
    }
    
    public static double calcularTotalCompra(double precioProducto, double costoEnvio){
        return precioProducto + costoEnvio;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese el precio del producto: ");
        double precioProducto = scan.nextDouble();

        System.out.println("Ingrese el peso del producto en kg: ");
        double peso = scan.nextDouble();

        scan.nextLine();
        
        System.out.println("Ingrese la zona de envio (Nacional/Internacional): ");
        String zona = scan.nextLine();
        
        double costoEnvio = calcularCostoEnvio(peso, zona);
        double precioFinal = calcularTotalCompra(precioProducto, costoEnvio);
        
        System.out.println("El costo de envio es de: " + costoEnvio);
        System.out.println("El precio final es de: " + precioFinal);
        
    }
}
