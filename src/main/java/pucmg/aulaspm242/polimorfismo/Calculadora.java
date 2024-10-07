/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pucmg.aulaspm242.polimorfismo;

/**
 *
 * @author danil
 */
public class Calculadora {
    

    public static double calcular(TipoCalculo tipo, double valorA, double valorB) {

        CalculoMatematico c;
        
        switch(tipo){
            case ADICAO:
                c = new Adicao(valorA, valorB);
                return c.calcular();
            case SUBTRACAO:
                c = new Subtracao(valorA, valorB);
                return c.calcular();
            case DIVISAO:
                c = new Divisao(valorA, valorB);
                return c.calcular();
            case MULTIPLICACAO:
                c = new Multiplicacao(valorA, valorB);
                c.calcular();
        }
        return Double.MIN_VALUE;
    }
    
    public static double calcular(CalculoMatematico calculo){
        return calculo.calcular();
    }

}
