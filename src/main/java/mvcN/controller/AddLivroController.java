/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mvcN.controller;

import javax.swing.JOptionPane;
import mvcN.dao.Livros;
import mvcN.model.Livro;
import mvcN.view.AddLivroView;

/**
 *
 * @author danil
 */
public class AddLivroController {
    
    private AddLivroView view;
    private Livros livros;
    
    public AddLivroController(){
        
        this.view = new AddLivroView();
        this.livros = Livros.getInstancia();
        
        this.view.getBtnSalvar().addActionListener((e)->{
            addLivro();
            limparCampos();
        });
        
        this.view.getBtnCancelar().addActionListener((e)->{
            sair();
        });
                
        this.view.setVisible(true);
    }
    
    public void addLivro(){
        
        String nome = view.getTxtNome().getText();
        String autor = view.getTxtAutor().getText();
        int numeroPaginas = Integer.valueOf(view.getTxtNumeroPagina().getText());
        String resumo = view.getTxtResumo().getText();
        int estrangeiro = view.getCbEstangeiro().getSelectedIndex();
        
        Livro l = new Livro(nome, autor, numeroPaginas, resumo, estrangeiro);
        livros.addLivro(l);
        
        JOptionPane.showMessageDialog(view, "Livro Salvo Com Sucesso!");
        
    }
    
    private void limparCampos(){
        
        view.getTxtNome().setText("");
        view.getTxtAutor().setText("");
        view.getTxtNumeroPagina().setText("");
        view.getTxtResumo().setText("");
        view.getCbEstangeiro().setSelectedIndex(0);
    }
    
    private void sair(){
        view.dispose();
    }
}
