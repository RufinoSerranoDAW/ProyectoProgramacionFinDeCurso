/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dialogos;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;

/**
 *
 * @author rufis
 */
public class Dlg_Acciones extends javax.swing.JDialog {

    /**
     * Creates new form Dlg_ConectarCrearBBDD
     */
    public Dlg_Acciones(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        // Escuchador para regresar a la ventana anterior
        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                parent.setVisible(true);
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btn_conectar_bbdd = new javax.swing.JButton();
        btn_crear_bbdd = new javax.swing.JButton();
        btn_borrar_bbdd = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("¿Qué desea realizar?");

        btn_conectar_bbdd.setText("Conectar y operar con Base de Datos existente");
        btn_conectar_bbdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_conectar_bbddActionPerformed(evt);
            }
        });

        btn_crear_bbdd.setText("Crear nueva Base de Datos");
        btn_crear_bbdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_crear_bbddActionPerformed(evt);
            }
        });

        btn_borrar_bbdd.setText("Borrar Base de Datos existente");
        btn_borrar_bbdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_borrar_bbddActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/mysql.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_borrar_bbdd)
                        .addGap(87, 87, 87))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_crear_bbdd)
                        .addGap(96, 96, 96))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(55, Short.MAX_VALUE)
                        .addComponent(btn_conectar_bbdd)
                        .addGap(37, 37, 37)))
                .addComponent(jLabel2)
                .addGap(31, 31, 31))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(btn_conectar_bbdd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                        .addComponent(btn_crear_bbdd)
                        .addGap(18, 18, 18)
                        .addComponent(btn_borrar_bbdd)))
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_conectar_bbddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_conectar_bbddActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        this.dispose();
            
        Dlg_ConectarBaseDeDatos ccbd= new Dlg_ConectarBaseDeDatos(this, true);
        ccbd.setVisible(true);
    }//GEN-LAST:event_btn_conectar_bbddActionPerformed

    private void btn_crear_bbddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_crear_bbddActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        this.dispose();
        
        Dlg_CrearBaseDeDatos cbd= new Dlg_CrearBaseDeDatos(this, true);
        cbd.setVisible(true);
    }//GEN-LAST:event_btn_crear_bbddActionPerformed

    private void btn_borrar_bbddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_borrar_bbddActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        this.dispose();
        
        Dlg_BorrarBaseDeDatos bbd= new Dlg_BorrarBaseDeDatos(this, true);
        bbd.setVisible(true);
    }//GEN-LAST:event_btn_borrar_bbddActionPerformed

        
    
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
            java.util.logging.Logger.getLogger(Dlg_Acciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dlg_Acciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dlg_Acciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dlg_Acciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Dlg_Acciones dialog = new Dlg_Acciones(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btn_borrar_bbdd;
    private javax.swing.JButton btn_conectar_bbdd;
    private javax.swing.JButton btn_crear_bbdd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
