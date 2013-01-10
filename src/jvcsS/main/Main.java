/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jvcsS.main;

import jvcsS.conexoes.CriaConexaoDB;
import jvcsS.controles.DoContato;
import jvcsS.dados.Contato;
import java.sql.Connection;
import java.sql.SQLException;
import jvcsS.conexoes.CriaServer;
/**
 *
 * @author Allan
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
                
        DoContato dao = new DoContato();
        CriaServer novo = new CriaServer();
        //dao.deleta(contato.getNome());
        
        
        
        
        
    }
}
