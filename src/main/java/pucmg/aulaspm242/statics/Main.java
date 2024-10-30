/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pucmg.aulaspm242.statics;

/**
 *
 * @author danil
 */
public class Main {
    
    public static void main(String[] args) {
        
        //System.out.println(Aluno.FREQMINIMA);
        double area = Aluno.getArea(10, 20);
        
        Aluno a = new Aluno("Lorran");
        Aluno b = new Aluno("Olavo");
        Aluno c = new Aluno("Raquel");
        
        Aluno.imprimeAluno(a);
        Aluno.imprimeAluno(b);
        Aluno.imprimeAluno(c);
        
        Disc d1 = new Disc();
        Disc d2 = new Disc();
        
        d1.nome = "Programação";
        d1.ch = 30;
        
        d2.nome = "Redes";
        d2.ch = 60;
        
        System.out.println(d1);
        System.out.println(d2);
        
    }
    
}
