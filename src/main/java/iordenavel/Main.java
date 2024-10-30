/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package iordenavel;

/**
 *
 * @author danil
 */
public class Main {
    public static void main(String[] args) {
        Pedido p0 = new Pedido(1, "5678", 5000);
        Pedido p1 = new Pedido(2, "56789", 15000);
        Pedido p2 = new Pedido(3, "56780", 25000);
    
        Aluno a = new Aluno("Jão", 1);
        
        p0.menorQue(p1);
        p0.menorQue(a);
        
        IOrdenavel i = a;
        i = p1;
        
        IOrdenavel io = new Pedido(1, "", 10);
    
      
    
    }
    
    
}
