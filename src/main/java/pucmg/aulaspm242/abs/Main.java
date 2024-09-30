/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pucmg.aulaspm242.abs;

import java.time.LocalDateTime;

/**
 *
 * @author danil
 */
public class Main {
    
    public static void main(String[] args) {
        
        //Servico s = new Servico(1, "QQ", "OO", "30/09/2024");
        
        Servico s = new Emprestimo(100000, 0.025, 1, "Fulano", "Cicrano", "30/09/2024");
        
        System.out.println(s.calcularTaxa());
        
        s = new SeguroDeVeiculo(150000, "Corolla", 1, "Fulano", "Cicrano", "30/09/2024");
        
        System.out.println(s.calcularTaxa());
        
        Emprestimo e = new Emprestimo(10, 1, 2, "Tal", "Talll", "4567890");

        if(s instanceof SeguroDeVeiculo){
            SeguroDeVeiculo sv = (SeguroDeVeiculo)s;
            sv.getValorSegurado();
        }
        s.getValorSegurado();
    }
    
}
