/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pucmg.aulaspm242.statics;

/**
 *
 * @author danil
 */
public class Aluno {
    
    
    private static final double FREQMINIMA;
    private static final double NOTAAPROVACAO;
    private static final double NUMEROAVALIACOES;
    private static int proxId;
    
    private int identificador;
    private String nome;
    
    public Aluno(String nome){
        this.nome = nome;
        this.identificador = getProxMatricula();
    }
    
    static{
        FREQMINIMA = 0.75;
        NOTAAPROVACAO = 0.6;
        NUMEROAVALIACOES = 4;
        proxId = 1;
    }
    
    private int getProxMatricula(){
        return proxId++;
    }
    
    public static double getArea(int a, int b){
        return a*b;
    }
    
    public static void imprimeAluno(Aluno a){
        
        System.out.println("Nome: " + a.nome);
        System.out.println("ID: " + a.identificador);
    }
    
}
