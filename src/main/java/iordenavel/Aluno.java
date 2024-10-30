/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package iordenavel;

/**
 *
 * @author danil
 */
public class Aluno implements IOrdenavel {

    private String nome;
    private int id;

    public Aluno(String nome, int id) {
        this.nome = nome;
        this.id = id;
    }
    
    

    @Override
    public boolean menorQue(IOrdenavel outro) {
        if (outro instanceof Aluno) {
            Aluno outroAluno = (Aluno) outro;
            return this.id < outroAluno.id;
        }

        return false;
    }

    @Override
    public boolean igual(IOrdenavel outro) {
        if (outro instanceof Aluno) {
            Aluno outroAluno = (Aluno) outro;
            return this.id == outroAluno.id;
        }

        return false;

    }

}
