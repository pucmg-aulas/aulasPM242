/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pucmg.aulaspm242.abs;

/**
 *
 * @author danil
 */
public class Emprestimo extends Servico {
    
    private double valor; 
    private double taxaJuros;

    public Emprestimo(double valor, double taxaJuros, int codigo, String cliente, String funcionario, String data) {
        super(codigo, cliente, funcionario, data);
        this.valor = valor;
        this.taxaJuros = taxaJuros;
    }
    
    @Override
    public double calcularTaxa(){
        return 0.02*this.valor + TAXABASICA;
    }

    public double getValor() {
        return valor;
    }

    public double getTaxaJuros() {
        return taxaJuros;
    }
    
    
}
