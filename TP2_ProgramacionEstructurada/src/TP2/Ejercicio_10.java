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
public class Ejercicio_10 {

    public static int actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida) {
        int nuevoStock = stockActual - cantidadVendida + cantidadRecibida;
        return nuevoStock;

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese el stock actual del producrto: ");
        int stock = scan.nextInt();

        System.out.println("Ingrese la cantidad vendida: ");
        int cantidadVendida = scan.nextInt();

        System.out.println("Ingrese la cantidad recibida: ");
        int cantidadRecibida = scan.nextInt();
        
        int resultado = actualizarStock(stock, cantidadVendida, cantidadRecibida);
        
        System.out.println("El nuevo stock del producto es: " + resultado);
        
    }
}
