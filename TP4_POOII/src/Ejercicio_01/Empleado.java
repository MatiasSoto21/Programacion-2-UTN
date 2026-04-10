/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_01;

/**
 *
 * @author matia
 */
public class Empleado {

    private final int id;
    private String nombre;
    private String puesto;
    private double salario;
    private static int totalEmpleados;

    public int getId() {
        return id;
    }

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

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        if (puesto != null && !puesto.trim().isEmpty()) {
            this.puesto = puesto;
        } else {
            System.out.println("El puesto no puede estar vacio");
        }
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario > 0) {
            this.salario = salario;
        } else {
            System.out.println("El salario no puede ser negativo.");
        }
    }

    public static int getTotalEmpleados() {
        return totalEmpleados;
    }

    public Empleado(String nombre, String puesto, double salario) {
        this.id = ++totalEmpleados;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
    }

    public Empleado(String nombre, String puesto) {
        this(nombre, puesto, 5000);
    }

    public void actualizarSalarioPorcentual(double aumento) {
        if (aumento > 0) {
            this.salario += this.salario * (aumento / 100);
        } else {
            System.out.println("No se puede aumentar valores negativos.");
        }
    }

    public void actualizarSalarioCantidad(double aumento) {
        if (aumento > 0) {
            this.salario += aumento;
        } else {
            System.out.println("No se puede aumentar valores negativos.");
        }
    }

    public static int mostrarTotalEmpleados() {
        return totalEmpleados;
    }

    @Override
    public String toString() {
        return "Empleado"
                + "\nID: " + id
                + "\nNombre: " + nombre
                + "\nPuesto: " + puesto
                + "\nSalario: " + salario;
    }
}
