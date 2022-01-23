
package view;

import controller.ClienteController;
import controller.FilmeController;
import controller.ItensLocacaoController;
import controller.LocacaoController;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import model.Cliente;
import model.Filme;
import model.Locacao;


public class TelaDevolucao extends javax.swing.JFrame {
    
    ClienteController clienteController;
    FilmeController filmeController;
    LocacaoController locacaoController;
    ItensLocacaoController itensLocacaoController;
    ArrayList<Cliente> clientesLocados;

    public TelaDevolucao() {
        initComponents();
        this.clienteController = new ClienteController();
        this.filmeController = new FilmeController();
        this.locacaoController = new LocacaoController();
        this.itensLocacaoController = new ItensLocacaoController();
        this.clientesLocados = new ArrayList<>();
        
        this.consultarLocacao();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        textoNomeCliente = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaLocacao = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaFilmes = new javax.swing.JTable();
        botaoDevolucao = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("Locações");

        jLabel2.setText("Nome do Cliente");

        textoNomeCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoNomeClienteActionPerformed(evt);
            }
        });
        textoNomeCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textoNomeClienteKeyReleased(evt);
            }
        });

        tabelaLocacao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaLocacaoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaLocacao);

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("Filmes");

        tabelaFilmes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaFilmesMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabelaFilmes);

        botaoDevolucao.setText("Confirmar Devolução");
        botaoDevolucao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoDevolucaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(textoNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(botaoDevolucao))))
                            .addComponent(jLabel3))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoDevolucao))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textoNomeClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoNomeClienteActionPerformed

    }//GEN-LAST:event_textoNomeClienteActionPerformed

    private void tabelaLocacaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaLocacaoMouseClicked
        this.setInterface(tabelaLocacao.getSelectedRow());
        this.consultarFilmesLocados(this.tabelaLocacao.getSelectedRow());
    }//GEN-LAST:event_tabelaLocacaoMouseClicked

    private void tabelaFilmesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaFilmesMouseClicked

    }//GEN-LAST:event_tabelaFilmesMouseClicked

    private void botaoDevolucaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoDevolucaoActionPerformed
        if(tabelaLocacao.getSelectedRow()>=0)
            this.devolverItens(this.tabelaLocacao.getSelectedRow());
    }//GEN-LAST:event_botaoDevolucaoActionPerformed

    private void textoNomeClienteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textoNomeClienteKeyReleased
        this.consultarPorNome(this.textoNomeCliente.getText());
    }//GEN-LAST:event_textoNomeClienteKeyReleased

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(TelaDevolucao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaDevolucao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaDevolucao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaDevolucao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaDevolucao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoDevolucao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabelaFilmes;
    private javax.swing.JTable tabelaLocacao;
    private javax.swing.JTextField textoNomeCliente;
    // End of variables declaration//GEN-END:variables

    private void consultarLocacao() {
        ArrayList<Locacao> locacao = (ArrayList<Locacao>)(ArrayList<?>) this.locacaoController.getTuplas();
        this.clientesLocados = this.locacaoController.clientesLocados();
        this.criarTabelaLocacao(locacao);
    }

    private void criarTabelaLocacao(ArrayList<Locacao> locacao) {
        DefaultTableModel modeloCliente = new DefaultTableModel();
        modeloCliente.addColumn("Cliente");
        modeloCliente.addColumn("Data de Locacao");
        modeloCliente.addColumn("Data de Devolucao");
        modeloCliente.addColumn("Valor");
        modeloCliente.addColumn("Emprestado");
        tabelaLocacao.setModel(modeloCliente);
  
        if(locacao.size()>0){
            for(int i=0; i<locacao.size(); i++){
                
                String aux = "Não";
                if(locacao.get(i).isEmprestado())
                    aux = "Sim";
                
                modeloCliente.addRow(new Object[]{
                                    clientesLocados.get(i).getNome(),
                                    locacao.get(i).getDataLocacao(),
                                    locacao.get(i).getDataDevolucao(),
                                    locacao.get(i).getValor(),
                                    aux}); 
            }
        }
    }

    private void setInterface(int indiceTupla) {
        tabelaLocacao.setRowSelectionInterval(indiceTupla, indiceTupla);
    }

    private void consultarFilmesLocados(int indiceTupla) {
        Locacao locacao = (Locacao) this.locacaoController.getTuplasPorIndice(indiceTupla);
        ArrayList<Filme> filmes = this.filmeController.getTuplasPorId(locacao.getIdLocacao());
        this.criarTabelaFilmesLocados(filmes);
    }

    private void criarTabelaFilmesLocados(ArrayList<Filme> filmes) {
        DefaultTableModel modeloCliente = new DefaultTableModel();
        modeloCliente.addColumn("Codigo");
        modeloCliente.addColumn("Titulo");
        modeloCliente.addColumn("Genero");
        modeloCliente.addColumn("Produtora");
        tabelaFilmes.setModel(modeloCliente);
        
        if(filmes.size()>0){
            for(int i=0; i<filmes.size(); i++){  
                modeloCliente.addRow(new Object[]{
                                    filmes.get(i).getCodigo(),
                                    filmes.get(i).getTitulo(),
                                    filmes.get(i).getGenero(),
                                    filmes.get(i).getProdutora()}); 
            }
        }
    }

    private void devolverItens(int indiceTupla) {
        Locacao locacao = (Locacao) this.locacaoController.getTuplasPorIndice(indiceTupla);
        this.locacaoController.excluir((Object) locacao);
        this.itensLocacaoController.excluir(locacao);
        this.tabelaFilmes.clearSelection();
        DefaultTableModel modeloCliente = new DefaultTableModel();
        modeloCliente.addColumn("Codigo");
        modeloCliente.addColumn("Titulo");
        modeloCliente.addColumn("Genero");
        modeloCliente.addColumn("Produtora");
        tabelaFilmes.setModel(modeloCliente);          
        this.consultarLocacao();
        this.textoNomeCliente.setText(" ");
    }

    private void consultarPorNome(String texto) {
       ArrayList<Locacao> locacao = (ArrayList<Locacao>)(ArrayList<?>) this.locacaoController.getTuplas();
       ArrayList<Cliente> clientes = (ArrayList<Cliente>)(ArrayList<?>) this.clienteController.getTuplasPorNome(texto);
       ArrayList<Locacao> filtroLocacao = new ArrayList<>();
       ArrayList<Cliente> clientesLoc = new ArrayList<>();
       
       
       for(Locacao loc: locacao){
           for(Cliente cl:clientes){
               if(loc.getCliente_idCliente() == cl.getIdCliente())
                   filtroLocacao.add(loc);
                   clientesLoc.add(cl);
           }
       }
       
       this.clientesLocados = clientesLoc;
       this.criarTabelaLocacao(filtroLocacao);
    }
}

    

