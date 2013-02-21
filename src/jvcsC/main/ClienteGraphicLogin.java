/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jvcsC.main;


import jvcsC.main.Cadastro;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;
import jvcsC.main.EsqueceuSenha;
/**
 *
 * @author Calamity
 */
public class ClienteGraphicLogin extends javax.swing.JFrame {

    BufferedReader in;
    PrintWriter out;
    Socket socket;
    /**
     * Creates new form ClienteGraphicLogin
     */
    public ClienteGraphicLogin() {
        initComponents();
    }
    
    public void configRed() throws UnknownHostException, IOException{
        
        socket = new Socket("177.156.153.94", 6969);
        out = new PrintWriter(socket.getOutputStream());
    }
    /*private String getLogin(){
    
      
    }
    
    private String getSenha(){
        
    }*/
  

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        fazerLogin = new javax.swing.JButton();
        novaConta = new javax.swing.JButton();
        Login = new javax.swing.JTextField();
        Senha = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        recuperarSenha = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Bem-vindo a loja virtual JStore. Por favor, logar ou cadastrar conta.");

        fazerLogin.setText("Fazer Login");
        fazerLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fazerLoginActionPerformed(evt);
            }
        });

        novaConta.setText("Criar nova conta");
        novaConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novaContaActionPerformed(evt);
            }
        });

        Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginActionPerformed(evt);
            }
        });

        Senha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SenhaActionPerformed(evt);
            }
        });

        jLabel2.setText("Nome de usuário");

        jLabel3.setText("Senha");

        recuperarSenha.setText("Esqueci minha senha");
        recuperarSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recuperarSenhaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(novaConta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(recuperarSenha)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(fazerLogin))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(Senha, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                    .addComponent(Login, javax.swing.GroupLayout.Alignment.LEADING)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(81, 81, 81)
                                .addComponent(jLabel1)))
                        .addGap(0, 93, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Senha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fazerLogin)
                    .addComponent(novaConta)
                    .addComponent(recuperarSenha)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SenhaActionPerformed
         // TODO add your handling code here:
    }//GEN-LAST:event_SenhaActionPerformed

    private void LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LoginActionPerformed
    private void novaContaActionPerformed(java.awt.event.ActionEvent evt) {
    this.dispose();
    new Cadastro().setVisible(true);
            
    }
    private void fazerLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fazerLoginActionPerformed
    
         try {
            
            out = new PrintWriter(socket.getOutputStream(), true);
        } catch (IOException ex) {
            Logger.getLogger(ClienteGraphicLogin.class.getName()).log(Level.SEVERE, null, ex);
        }

        out.println("Logar" + Senha.getText() + "-" + Login.getText());
        out.println("Logar" + Senha.getText() + "-" + Login.getText());
    // TODO add your handling code here:
    }//GEN-LAST:event_fazerLoginActionPerformed

    private void recuperarSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recuperarSenhaActionPerformed
    this.dispose(); 
    new EsqueceuSenha().setVisible(true);         // TODO add your handling code here:
    }//GEN-LAST:event_recuperarSenhaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ClienteGraphicLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClienteGraphicLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClienteGraphicLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClienteGraphicLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClienteGraphicLogin().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Login;
    private javax.swing.JTextField Senha;
    private javax.swing.JButton fazerLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton novaConta;
    private javax.swing.JButton recuperarSenha;
    // End of variables declaration//GEN-END:variables
}

        /*while (true) {
            if (login.startsWith("SUBMITNAME")) {
                out.println(getName());
            } else if (line.startsWith("NAMEACCEPTED")) {
                textField.setEditable(true);
            } else if (line.startsWith("MESSAGE")) {
                messageArea.append(line.substring(8) + "\n");
            }
        }*/

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/*package jvcsS.main;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import jvcsS.DAO.ClienteDAO;
import jvcsS.DAO.ConfigurarDB;
import jvcsS.dados.*;

/**
 *
 * @author Allan
 */
/*public class Controle {
    
    private ClienteDAO clientes;

    public Controle() throws ClassNotFoundException, SQLException {
        this.clientes = new ClienteDAO(ConfigurarDB.ConectarComBanco());
    }
    
    public void Menu(String protocolo, BufferedReader in, PrintWriter out){
        
        System.out.println("Entrou menu\n");
        String comando[] = protocolo.split("-");
        
        System.out.println(comando[0]);
        
        switch (comando[0]) {

            case "Logar":
                try {
                    out.println(Logar(protocolo));
                } catch (SQLException ex) {
                    Logger.getLogger(Controle.class.getName()).log(Level.SEVERE, null, ex);
                }
                brea


        }
        
        
        
    }
    
    
    public String Logar(String protocolo) throws SQLException{
        
        String resultado[] = protocolo.split("-");
        
        for(Cliente tmp : clientes.ProcurarTudo()){
            
            if(tmp.getLogin().equals(resultado[1]) && tmp.getSenha().equals(resultado[2])){
                return "LoginValido\n";
            }
            
        }
        
        return "LoginInvalido\n";
        
        
    }
    
    
}*/