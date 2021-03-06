/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visao;

import Controlador.Controlador;
import Controlador.Tipos_Operacoes;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

/**
 *
 * @author Rogerio
 */
public class GUI_Resultado extends javax.swing.JDialog {

    private boolean flag_conteudo;
    
    /**
     * Creates new form GUI_Resultado
     */
    public GUI_Resultado(java.awt.Frame parent, boolean modal, Tipos_Operacoes operacao) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        this.flag_conteudo = true;
        carregarValores(operacao);
        if (!this.flag_conteudo){
            this.setVisible(false);
            this.dispose();
        }else{
            this.setVisible(true);
        }        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Lista = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Resultado");

        lblTitulo.setText("TITULO");

        jScrollPane1.setViewportView(Lista);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTitulo)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 667, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 373, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(GUI_Resultado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_Resultado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_Resultado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_Resultado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {                
               // super(new javax.swing.JFrame(), true);
               // TODO arrumar essa gambiarra atualizando a comunicação entre frames!
                GUI_Resultado dialog = new GUI_Resultado(new javax.swing.JFrame(), true, Tipos_Operacoes.$GPGGA_Brutas);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> Lista;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTitulo;
    // End of variables declaration//GEN-END:variables

    private void carregarValores(Tipos_Operacoes operacao) {
        ArrayList<String> medicoes = null;
        switch (operacao) {
            case $GPGGA_Brutas:
                lblTitulo.setText(Controlador.getInstance().getGPGGAbrutas().getLabel());
                medicoes = Controlador.getInstance().getGPGGAbrutas().getDados();
            break;
            case $GPGGA_Processadas:
                lblTitulo.setText(Controlador.getInstance().getGPGGAprocessadas().getLabel());
                medicoes = Controlador.getInstance().getGPGGAprocessadas().getDados();
            break;
            case $PGLOR:
                lblTitulo.setText(Controlador.getInstance().getPGLOR().getLabel());
                medicoes = Controlador.getInstance().getPGLOR().getDados();
            break;
            case $GPGSV:
                lblTitulo.setText(Controlador.getInstance().getGPGSV().getLabel());
                medicoes = Controlador.getInstance().getGPGSV().getDados();
            break;
            case $GLGSV:
                lblTitulo.setText(Controlador.getInstance().getGLGSV().getLabel());
                medicoes = Controlador.getInstance().getGLGSV().getDados();
            break;
            case $BDGSV:
                lblTitulo.setText(Controlador.getInstance().getBDGSV().getLabel());
                medicoes = Controlador.getInstance().getBDGSV().getDados();
            break;
            case $GPGSA:
                lblTitulo.setText(Controlador.getInstance().getGPGSA().getLabel());
                medicoes = Controlador.getInstance().getGPGSA().getDados();
            break;
            case $GNGSA:
                lblTitulo.setText(Controlador.getInstance().getGNGSA().getLabel());
                medicoes = Controlador.getInstance().getGNGSA().getDados();
            break;
            case $QZGSA:
                lblTitulo.setText(Controlador.getInstance().getQZGSA().getLabel());
                medicoes = Controlador.getInstance().getQZGSA().getDados();
            break;
            case $IMGSA:
                lblTitulo.setText(Controlador.getInstance().getIMGSA().getLabel());
                medicoes = Controlador.getInstance().getIMGSA().getDados();
            break;
            case $BDGSA:
                lblTitulo.setText(Controlador.getInstance().getBDGSA().getLabel());
                medicoes = Controlador.getInstance().getBDGSA().getDados();
            break;
            case $GAGSA:
                lblTitulo.setText(Controlador.getInstance().getGAGSA().getLabel());
                medicoes = Controlador.getInstance().getGAGSA().getDados();
            break;
            case $GPRMC:
                lblTitulo.setText(Controlador.getInstance().getGPRMC().getLabel());
                medicoes = Controlador.getInstance().getGPRMC().getDados();
            break;
            case MEDICOES_BRUTAS:
                lblTitulo.setText(Controlador.getInstance().getMedicoesBrutas().getLabel());
                medicoes = Controlador.getInstance().getMedicoesBrutas().getDados();
            break;
            case MEDICOES_PROCESSADAS:
                lblTitulo.setText(Controlador.getInstance().getMedicoesProcessadas().getLabel());
                medicoes = Controlador.getInstance().getMedicoesProcessadas().getDados();
            break;
        }

        if (medicoes == null || medicoes.isEmpty()) {
            JOptionPane optionPane = new JOptionPane("O arquivo de log não possui medições NMEA!", JOptionPane.ERROR_MESSAGE);
            JDialog dialog = optionPane.createDialog("Erro");
            dialog.setAlwaysOnTop(true);
            dialog.setVisible(true);
            this.flag_conteudo = false;
            return;
        }

        DefaultListModel listModel = new DefaultListModel();
        
        for (String medicao : medicoes) {
            listModel.addElement(medicao);
        }
        
        Lista.setModel(listModel);
    }
}
