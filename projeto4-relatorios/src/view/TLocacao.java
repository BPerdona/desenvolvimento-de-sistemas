
package view;

import controller.ClienteController;
import controller.FilmeController;
import controller.LocacaoController;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import model.Cliente;
import model.Filme;

public class TLocacao extends javax.swing.JInternalFrame {
    
    //Utilizado para realizar as consultas no banco
    ClienteController clienteController;
    
    //Utilizado para realizar as consultas no banco
    FilmeController filmeController;
    
    //Utilizado para inserir uma nova locação
    LocacaoController locacaoController;
    
    //Utilizado para armazenar os filmes temporariamente antes de finalizar a locação
    List<Filme> filmesLocacao;

    public TLocacao() {
        initComponents();
        this.clienteController = new ClienteController();
        this.filmeController = new FilmeController();
        this.filmesLocacao = new ArrayList<Filme>();
        this.locacaoController = new LocacaoController();
        
        //Iniciando todas as tabelas com a consulta padrão
        this.consultarCliente();
        this.consultarFilme();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        textoNomeCliente = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaClientes = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        textoCodigoFilme = new javax.swing.JTextField();
        botaoLocar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaFilmes = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        botaoRemoverFilme = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabelaLocacao = new javax.swing.JTable();
        finalizarLocacao = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("Cliente");

        jLabel2.setText("Nome do Cliente");

        textoNomeCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textoNomeClienteKeyReleased(evt);
            }
        });

        tabelaClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tabelaClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaClientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaClientes);

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("Filmes");

        jLabel4.setText("Código do filme");

        textoCodigoFilme.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textoCodigoFilmeKeyReleased(evt);
            }
        });

        botaoLocar.setText("Locar");
        botaoLocar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoLocarActionPerformed(evt);
            }
        });

        tabelaFilmes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tabelaFilmes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaFilmesMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabelaFilmes);

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setText("Filmes para locação");

        botaoRemoverFilme.setText("Remover Filme");
        botaoRemoverFilme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoRemoverFilmeActionPerformed(evt);
            }
        });

        tabelaLocacao.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tabelaLocacao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaLocacaoMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tabelaLocacao);

        finalizarLocacao.setText("Finalizar Locação");
        finalizarLocacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finalizarLocacaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 641, Short.MAX_VALUE)
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(textoCodigoFilme, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(botaoLocar, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botaoRemoverFilme))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(textoNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(finalizarLocacao)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textoNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoCodigoFilme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoLocar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(botaoRemoverFilme))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(finalizarLocacao)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void finalizarLocacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finalizarLocacaoActionPerformed
        if(filmesLocacao.size()>0)
            this.finalizarLocacao(tabelaClientes.getSelectedRow());
    }//GEN-LAST:event_finalizarLocacaoActionPerformed

    private void botaoLocarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoLocarActionPerformed
        //Verificando se filme foi selecionado na tabela
        if(tabelaFilmes.getSelectedRow()>=0)
            this.adicionarFilmeLista(tabelaFilmes.getSelectedRow());
    }//GEN-LAST:event_botaoLocarActionPerformed

    private void botaoRemoverFilmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoRemoverFilmeActionPerformed
        this.filmesLocacao.remove(tabelaLocacao.getSelectedRow());
        this.criarTabelaFilmeLocacao();
    }//GEN-LAST:event_botaoRemoverFilmeActionPerformed

    private void tabelaClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaClientesMouseClicked
        this.setInterfaceCliente(tabelaClientes.getSelectedRow());
    }//GEN-LAST:event_tabelaClientesMouseClicked

    private void tabelaFilmesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaFilmesMouseClicked
        this.setInterfaceFilme(tabelaFilmes.getSelectedRow());
    }//GEN-LAST:event_tabelaFilmesMouseClicked

    private void tabelaLocacaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaLocacaoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tabelaLocacaoMouseClicked

    private void textoNomeClienteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textoNomeClienteKeyReleased
        this.consultarNome(textoNomeCliente.getText());
    }//GEN-LAST:event_textoNomeClienteKeyReleased

    private void textoCodigoFilmeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textoCodigoFilmeKeyReleased
        this.consultarCodigo(textoCodigoFilme.getText());
    }//GEN-LAST:event_textoCodigoFilmeKeyReleased

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaLocacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLocacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLocacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLocacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLocacao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoLocar;
    private javax.swing.JButton botaoRemoverFilme;
    private javax.swing.JButton finalizarLocacao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tabelaClientes;
    private javax.swing.JTable tabelaFilmes;
    private javax.swing.JTable tabelaLocacao;
    private javax.swing.JTextField textoCodigoFilme;
    private javax.swing.JTextField textoNomeCliente;
    // End of variables declaration//GEN-END:variables

    //Consulta feita utilizando o nome coloca na caixa de nome
    private void consultarNome(String text) {
        List<Cliente> clientes = (List<Cliente>)(List<?>) this.clienteController.getTuplasPorNome(text);
        this.criarTabelaCliente(clientes);
    }

    //Consulta geral
    private void consultarCliente() {
        List<Cliente> clientes = (List<Cliente>)(List<?>) this.clienteController.getTuplas();
        this.criarTabelaCliente(clientes);
    }
    
    //Criação da Tabela Cliente é feita independente de qual tipo de consulta foi feita
    private void criarTabelaCliente(List<Cliente> clientes){
        DefaultTableModel modeloCliente = new DefaultTableModel();
        modeloCliente.addColumn("Nome");
        modeloCliente.addColumn("Endereço");
        modeloCliente.addColumn("Data");
        tabelaClientes.setModel(modeloCliente);
        
        if(clientes.size()>0){
            for(Cliente cliente:clientes){
                modeloCliente.addRow(new Object[]{
                                    cliente.getNome(),
                                    cliente.getEndereco(),
                                    cliente.getDataCadastro()}); 
            }
        }
    }

    private void setInterfaceCliente(int indiceTupla) {
        Cliente cliente = (Cliente) this.clienteController.getTuplasPorIndice(indiceTupla);
        textoNomeCliente.setText(cliente.getNome());
        tabelaClientes.setRowSelectionInterval(indiceTupla, indiceTupla);
    }
    
    //Consulta padrão
    private void consultarFilme(){
        List<Filme> filmes = (List<Filme>) (List<?>) this.filmeController.getTuplas();
        criarTabelaFilme(filmes);
    }
    //Consulta baseada no codigo que foi digitado
    private void consultarCodigo(String text) {
        List<Filme> filmes = (List<Filme>) (List<?>) this.filmeController.getTuplasPorCodigo(text);
        criarTabelaFilme(filmes);
    }

    //Assim como Cliente a tabela Filme nao depende
    private void criarTabelaFilme(List<Filme> filmes) {
        DefaultTableModel modeloFilme = new DefaultTableModel();
        modeloFilme.addColumn("codigo");
        modeloFilme.addColumn("titulo");
        modeloFilme.addColumn("genero");
        modeloFilme.addColumn("produtora");
        tabelaFilmes.setModel(modeloFilme);
        
        if(filmes.size()>0){
            for(Filme filme:filmes){
                modeloFilme.addRow(new Object[]{
                                   filme.getCodigo(),
                                   filme.getTitulo(),
                                   filme.getGenero(),
                                   filme.getProdutora()
                });
            }
        }
    }

    private void setInterfaceFilme(int indiceTupla) {
        Filme filme = (Filme) this.filmeController.getTuplasPorIndice(indiceTupla);
        textoCodigoFilme.setText(filme.getCodigo());
        tabelaFilmes.setRowSelectionInterval(indiceTupla, indiceTupla);
    }

    //Utilizando para armazenar os filmes temporariamente em uma variavel global
    private void adicionarFilmeLista(int selectedRow) {
        Filme filme = (Filme) filmeController.getTuplasPorIndice(selectedRow);
        filmesLocacao.add(filme);
        criarTabelaFilmeLocacao();
        
    }

    private void criarTabelaFilmeLocacao() {
        DefaultTableModel modeloLocacao = new DefaultTableModel();
        modeloLocacao.addColumn("idFilme");
        modeloLocacao.addColumn("titulo");
        modeloLocacao.addColumn("genero");
        modeloLocacao.addColumn("produtora");
        modeloLocacao.addColumn("statusTupla");
        modeloLocacao.addColumn("codigo");
        tabelaLocacao.setModel(modeloLocacao);
        
        if(filmesLocacao.size()>0){
            for(Filme filme : filmesLocacao){
                modeloLocacao.addRow(new Object[]{
                                   filme.getIdFilme(),
                                   filme.getTitulo(),
                                   filme.getGenero(),
                                   filme.getProdutora(),
                                   filme.getStatusTupla(),
                                   filme.getCodigo()
                });
            }
        }
    }


    //Metodo que fará a locação e populará as tabelas Locacao e itensLocacao do banco de dados
    private void finalizarLocacao(int indiceTupla) {
        Cliente cliente = (Cliente) this.clienteController.getTuplasPorIndice(indiceTupla);
        
        //Função para realizar as inserções nas tabelas
        this.locacaoController.inserir((Object) cliente, filmesLocacao);
        
        //Após locação será limpado a lista de filmes e as seleções nas tabelas
        tabelaClientes.clearSelection();
        tabelaFilmes.clearSelection();
        textoNomeCliente.setText("");
        textoCodigoFilme.setText("");
        filmesLocacao.clear();
        criarTabelaFilmeLocacao();
    }
}
