/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jvcsS.main;
import java.sql.SQLException;

/**
 *
 * @author Allan
 */
public class Main {
     public static void main(String[] args) throws ClassNotFoundException, SQLException{
         
         GerenciadorDB frame = new GerenciadorDB();
         frame.setVisible(true);
         
     }
    
    
}
