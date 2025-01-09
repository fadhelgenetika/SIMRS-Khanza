/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Compile;

import com.raven.datechooser.DateChooser;
import fungsi.validasi;
import java.text.SimpleDateFormat;

public class TestAutoNomer extends javax.swing.JFrame {

    private validasi Valid=new validasi();
    private DateChooser chDate=new DateChooser();
    
    public TestAutoNomer() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        
        chDate.setDateFormat(new SimpleDateFormat("yyyy-MM-dd"));
        chDate.setTextField(tanggalResep);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        testNomorResep = new javax.swing.JTextField();
        btnCheck = new javax.swing.JButton();
        tanggalResep = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        testNomorResep.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        testNomorResep.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btnCheck.setText("Cek Nomor Resep");
        btnCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckActionPerformed(evt);
            }
        });

        tanggalResep.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tanggalResepMouseReleased(evt);
            }
        });
        tanggalResep.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tanggalResepPropertyChange(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(testNomorResep)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tanggalResep, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 118, Short.MAX_VALUE)
                        .addComponent(btnCheck)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(testNomorResep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCheck)
                    .addComponent(tanggalResep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckActionPerformed
        // TODO add your handling code here:
        Valid.autoNomer3("select ifnull(MAX(CONVERT(RIGHT(resep_obat.no_resep,4),signed)),0) from resep_obat where resep_obat.tgl_peresepan='"+tanggalResep.getText()+"' or resep_obat.tgl_perawatan='"+tanggalResep.getText()+"'",tanggalResep.getText().replace("-", ""),4,testNomorResep);
    }//GEN-LAST:event_btnCheckActionPerformed

    private void tanggalResepMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tanggalResepMouseReleased
        
        
    }//GEN-LAST:event_tanggalResepMouseReleased

    private void tanggalResepPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tanggalResepPropertyChange
        
    }//GEN-LAST:event_tanggalResepPropertyChange

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
                if ("Window".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TestAutoNomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TestAutoNomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TestAutoNomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TestAutoNomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TestAutoNomer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCheck;
    private javax.swing.JTextField tanggalResep;
    private javax.swing.JTextField testNomorResep;
    // End of variables declaration//GEN-END:variables
}
