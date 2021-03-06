package spacecup.Form;

import java.util.List;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import spacecup.DAO.CompeticaoDAO;
import spacecup.DAO.LancamentoDAO;
import spacecup.DAO.TipoCompeticaoDAO;
import spacecup.DAO.UsuarioDAO;
import spacecup.Model.Aluno;
import spacecup.Model.Lancamento;
import spacecup.Model.Usuario;

public class FormGerenciarLancamento extends javax.swing.JInternalFrame {

    private int id;
    private Usuario usuario;

    public FormGerenciarLancamento() {
        initComponents();
        setComboBox();
    }

    FormGerenciarLancamento(Usuario usuario) {
        initComponents();
        setComboBox();
        this.usuario = usuario;
        isAdm();
    }

    private boolean isAdm() {
        if (usuario.getNivelAcesso() > 0) {
            btnNovoLancamento.setEnabled(true);
            return true;
        } else if (usuario.getNivelAcesso() == 0) {
            Aluno aluno = new UsuarioDAO().getAlunoById(usuario.getId());
            if (!aluno.getEquipe().getTurma().getCompeticao().isAtiva()) {
                btnNovoLancamento.setEnabled(false);
                
                btnEditar.setVisible(false);
                btnEditar.setEnabled(false);
            }
        }
        return false;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cbAnoCompeticao = new javax.swing.JComboBox<>();
        cbCompeticoes = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnFiltrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        btnEditar = new javax.swing.JButton();
        btnDetalhes = new javax.swing.JButton();
        btnNovoLancamento = new javax.swing.JButton();

        jLabel1.setText("Ano");

        jLabel2.setText("Competicao");

        btnFiltrar.setText("Filtrar");
        btnFiltrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiltrarActionPerformed(evt);
            }
        });

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Equipe", "Turma"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable);

        btnEditar.setText("Editar Lançamento");
        btnEditar.setEnabled(false);
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnDetalhes.setText("Detalhes");
        btnDetalhes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetalhesActionPerformed(evt);
            }
        });

        btnNovoLancamento.setText("Novo Lançamento");
        btnNovoLancamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoLancamentoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnNovoLancamento)
                .addGap(37, 37, 37)
                .addComponent(btnDetalhes, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEditar)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDetalhes)
                    .addComponent(btnEditar)
                    .addComponent(btnNovoLancamento))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbCompeticoes, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbAnoCompeticao, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnFiltrar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbCompeticoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(cbAnoCompeticao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFiltrar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltrarActionPerformed
        String nome = (String) cbCompeticoes.getSelectedItem();
        String ano = (String) cbAnoCompeticao.getSelectedItem();

        List<Lancamento> lancamentos = new LancamentoDAO().getLancamentosByYear(nome, ano);
        listar(lancamentos);
    }//GEN-LAST:event_btnFiltrarActionPerformed

    private void jTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMouseClicked
        int index = jTable.getSelectedRow();
        TableModel model = jTable.getModel();

        if (index != -1 && isAdm()) {
            id = (int) model.getValueAt(index, 0);
            btnEditar.setEnabled(true);
        }
    }//GEN-LAST:event_jTableMouseClicked

    private void btnDetalhesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetalhesActionPerformed
        new detalheLancamento(id).setVisible(true);
    }//GEN-LAST:event_btnDetalhesActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        new detalheLancamento(id, usuario).setVisible(true);
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnNovoLancamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoLancamentoActionPerformed
        new detalheLancamento(usuario).setVisible(true);
    }//GEN-LAST:event_btnNovoLancamentoActionPerformed

    private void listar(List<Lancamento> lancamentos) {
        DefaultTableModel model = (DefaultTableModel) jTable.getModel();
        clearList();

        for (Lancamento l : lancamentos) {
            model.addRow((Object[]) addLinha(l));
        }
    }

    private void clearList() {
        DefaultTableModel model = (DefaultTableModel) jTable.getModel();

        for (int i = model.getRowCount() - 1; i >= 0; i--) {
            model.removeRow(i);
        }
    }

    private Object addLinha(Lancamento l) {
        return new Object[]{
            l.getId(),
            l.getEquipe().getNome(),
            l.getEquipe().getTurma().getNome()
        };
    }

    private void setComboBox() {
        for (String nome : new TipoCompeticaoDAO().getNomes()) {
            cbCompeticoes.addItem(nome);

            for (String s : new CompeticaoDAO().getDatas(nome)) {
                cbAnoCompeticao.addItem(s);
            }
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDetalhes;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnFiltrar;
    private javax.swing.JButton btnNovoLancamento;
    private javax.swing.JComboBox<String> cbAnoCompeticao;
    private javax.swing.JComboBox<String> cbCompeticoes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    // End of variables declaration//GEN-END:variables

}
