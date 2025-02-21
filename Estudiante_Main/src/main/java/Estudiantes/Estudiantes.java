/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Estudiantes;

/**
 *
 * @author Gercray
 */
public class Estudiantes {
    private String nombre;
    private int edad;
    private double notaPromedio;
    
    public Estudiantes(String nombre, int edad, double notaPromedio){
        this.nombre = nombre;
        this.edad = edad;
        this.notaPromedio = notaPromedio;
    }

    public String getNombre() {
        
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre != null && !nombre.isEmpty()){
            this.nombre = nombre;
        } else {
            System.out.println("El nombre no puede estar vacío");
        }
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad >= 0 && edad <= 120){
            this.edad = edad;
        } else {
            System.out.println("Error: La edad debe estar entre 0 y 120.");
        }
    }

    public double getNotaPromedio() {
        return notaPromedio;
    }

    public void setNotaPromedio(double notaPromedio) {
        if (notaPromedio >= 0.0 && notaPromedio <= 10.0){
            this.notaPromedio = notaPromedio;
        } else {
            System.out.println("La nota promedio debe estar entre 0.0 y 5.0");
        }
      }
}
