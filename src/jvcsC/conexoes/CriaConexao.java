/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jvcsC.conexoes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Allan
 */
public class CriaConexao {

    public CriaConexao() {
        try {
            
            Socket socket = new Socket("127.0.0.1",6969);
            System.out.println("Cliente ligado!");
            try (Scanner recebe = new Scanner(socket.getInputStream())) {
                System.out.println(recebe.nextLine());
            }
            

        } catch (UnknownHostException ex) {
            Logger.getLogger(CriaConexao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(CriaConexao.class.getName()).log(Level.SEVERE, null, ex);
        }


    }
}
