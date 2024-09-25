/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pucmg.aulaspm242.heranca;

/**
 *
 * @author danil
 */
public class SeguroDeVida extends Servico{
    
    private double valorSegurado;
    private int numeroDependentes;

    public SeguroDeVida(double valorSegurado, int numeroDependentes, String cliente, String funcionario, String dataContratacao) {
        super(cliente, funcionario, dataContratacao);
        this.valorSegurado = valorSegurado;
        this.numeroDependentes = numeroDependentes;
    }
    
    

    
}
