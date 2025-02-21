/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package UsoPrivate;

/**
 *
 * @author Gercray
 */
public class Private_Error {

    public static void main(String[] args) {
        Persona persona1 = new Persona("Miguel");
        
        System.out.println("Nombre: "+persona1.nombre);//no se puede acceder directamente a un dato private se le debe hacer un get
    }
}
