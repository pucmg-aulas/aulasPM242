/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pucmg.aulaspm242.abs;

import java.time.LocalDateTime;

/**
 *
 * @author danil
 */
public abstract class Servico {
    
    private int codigo;
    private String cliente;
    private String funcionario;
    private String data;
    protected static final double TAXABASICA;
    
    static{
        TAXABASICA = 10;
    }

    public Servico(int codigo, String cliente, String funcionario, String data) {
        this.codigo = codigo;
        this.cliente = cliente;
        this.funcionario = funcionario;
        this.data = data;
    }

    public abstract double calcularTaxa();
    
    public int getCodigo() {
        return codigo;
    }

    public String getCliente() {
        return cliente;
    }

    public String getFuncionario() {
        return funcionario;
    }

    public String getData() {
        return data;
    }
    
    
    
    
}
