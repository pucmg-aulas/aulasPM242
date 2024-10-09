/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pucmg.aulaspm242.mvc.controller;

import pucmg.aulaspm242.mvc.dao.ContatoDAO;
import pucmg.aulaspm242.mvc.model.Contato;
import pucmg.aulaspm242.mvc.view.AddContatoView;

/**
 *
 * @author danil
 */
public class AddContatoController {
    
    private AddContatoView view;
    private ContatoDAO contatoDAO;
    
    public AddContatoController(){
        this.view = new AddContatoView();
        this.contatoDAO = ContatoDAO.getInstance();
        
        this.view.getBtnCancelar().addActionListener((e)->{
            sair();
        });
        
        this.view.getBtnSalvar().addActionListener((e)->{
            addContato();
        });
        this.view.setVisible(true);
    }
    
    public void addContato(){
        
        String nome;
        String telefone;
        
        nome = view.getTxtNome().getText();
        telefone = view.getTxtTelefone().getText();
        
        Contato c = new Contato(nome, telefone);
        contatoDAO.addContato(c);
        
        limparCampos();
    }
    
    private void sair(){
        this.view.dispose();
    }
    
    private void limparCampos(){
        this.view.getTxtNome().setText("");
        this.view.getTxtTelefone().setText("");
    }
    
}
