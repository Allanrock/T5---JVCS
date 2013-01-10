/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jvcsC.conexoes;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Allan
 */
public class CriaConexao {
    Socket conexao;
    
    public  CriaConexao(){
        try {
            
            this.conexao = new Socket("127.0.0.1",8001);
            PrintWriter EnviaInstrucao = new PrintWriter(conexao.getOutputStream());
            EnviaInstrucao.print("Conectei ^^\n");
            
        } catch (UnknownHostException ex) {
            Logger.getLogger(CriaConexao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(CriaConexao.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    
}
    
}
