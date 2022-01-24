
package view;

import controller.UsuarioController;
import java.util.List;
import model.Usuario;
import javax.swing.JOptionPane;

public class TelaLogin extends javax.swing.JFrame {
    
    private UsuarioController usuarioController;
    private Usuario usuario;

  
    public TelaLogin() {
        initComponents();
        this.usuarioController = new UsuarioController();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        textoLogin = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        textoSenha = new javax.swing.JPasswordField();
        botaoEntrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Login:");

        textoLogin.setText("admin");
        textoLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoLoginActionPerformed(evt);
            }
        });

        jLabel2.setText("Senha:");

        textoSenha.setText("admin");
        textoSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoSenhaActionPerformed(evt);
            }
        });

        botaoEntrar.setText("Entrar");
        botaoEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoEntrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1)
                            .addComponent(textoLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
                            .addComponent(jLabel2)
                            .addComponent(textoSenha)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(botaoEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textoLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textoSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botaoEntrar)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textoLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoLoginActionPerformed

    private void textoSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoSenhaActionPerformed

    private void botaoEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEntrarActionPerformed
        String login = textoLogin.getText();
        String senha = String.valueOf(textoSenha.getPassword());
        this.usuarioController.consultarLogin(new Usuario(login, senha));
        List<Usuario> todosUsuarios = (List<Usuario>)(List<?>)this.usuarioController.getTuplas();
        if(todosUsuarios.size() == 1){
            this.usuario = (Usuario)todosUsuarios.get(todosUsuarios.size()-1);
            java.awt.EventQueue.invokeLater(new Runnable() {
               public void run(){
                   new TelaPrincipal(TelaLogin.this).setVisible(true);
               } 
            });
        } else{
            textoLogin.setText("");
            textoSenha.setText("");
            JOptionPane.showMessageDialog(this, "Usuário não encontrado!", "Tela login", 1);
        }
    }//GEN-LAST:event_botaoEntrarActionPerformed

    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }
    
    public Usuario getUsuario(){
        return this.usuario;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoEntrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField textoLogin;
    private javax.swing.JPasswordField textoSenha;
    // End of variables declaration//GEN-END:variables
}
