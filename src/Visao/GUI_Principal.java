/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visao;

import Controlador.ControladorTeste;
import Controlador.Tipos_Operacoes;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Rogerio
 */
public class GUI_Principal extends javax.swing.JFrame {

    private String abrirArquivo(String extensao, String titulo, String filtro){
        String fileName = null;

        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle(titulo);
        fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
        fileChooser.removeChoosableFileFilter(fileChooser.getChoosableFileFilters()[0]);
        fileChooser.addChoosableFileFilter(new FileNameExtensionFilter(filtro, extensao));
        
        int userSelection = fileChooser.showOpenDialog(null);
        if (userSelection == JFileChooser.APPROVE_OPTION) {
            File fileToSave = fileChooser.getSelectedFile();
            fileName = fileToSave.getAbsolutePath();
        }        
        
        return fileName;
    }
    
    /**
     * Creates new form GUI_Principal
     */
    public GUI_Principal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuOpenLog = new javax.swing.JMenuItem();
        menuExtrairGPGGA = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        menuExtrairPGLOR = new javax.swing.JMenuItem();
        menuExtrairGPGSV = new javax.swing.JMenuItem();
        menuExtrairGLGSV = new javax.swing.JMenuItem();
        menuExtrairBDGSV = new javax.swing.JMenuItem();
        menuExtrairGPGSA = new javax.swing.JMenuItem();
        menuExtrairGNGSA = new javax.swing.JMenuItem();
        menuExtrairQZGSA = new javax.swing.JMenuItem();
        menuExtrairIMGSA = new javax.swing.JMenuItem();
        menuExtrairBDGSA = new javax.swing.JMenuItem();
        menuExtrairGAGSA = new javax.swing.JMenuItem();
        menuExtrairGPRMC = new javax.swing.JMenuItem();
        menuOpenNMEA = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("GNSS Logger - NMEA Analyzer");

        jMenu1.setText("Arquivo");

        menuOpenLog.setText("Abrir log");
        menuOpenLog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuOpenLogActionPerformed(evt);
            }
        });
        jMenu1.add(menuOpenLog);

        menuExtrairGPGGA.setText("Extrair $GPGGA");
        menuExtrairGPGGA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuExtrairGPGGAActionPerformed(evt);
            }
        });
        jMenu1.add(menuExtrairGPGGA);

        jMenu3.setText("Extrair medições NMEA");

        menuExtrairPGLOR.setText("Extrair $PGLOR");
        menuExtrairPGLOR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuExtrairPGLORActionPerformed(evt);
            }
        });
        jMenu3.add(menuExtrairPGLOR);

        menuExtrairGPGSV.setText("Extrair $GPGSV");
        menuExtrairGPGSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuExtrairGPGSVActionPerformed(evt);
            }
        });
        jMenu3.add(menuExtrairGPGSV);

        menuExtrairGLGSV.setText("Extrair $GLGSV");
        menuExtrairGLGSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuExtrairGLGSVActionPerformed(evt);
            }
        });
        jMenu3.add(menuExtrairGLGSV);

        menuExtrairBDGSV.setText("Extrair $BDGSV");
        menuExtrairBDGSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuExtrairBDGSVActionPerformed(evt);
            }
        });
        jMenu3.add(menuExtrairBDGSV);

        menuExtrairGPGSA.setText("Extrair $GPGSA");
        menuExtrairGPGSA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuExtrairGPGSAActionPerformed(evt);
            }
        });
        jMenu3.add(menuExtrairGPGSA);

        menuExtrairGNGSA.setText("Extrair $GNGSA");
        menuExtrairGNGSA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuExtrairGNGSAActionPerformed(evt);
            }
        });
        jMenu3.add(menuExtrairGNGSA);

        menuExtrairQZGSA.setText("Extrair $QZGSA");
        menuExtrairQZGSA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuExtrairQZGSAActionPerformed(evt);
            }
        });
        jMenu3.add(menuExtrairQZGSA);

        menuExtrairIMGSA.setText("Extrair $IMGSA");
        menuExtrairIMGSA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuExtrairIMGSAActionPerformed(evt);
            }
        });
        jMenu3.add(menuExtrairIMGSA);

        menuExtrairBDGSA.setText("Extrair $BDGSA");
        menuExtrairBDGSA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuExtrairBDGSAActionPerformed(evt);
            }
        });
        jMenu3.add(menuExtrairBDGSA);

        menuExtrairGAGSA.setText("Extrair $GAGSA");
        menuExtrairGAGSA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuExtrairGAGSAActionPerformed(evt);
            }
        });
        jMenu3.add(menuExtrairGAGSA);

        menuExtrairGPRMC.setText("Extrair $GPRMC");
        menuExtrairGPRMC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuExtrairGPRMCActionPerformed(evt);
            }
        });
        jMenu3.add(menuExtrairGPRMC);

        jMenu1.add(jMenu3);

        menuOpenNMEA.setText("Abrir NMEA processado");
        menuOpenNMEA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuOpenNMEAActionPerformed(evt);
            }
        });
        jMenu1.add(menuOpenNMEA);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 488, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 370, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuOpenLogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuOpenLogActionPerformed
        String fileName = null;
        String titulo = "Abra o arquivo gerado pelo GNSS Logger";
        String extensao = "txt";
        String filtro = "txt (*.txt)";
        
        fileName = abrirArquivo(extensao,titulo,filtro);
        
        ControladorTeste.getInstance().abrirLog(fileName);
    }//GEN-LAST:event_menuOpenLogActionPerformed

    private void menuExtrairGPGGAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuExtrairGPGGAActionPerformed
       GUI_Resultado novaTela = new GUI_Resultado(this,true,Tipos_Operacoes.$GPGGA);
       novaTela.setVisible(true);
    }//GEN-LAST:event_menuExtrairGPGGAActionPerformed

    private void menuOpenNMEAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuOpenNMEAActionPerformed
        JOptionPane.showMessageDialog(this,"Abra o arquivo .nmea gerado pelo GNSS Analysis App.");
               
        String fileName = null;
        String titulo = "Abra o arquivo gerado pelo GNSS Analysis App";
        String extensao = "nmea";
        String filtro = "nmea (*.nmea)";
        
        fileName = abrirArquivo(extensao,titulo,filtro);
               
        ControladorTeste.getInstance().abrirLog(fileName);        
    }//GEN-LAST:event_menuOpenNMEAActionPerformed

    private void menuExtrairPGLORActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuExtrairPGLORActionPerformed
       GUI_Resultado novaTela = new GUI_Resultado(this,true,Tipos_Operacoes.$PGLOR);
       novaTela.setVisible(true);
    }//GEN-LAST:event_menuExtrairPGLORActionPerformed

    private void menuExtrairGPGSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuExtrairGPGSVActionPerformed
       GUI_Resultado novaTela = new GUI_Resultado(this,true,Tipos_Operacoes.$GPGSV);
       novaTela.setVisible(true);
    }//GEN-LAST:event_menuExtrairGPGSVActionPerformed

    private void menuExtrairGLGSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuExtrairGLGSVActionPerformed
       GUI_Resultado novaTela = new GUI_Resultado(this,true,Tipos_Operacoes.$GLGSV);
       novaTela.setVisible(true);
    }//GEN-LAST:event_menuExtrairGLGSVActionPerformed

    private void menuExtrairBDGSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuExtrairBDGSVActionPerformed
       GUI_Resultado novaTela = new GUI_Resultado(this,true,Tipos_Operacoes.$BDGSV);
       novaTela.setVisible(true);
    }//GEN-LAST:event_menuExtrairBDGSVActionPerformed

    private void menuExtrairGPGSAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuExtrairGPGSAActionPerformed
       GUI_Resultado novaTela = new GUI_Resultado(this,true,Tipos_Operacoes.$GPGSA);
       novaTela.setVisible(true);
    }//GEN-LAST:event_menuExtrairGPGSAActionPerformed

    private void menuExtrairGNGSAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuExtrairGNGSAActionPerformed
       GUI_Resultado novaTela = new GUI_Resultado(this,true,Tipos_Operacoes.$GNGSA);
       novaTela.setVisible(true);
    }//GEN-LAST:event_menuExtrairGNGSAActionPerformed

    private void menuExtrairQZGSAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuExtrairQZGSAActionPerformed
       GUI_Resultado novaTela = new GUI_Resultado(this,true,Tipos_Operacoes.$QZGSA);
       novaTela.setVisible(true);
    }//GEN-LAST:event_menuExtrairQZGSAActionPerformed

    private void menuExtrairIMGSAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuExtrairIMGSAActionPerformed
       GUI_Resultado novaTela = new GUI_Resultado(this,true,Tipos_Operacoes.$IMGSA);
       novaTela.setVisible(true);
    }//GEN-LAST:event_menuExtrairIMGSAActionPerformed

    private void menuExtrairBDGSAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuExtrairBDGSAActionPerformed
       GUI_Resultado novaTela = new GUI_Resultado(this,true,Tipos_Operacoes.$BDGSA);
       novaTela.setVisible(true);
    }//GEN-LAST:event_menuExtrairBDGSAActionPerformed

    private void menuExtrairGAGSAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuExtrairGAGSAActionPerformed
       GUI_Resultado novaTela = new GUI_Resultado(this,true,Tipos_Operacoes.$GAGSA);
       novaTela.setVisible(true);
    }//GEN-LAST:event_menuExtrairGAGSAActionPerformed

    private void menuExtrairGPRMCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuExtrairGPRMCActionPerformed
       GUI_Resultado novaTela = new GUI_Resultado(this,true,Tipos_Operacoes.$GPRMC);
       novaTela.setVisible(true);
    }//GEN-LAST:event_menuExtrairGPRMCActionPerformed

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
            java.util.logging.Logger.getLogger(GUI_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem menuExtrairBDGSA;
    private javax.swing.JMenuItem menuExtrairBDGSV;
    private javax.swing.JMenuItem menuExtrairGAGSA;
    private javax.swing.JMenuItem menuExtrairGLGSV;
    private javax.swing.JMenuItem menuExtrairGNGSA;
    private javax.swing.JMenuItem menuExtrairGPGGA;
    private javax.swing.JMenuItem menuExtrairGPGSA;
    private javax.swing.JMenuItem menuExtrairGPGSV;
    private javax.swing.JMenuItem menuExtrairGPRMC;
    private javax.swing.JMenuItem menuExtrairIMGSA;
    private javax.swing.JMenuItem menuExtrairPGLOR;
    private javax.swing.JMenuItem menuExtrairQZGSA;
    private javax.swing.JMenuItem menuOpenLog;
    private javax.swing.JMenuItem menuOpenNMEA;
    // End of variables declaration//GEN-END:variables
}
