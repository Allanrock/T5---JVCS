/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jvcsS.dados;

/**
 *
 * @author Allan
 */
public class Cliente {
    
    private int id;
    private String login;
    private String senha;

    public Cliente(int id, String login, String senha) {
        this.id = id;
        this.login = login;
        this.senha = senha;
        
 
    }

    public Cliente() {
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    

    
    
}
