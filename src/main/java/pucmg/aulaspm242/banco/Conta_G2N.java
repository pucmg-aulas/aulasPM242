/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pucmg.aulaspm242.banco;

/**
 *
 * @author danil
 */
public class Conta_G2N {

    private String numero;
    private String cpf;
    private double saldo;
    private double limiteUtilizado;
    private double limiteContratado;
    private double taxaDeJuros;

    public Conta_G2N(String numero, String cpf, double saldo, double limiteContratado, double taxaDejuros) {
        this.numero = numero;
        this.cpf = cpf;
        this.saldo = saldo;
        this.limiteContratado = limiteContratado;
        this.limiteUtilizado = 0;
        this.taxaDeJuros = taxaDejuros;
    }

    public String depositar(double valor) {

        if (valor <= 0) {
            return "Insira um valor positivo.";
        }

        if (this.saldo < 0) {
            this.saldo += valor - calcularTaxa();
            
            if(this.limiteUtilizado + valor > this.limiteContratado)
                this.limiteUtilizado = this.limiteContratado;
            else
                this.limiteUtilizado += valor;
            
        } else {
            this.saldo += valor;
        }
        return "Deposito efetuado com sucesso!";

    }

    private double calcularTaxa() {
        return Math.abs(this.saldo * this.taxaDeJuros);
    }

    public String sacar(double valor) {

        double max = this.saldo + (this.limiteContratado - this.limiteUtilizado);

        if (valor <= 0) {
            return "Impossível realizar o saque. Informe valor positivo.";
        }
        if (valor > max) {
            return "Impossível realizar o saque. Consulte seus limites.";
        }

        if (valor > this.saldo) {
            //this.saldo -= valor;
            //return "Saque efetuado com sucesso!";
            //} else {
            //this.saldo -= valor;
            this.limiteUtilizado += (valor - this.saldo);

        }
        this.saldo -= valor;
        return "Saque efetuado com sucesso!";
    }
    
    public String imprimeExtrato(){
        return "\n=======\nSaldo: R$" + this.saldo + "\nLimite: R$" + this.limiteUtilizado + "\n=======\n";
    }
    

}
