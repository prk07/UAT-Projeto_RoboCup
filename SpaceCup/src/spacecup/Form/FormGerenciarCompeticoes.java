package spacecup.Form;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import spacecup.DAO.CompeticaoDAO;
import spacecup.DAO.EnderecoDAO;
import spacecup.DAO.TipoCompeticaoDAO;
import spacecup.Model.Competicao;
import spacecup.Model.Endereco;
import spacecup.Model.Usuario;

public class FormGerenciarCompeticoes extends javax.swing.JInternalFrame {

    private int id;
    private Usuario usuario;

    public FormGerenciarCompeticoes(Usuario usuario) {
        this.usuario = usuario;

        initComponents();
        populaLista();
        getCompeticoes();
        getEnderecos();
        isAdm();
    }

    private boolean isAdm() {
        if (usuario.getNivelAcesso() > 0) {
            return true;
        } else if (usuario.getNivelAcesso() == 0) {
            btnSalvar.setVisible(false);
            btnSalvar.setEnabled(false);

            btnEditar.setVisible(false);
            btnEditar.setEnabled(false);

            btnNovoEndereco.setVisible(false);
            btnNovoEndereco.setEnabled(false);

            btnNovoTipo.setVisible(false);
            btnNovoTipo.setEnabled(false);

            cbNomeCompeticao.setEnabled(false);
            cbEndereco.setEnabled(false);
            ckAtivo.setEnabled(false);
            
            txtData.setEnabled(false);
        }
        return false;
    }

    private void getCompeticoes() {
        List<String> competicoes = new TipoCompeticaoDAO().getNomes();
        for (String s : competicoes) {
            cbNomeCompeticao.addItem(s);
        }
    }

    private void getEnderecos() {
        List<Endereco> enderecos = new EnderecoDAO().getEndereco();
        for (Endereco e : enderecos) {
            cbEndereco.addItem(e.getRua());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnEditar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        cbNomeCompeticao = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        txtData = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cbEndereco = new javax.swing.JComboBox<>();
        btnNovoEndereco = new javax.swing.JButton();
        ckAtivo = new javax.swing.JCheckBox();
        btnNovoTipo = new javax.swing.JButton();

        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
        });

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Data", "Endereço", "Ativo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
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

        jLabel1.setText("Nome");

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        jLabel2.setText("Data");

        jLabel3.setText("Endereço");

        btnNovoEndereco.setText("Novo Endereço");
        btnNovoEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoEnderecoActionPerformed(evt);
            }
        });

        ckAtivo.setText("Ativo");

        btnNovoTipo.setText("Novo Tipo");
        btnNovoTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoTipoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cbNomeCompeticao, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2))
                    .addComponent(btnNovoTipo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ckAtivo)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnNovoEndereco)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSalvar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cbNomeCompeticao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(cbEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ckAtivo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovoEndereco)
                    .addComponent(btnEditar)
                    .addComponent(btnSalvar)
                    .addComponent(btnNovoTipo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMouseClicked
        int index = jTable.getSelectedRow();
        TableModel model = jTable.getModel();

        if (index != -1) {
            id = (int) model.getValueAt(index, 0);
            txtData.setText(String.valueOf(model.getValueAt(index, 2)));
            cbEndereco.setSelectedItem(model.getValueAt(index, 3));
            cbNomeCompeticao.setSelectedItem(model.getValueAt(index, 1));
            ckAtivo.setSelected((boolean) model.getValueAt(index, 4));
        }
    }//GEN-LAST:event_jTableMouseClicked

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        Competicao c = new Competicao();
        c.setId(id);

        try {
            c.setData(new SimpleDateFormat("yyyy-mm-dd").parse(txtData.getText()));
        } catch (ParseException ex) {
            Logger.getLogger(FormGerenciarCompeticoes.class.getName()).log(Level.SEVERE, null, ex);
        }

        c.setTipoCompeticao(new TipoCompeticaoDAO().getBynome((String) cbNomeCompeticao.getSelectedItem()));
        c.setEndereco(new EnderecoDAO().getByRua((String) cbEndereco.getSelectedItem()));
        c.setAtiva(ckAtivo.isSelected());
        new CompeticaoDAO().alteraCompeticao(c);
        JOptionPane.showMessageDialog(this, "Competição alterada com sucesso");
        populaLista();
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        Competicao c = new Competicao();
        try {
            c.setData(new SimpleDateFormat("yyyy-mm-dd").parse(txtData.getText()));
        } catch (ParseException ex) {
            Logger.getLogger(FormGerenciarCompeticoes.class.getName()).log(Level.SEVERE, null, ex);
        }

        c.setTipoCompeticao(new TipoCompeticaoDAO().getBynome((String) cbNomeCompeticao.getSelectedItem()));
        c.setEndereco(new EnderecoDAO().getByRua((String) cbEndereco.getSelectedItem()));
        c.setAtiva(ckAtivo.isSelected());
        new CompeticaoDAO().adicionaCompeticao(c);
        JOptionPane.showMessageDialog(this, "Competição salva com sucesso");
        populaLista();
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnNovoEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoEnderecoActionPerformed
        new NovoEndereco().setVisible(true);
    }//GEN-LAST:event_btnNovoEnderecoActionPerformed

    private void btnNovoTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoTipoActionPerformed
        new FormTipoCompeticao().setVisible(true);
    }//GEN-LAST:event_btnNovoTipoActionPerformed

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained

    }//GEN-LAST:event_formFocusGained

    private void populaLista() {
        List<Competicao> competicoes = new CompeticaoDAO().getCompeticoes();
        listar(competicoes);
    }

    private void listar(List<Competicao> competicoes) {
        DefaultTableModel model = (DefaultTableModel) jTable.getModel();
        clearList();

        for (Competicao c : competicoes) {
            model.addRow((Object[]) addLinha(c));
        }
    }

    private void clearList() {
        DefaultTableModel model = (DefaultTableModel) jTable.getModel();

        for (int i = model.getRowCount() - 1; i >= 0; i--) {
            model.removeRow(i);
        }
    }

    private Object addLinha(Competicao c) {
        return new Object[]{
            c.getId(),
            c.getTipoCompeticao().getNome(),
            c.getData(),
            c.getEndereco().getRua(),
            c.isAtiva()
        };
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnNovoEndereco;
    private javax.swing.JButton btnNovoTipo;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox<String> cbEndereco;
    private javax.swing.JComboBox<String> cbNomeCompeticao;
    private javax.swing.JCheckBox ckAtivo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    private javax.swing.JTextField txtData;
    // End of variables declaration//GEN-END:variables
}
