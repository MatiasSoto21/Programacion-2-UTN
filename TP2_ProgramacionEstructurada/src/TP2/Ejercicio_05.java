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
public class Ejercicio_05 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int total = 0;

        while (true) {
            System.out.println("Ingrese un número (0 para terminar): ");
            int num = scan.nextInt();

            if (num == 0) {
                break;
            }

            if (num % 2 == 0) {
                total += num;
            }
        }
        System.out.println("La suma de los números pares es: " + total);
    }
}
