/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jvcs.bancodados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Allan
 */
public class CriaConexaoDB {

    public static Connection getConexao() throws SQLException {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = null;
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jvcs", "root", "admin");
            return conn;
        } catch (ClassNotFoundException e) {
            throw new SQLException(e.getMessage());
        }

    }
}
