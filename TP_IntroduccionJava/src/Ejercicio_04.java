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
public class Ejercicio_04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingresa el primer numero");
        int num1 = scan.nextInt();
        System.out.println("Ingresa el segundo numero");
        int num2 = scan.nextInt();

        System.out.println("La suma de ambos numeros es de: " + (num1 + num2));
        System.out.println("La resta de ambos numeros es de: " + (num1 - num2));
        System.out.println("La multiplicacion de ambos numeros es de: " + (num1 * num2));
        System.out.println("La division de ambos numeros es de: " + (num1 / num2));

    }
}
