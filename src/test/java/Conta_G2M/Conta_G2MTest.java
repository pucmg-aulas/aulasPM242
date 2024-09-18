/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Conta_G2M;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import pucmg.aulaspm242.banco.Conta_G2M;

/**
 *
 * @author danil
 */
public class Conta_G2MTest {

    public Conta_G2MTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void descontarTaxaTeste() {

        double saldoUtilizado = -100;
        double taxaEsperada = 3.00;

        Conta_G2M c = new Conta_G2M("00", "111", 200);
        c.setSaldo(saldoUtilizado);

        double resultadoTaxa = c.descontarTaxa();

        assertEquals(taxaEsperada, resultadoTaxa, 0.001);

    }

    @Test
    public void realizarSaqueExcedendoLimite() {

        Conta_G2M c = new Conta_G2M("00", "111", 200);
        c.deposito(200);
        boolean resultadoEsperado = false;
        
        boolean saqueAtual = c.saque(450);
       
        assertEquals(resultadoEsperado , saqueAtual);
        
    }
    
}
