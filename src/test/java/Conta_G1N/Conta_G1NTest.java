/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Conta_G1N;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;
import pucmg.aulaspm242.banco.Conta_G1N;

/**
 *
 * @author danil
 */
public class Conta_G1NTest {
    
    public Conta_G1NTest() {
    }
    
    @Test
    public void sacarValorNegativo(){
        
    
        Conta_G1N conta = new Conta_G1N("1", "000", 1000, 100, 0.03);
        double valorSaque = -300;
        double saldoEsperado = 1300;
        
        conta.sacar(valorSaque);
        
        assertEquals(saldoEsperado, conta.getSaldo(), 0.01);
    }
    
}
