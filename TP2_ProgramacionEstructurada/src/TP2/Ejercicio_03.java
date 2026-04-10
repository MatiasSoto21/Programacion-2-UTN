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
public class Ejercicio_03 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese su edad: ");
        int edad = scan.nextInt();

        if (edad < 12) {
            System.out.println("Sos un niño");
        } else if (edad <= 17) {
            System.out.println("Sos un adolescente");
        } else if (edad <= 59) {
            System.out.println("Sos un Adulto");
        } else {
            System.out.println("Sos un Adulto mayor");
        }
    }
}
