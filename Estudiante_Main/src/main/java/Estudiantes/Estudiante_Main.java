/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Estudiantes;

/**
 *
 * @author Gercray
 */
public class Estudiante_Main {

    public static void main(String[] args) {
        Estudiantes juan = new Estudiantes("Juan", 18, 4.0);
        
        System.out.println("LOS DATOS DE EL ESTUDIANTE SON: \n");
        System.out.println("Nombre: "+juan.getNombre());
        System.out.println("Edad: "+juan.getEdad());
        System.out.println("Nota Promedio: "+juan.getNotaPromedio());
    
    }
}
