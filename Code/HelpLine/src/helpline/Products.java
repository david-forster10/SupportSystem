package helpline;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Products extends javax.swing.JFrame {

    public Products() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        lbl_Products = new javax.swing.JLabel();
        lbl_ProName = new javax.swing.JLabel();
        lbl_Manufacturer = new javax.swing.JLabel();
        lbl_ModNo = new javax.swing.JLabel();
        lbl_SerialNo = new javax.swing.JLabel();
        lbl_DateIn = new javax.swing.JLabel();
        lbl_Problem = new javax.swing.JLabel();
        lbl_FixDate = new javax.swing.JLabel();
        lbl_Finished = new javax.swing.JLabel();
        txt_ProName = new javax.swing.JTextField();
        txt_Manufacturer = new javax.swing.JTextField();
        txt_ModNo = new javax.swing.JTextField();
        txt_SerialNo = new javax.swing.JTextField();
        txt_DateIn = new javax.swing.JTextField();
        txt_Problem = new javax.swing.JTextField();
        txt_Finished = new javax.swing.JTextField();
        btn_QuitProd = new javax.swing.JButton();
        txt_FixDate = new javax.swing.JTextField();
        btn_submit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_ProductFormID = new javax.swing.JTextField();
        txt_CustomerReportingFormID = new javax.swing.JTextField();
        txt_StaffID = new javax.swing.JTextField();
        btn_edit = new javax.swing.JToggleButton();
        btn_delete = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                LoadProducts(evt);
            }
        });

        lbl_Products.setFont(new java.awt.Font("Tahoma", 0, 21)); // NOI18N
        lbl_Products.setText("Products");

        lbl_ProName.setText("Product Name");

        lbl_Manufacturer.setText("Manufacturer");

        lbl_ModNo.setText("Model Number");

        lbl_SerialNo.setText("Serial Number");

        lbl_DateIn.setText("Date In");

        lbl_Problem.setText("Problem");

        lbl_FixDate.setText("Fix Date");

        lbl_Finished.setText("Finished");

        btn_QuitProd.setText("Back");
        btn_QuitProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_QuitProdActionPerformed(evt);
            }
        });

        btn_submit.setText("Submit");
        btn_submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_submitActionPerformed(evt);
            }
        });

        jLabel1.setText("Product Form ID");

        jLabel2.setText("Customer Reporting Form ID");

        jLabel3.setText("Staff ID");

        btn_edit.setText("Edit Record");
        btn_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editActionPerformed(evt);
            }
        });

        btn_delete.setText("Delete");
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product Form ID", "Customer Reporting Form ID", "Staff ID", "Product Name", "Manufacturer", "Model Number", "Serial Number", "Date bought in for fixing", "Nature of problem", "Date fixed", "Work Done"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTable1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(lbl_ProName)
                            .addComponent(lbl_Manufacturer)
                            .addComponent(lbl_ModNo)
                            .addComponent(lbl_SerialNo))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txt_ProductFormID, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_CustomerReportingFormID, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_ProName, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_Manufacturer, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_ModNo, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_SerialNo, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(btn_QuitProd, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(367, 367, 367)
                        .addComponent(btn_delete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_submit)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbl_DateIn, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbl_FixDate, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbl_Problem, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbl_Finished, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txt_DateIn)
                            .addComponent(txt_StaffID)
                            .addComponent(txt_Problem)
                            .addComponent(txt_FixDate, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_Finished, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(116, 116, 116))))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 885, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(415, 415, 415)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbl_Products)
                            .addComponent(btn_edit))))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(lbl_Products)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_ProductFormID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txt_StaffID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_CustomerReportingFormID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txt_DateIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_DateIn))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_ProName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_ProName)
                    .addComponent(lbl_Problem)
                    .addComponent(txt_Problem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_Manufacturer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_Manufacturer))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_ModNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_ModNo))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_SerialNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_SerialNo)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_FixDate)
                            .addComponent(txt_FixDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_Finished)
                            .addComponent(txt_Finished, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(14, 14, 14)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_QuitProd)
                    .addComponent(btn_edit)
                    .addComponent(btn_delete)
                    .addComponent(btn_submit))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void btn_QuitProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_QuitProdActionPerformed
        Navigation ProdBack = new Navigation();
        ProdBack.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_QuitProdActionPerformed

    private void btn_submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_submitActionPerformed
        Pattern pat = Pattern.compile("[^a-z ]", Pattern.CASE_INSENSITIVE); //allows only text inputs e.g. name fields
        Pattern pat2 = Pattern.compile("[^0-9.]");
        Pattern pat3 = Pattern.compile("[^a-z0-9 ]", Pattern.CASE_INSENSITIVE); //validation for only allowing numbers & letters, e.g. an address
        Pattern pat4 = Pattern.compile("\\d{4}-\\d{2}-\\d{2}", Pattern.CASE_INSENSITIVE); //validation for a date, format "YYYY/MM/DD"
        Pattern pat5 = Pattern.compile("[^0-9]");
     
        Matcher productformID = pat5.matcher(txt_ProductFormID.getText());
        Matcher customerID = pat5.matcher(txt_CustomerReportingFormID.getText());
        Matcher staffID = pat5.matcher(txt_StaffID.getText());
        Matcher Productname = pat.matcher(txt_ProName.getText());
        Matcher manufacturer = pat.matcher(txt_Manufacturer.getText());
        Matcher modNo = pat2.matcher(txt_ModNo.getText());
        Matcher SerialNo = pat2.matcher(txt_SerialNo.getText());
        Matcher dateIn = pat4.matcher(txt_DateIn.getText());
        Matcher problem = pat.matcher(txt_Problem.getText());  
        Matcher fixDate = pat4.matcher(txt_FixDate.getText());
        Matcher finished = pat.matcher(txt_Finished.getText());
    
        if (txt_ProductFormID.getText().equals("") || txt_CustomerReportingFormID.getText().equals("") || txt_StaffID.getText().equals("") || txt_ProName.getText().equals("") || txt_Manufacturer.getText().equals("") || txt_ModNo.getText().equals("") || txt_SerialNo.getText().equals("") || txt_DateIn.getText().equals("") || txt_Problem.getText().equals("") || txt_FixDate.getText().equals("") || txt_Finished.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Please fill in all sections of the form!", "Error", JOptionPane.WARNING_MESSAGE);
        }
        else
        {
            if (productformID.find() || customerID.find() || staffID.find() || Productname.find() || manufacturer.find() || modNo.find() || SerialNo.find() || dateIn.find() || problem.find() || fixDate.find() || finished.find()) //uses matchers from above, add/remove as needed
            {
            }
        else
        {
            JOptionPane.showMessageDialog(null, "Please only input valid characters!", "Error", JOptionPane.WARNING_MESSAGE);
        }
    }
    }                                          

    public void AddData(){
        try {
        Class.forName("com.mysql.jdbc.Driver"); 
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/helpline?allowMultiQueries=true","user","user");
        
        String DateIn = txt_DateIn.getText();
        String FixDate = txt_FixDate.getText();
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        Date In;
        Date Fix;
        try {
            In = (Date) df.parse(DateIn);
            Fix = (Date) df.parse(FixDate);  
            String dteIn = df.format(In);
            String dteFix = df.format(Fix);
            
            String insert = "INSERT INTO `product form` VALUES (?, ? , ? , ? , ? , ? , ? , ? , ? , ? , ?) ";
            PreparedStatement ps = con.prepareStatement(insert);
            ps.setInt(1, Integer.parseInt(txt_ProductFormID.getText()));
            ps.setInt(2, Integer.parseInt(txt_CustomerReportingFormID.getText()));
            ps.setInt(3, Integer.parseInt(txt_StaffID.getText()));
            ps.setString(4, txt_ProName.getText());
            ps.setString(5, txt_Manufacturer.getText());
            ps.setString(6, txt_ModNo.getText());
            ps.setString(7, txt_SerialNo.getText());
            ps.setString(8, dteIn);
            ps.setString(9, txt_Problem.getText());
            ps.setString(10, dteFix);
            ps.setString(11, txt_Finished.getText());
            
            ps.executeUpdate();
            
            ps.execute(insert);
            con.close();
        } catch (ParseException e) {
            e.printStackTrace();
        }           
    } 
    catch (Exception ex) {
	Logger.getLogger(HelpLine.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_btn_submitActionPerformed

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_deleteActionPerformed

    private void btn_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_editActionPerformed

    private void LoadProducts(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_LoadProducts
        txt_ProductFormID.setEnabled(false); //disabling the autogenerated StaffID text file
        //int IDGen = Navigation.ProductTbl.get(1).size(); //getting size of array for last ID generated
        //txt_ProductFormID.setText(Integer.toString(Integer.parseInt(Navigation.ProductTbl.get(1).get(IDGen)) + 1)); //Generating a new ID
        DefaultTableModel tableModel = (DefaultTableModel) jTable1.getModel(); //declaring a tablemodel for adding records to the JTable
       
        for (int i = 0; i < Navigation.ProductTbl.get(1).size(); i++) //loop to add all records to table
        {
            Object[] rowData = { 
                Navigation.ProductTbl.get(0).get(i), //each comma is info for a new row
                Navigation.ProductTbl.get(1).get(i), 
                Navigation.ProductTbl.get(2).get(i), 
                Navigation.ProductTbl.get(3).get(i),
                Navigation.ProductTbl.get(4).get(i),
                Navigation.ProductTbl.get(5).get(i),
                Navigation.ProductTbl.get(6).get(i),
                Navigation.ProductTbl.get(7).get(i),
                Navigation.ProductTbl.get(8).get(i),
                Navigation.ProductTbl.get(9).get(i),
                Navigation.ProductTbl.get(10).get(i),
        };
            tableModel.addRow(rowData); //adding the data into the table
        }
        
        jTable1.setEnabled(false); //disabling the table on load
    }//GEN-LAST:event_LoadProducts

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
            java.util.logging.Logger.getLogger(Products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Products().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_QuitProd;
    private javax.swing.JButton btn_delete;
    private javax.swing.JToggleButton btn_edit;
    private javax.swing.JButton btn_submit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lbl_DateIn;
    private javax.swing.JLabel lbl_Finished;
    private javax.swing.JLabel lbl_FixDate;
    private javax.swing.JLabel lbl_Manufacturer;
    private javax.swing.JLabel lbl_ModNo;
    private javax.swing.JLabel lbl_ProName;
    private javax.swing.JLabel lbl_Problem;
    private javax.swing.JLabel lbl_Products;
    private javax.swing.JLabel lbl_SerialNo;
    private javax.swing.JTextField txt_CustomerReportingFormID;
    private javax.swing.JTextField txt_DateIn;
    private javax.swing.JTextField txt_Finished;
    private javax.swing.JTextField txt_FixDate;
    private javax.swing.JTextField txt_Manufacturer;
    private javax.swing.JTextField txt_ModNo;
    private javax.swing.JTextField txt_ProName;
    private javax.swing.JTextField txt_Problem;
    private javax.swing.JTextField txt_ProductFormID;
    private javax.swing.JTextField txt_SerialNo;
    private javax.swing.JTextField txt_StaffID;
    // End of variables declaration//GEN-END:variables
}
