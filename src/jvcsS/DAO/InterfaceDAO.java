/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jvcsS.DAO;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Allan
 */
public interface InterfaceDAO <T, PK> {

   public void ConectarComBanco(Connection conn);

   public void CriarTabela() throws SQLException;

   public void FecharTabela() throws SQLException;

   public void Criar(T newInstance) throws SQLException;

   public T ProcurarPor(PK id) throws SQLException;

   public List<T> ProcurarTudo() throws SQLException;

   public void Atualizar(T transientObject) throws SQLException;

   public void Deletar(PK id) throws SQLException;
}
