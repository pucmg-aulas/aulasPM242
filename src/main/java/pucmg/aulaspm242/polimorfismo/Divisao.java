/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pucmg.aulaspm242.polimorfismo;

/**
 *
 * @author danil
 */
public class Divisao extends CalculoMatematico {

    public Divisao(double valorA, double valorB) {
        super(valorA, valorB);
    }

    @Override
    public double calcular() {
        return getValorA() / getValorB();
    }

}
