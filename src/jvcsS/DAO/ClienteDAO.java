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
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;
import jvcsS.dados.Cliente;

public class ClienteDAO extends DAO<Cliente, Integer> {

   public ClienteDAO() {
      sqlInsert = "INSERT INTO Cliente (Login, Senha) VALUES (?, ?)";
      sqlSelect = "SELECT id, descr, ch FROM acg WHERE id = ?";
      sqlUpdate = "UPDATE Cliente SET Login = ?, Senha = ? WHERE id = ?";
      sqlDelete = "DELETE FROM Cliente WHERE id = ?";
      sqlSelectAll = "SELECT * FROM Cliente";
      sqlCreate = "CREATE TABLE Cliente " +
         "(id INT NOT NULL AUTO_INCREMENT PRIMARY KEY," +
         " Login VARCHAR(255), Senha VARCHAR(255))";
      sqlDrop = "DROP TABLE Cliente";
   }

   public ClienteDAO(Connection conn) {
      super(conn);
   }

   protected void fillSqlInsert(PreparedStatement ps, Cliente a) throws SQLException {
      //ps.setInt(1, a.getId());
      ps.setString(1, a.getLogin());
      ps.setString(2, a.getSenha());
   }

   protected void fillSqlSelect(PreparedStatement ps, Integer id) throws SQLException {
      ps.setInt(1, id);
   }

   protected void fillSqlUpdate(PreparedStatement ps, Cliente a) throws SQLException {
      ps.setString(1, a.getLogin());
      ps.setString(2, a.getSenha());
      ps.setInt(3, a.getId());
   }

   protected void fillSqlDelete(PreparedStatement ps, Integer id) throws SQLException {
      ps.setInt(1, id);
   }

   protected Cliente fillFrom(ResultSet rs) throws SQLException {
      Cliente a = new Cliente();
      a.setId(rs.getInt("id"));
      a.setLogin(rs.getString("Login"));
      a.setSenha(rs.getString("Senha"));
      return a;
   }

}

