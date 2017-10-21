
package spacecup.Form;

import java.awt.Dimension;
import javax.swing.JInternalFrame;

public class MainForm extends javax.swing.JFrame {

    public MainForm() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sideBar = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        Lancamentos = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        Alunos = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jdPanel = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        sideBar.setBackground(new java.awt.Color(4, 47, 107));
        sideBar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logo.setBackground(new java.awt.Color(50, 230, 200));
        logo.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        logo.setForeground(new java.awt.Color(50, 230, 200));
        logo.setText("Space Cup");
        sideBar.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 130, -1));

        Lancamentos.setBackground(new java.awt.Color(4, 47, 107));
        Lancamentos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LancamentosMouseClicked(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/spacecup/icons/rocket.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(254, 254, 254));
        jLabel2.setText("Lancamentos");

        javax.swing.GroupLayout LancamentosLayout = new javax.swing.GroupLayout(Lancamentos);
        Lancamentos.setLayout(LancamentosLayout);
        LancamentosLayout.setHorizontalGroup(
            LancamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LancamentosLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addContainerGap(44, Short.MAX_VALUE))
        );
        LancamentosLayout.setVerticalGroup(
            LancamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LancamentosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(LancamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        sideBar.add(Lancamentos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 230, 60));
        sideBar.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 210, 20));

        Alunos.setBackground(new java.awt.Color(4, 47, 107));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/spacecup/icons/rocket.png"))); // NOI18N

        jLabel5.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(254, 254, 254));
        jLabel5.setText("Alunos");

        javax.swing.GroupLayout AlunosLayout = new javax.swing.GroupLayout(Alunos);
        Alunos.setLayout(AlunosLayout);
        AlunosLayout.setHorizontalGroup(
            AlunosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AlunosLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addContainerGap(99, Short.MAX_VALUE))
        );
        AlunosLayout.setVerticalGroup(
            AlunosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AlunosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(AlunosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        sideBar.add(Alunos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 230, -1));

        jdPanel.setBackground(new java.awt.Color(50, 230, 200));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(sideBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jdPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 766, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sideBar, javax.swing.GroupLayout.DEFAULT_SIZE, 478, Short.MAX_VALUE)
            .addComponent(jdPanel)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void LancamentosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LancamentosMouseClicked
        FormGerenciarLancamento janela = new FormGerenciarLancamento();
        addJanela(janela);
    }//GEN-LAST:event_LancamentosMouseClicked

    private void addJanela(JInternalFrame janela) {
        jdPanel.removeAll();
        Dimension size = jdPanel.getSize();
        janela.setSize(size);
        jdPanel.add(janela);
        janela.setLocation(0, 0);
        janela.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Alunos;
    private javax.swing.JPanel Lancamentos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JDesktopPane jdPanel;
    private javax.swing.JLabel logo;
    private javax.swing.JPanel sideBar;
    // End of variables declaration//GEN-END:variables
}
