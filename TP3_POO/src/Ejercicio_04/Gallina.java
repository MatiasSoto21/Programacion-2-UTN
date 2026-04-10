/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_04;

/**
 *
 * @author matia
 */
public class Gallina {

    private int idGallina;
    private int edad;
    private int huevosPuestos;

    public Gallina() {
    }

    //idGallina
    public int getIdGallina() {
        return idGallina;
    }

    public void setIdGallina(int id) {
        if (id > 0) {
            this.idGallina = id;
        } else {
            System.out.println("El id no puede ser negativo");
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

    //huevosPuestos
    public int getHuevosPuestos() {
        return huevosPuestos;
    }

    public void setHuevosPuestos(int huevosPuestos) {
        if (huevosPuestos > 0) {
            this.huevosPuestos = huevosPuestos;
        } else {
            System.out.println("La cantidad de huevos no puede ser negativa");
        }
    }

    public void ponerHuevo() {
        huevosPuestos += 1;
    }

    public void envejecer() {
        edad += 1;
    }

    public void mostrarEstado() {
        System.out.println("Id: " + idGallina
                + "\nEdad: " + edad
                + "\nHuevosPuestos: " + huevosPuestos);
    }
}
