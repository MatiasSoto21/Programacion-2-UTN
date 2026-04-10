/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio_01;

import static Ejercicio_01.Empleado.mostrarTotalEmpleados;

/**
 *
 * @author matia
 */
public class Main {

    public static void main(String[] args) {
        Empleado matias = new Empleado("Matias Soto", "Jefe", 8000);
        Empleado jorge = new Empleado("Jorge Gonzalez", "Gerente");

        //datos invalidos----
        matias.actualizarSalarioCantidad(0);
        matias.actualizarSalarioCantidad(-50);
        matias.actualizarSalarioPorcentual(0);
        matias.actualizarSalarioPorcentual(-7);

        //datos invalidos----
        jorge.actualizarSalarioCantidad(0);
        jorge.actualizarSalarioCantidad(-77);
        jorge.actualizarSalarioPorcentual(0);
        jorge.actualizarSalarioPorcentual(-9);

        //datos validos-----
        matias.actualizarSalarioCantidad(500);
        matias.actualizarSalarioPorcentual(15);
        jorge.actualizarSalarioCantidad(300);
        jorge.actualizarSalarioPorcentual(5);

        System.out.println(matias);
        System.out.println(jorge);

        System.out.println("Total de empleados: " + mostrarTotalEmpleados());

    }

}
