/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mvcN.dao;

import java.util.ArrayList;
import mvcN.model.Livro;

/**
 *
 * @author danil
 */
public class Livros {
    
    private ArrayList<Livro> livros;
    private static Livros instancia;

    private Livros() {
        this.livros = new ArrayList<Livro>();
    }
    
    public static Livros getInstancia(){
        if(instancia == null)
            instancia = new Livros();
        return instancia;
    }
    
    
    
    public void addLivro(Livro livro){
        livros.add(livro);        
    }
   
    public void removerLivro(Livro livro){
        livros.remove(livro);
    }
    
    public Livro pesquisarLivro(String nome){
        for (Livro livro : livros) {
            if(livro.getNome().equalsIgnoreCase(nome))
                return livro;
        }
        return null;
    }
}
