/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package iordenavel;

/**
 *
 * @author danil
 */
public class Pedido implements IOrdenavel{
    
    private int id;
    private String data;
    private double valorTotal;

    public Pedido(int id, String data, double valorTotal) {
        this.id = id;
        this.data = data;
        this.valorTotal = valorTotal;
    }
    
    

    @Override
    public boolean menorQue(IOrdenavel outro) {
        if(outro instanceof Pedido){
            Pedido p = (Pedido) outro;
            return this.valorTotal < p.valorTotal;
        }
        return false;
    }

    @Override
    public boolean igual(IOrdenavel outro) {
        if(outro instanceof Pedido){
            Pedido p = (Pedido) outro;
            return this.valorTotal == p.valorTotal;
        }
        return false;
    }
    
}
