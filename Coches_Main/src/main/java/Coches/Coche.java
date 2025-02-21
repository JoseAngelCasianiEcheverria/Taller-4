/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Coches;

/**
 *
 * @author Gercray
 */
public class Coche {
    private String marca;
    private String modelo;
    private int velocidadMax;
    
    public Coche(String marca, String modelo, int velocidadMax){
    this.marca = marca;
    this.modelo = modelo;
    this.velocidadMax = velocidadMax;
    }
    
    public void acelerar(int incremento){
        if(incremento > 0){
            velocidadMax += incremento;
            System.out.println("El coche acelero hasta: "+velocidadMax+ " km/h");
        }else{
            System.out.println("El incremento debe ser positivo");
        }
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getVelocidadMax() {
        return velocidadMax;
    }
    
}
