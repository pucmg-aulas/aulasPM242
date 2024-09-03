/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pucmg.aulaspm242.banco;

/**
 *
 * @author danil
 */
public class Conta_G1M {

    private String numero;
    private String cpf;
    private double saldo;
    private double limite;
    private double limiteUtilizado;

    public Conta_G1M(String numero, String cpf, double saldo, double limite) {
        this.numero = numero;
        this.cpf = cpf;
        this.saldo = saldo;
        this.limite = limite;
        this.limiteUtilizado = this.limite;
    }

    public boolean depositar(double valor) {
        if (valor < 0) {
            return false;
        }
        if (this.saldo < 0) {
            ajustarLimiteUtilizado(valor);
            this.saldo = aplicarTaxa() + valor;
            return true;
        }
        this.saldo += valor;
        return true;
    }

    private void ajustarLimiteUtilizado(double valor) {
        if (this.limiteUtilizado < this.limite) {
            this.limiteUtilizado += valor;
            
            if(this.limiteUtilizado > this.limite){
                this.limiteUtilizado = this.limite;
            }
        }
    }

    private boolean validarSaque(double valor) {
        if (valor <= this.saldo + this.limiteUtilizado) {
            return true;
        }
        return false;
    }

    public boolean sacar(double valor) {
        if (validarSaque(valor)) {
            descontarLimite(valor);
            this.saldo -= valor;
            return true;
        }
        return false;
    }

    private void descontarLimite(double valor) {

        if (this.saldo < valor) {
            this.limiteUtilizado += this.saldo - valor;
        }

    }

    private double aplicarTaxa() {
        return this.saldo * 1.03;
    }
    
    public String imprimirExtrato(){
        
        return "\nO saldo é de R$ " + this.saldo
                + "\nLimite de Crédito de R$ " + this.limite
                + "\nLimite Utilizado de R$ " + (this.limite-this.limiteUtilizado);
        
    }
}
