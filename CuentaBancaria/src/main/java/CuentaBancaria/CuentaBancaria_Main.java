/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package CuentaBancaria;

/**
 *
 * @author Gercray
 */
public class CuentaBancaria_Main {

    public static void main(String[] args) {
        CuentaBancaria jose = new CuentaBancaria(1341546, 5000, "Ahorro");
        
        jose.MostrarDatos();
        
        //el error que observaba era el de acceso por que es privado y no se puede acceder directamente
    }
}
