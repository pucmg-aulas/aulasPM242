/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pucmg.aulaspm242.mvc.controller;

import pucmg.aulaspm242.mvc.dao.ContatoDAO;
import pucmg.aulaspm242.mvc.model.Contato;
import pucmg.aulaspm242.mvc.view.ListarContatoView;

/**
 *
 * @author danil
 */
public class ListarContatoController {
    
    private ListarContatoView view;
    private ContatoDAO contatoDao;
    
    public ListarContatoController(){
        this.view = new ListarContatoView();
        this.contatoDao = ContatoDAO.getInstance();
    }
    
    public void listarContatos(){
        
        for (Contato contato : contatoDao.getContatos()) {
            contato.contatoFormatado();
            //view.
        }

    }
    
}
