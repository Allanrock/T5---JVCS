/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jvcsS.main;
import java.io.IOException;
import java.net.ServerSocket;
import jvcsS.DAO.*;
import java.sql.*;
import java.util.List;
import jvcsS.dados.Cliente;

/**
 *
 * @author Allan
 */
public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException, SQLException {
        ClienteDAO teste =  new ClienteDAO();
        Connection c = ConfigurarDB.ConectarComBanco();
        Cliente novo = new Cliente(100, "allan", "rock");
        teste.ConectarComBanco(c);
                
        
        System.out.println("Servidor Iniciado");
        try (ServerSocket listener = new ServerSocket(6969)) {
            while (true) {
                new Servidor(listener.accept()).start();
            }
        }
                       
        
    }
    
    
    
}
