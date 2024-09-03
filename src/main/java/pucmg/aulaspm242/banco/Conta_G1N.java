/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pucmg.aulaspm242.banco;

/**
 *
 * @author danil
 */
public class Conta_G1N {

    private String numero;
    private String cpf;
    private double saldo;
    private double limite;
    private double limiteMaximo;
    private double taxa;

    public Conta_G1N(String numero, String cpf, double saldo, double limiteMaximo, double taxa) {
        this.numero = numero;
        this.cpf = cpf;
        this.saldo = saldo;
        this.limiteMaximo = limiteMaximo;
        this.taxa = taxa;
        this.limite = limiteMaximo;
    }

    public double sacar(double valor) {
        if (valor > this.saldo + this.limite) {
            return -Double.MAX_VALUE;
        }
        if (valor > this.saldo) {
            this.saldo -= valor;
            this.limite += this.saldo;
            return this.saldo;
        }
        return this.saldo -= valor;
    }

    public double depositar(double valor) {
        if (this.saldo <= 0) {
            if (this.limite + valor > this.limiteMaximo) {
                this.limite = this.limiteMaximo;
            } else {
                this.limite += valor;
            }

            valor -= calcularTaxa();
        }
        return this.saldo += valor;
    }

    private double calcularTaxa() {
        return (this.saldo * this.taxa) * -1;
    }

    public String imprimirExtrato() {
        return """
               ========
               Saldo: R$""" + saldo
                + "\nLimite: R$" + limite
                + "\n========\n";
    }

    public String alterarTaxaDeJuros(double novaTaxa) {
        if (novaTaxa < 0) {
            return "Taxa deve ser superior ou igual a zero!";
        }
        this.taxa = novaTaxa;
        return "Taxa Alterada com Sucesso!";
    }

}
