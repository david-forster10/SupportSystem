/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helpline;

/**
 *
 * @author Vanilla
 */
public class Customer_Report extends javax.swing.JFrame {

    /**
     * Creates new form Customer_Report
     */
    public Customer_Report() {
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

        lbl_ReportForm = new javax.swing.JLabel();
        lbl_FirstName = new javax.swing.JLabel();
        lbl_Surname = new javax.swing.JLabel();
        lbl_Address = new javax.swing.JLabel();
        lbl_Postcode = new javax.swing.JLabel();
        lbl_Telephone = new javax.swing.JLabel();
        lbl_DateReported = new javax.swing.JLabel();
        lbl_Problem = new javax.swing.JLabel();
        lbl_Severity = new javax.swing.JLabel();
        lbl_StaffRecieving = new javax.swing.JLabel();
        lbl_StaffFixing = new javax.swing.JLabel();
        lbl_DateResolved = new javax.swing.JLabel();
        lbl_RepairCost = new javax.swing.JLabel();
        lbl_EquipType = new javax.swing.JLabel();
        txt_FirstName = new javax.swing.JTextField();
        txt_Surname = new javax.swing.JTextField();
        txt_Address = new javax.swing.JTextField();
        txt_Postcode = new javax.swing.JTextField();
        txt_Telephone = new javax.swing.JTextField();
        txt_ReportDate = new javax.swing.JTextField();
        txt_EquipType = new javax.swing.JTextField();
        txt_Problem = new javax.swing.JTextField();
        txt_StaffRecieving = new javax.swing.JTextField();
        txt_StaffFixing = new javax.swing.JTextField();
        txt_DateResolved = new javax.swing.JTextField();
        txt_RepairCost = new javax.swing.JTextField();
        btn_Submit = new javax.swing.JButton();
        btn_Back = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbl_ReportForm.setFont(new java.awt.Font("Tahoma", 0, 21)); // NOI18N
        lbl_ReportForm.setText("Customer Reporting Form");

        lbl_FirstName.setText("First Name");

        lbl_Surname.setText("Surname");

        lbl_Address.setText("Address");

        lbl_Postcode.setText("Postcode");

        lbl_Telephone.setText("Telephone");

        lbl_DateReported.setText("Date Reported");

        lbl_Problem.setText("Problem");

        lbl_Severity.setText("Severity");

        lbl_StaffRecieving.setText("Staff Recieving");

        lbl_StaffFixing.setText("Staff Fixing");

        lbl_DateResolved.setText("Date Resolved");

        lbl_RepairCost.setText("Est Repair Cost");

        lbl_EquipType.setText("Equipment Type");

        txt_FirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_FirstNameActionPerformed(evt);
            }
        });

        txt_Surname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_SurnameActionPerformed(evt);
            }
        });

        txt_Address.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_AddressActionPerformed(evt);
            }
        });

        txt_Postcode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_PostcodeActionPerformed(evt);
            }
        });

        txt_Telephone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_TelephoneActionPerformed(evt);
            }
        });

        txt_ReportDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ReportDateActionPerformed(evt);
            }
        });

        txt_EquipType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_EquipTypeActionPerformed(evt);
            }
        });

        txt_Problem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ProblemActionPerformed(evt);
            }
        });

        txt_StaffRecieving.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_StaffRecievingActionPerformed(evt);
            }
        });

        txt_StaffFixing.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_StaffFixingActionPerformed(evt);
            }
        });

        txt_DateResolved.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_DateResolvedActionPerformed(evt);
            }
        });

        txt_RepairCost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_RepairCostActionPerformed(evt);
            }
        });

        btn_Submit.setText("Submit");
        btn_Submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SubmitActionPerformed(evt);
            }
        });

        btn_Back.setText("Back");
        btn_Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BackActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1 (High)", "2 (Medium)", "3 (Low)" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_ReportForm)
                .addGap(144, 144, 144))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbl_FirstName)
                                .addGap(44, 44, 44)
                                .addComponent(txt_FirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbl_Surname)
                                .addGap(53, 53, 53)
                                .addComponent(txt_Surname))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbl_Address)
                                .addGap(56, 56, 56)
                                .addComponent(txt_Address, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_Telephone)
                                    .addComponent(lbl_Postcode)
                                    .addComponent(lbl_DateReported))
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_Postcode)
                                    .addComponent(txt_Telephone)
                                    .addComponent(txt_ReportDate, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbl_EquipType)
                                .addGap(18, 18, 18)
                                .addComponent(txt_EquipType, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lbl_Severity)
                                .addGap(67, 67, 67))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_Problem)
                                    .addComponent(lbl_RepairCost)
                                    .addComponent(lbl_DateResolved)
                                    .addComponent(lbl_StaffFixing)
                                    .addComponent(lbl_StaffRecieving))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_Problem)
                            .addComponent(txt_StaffRecieving)
                            .addComponent(txt_StaffFixing)
                            .addComponent(txt_DateResolved)
                            .addComponent(txt_RepairCost)
                            .addComponent(jComboBox1, 0, 130, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(btn_Back, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_Submit, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(39, 39, 39))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(lbl_ReportForm)
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_FirstName)
                    .addComponent(lbl_Problem)
                    .addComponent(txt_FirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Problem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Surname)
                    .addComponent(lbl_Severity)
                    .addComponent(txt_Surname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Address)
                    .addComponent(lbl_StaffRecieving)
                    .addComponent(txt_Address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_StaffRecieving, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Postcode)
                    .addComponent(lbl_StaffFixing)
                    .addComponent(txt_Postcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_StaffFixing, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Telephone)
                    .addComponent(lbl_DateResolved)
                    .addComponent(txt_Telephone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_DateResolved, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_DateReported)
                    .addComponent(lbl_RepairCost)
                    .addComponent(txt_ReportDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_RepairCost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_EquipType)
                    .addComponent(txt_EquipType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Back)
                    .addComponent(btn_Submit))
                .addGap(25, 25, 25))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txt_RepairCostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_RepairCostActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_RepairCostActionPerformed

    private void btn_SubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SubmitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_SubmitActionPerformed

    private void btn_BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BackActionPerformed
        Navigation NavBack = new Navigation();
        NavBack.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_BackActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void txt_FirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_FirstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_FirstNameActionPerformed

    private void txt_SurnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_SurnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_SurnameActionPerformed

    private void txt_AddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_AddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_AddressActionPerformed

    private void txt_PostcodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_PostcodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_PostcodeActionPerformed

    private void txt_TelephoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_TelephoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_TelephoneActionPerformed

    private void txt_ReportDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ReportDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ReportDateActionPerformed

    private void txt_EquipTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_EquipTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_EquipTypeActionPerformed

    private void txt_ProblemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ProblemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ProblemActionPerformed

    private void txt_StaffRecievingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_StaffRecievingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_StaffRecievingActionPerformed

    private void txt_StaffFixingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_StaffFixingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_StaffFixingActionPerformed

    private void txt_DateResolvedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_DateResolvedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_DateResolvedActionPerformed

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
            java.util.logging.Logger.getLogger(Customer_Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Customer_Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Customer_Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Customer_Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Customer_Report().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Back;
    private javax.swing.JButton btn_Submit;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel lbl_Address;
    private javax.swing.JLabel lbl_DateReported;
    private javax.swing.JLabel lbl_DateResolved;
    private javax.swing.JLabel lbl_EquipType;
    private javax.swing.JLabel lbl_FirstName;
    private javax.swing.JLabel lbl_Postcode;
    private javax.swing.JLabel lbl_Problem;
    private javax.swing.JLabel lbl_RepairCost;
    private javax.swing.JLabel lbl_ReportForm;
    private javax.swing.JLabel lbl_Severity;
    private javax.swing.JLabel lbl_StaffFixing;
    private javax.swing.JLabel lbl_StaffRecieving;
    private javax.swing.JLabel lbl_Surname;
    private javax.swing.JLabel lbl_Telephone;
    private javax.swing.JTextField txt_Address;
    private javax.swing.JTextField txt_DateResolved;
    private javax.swing.JTextField txt_EquipType;
    private javax.swing.JTextField txt_FirstName;
    private javax.swing.JTextField txt_Postcode;
    private javax.swing.JTextField txt_Problem;
    private javax.swing.JTextField txt_RepairCost;
    private javax.swing.JTextField txt_ReportDate;
    private javax.swing.JTextField txt_StaffFixing;
    private javax.swing.JTextField txt_StaffRecieving;
    private javax.swing.JTextField txt_Surname;
    private javax.swing.JTextField txt_Telephone;
    // End of variables declaration//GEN-END:variables
}
