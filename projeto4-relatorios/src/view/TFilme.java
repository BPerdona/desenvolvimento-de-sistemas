
package view;

import controller.FilmeController;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Filme;

public class TFilme extends javax.swing.JInternalFrame {

    private FilmeController filmeController;
    
    public TFilme() {
        initComponents();
        this.filmeController = new FilmeController();
        this.consultar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        textoCodigo = new javax.swing.JTextField();
        botaoNovo = new javax.swing.JButton();
        botaoGravar = new javax.swing.JButton();
        botaoAlterar = new javax.swing.JButton();
        botaoExcluir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        textoTitulo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        textoGenero = new javax.swing.JTextField();
        textoProdutora = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaFilme = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);

        jLabel1.setText("Código");

        textoCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoCodigoActionPerformed(evt);
            }
        });

        botaoNovo.setText("Novo");
        botaoNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoNovoActionPerformed(evt);
            }
        });

        botaoGravar.setText("Gravar");
        botaoGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoGravarActionPerformed(evt);
            }
        });

        botaoAlterar.setText("Alterar");
        botaoAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAlterarActionPerformed(evt);
            }
        });

        botaoExcluir.setText("Excluir");
        botaoExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoExcluirActionPerformed(evt);
            }
        });

        jLabel2.setText("Título");

        jLabel3.setText("Gênero");

        jLabel4.setText("Produtora");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setText("Dados:");

        tabelaFilme.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tabelaFilme.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaFilmeMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaFilme);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(213, 213, 213))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(textoGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(textoProdutora))
                            .addComponent(textoTitulo)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(textoCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(botaoNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botaoGravar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(botaoAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botaoExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(12, 12, 12))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoNovo)
                    .addComponent(botaoExcluir)
                    .addComponent(botaoAlterar)
                    .addComponent(botaoGravar))
                .addGap(12, 12, 12)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textoTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoProdutora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoExcluirActionPerformed
        if(JOptionPane.showConfirmDialog(null, "Deseja realmente executar esta alteração?", "Excluir registro.", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
            this.excluir(tabelaFilme.getSelectedRow());
            this.consultar();
        }
    }//GEN-LAST:event_botaoExcluirActionPerformed

    private void tabelaFilmeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaFilmeMouseClicked
        this.setInterface(tabelaFilme.getSelectedRow());
    }//GEN-LAST:event_tabelaFilmeMouseClicked

    private void textoCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoCodigoActionPerformed

    private void botaoNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoNovoActionPerformed
        textoTitulo.setText("");
        textoCodigo.setText("");
        textoGenero.setText("");
        textoProdutora.setText("");
        tabelaFilme.clearSelection();
    }//GEN-LAST:event_botaoNovoActionPerformed

    private void botaoGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoGravarActionPerformed
        this.gravar(new Filme(textoTitulo.getText(), textoGenero.getText(), textoProdutora.getText(), textoCodigo.getText()));
    }//GEN-LAST:event_botaoGravarActionPerformed

    private void botaoAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAlterarActionPerformed
        Filme filme = (Filme) this.filmeController.getTuplasPorIndice(tabelaFilme.getSelectedRow());
        filme.setTitulo(textoTitulo.getText());
        filme.setCodigo(textoCodigo.getText());
        filme.setProdutora(textoProdutora.getText());
        filme.setGenero(textoGenero.getText());
        this.gravar(filme);
    }//GEN-LAST:event_botaoAlterarActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaFilme().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoAlterar;
    private javax.swing.JButton botaoExcluir;
    private javax.swing.JButton botaoGravar;
    private javax.swing.JButton botaoNovo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaFilme;
    private javax.swing.JTextField textoCodigo;
    private javax.swing.JTextField textoGenero;
    private javax.swing.JTextField textoProdutora;
    private javax.swing.JTextField textoTitulo;
    // End of variables declaration//GEN-END:variables

    private void consultar() {
        List<Filme> filmes = (List<Filme>) (List<?>) this.filmeController.getTuplas();
        DefaultTableModel modeloFilme = new DefaultTableModel();
        modeloFilme.addColumn("idFilme");
        modeloFilme.addColumn("titulo");
        modeloFilme.addColumn("genero");
        modeloFilme.addColumn("produtora");
        modeloFilme.addColumn("statusTupla");
        modeloFilme.addColumn("codigo");
        tabelaFilme.setModel(modeloFilme);
        
        
        if(filmes.size()>0){
            for(Filme filme:filmes){
                modeloFilme.addRow(new Object[]{
                                   filme.getIdFilme(),
                                   filme.getTitulo(),
                                   filme.getGenero(),
                                   filme.getProdutora(),
                                   filme.getStatusTupla(),
                                   filme.getCodigo()
                });
            }
            this.setInterface(0);
        }
    }

    private void setInterface(int indiceTupla) {
        Filme filme = (Filme) this.filmeController.getTuplasPorIndice(indiceTupla);
        textoTitulo.setText(filme.getTitulo());
        textoCodigo.setText(filme.getCodigo());
        textoGenero.setText(filme.getGenero());
        textoProdutora.setText(filme.getProdutora());
        tabelaFilme.setRowSelectionInterval(indiceTupla, indiceTupla);
    }

    private void gravar(Filme filme) {
        if(filme.getIdFilme()<0){
            this.filmeController.inserir(filme);
        }
        else{
            this.filmeController.alterar(filme);
        }
        this.consultar();
    }

    private void excluir(int selectedRow) {
        Filme filme = (Filme) this.filmeController.getTuplasPorIndice(selectedRow);
        this.filmeController.excluir(filme);
        filme = null;
    }
}
