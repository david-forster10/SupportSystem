package helpline;

public class Navigation extends javax.swing.JFrame {

    public Navigation() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn_NavProd = new javax.swing.JButton();
        btn_NavCust = new javax.swing.JButton();
        btn_QuitNav = new javax.swing.JButton();
        btn_NavStaff = new javax.swing.JButton();
        lbl_Navigation = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        btn_NavProd.setText("Products");
        btn_NavProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_NavProdActionPerformed(evt);
            }
        });

        btn_NavCust.setText("Customer Report");
        btn_NavCust.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_NavCustActionPerformed(evt);
            }
        });

        btn_QuitNav.setText("Quit");
        btn_QuitNav.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_QuitNavActionPerformed(evt);
            }
        });

        btn_NavStaff.setText("Staff Information");
        btn_NavStaff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_NavStaffActionPerformed(evt);
            }
        });

        lbl_Navigation.setFont(new java.awt.Font("Tahoma", 0, 21)); // NOI18N
        lbl_Navigation.setText("Navigation");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(lbl_Navigation))
                    .addComponent(btn_NavStaff, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                    .addComponent(btn_NavCust, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_NavProd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_QuitNav, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(97, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(lbl_Navigation)
                .addGap(37, 37, 37)
                .addComponent(btn_NavProd)
                .addGap(18, 18, 18)
                .addComponent(btn_NavCust, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_NavStaff)
                .addGap(18, 18, 18)
                .addComponent(btn_QuitNav)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_NavStaffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_NavStaffActionPerformed
        Staff_Information StaffBtn = new Staff_Information();
        StaffBtn.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_NavStaffActionPerformed

    private void btn_NavProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_NavProdActionPerformed
        Products ProdBtn = new Products();
        ProdBtn.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_NavProdActionPerformed

    private void btn_QuitNavActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_QuitNavActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btn_QuitNavActionPerformed

    private void btn_NavCustActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_NavCustActionPerformed
        Customer_Report CustBtn = new Customer_Report();
        CustBtn.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_NavCustActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(Navigation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Navigation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Navigation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Navigation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Navigation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_NavCust;
    private javax.swing.JButton btn_NavProd;
    private javax.swing.JButton btn_NavStaff;
    private javax.swing.JButton btn_QuitNav;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_Navigation;
    // End of variables declaration//GEN-END:variables
}