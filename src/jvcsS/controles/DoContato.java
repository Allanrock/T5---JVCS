/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jvcsS.controles;

import java.sql.Connection;
import jvcsS.conexoes.CriaConexaoDB;
import jvcsS.dados.Contato;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Allan
 */
public class DoContato {

    private Connection conexao;

    public DoContato() throws SQLException {
        this.conexao = CriaConexaoDB.getConexao();
    }

    public void adiciona(Contato c) throws SQLException {

        if (!pesquisa(c.getLogin(), "login")) {
            String sql = "insert into contato(login, senha)"
                    + "values(?,?)";
            PreparedStatement stmt = conexao.prepareStatement(sql);

            //seta os valores
            stmt.setString(1, c.getLogin());
            stmt.setString(2, c.getSenha());
            

            //Executa o codigo sql
            stmt.execute();
            stmt.close();
            System.out.println("Conta criada!");
        } else {
            System.out.println("Login ja existe");
        }

    }

    public void deleta(String alvo) throws SQLException {

        String sql = "DELETE from contato where login = ?";
        PreparedStatement stmt = conexao.prepareStatement(sql);


        stmt.setString(1, alvo);

        stmt.execute();
        stmt.close();

        System.out.println(alvo + " deletado!");
    }

    public boolean loga(String login, String senha) throws SQLException {

        String sql = "Select * from contato";
        PreparedStatement stmt = conexao.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();

        while (rs.next()) {
            if (rs.getString("login").equals(login) && rs.getString("senha").equals(senha)) {
                System.out.println("Logado");
                return true;
            }
        }
        System.out.println("Não encontramos sua conta =/ ");
        return false;



    }

    public boolean pesquisa(String alvo, String tipo) throws SQLException {

        String sql = "Select * from contato";
        PreparedStatement stmt = conexao.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();

        while (rs.next()) {
            if (alvo.equals(rs.getString(tipo))) {
                return true;
            }
        }
        return false;
    }
}
