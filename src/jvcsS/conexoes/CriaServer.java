/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jvcsS.conexoes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Allan
 */
public class CriaServer {

    
    public CriaServer() {
        try {
            ServerSocket ConexaoServer = new ServerSocket(6969);
            System.out.println("Servidor ligado!");
            while(true){
                Socket cliente = ConexaoServer.accept();
                
                PrintWriter envia = new PrintWriter(cliente.getOutputStream());
                envia.print("EnviadoTesteDocliente");
            }
        } catch (IOException ex) {
            Logger.getLogger(CriaServer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
