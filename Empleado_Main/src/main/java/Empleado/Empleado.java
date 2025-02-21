/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Empleado;

/**
 *
 * @author Gercray
 */
public class Empleado {
    public String nombre;
    private int salario;
    
    public Empleado(String nombre, int salario){
        this.nombre = nombre;
        this.salario = salario;
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

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        if (salario >= 0){
            this.salario = salario;
        } else {
            System.out.println("El salario debe ser mayor a 0");
        }
    }
    
}
