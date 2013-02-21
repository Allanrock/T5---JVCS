/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jvcsS.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Allan
 */
public class Servidor extends Thread {

    private String name;
    private Socket socket;
    private BufferedReader in;
    private PrintWriter out;
    private ArrayList<Socket> conexoes;
    private Controle controle;

    public Servidor(Socket socket) {
        this.socket = socket;
    }

    public void run() {
        try {
            try {
                controle = new Controle();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println("Um cliente conectou\n");
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            out = new PrintWriter(socket.getOutputStream(), true);
            String protocolo = null;
            
            while (true) {
                
                while(protocolo == null){
                    
                    protocolo = in.readLine();
                }
                
                controle.Menu(protocolo, in, out);
                protocolo = null;
                    
            }
            
            

        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
