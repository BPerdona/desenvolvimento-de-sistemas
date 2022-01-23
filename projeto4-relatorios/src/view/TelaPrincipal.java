
package view;

import controller.PerfilUsuarioController;
import java.util.List;
import javax.swing.JOptionPane;
import model.PerfilUsuario;
import model.Usuario;

public class TelaPrincipal extends javax.swing.JFrame {
    
    private Usuario usuario;
    private PerfilUsuarioController perfilControl;
    private PerfilUsuario perfilUsuario;
    
    public TelaPrincipal(TelaLogin telaLogin) {
        initComponents();
        telaLogin.setVisible(false);
        telaLogin.dispose();
        this.usuario=telaLogin.getUsuario();
        telaLogin=null;
        this.perfilControl = new PerfilUsuarioController(new PerfilUsuario(this.usuario.getPerfilUsuario_idPerfilUsuario(), null,null,null));
        List<PerfilUsuario> userRole = (List<PerfilUsuario>) (List<?>) this.perfilControl.getTuplas();
        
        
        if(userRole.size() == 1){
            this.perfilUsuario = (PerfilUsuario)userRole.get(userRole.size()-1);
            if(this.perfilUsuario.getNome().equals("Atendente"))
                this.jMenu4.setVisible(false);
            if(this.perfilUsuario.getNome().equals("Não Administrativo")){
                this.jMenu3.setVisible(false);
                this.jMenu4.setVisible(false);
            }
        }else{
            JOptionPane.showMessageDialog(this, "Perfil do usuário não encontrado!");
            this.setVisible(false);
            this.dispose();
            System.exit(0);
        }
        this.nomeUtilizador.setText("Usuário: "+this.usuario.getNome()+" | Perfil: "+this.perfilUsuario.getNome());        
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        deskTop = new javax.swing.JDesktopPane();
        nomeUtilizador = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        itemCliente = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        nomeUtilizador.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        nomeUtilizador.setForeground(new java.awt.Color(255, 102, 102));
        nomeUtilizador.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        nomeUtilizador.setText(" ");

        deskTop.setLayer(nomeUtilizador, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout deskTopLayout = new javax.swing.GroupLayout(deskTop);
        deskTop.setLayout(deskTopLayout);
        deskTopLayout.setHorizontalGroup(
            deskTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, deskTopLayout.createSequentialGroup()
                .addContainerGap(715, Short.MAX_VALUE)
                .addComponent(nomeUtilizador, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        deskTopLayout.setVerticalGroup(
            deskTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, deskTopLayout.createSequentialGroup()
                .addContainerGap(681, Short.MAX_VALUE)
                .addComponent(nomeUtilizador, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jMenu1.setText("Cadastro");

        itemCliente.setText("Cliente");
        itemCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemClienteActionPerformed(evt);
            }
        });
        jMenu1.add(itemCliente);

        jMenuItem2.setText("Filme");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Locação");

        jMenuItem3.setText("Locar Filme");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuItem4.setText("Devolução/Consulta");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Relatório");

        jMenuItem5.setText("Cliente");
        jMenu3.add(jMenuItem5);

        jMenuItem6.setText("Filme");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem6);

        jMenuItem7.setText("Locação");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem7);

        jMenuItem8.setText("Devolução");
        jMenu3.add(jMenuItem8);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Administração");

        jMenuItem9.setText("Usuário");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem9);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(deskTop)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(deskTop)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void itemClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemClienteActionPerformed
        TCliente cliente = new TCliente();
        deskTop.add(cliente);
        cliente.setVisible(true);
    }//GEN-LAST:event_itemClienteActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        TFilme filme = new TFilme();
        deskTop.add(filme);
        filme.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        TLocacao locacao = new TLocacao();
        deskTop.add(locacao);
        locacao.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        TDevolucao devolucao = new TDevolucao();
        deskTop.add(devolucao);
        devolucao.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        TUsuario usuario = new TUsuario();
        deskTop.add(usuario);
        usuario.setVisible(true);
    }//GEN-LAST:event_jMenuItem9ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane deskTop;
    private javax.swing.JMenuItem itemCliente;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JLabel nomeUtilizador;
    // End of variables declaration//GEN-END:variables
}
