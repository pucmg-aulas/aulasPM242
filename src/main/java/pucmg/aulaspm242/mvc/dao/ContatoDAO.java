/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pucmg.aulaspm242.mvc.dao;

import java.util.ArrayList;
import pucmg.aulaspm242.mvc.model.Contato;

/**
 *
 * @author danil
 */
public class ContatoDAO {
    
    private ArrayList<Contato> contatos;
    private static ContatoDAO instance;
    
    private ContatoDAO(){
        this.contatos = new ArrayList<>();
    }
    
    public static ContatoDAO getInstance(){
        if(instance == null)
            instance = new ContatoDAO();
        return instance;
    }
    
    public void addContato(Contato contato){
        contatos.add(contato);
    }
    
    public void removerContato(Contato contato){
        contatos.remove(contato);
    }
    
    public Contato pesquisarContatoPorNome(String nome){
        for (Contato contato : contatos) {
            if(contato.getNome().equalsIgnoreCase(nome)){
                return contato;
            }
        }
        return null;
    }
    
    //TODO
    public void atualizarContato(Contato antigo, Contato Novo){
        
    }

    public ArrayList<Contato> getContatos() {
        return contatos;
    }
    
    
}
