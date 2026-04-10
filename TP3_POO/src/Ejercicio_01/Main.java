/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio_01;

/**
 *
 * @author matia
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Estudiante alumno1 = new Estudiante();
        System.out.println("seteando datos invalidos..");
        alumno1.setNombre("");
        alumno1.setApellido(null);
        alumno1.setCurso("  ");
        alumno1.setCalificacion(-5);
        
        System.out.println("seteando datos validos..");
        alumno1.setNombre("Matias");
        alumno1.setApellido("Soto");
        alumno1.setCurso("1ro");
        alumno1.setCalificacion(5);
        alumno1.mostrarInfo();
        
        System.out.println("Subiendo calificacion 2 puntos");
        alumno1.subirCalificacion(2);
        double calificacionSubida = alumno1.getCalificacion();
        System.out.println(calificacionSubida);
        System.out.println("Intento subirla a mas de 10");
        alumno1.subirCalificacion(15);
        
        System.out.println("Bajando calificacion 3 puntos");
        alumno1.bajarCalificacion(3);
        double calificacionBajada = alumno1.getCalificacion();
        System.out.println(calificacionBajada);
        System.out.println("Intento bajarla a mas de 0");
        alumno1.bajarCalificacion(12);
        
        alumno1.mostrarInfo();

    }
}
