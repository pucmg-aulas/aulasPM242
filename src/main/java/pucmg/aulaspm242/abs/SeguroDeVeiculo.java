/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pucmg.aulaspm242.abs;

/**
 *
 * @author danil
 */
public class SeguroDeVeiculo extends Servico{
    
    private double valorSegurado;
    private String veiculo;

    public SeguroDeVeiculo(double valorSegurado, String veiculo, int codigo, String cliente, String funcionario, String data) {
        super(codigo, cliente, funcionario, data);
        this.valorSegurado = valorSegurado;
        this.veiculo = veiculo;
    }

    @Override
    public double calcularTaxa() {
        return 0.05*this.valorSegurado + TAXABASICA;
    }

    public double getValorSegurado() {
        return valorSegurado;
    }

    public String getVeiculo() {
        return veiculo;
    }
    
    
    
}
