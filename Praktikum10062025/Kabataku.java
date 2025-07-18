/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package praktikum1062025;

import javax.swing.JOptionPane;

/**
 *
 * @author LABSIKOMP
 */
public class Kabataku extends javax.swing.JFrame {

    /**
     * Creates new form Kabataku
     */
    public Kabataku() {
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

        jLabel1 = new javax.swing.JLabel();
        lblangka1 = new javax.swing.JLabel();
        txtangka1 = new javax.swing.JTextField();
        lblangka2 = new javax.swing.JLabel();
        txtangka2 = new javax.swing.JTextField();
        cmbpilih = new javax.swing.JComboBox<>();
        lblangka3 = new javax.swing.JLabel();
        txthasil = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Kabataku");

        lblangka1.setText("Masukkan Angka 1 :");

        lblangka2.setText("Masukkan Angka 2 :");

        txtangka2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtangka2ActionPerformed(evt);
            }
        });

        cmbpilih.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Proses", "Perkalian", "Pembagian", "Tambah", "Pengurangan" }));
        cmbpilih.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbpilihActionPerformed(evt);
            }
        });

        lblangka3.setText("Hasil  :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel1)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblangka1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtangka1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblangka3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblangka2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cmbpilih, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txthasil)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtangka2)
                                .addGap(23, 23, 23)))))
                .addContainerGap(164, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblangka1)
                    .addComponent(txtangka1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblangka2)
                    .addComponent(txtangka2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(cmbpilih, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblangka3)
                    .addComponent(txthasil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(106, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbpilihActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbpilihActionPerformed
       Double angka1 = Double.parseDouble(txtangka1.getText());
       Double angka2 = Double.parseDouble(txtangka2.getText());
       Double hasil;
       int pilih = (int)cmbpilih.getSelectedIndex();
       switch(pilih){
           case 1 : hasil = angka1*angka2;break;
           case 2 : if(angka2==0){
               JOptionPane.showMessageDialog(this,"Tidak bisa membagi nol","Eror", JOptionPane.ERROR_MESSAGE);
               txthasil.setText("");
               return;
           }
           hasil=angka1/angka2;
           break;
           case 3 : hasil = angka1+angka2;break;
           case 4 : hasil = angka1-angka2;break;
           default : txthasil.setText("");return;
       }
      txthasil.setText(String.valueOf(hasil));
    }//GEN-LAST:event_cmbpilihActionPerformed

    private void txtangka2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtangka2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtangka2ActionPerformed

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
            java.util.logging.Logger.getLogger(Kabataku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Kabataku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Kabataku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Kabataku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Kabataku().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbpilih;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblangka1;
    private javax.swing.JLabel lblangka2;
    private javax.swing.JLabel lblangka3;
    private javax.swing.JTextField txtangka1;
    private javax.swing.JTextField txtangka2;
    private javax.swing.JTextField txthasil;
    // End of variables declaration//GEN-END:variables
}
