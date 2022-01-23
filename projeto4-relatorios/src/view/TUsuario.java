
package view;

import controller.UsuarioController;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Usuario;

public class TUsuario extends javax.swing.JInternalFrame {

    private UsuarioController usuarioController;

    public TUsuario() {
        initComponents();
        this.usuarioController = new UsuarioController();
        this.consultar();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaUsuario = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        textoNome = new javax.swing.JTextField();
        textoLogin = new javax.swing.JTextField();
        boxCargo = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        textoPassword = new javax.swing.JPasswordField();
        buttonGravar = new javax.swing.JButton();
        buttonRemover = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        buttonNovo = new javax.swing.JButton();

        jLabel4.setText("jLabel4");

        jPasswordField1.setText("jPasswordField1");

        setClosable(true);
        setIconifiable(true);

        tabelaUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tabelaUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaUsuarioMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaUsuario);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("Usuarios");

        jLabel2.setText("Nome");

        jLabel3.setText("Login");

        boxCargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Atendente", "Não Administrativo" }));
        boxCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxCargoActionPerformed(evt);
            }
        });

        jLabel5.setText("Cargo");

        buttonGravar.setText("Gravar");
        buttonGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonGravarActionPerformed(evt);
            }
        });

        buttonRemover.setText("Remover");
        buttonRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRemoverActionPerformed(evt);
            }
        });

        jLabel6.setText("Senha");

        buttonNovo.setText("Novo");
        buttonNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonNovoActionPerformed(evt);
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 483, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textoLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(textoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textoPassword)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(jLabel5)
                                    .addComponent(boxCargo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buttonNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonGravar, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(126, 126, 126)
                        .addComponent(buttonRemover)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5))
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boxCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonGravar)
                    .addComponent(buttonRemover)
                    .addComponent(buttonNovo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boxCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxCargoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxCargoActionPerformed

    private void tabelaUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaUsuarioMouseClicked
        this.setInterface(tabelaUsuario.getSelectedRow());
    }//GEN-LAST:event_tabelaUsuarioMouseClicked

    private void buttonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonNovoActionPerformed
        textoNome.setText("");
        textoLogin.setText("");
        textoPassword.setText("");
    }//GEN-LAST:event_buttonNovoActionPerformed

    private void buttonGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGravarActionPerformed
        String selected = (String) boxCargo.getSelectedItem();
        Integer escolha=3;
        if(selected.equals("Administrador"))
            escolha=1;
        if(selected.equals("Atendente"))
            escolha=2;
        if(selected.equals("Não Administrativo"))
            escolha=3;
        this.gravar(new Usuario(textoNome.getName(), textoLogin.getText(), String.valueOf(textoPassword.getPassword()), escolha));
    }//GEN-LAST:event_buttonGravarActionPerformed

    private void buttonRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRemoverActionPerformed
        if(JOptionPane.showConfirmDialog(null, "Deseja realmente executar esta alteração?", "Excluir registro.", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
            this.excluir(tabelaUsuario.getSelectedRow());
            this.consultar();
        }
    }//GEN-LAST:event_buttonRemoverActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxCargo;
    private javax.swing.JButton buttonGravar;
    private javax.swing.JButton buttonNovo;
    private javax.swing.JButton buttonRemover;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaUsuario;
    private javax.swing.JTextField textoLogin;
    private javax.swing.JTextField textoNome;
    private javax.swing.JPasswordField textoPassword;
    // End of variables declaration//GEN-END:variables
    
    private void consultar(){
        List<Usuario> usuarios = (List<Usuario>)(List<?>) this.usuarioController.getTuplas();
        DefaultTableModel modeloCliente = new DefaultTableModel();
        modeloCliente.addColumn("Id");
        modeloCliente.addColumn("Nome");
        modeloCliente.addColumn("Login");
        modeloCliente.addColumn("statusTupla");
        tabelaUsuario.setModel(modeloCliente);
        
        if(usuarios.size()>0){
            for(Usuario usuario:usuarios){
                modeloCliente.addRow(new Object[]{
                                    usuario.getIdUsuario(),
                                    usuario.getNome(),
                                    usuario.getLogin(),
                                    usuario.getStatusTupla()});  
            }
            this.setInterface(0);
        }
    }
    
    private void setInterface(int indiceTupla){
        Usuario usuario = (Usuario) this.usuarioController.getTuplasPorIndice(indiceTupla);
        textoNome.setText(usuario.getNome());
        textoLogin.setText(usuario.getLogin());
        textoPassword.setText(usuario.getSenha());
        //Finalizar essa parte
//        this.boxCargo.setSelectedItem(1);
    }
    
    private void gravar(Usuario usuario){
        this.usuarioController.inserir(usuario);
        this.consultar();
    }
    
    private void excluir(int indiceTupla){
        Usuario usuario = (Usuario) this.usuarioController.getTuplasPorIndice(indiceTupla);
        this.usuarioController.excluir(usuario);
    }
}
