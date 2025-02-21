/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Empleado;

/**
 *
 * @author Gercray
 */
public class Empleado_Main {

    public static void main(String[] args) {
       Empleado empleado1 = new Empleado("Jose", 5000);
       
        System.out.println("LA PAGA DE EL EMPLEADO "+empleado1.nombre + " ES:");//nombre es publico y no necesitamos get
        System.out.println("PAGA: "+ empleado1.getSalario());//no podemos acceder a salario sin un get 
        
        empleado1.setNombre("Manuel");
        empleado1.setSalario(10000);
        
        System.out.println("\n DESPUES DE AGREGAR NUEVOS DATOS\n");
        System.out.println("Nombre: "+empleado1.nombre);
        System.out.println("Salario: "+empleado1.getSalario());
    }
}
