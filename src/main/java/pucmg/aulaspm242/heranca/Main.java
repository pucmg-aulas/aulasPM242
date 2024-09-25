/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pucmg.aulaspm242.heranca;

/**
 *
 * @author danil
 */
public class Main {
    
    public static void main(String[] args) {
        
        Emprestimo e = new Emprestimo("Jão", "Maria", "18/09/2024", 900000, 0.05);
        
        System.out.println("A Data de Contratação do esmprestimo foi em ");
        //System.out.println(e.getDataEmprestimo());
        System.out.println(e.getDataContratacao());
    }
    
}
