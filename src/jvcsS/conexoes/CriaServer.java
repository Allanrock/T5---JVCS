/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jvcsS.conexoes;

import java.io.IOException;
import java.net.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Allan
 */
public class CriaServer {
    
    ServerSocket conexao;
    Scanner RecebeInstrucao;

    public CriaServer(){
        try {
            this.conexao = new ServerSocket(8001);
            while(true){
                Socket s = conexao.accept();
                RecebeInstrucao = new Scanner(s.getInputStream());
                System.out.println(RecebeInstrucao.nextLine());
            }
        } catch (IOException ex) {
            Logger.getLogger(CriaServer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
