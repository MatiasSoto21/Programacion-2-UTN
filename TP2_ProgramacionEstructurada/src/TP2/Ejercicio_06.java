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
public class Ejercicio_06 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("A continuacion ingresaras 10 numeros");
        int positivos = 0;
        int negativos = 0;
        int ceros = 0;

        for (int i = 0; i <= 9; i++) {
            System.out.println("Ingresa el numero " + (i + 1));
            int num = scan.nextInt();

            if (num == 0) {
                ceros += 1;
            }

            if (num > 0) {
                positivos += 1;
            }

            if (num < 0) {
                negativos += 1;
            }
        }
        System.out.println(
                "Resultados"
                + "\n Positivos: " + positivos
                + "\n Negativos: " + negativos
                + "\n Ceros: " + ceros);
    }
}
