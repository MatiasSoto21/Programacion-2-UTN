/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_03;

/**
 *
 * @author matia
 */
public class Alumno {

    private String nombre;
    private double promedio;
    private static double notaAprobacion = 6;

    public Alumno(String nombre, double promedio) {
        setNombre(nombre);
        setPromedio(promedio);
    }

    public Alumno(String nombre) {
        this(nombre, 0);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre;
        } else {
            System.out.println("Error: El nombre no puede estar vacio, se asigna sin nombre");
            this.nombre = "Sin nombre";
        }
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        if (promedio >= 0.0 && promedio <= 10.0) {
            this.promedio = promedio;
        } else {
            System.out.println("Error: El promedio debe estar en el rango 0.0-10.0, se asigna valor mas proximo");
            this.promedio = (promedio < 0.0? 0 : 10);
        }
    }

    public void actualizarPromedio(double nuevoPromedio) {
        setPromedio(nuevoPromedio);
    }

    public void actualizarPromedio(double[] notas) {
        if (notas == null || notas.length == 0) {
            System.out.println("Error: no hay notas");
            return;
        }

        double promedioFinal = 0;
        double sumaNotas = 0;

        for (int i = 0; i < notas.length; i++) {
            sumaNotas += notas[i];
        }

        promedioFinal = sumaNotas / notas.length;
        setPromedio(promedioFinal);
    }

    public boolean aprobo() {
        return promedio >= Alumno.notaAprobacion;
    }

    public static void cambiarNotaAprobacion(double nueva) {
        if (nueva >= 0.0 && nueva <= 10.0) {
            Alumno.notaAprobacion = nueva;
        } else {
            System.out.println("Error: la nueva nota de aprobacion debe estar en el rango 0.0-10.0");
        }
    }

    @Override
    public String toString() {
        return "Alumno"
                + "\nNombre: " + nombre
                + "\nPromedio: " + promedio
                + "\nAprobado: " + (aprobo() ? "Si" : "No");
    }
}
