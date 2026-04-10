/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_02;

/**
 *
 * @author matia
 */
public class Mascota {
    private String nombre;
    private String especie;
    private int edad;

    public Mascota() {
    }

    //nombre
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre;
        } else {
            System.out.println("El nombre no puede estar vacio");
        }
    }

    //especie
    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        if (especie != null && !especie.trim().isEmpty()) {
            this.especie = especie;
        } else {
            System.out.println("La especie no puede estar vacia");
        }
    }

    //edad
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad > 0) {
            this.edad = edad;
        } else {
            System.out.println("La edad no puede ser negativa");
        }
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre
                + "\nEspecie: " + especie
                + "\nEdad: " + edad);
    }
    
    public void cumplirAnios(){
        edad += 1;
        System.out.println("La mascota ha cumplido 1 anio mas, Feliz cumple!");
        System.out.println("Edad actualizada: " + edad + " anios");
    }
}
