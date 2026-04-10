/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_01;

/**
 *
 * @author matia
 */
public class Estudiante {
    private String nombre;
    private String apellido;
    private String curso;
    private double calificacion;

    public Estudiante() {
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

    // apellido
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        if (apellido != null && !apellido.trim().isEmpty()) {
            this.apellido = apellido;
        } else {
            System.out.println("El apellido no puede estar vacio");
        }
    }

    //curso
    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        if (curso != null && !curso.trim().isEmpty()) {
            this.curso = curso;
        } else {
            System.out.println("El curso no puede estar vacio");
        }
    }

    // calificacion
    public double getCalificacion() {
        return calificacion;
    }
    public void setCalificacion(double calificacion) {
        if (calificacion >= 0.0 && calificacion <= 10.0) {
            this.calificacion = calificacion;
        } else {
            System.out.println("La calificacion debe estar en el rango 0-10");
        }
    }
    public void subirCalificacion(double puntos) {
        if (puntos < 0) {
            System.out.println("Error: no se pueden sumar puntos negativos.");
            return;
        }
        if (this.calificacion + puntos <= 10.0) {
            this.calificacion += puntos;
        } else {
            System.out.println("La calificacion maxima no puede ser mayora a 10.0");
        }
    }
    public void bajarCalificacion(double puntos) {
        if (puntos < 0) {
            System.out.println("Error: no se pueden sumar puntos negativos.");
            return;
        }
        if (this.calificacion - puntos >= 0.0) {
            this.calificacion -= puntos;
        } else {
            System.out.println("La calificacion final no puede ser menor a 0.0");
        }
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre
                + "\nApellido: " + apellido
                + "\nCurso: " + curso
                + "\nCalificacion: " + calificacion);
    }
}
