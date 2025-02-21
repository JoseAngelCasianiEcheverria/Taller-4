/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CuentaBancaria;

/**
 *
 * @author Gercray
 */
public class CuentaBancaria {
    private int numeroCuenta;
    private double saldo;
    public String tipoCuenta;
    
    public CuentaBancaria(int numeroCuenta, int saldo, String tipoCuenta){
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.tipoCuenta = tipoCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public void MostrarDatos(){
        System.out.println("LOS DATOS DE LA CUENTA SON: ");
        System.out.println("Numero de cuenta: "+numeroCuenta);
        System.out.println("Saldo de la cuenta: "+saldo);
        System.out.println("Tipo de cuenta: "+tipoCuenta);
    }
}
