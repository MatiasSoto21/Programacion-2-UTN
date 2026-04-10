/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_05;

/**
 *
 * @author matia
 */
public class NaveEspacial {

    private String nombre;
    private int combustible;
    private static final int CAPACIDAD_MAXIMA = 100;

    public NaveEspacial() {

    }

    //nombre
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //combustible
    public int getCombustible() {
        return combustible;
    }

    public void setCombustible(int combustible) {
        if (combustible >= 0 && combustible <= CAPACIDAD_MAXIMA) {
            this.combustible = combustible;
        } else {
            System.out.println("El combustible no puede ser negativo o ser mayor a 100");

        }
    }

    public void despegar() {
        if (combustible >= 5) {
            combustible -= 5;
        } else {
            System.out.println("Error: no hay suficiente combustible para despegar");
        }
    }

    public void avanzar(int distancia) {
        if (combustible >= (distancia * 2)) {
            combustible -= (distancia * 2);
        } else {
            System.out.println("Error: no hay suficiente combustible para avanzar");
        }
    }

    public void recargarCombustible(int cantidad) {
        if (cantidad <= 0) {
            System.out.println("La cantidad no debe ser negativa");
        } else if ((cantidad + this.combustible) > CAPACIDAD_MAXIMA) {
            System.out.println("Error: no se puede cargar porque excede el limite, probar un valor menor");
        } else {
            this.combustible += cantidad;
        }
    }

    public void mostrarEstado() {
        System.out.println("Nombre: " + nombre
                + "\nCombustible: " + combustible
                + "\nCapacidad Maxima: " + CAPACIDAD_MAXIMA);
    }
}
