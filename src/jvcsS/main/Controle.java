/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jvcsS.main;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import jvcsS.DAO.ClienteDAO;
import jvcsS.DAO.ConfigurarDB;
import jvcsS.dados.*;

/**
 *
 * @author Allan
 */
public class Controle {
    
    private ClienteDAO clientes;

    public Controle() throws ClassNotFoundException, SQLException {
        Connection c = ConfigurarDB.ConectarComBanco();
        this.clientes = new ClienteDAO();
        clientes.ConectarComBanco(c);
    }
    
    public void Menu(String protocolo, BufferedReader in, PrintWriter out){
        
        System.out.println("Entrou menu\n");
        String comando[] = protocolo.split("-");
        
        System.out.println(comando[0]);
        
        switch (comando[0]) {

            case "Logar":
                try {
                    out.println(Logar(protocolo));
                } catch (SQLException ex) {
                    Logger.getLogger(Controle.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;


        }
        
        
        
    }
    
    
    public String Logar(String protocolo) throws SQLException{
        
        String resultado[] = protocolo.split("-");
        
        for(Cliente tmp : clientes.ProcurarTudo()){
            
            if(tmp.getLogin().equals(resultado[1]) && tmp.getSenha().equals(resultado[2])){
                return "LoginValido\n";
            }
            
        }
        
        return "LoginInvalido\n";
        
        
    }
    
    
}
