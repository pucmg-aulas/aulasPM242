/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pucmg.aulaspm242.banco;

/**
 *
 * @author danil
 */
public class AppBanco {
// esta classe possui vários métodos main, um pra cada aula realizada
    public static void main(String[] args) {
        
        Conta_G1N c = new Conta_G1N("0", "0000", 200, 100, 0.03);

        c.sacar(250);
        System.out.println(c.imprimirExtrato());
        
        c.depositar(25);
        System.out.println(c.imprimirExtrato());
        
        c.depositar(50);
        System.out.println(c.imprimirExtrato());
        
    }

    
    
    
    
    
    
    /*
    public static void main(String[] args) {

        Conta_G2N c = new Conta_G2N("0", "000", 200, 100, 0.03);
        System.out.println(c.sacar(250));
        System.out.println(c.imprimeExtrato());

        System.out.println(c.depositar(25));
        System.out.println(c.imprimeExtrato());
        
        System.out.println(c.depositar(50));
        System.out.println(c.imprimeExtrato());
    
        System.out.println(c.sacar(350));
        System.out.println(c.imprimeExtrato());
    }

     */
 /*
    public static void main(String[] args) {
        
        Conta_G1M c = new Conta_G1M("0", "000", 200, 100);
        
        c.sacar(250);
        System.out.println(c.imprimirExtrato());
        
        c.depositar(25);
        System.out.println(c.imprimirExtrato());
        
        c.depositar(50);
        System.out.println(c.imprimirExtrato());
    }
    
     */
 /*
    public static void main(String[] args) {
        
        Conta_G2M c = new Conta_G2M();
        c.deposito(200);
        c.setLimite(100);
        
        c.saque(250);
        System.out.println(c.imprimeExtrato());
        
        c.deposito(25);
        System.out.println(c.imprimeExtrato());
        
        c.deposito(50);
        System.out.println(c.imprimeExtrato());
        
        boolean flag = c.saque(1000);
        
        if(flag){
            System.out.println(c.imprimeExtrato());
        }
        else{
            System.out.println("Saldo insuficiente. Tente valor menor!");
        }   
    }
     */
}
