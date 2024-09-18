/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pucmg.aulaspm242.banco;

/**
 *
 * @author danil
 */
public class Conta_G2M {

    private String identificador;
    private String cpf;
    private double saldo;
    private double limite;

    public Conta_G2M(String identificador, String cpf, double limite) {
        this.identificador = identificador;
        this.cpf = cpf;
        this.limite = limite;
    }
    
    
    public boolean saque(double valor) {

        if (valor <= this.saldo + this.limite) {
            double limiteUtilizado = valor - this.saldo;
            this.saldo -= valor;
            this.limite -= limiteUtilizado; 
            return true;
        }
        return false;

    }

    public void deposito(double valor) {
        if (this.saldo < 0) {
            this.saldo += valor - descontarTaxa();
            this.limite += valor;
        } else {
            this.saldo += valor;
        }
    }

    public double descontarTaxa() {
        return Math.abs(this.saldo * 0.03);
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
    
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    
    public double getSaldo(){
        return this.saldo;
    }
    public String imprimeExtrato(){
        return "O saldo da conta é de " + this.saldo 
                + "\nO limite da conta é de " + this.limite;
    }
}
