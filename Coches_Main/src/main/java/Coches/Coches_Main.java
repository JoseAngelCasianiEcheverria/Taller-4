/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package Coches;

/**
 *
 * @author Gercray
 */
public class Coches_Main {

    public static void main(String[] args) {
        Coche audi = new Coche("Audi", "sedanes", 130);
        /*si intentamos acceder directamente a las propiedades se 
        generara el error por acceso ya que son privadas debemos resolverlo de la siguiente manera*/
        
        System.out.println("Marca: " + audi.getMarca());
        System.out.println("Modelo: " + audi.getModelo());
        System.out.println("Velocidad Maxima: " + audi.getVelocidadMax() + " km/h");
        
        audi.acelerar(100);
        audi.acelerar(-5);
    }
}
