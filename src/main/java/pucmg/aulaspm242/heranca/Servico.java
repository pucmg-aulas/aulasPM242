/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pucmg.aulaspm242.heranca;

/**
 *
 * @author danil
 */
public class Servico {
    
    private String cliente;
    private String funcionario;
    protected String dataContratacao;

    public Servico(String cliente, String funcionario, String dataContratacao) {
        this.cliente = cliente;
        this.funcionario = funcionario;
        this.dataContratacao = dataContratacao;
    }
    
    public String getDataContratacao(){
        return this.dataContratacao;
    }
    
    
    
}
