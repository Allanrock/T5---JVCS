/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jvcsS.DAO;

/**
 *
 * @author Allan
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConfigurarDB {

   // Constantes para conexao com HSQLSB (modo standalone)
   static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
   static final String DB_NAME = "jvcs";
   static final String DB_URL = "jdbc:mysql://localhost:3306/" + DB_NAME;
   static final String DB_USER = "root";
   static final String DB_PASSWD = "admin";
   

   public static Connection ConectarComBanco() throws ClassNotFoundException, SQLException {
     Class.forName(JDBC_DRIVER);
     return DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWD);
   }
}

