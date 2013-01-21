/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jvcsS.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Allan
 */
public abstract class DAO <T, PK> 
   implements InterfaceDAO <T, PK> {

   protected String sqlInsert;
   protected String sqlSelect;
   protected String sqlUpdate;
   protected String sqlDelete;
   protected String sqlSelectAll;
   protected String sqlCreate;
   protected String sqlDrop;

   protected Connection conn;
   
   public DAO() {
   }

   public DAO(Connection conn) {
      ConectarComBanco(conn);
   }
   public void ConectarComBanco(Connection conn) {
      this.conn = conn;
   }

   public void CriarTabela() throws SQLException {
      Statement s = null;
      try {
         s = conn.createStatement();
         s.executeUpdate(sqlCreate);
      } finally {
         close(s);
      }
   }

   public void FecharTabela() throws SQLException {
      Statement s = null;
      try {
         s = conn.createStatement();
         s.executeUpdate(sqlDrop);
      } finally {
         close(s);
      }
   }

   public void Criar(T t) throws SQLException {
      PreparedStatement ps = null;
      try {
         ps = conn.prepareStatement(sqlInsert);
         fillSqlInsert(ps, t);
         //ps.setInt(1, a.getId());
         //ps.setString(2, a.getDescr());
         //ps.setInt(3, a.getCh());
         ps.executeUpdate();
      } finally {
         close(ps);
      }
   }

   public T ProcurarPor(PK id) throws SQLException {
      PreparedStatement ps = null;
      ResultSet rs = null;
      try {
         ps = conn.prepareStatement(sqlSelect);
         fillSqlSelect(ps, id);
         //ps.setInt(1, id);
         rs = ps.executeQuery();
         List<T> results = getResults(rs);
         if (results.size() > 0)
            return results.get(0);
         else
            return null;
      } finally {
         close(rs);
         close(ps);
      }
   }

   public List<T> ProcurarTudo() throws SQLException {
      PreparedStatement ps = null;
      ResultSet rs = null;
      try {
         ps = conn.prepareStatement(sqlSelectAll);
         rs = ps.executeQuery();
         List<T> results = getResults(rs);
         return results;
      } finally {
         close(rs);
         close(ps);
      }
   }

   public void Atualizar(T t) throws SQLException {
      PreparedStatement ps = null;
      try {
         ps = conn.prepareStatement(sqlUpdate);
         fillSqlUpdate(ps, t);
         //ps.setString(1, a.getDescr());
         //ps.setInt(2, a.getCh());
         //ps.setInt(3, a.getId());
         ps.executeUpdate();
      } finally {
         close(ps);
      }
   }

   public void Deletar(PK id) throws SQLException {
      PreparedStatement ps = null;
      try {
         ps = conn.prepareStatement(sqlDelete);
         fillSqlDelete(ps, id);
         //ps.setInt(1, id);
         ps.executeUpdate();
      } finally {
         close(ps);
      }
   }
    
   private List<T> getResults(ResultSet rs) throws SQLException {
      List<T> results = new ArrayList<T>();
      while (rs.next()) {
         T t = fillFrom(rs);
         //a.setId(rs.getInt("id"));
         //a.setDescr(rs.getString("descr"));
         //a.setCh(rs.getInt("ch"));
         results.add(t);
      }
      return results;
   }

   private void close(Statement stmt) {
      if (stmt != null) {
         try {
            stmt.close();
         } catch (SQLException e) {}
      }
   }

   private void close(ResultSet rs) {
      if (rs != null) {
         try {
            rs.close();
         } catch (SQLException e) {}
      }
   }

   protected abstract void fillSqlInsert(PreparedStatement ps, T t) throws SQLException;

   protected abstract void fillSqlSelect(PreparedStatement ps, PK id) throws SQLException;

   protected abstract void fillSqlUpdate(PreparedStatement ps, T t) throws SQLException;

   protected abstract void fillSqlDelete(PreparedStatement ps, PK id) throws SQLException;

   protected abstract T fillFrom(ResultSet rs) throws SQLException;

}
