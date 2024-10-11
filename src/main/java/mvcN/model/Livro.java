/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mvcN.model;

/**
 *
 * @author danil
 */
public class Livro {
    
    private String nome;
    private String autor;
    private int numeroPaginas;
    private String resumo;
    private int estrangeiro;

    public Livro(String nome, String autor, int numeroPaginas, String resumo, int estrangeiro) {
        this.nome = nome;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
        this.resumo = resumo;
        this.estrangeiro = estrangeiro;
    }

    public String getNome() {
        return nome;
    }

    public String getAutor() {
        return autor;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public String getResumo() {
        return resumo;
    }

    public int isEstrangeiro() {
        return estrangeiro;
    }  
    
    
}
