/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package Vista;

import Juego.CaballoTablero;
import java.awt.BorderLayout;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author Crisp
 */
public class ViewReina extends javax.swing.JDialog {
    
    private CaballoTablero tablero;

    
    
    /**
     * Creates new form ViewReina
     */
    public ViewReina(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLayout(new BorderLayout());
        tablero = new CaballoTablero((ViewReina) (JDialog) null);

        JPanel contenedorTablero = new JPanel(new BorderLayout());
        contenedorTablero.setBorder(new EmptyBorder(80, 80, 80, 80)); // Espacios alrededor
        contenedorTablero.add(tablero, BorderLayout.CENTER);
        add(contenedorTablero, BorderLayout.CENTER);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblAArriba = new javax.swing.JLabel();
        lblBArriba = new javax.swing.JLabel();
        lblCArriba = new javax.swing.JLabel();
        lblDArriba = new javax.swing.JLabel();
        lblEArriba = new javax.swing.JLabel();
        lblFArriba = new javax.swing.JLabel();
        lblGArriba = new javax.swing.JLabel();
        lblHArriba = new javax.swing.JLabel();
        lbl1Derech = new javax.swing.JLabel();
        lbl2Derech = new javax.swing.JLabel();
        lbl3Derech = new javax.swing.JLabel();
        lbl4Derech = new javax.swing.JLabel();
        lbl5Derech = new javax.swing.JLabel();
        lbl6Derech = new javax.swing.JLabel();
        lbl7Derech = new javax.swing.JLabel();
        lbl8Derech = new javax.swing.JLabel();
        lblHAbajo = new javax.swing.JLabel();
        lblGAbajo = new javax.swing.JLabel();
        lblFAbajo = new javax.swing.JLabel();
        lblEAbajo = new javax.swing.JLabel();
        lblDAbajo = new javax.swing.JLabel();
        lblCAbajo = new javax.swing.JLabel();
        lblBAbajo = new javax.swing.JLabel();
        lblAAbajo = new javax.swing.JLabel();
        lbl8Izquierda = new javax.swing.JLabel();
        lbl7Izquierda = new javax.swing.JLabel();
        lbl6Izquierda = new javax.swing.JLabel();
        lbl5Izquierda = new javax.swing.JLabel();
        lbl4Izquierda = new javax.swing.JLabel();
        lbl3Izquierda = new javax.swing.JLabel();
        lbl2Izquierda = new javax.swing.JLabel();
        lbl1Izquierda = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Juego 8 Reinas");

        lblAArriba.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblAArriba.setText("A");

        lblBArriba.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblBArriba.setText("B");

        lblCArriba.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblCArriba.setText("C");

        lblDArriba.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblDArriba.setText("D");

        lblEArriba.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblEArriba.setText("E");

        lblFArriba.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblFArriba.setText("F");

        lblGArriba.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblGArriba.setText("G");

        lblHArriba.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblHArriba.setText("H");

        lbl1Derech.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lbl1Derech.setText("1");

        lbl2Derech.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lbl2Derech.setText("2");

        lbl3Derech.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lbl3Derech.setText("3");

        lbl4Derech.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lbl4Derech.setText("4");

        lbl5Derech.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lbl5Derech.setText("5");

        lbl6Derech.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lbl6Derech.setText("6");

        lbl7Derech.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lbl7Derech.setText("7");

        lbl8Derech.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lbl8Derech.setText("8");

        lblHAbajo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblHAbajo.setText("H");

        lblGAbajo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblGAbajo.setText("G");

        lblFAbajo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblFAbajo.setText("F");

        lblEAbajo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblEAbajo.setText("E");

        lblDAbajo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblDAbajo.setText("D");

        lblCAbajo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblCAbajo.setText("C");

        lblBAbajo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblBAbajo.setText("B");

        lblAAbajo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblAAbajo.setText("A");

        lbl8Izquierda.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lbl8Izquierda.setText("8");

        lbl7Izquierda.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lbl7Izquierda.setText("7");

        lbl6Izquierda.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lbl6Izquierda.setText("6");

        lbl5Izquierda.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lbl5Izquierda.setText("5");

        lbl4Izquierda.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lbl4Izquierda.setText("4");

        lbl3Izquierda.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lbl3Izquierda.setText("3");

        lbl2Izquierda.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lbl2Izquierda.setText("2");

        lbl1Izquierda.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lbl1Izquierda.setText("1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 483, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lbl2Izquierda)
                                .addComponent(lbl1Izquierda)
                                .addComponent(lbl3Izquierda)
                                .addComponent(lbl4Izquierda))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lbl1Derech, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbl2Derech, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbl3Derech, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbl4Derech, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lbl6Izquierda)
                                .addComponent(lbl5Izquierda)
                                .addComponent(lbl7Izquierda)
                                .addComponent(lbl8Izquierda))
                            .addGap(445, 445, 445)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lbl6Derech)
                                .addComponent(lbl5Derech)
                                .addComponent(lbl7Derech)
                                .addComponent(lbl8Derech)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(lblAAbajo)
                                    .addGap(33, 33, 33)
                                    .addComponent(lblBAbajo)
                                    .addGap(131, 131, 131)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(lblEAbajo)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lblFAbajo))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(lblEArriba)
                                            .addGap(39, 39, 39)
                                            .addComponent(lblFArriba)))
                                    .addGap(41, 41, 41)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lblGArriba)
                                        .addComponent(lblGAbajo))
                                    .addGap(39, 39, 39)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lblHArriba)
                                        .addComponent(lblHAbajo))
                                    .addGap(47, 47, 47))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(lblAArriba)
                                    .addGap(33, 33, 33)
                                    .addComponent(lblBArriba)
                                    .addGap(35, 35, 35)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(lblCAbajo)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lblDAbajo))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(lblCArriba)
                                            .addGap(37, 37, 37)
                                            .addComponent(lblDArriba)))
                                    .addGap(261, 261, 261)))))
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 481, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblFArriba)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblHArriba)
                            .addComponent(lblGArriba)
                            .addComponent(lblDArriba)
                            .addComponent(lblEArriba)
                            .addComponent(lblCArriba)
                            .addComponent(lblBArriba)
                            .addComponent(lblAArriba)))
                    .addGap(12, 12, 12)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbl1Izquierda)
                        .addComponent(lbl1Derech))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbl2Izquierda)
                        .addComponent(lbl2Derech))
                    .addGap(23, 23, 23)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbl3Izquierda)
                        .addComponent(lbl3Derech))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lbl4Derech, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lbl4Izquierda))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbl5Izquierda)
                        .addComponent(lbl5Derech))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbl6Izquierda)
                        .addComponent(lbl6Derech))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbl7Izquierda)
                        .addComponent(lbl7Derech))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbl8Izquierda)
                        .addComponent(lbl8Derech))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblAAbajo)
                        .addComponent(lblBAbajo)
                        .addComponent(lblCAbajo)
                        .addComponent(lblDAbajo)
                        .addComponent(lblEAbajo)
                        .addComponent(lblFAbajo)
                        .addComponent(lblGAbajo)
                        .addComponent(lblHAbajo))
                    .addContainerGap()))
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
            java.util.logging.Logger.getLogger(ViewReina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewReina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewReina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewReina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ViewReina dialog = new ViewReina(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel lbl1Derech;
    private javax.swing.JLabel lbl1Izquierda;
    private javax.swing.JLabel lbl2Derech;
    private javax.swing.JLabel lbl2Izquierda;
    private javax.swing.JLabel lbl3Derech;
    private javax.swing.JLabel lbl3Izquierda;
    private javax.swing.JLabel lbl4Derech;
    private javax.swing.JLabel lbl4Izquierda;
    private javax.swing.JLabel lbl5Derech;
    private javax.swing.JLabel lbl5Izquierda;
    private javax.swing.JLabel lbl6Derech;
    private javax.swing.JLabel lbl6Izquierda;
    private javax.swing.JLabel lbl7Derech;
    private javax.swing.JLabel lbl7Izquierda;
    private javax.swing.JLabel lbl8Derech;
    private javax.swing.JLabel lbl8Izquierda;
    private javax.swing.JLabel lblAAbajo;
    private javax.swing.JLabel lblAArriba;
    private javax.swing.JLabel lblBAbajo;
    private javax.swing.JLabel lblBArriba;
    private javax.swing.JLabel lblCAbajo;
    private javax.swing.JLabel lblCArriba;
    private javax.swing.JLabel lblDAbajo;
    private javax.swing.JLabel lblDArriba;
    private javax.swing.JLabel lblEAbajo;
    private javax.swing.JLabel lblEArriba;
    private javax.swing.JLabel lblFAbajo;
    private javax.swing.JLabel lblFArriba;
    private javax.swing.JLabel lblGAbajo;
    private javax.swing.JLabel lblGArriba;
    private javax.swing.JLabel lblHAbajo;
    private javax.swing.JLabel lblHArriba;
    // End of variables declaration//GEN-END:variables
}
