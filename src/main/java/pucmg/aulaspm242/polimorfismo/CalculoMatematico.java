/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pucmg.aulaspm242.polimorfismo;

/**
 *
 * @author danil
 */
public abstract class CalculoMatematico {
    
    private double valorA;
    private double valorB;

    public CalculoMatematico(double valorA, double valorB) {
        this.valorA = valorA;
        this.valorB = valorB;
    }

    public double getValorA() {
        return valorA;
    }

    public double getValorB() {
        return valorB;
    }
    
    public abstract double calcular();
    
}
