/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pucmg.aulaspm242.polimorfismo;

/**
 *
 * @author danil
 */
public class Main {

    public static void main(String[] args) {

        double resultado = Calculadora.calcular(TipoCalculo.ADICAO, 2, 3);

        System.out.println("Resultado = " + resultado);

        Adicao a = new Adicao(2, 3);

        resultado = Calculadora.calcular(a);
        System.out.println("Resultado = " + resultado);

    }

}
