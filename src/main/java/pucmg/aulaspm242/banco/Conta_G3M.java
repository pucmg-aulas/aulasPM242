/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pucmg.aulaspm242.banco;

/**
 *
 * @author danil
 */
public class Conta_G3M {

    private String numero;
    private String cpf;
    private double saldo;
    private double limiteDisponivel;
    private double limiteContratado;
    private double taxaDeJuros;

    public Conta_G3M(String numero, String cpf, double saldo, double limiteContratado, double taxaDeJuros) {
        this.numero = numero;
        this.cpf = cpf;
        this.saldo = saldo;
        this.limiteContratado = limiteContratado;
        this.limiteDisponivel = limiteContratado;
        this.taxaDeJuros = taxaDeJuros;
    }

    public void depositar(double valor) {
        if (this.saldo < 0) {
            this.saldo += valor - descontarTaxa();
            this.limiteDisponivel += valor;
        } else {
            this.saldo += valor;
        }

        if (this.limiteDisponivel > this.limiteContratado) {
            this.limiteDisponivel = this.limiteContratado;
        }
    }

    public String sacar(double valor) {
        if (valor <= this.saldo + this.limiteDisponivel) {
            this.saldo -= valor;
            this.limiteDisponivel += this.saldo;

            return "Saldo Após o Saque: R$" + this.saldo;
            
        } else {
            return "Saldo Insuficiente!";
        }
    }

    private double descontarTaxa() {
        return Math.abs(this.saldo * this.taxaDeJuros);
    }
    
    public String imprimirExtrato(){
        return "\nSaldo R$: "+ this.saldo + "\nLimite R$: "+ this.limiteDisponivel;
    }

}
