/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mvcN.dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author danil
 */
public abstract class AbstractDAO {


    public String gravar(String local, List lista) {
        try {
            FileOutputStream fo = new FileOutputStream(local);
            ObjectOutputStream oo = new ObjectOutputStream(fo);
            oo.writeObject(lista);
            oo.close();
            return "Dados gravados com sucesso";
        } catch (Exception e) {
            return "Erro ao serializar " + e.getMessage();
        }
    }

    public List ler(String local) {
        List retorno = new ArrayList();
        try {
            File arq = new File(local);
            FileInputStream fi = new FileInputStream(arq.getAbsolutePath());
            ObjectInputStream oi = new ObjectInputStream(fi);
            retorno = (List) oi.readObject();
            oi.close();
            return retorno;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return retorno;
        }
    }

}
