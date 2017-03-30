package helpline;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

public class Staff_Information extends javax.swing.JFrame {

    private static final int IMG_WIDTH = 180;
    private static final int IMG_HEIGHT = 180;
    private BufferedImage image;
    
    public Staff_Information() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDatabase = new javax.swing.JTable();
        txt_FName = new javax.swing.JTextField();
        txt_Surname = new javax.swing.JTextField();
        txt_Email = new javax.swing.JTextField();
        txt_Address = new javax.swing.JTextField();
        txt_PostCode = new javax.swing.JTextField();
        txt_DoB = new javax.swing.JTextField();
        lbl_Surname = new javax.swing.JLabel();
        lbl_Address = new javax.swing.JLabel();
        lbl_Info = new javax.swing.JLabel();
        btnDelete = new javax.swing.JButton();
        lbl_Email = new javax.swing.JLabel();
        lbl_FName = new javax.swing.JLabel();
        btn_QuitInfo = new javax.swing.JButton();
        lbl_DoB = new javax.swing.JLabel();
        lbl_PostCode = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        pnlPicture = new javax.swing.JPanel();
        lblPicture = new javax.swing.JLabel();
        tgbtn_Edit = new javax.swing.JToggleButton();
        lbl_StaffID = new javax.swing.JLabel();
        txt_StaffID = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        tblDatabase.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Staff ID", "First Name", "Last Name", "Address", "Post Code", "Email", "Date of Birth"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDatabase.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tblDatabase.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tblDatabase.getTableHeader().setResizingAllowed(false);
        tblDatabase.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblDatabase);

        txt_FName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_FNameActionPerformed(evt);
            }
        });

        lbl_Surname.setText("Surname");

        lbl_Address.setText("House Number/Name");

        lbl_Info.setFont(new java.awt.Font("Tahoma", 0, 21)); // NOI18N
        lbl_Info.setText("Staff Info");

        btnDelete.setText("Delete");
        btnDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDeleteMouseClicked(evt);
            }
        });

        lbl_Email.setText("Email");

        lbl_FName.setText("First Name");

        btn_QuitInfo.setText("Back");
        btn_QuitInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_QuitInfoActionPerformed(evt);
            }
        });

        lbl_DoB.setText("DOB (YYYY/MM/DD)");

        lbl_PostCode.setText("Post Code");

        btnSave.setText("Save");
        btnSave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSaveMouseClicked(evt);
            }
        });

        pnlPicture.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlPicture.setPreferredSize(new java.awt.Dimension(170, 170));
        pnlPicture.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlPictureMouseClicked(evt);
            }
        });

        lblPicture.setText("Click to add picture");

        javax.swing.GroupLayout pnlPictureLayout = new javax.swing.GroupLayout(pnlPicture);
        pnlPicture.setLayout(pnlPictureLayout);
        pnlPictureLayout.setHorizontalGroup(
            pnlPictureLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPictureLayout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addComponent(lblPicture)
                .addGap(41, 41, 41))
        );
        pnlPictureLayout.setVerticalGroup(
            pnlPictureLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPictureLayout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(lblPicture)
                .addContainerGap(84, Short.MAX_VALUE))
        );

        tgbtn_Edit.setText("Edit Record");
        tgbtn_Edit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tgbtn_EditMouseClicked(evt);
            }
        });
        tgbtn_Edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tgbtn_EditActionPerformed(evt);
            }
        });

        lbl_StaffID.setText("Staff ID");

        txt_StaffID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_StaffIDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 717, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn_QuitInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnDelete)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSave)))
                        .addGap(13, 13, 13))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(pnlPicture, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lbl_FName)
                                        .addComponent(lbl_Surname, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lbl_StaffID, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addComponent(lbl_Email))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_StaffID, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                                    .addComponent(txt_Surname)
                                    .addComponent(txt_Email, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txt_FName))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lbl_PostCode, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lbl_Address, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addGap(18, 18, 18))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(lbl_DoB)
                                        .addGap(19, 19, 19)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_PostCode, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                                    .addComponent(txt_Address, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txt_DoB))
                                .addGap(13, 13, 13))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(tgbtn_Edit)
                                    .addComponent(lbl_Info))
                                .addGap(311, 311, 311))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbl_Info)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_Address)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txt_StaffID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lbl_StaffID)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txt_FName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lbl_PostCode)
                                        .addComponent(txt_PostCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(lbl_FName)))
                            .addComponent(txt_Address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_Surname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_Surname)
                            .addComponent(lbl_DoB)
                            .addComponent(txt_DoB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_Email)
                            .addComponent(txt_Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(16, Short.MAX_VALUE)
                        .addComponent(pnlPicture, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_QuitInfo)
                    .addComponent(btnDelete)
                    .addComponent(btnSave)
                    .addComponent(tgbtn_Edit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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

    private void txt_FNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_FNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_FNameActionPerformed

    private void btn_QuitInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_QuitInfoActionPerformed
        Navigation BackStaff = new Navigation();
        BackStaff.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_QuitInfoActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        txt_StaffID.setEnabled(false);
        int StaffIDGen = Navigation.StaffTbl.get(1).size();
        txt_StaffID.setText(Integer.toString(Integer.parseInt(Navigation.StaffTbl.get(1).get(StaffIDGen)) + 1));
        DefaultTableModel tableModel = (DefaultTableModel) tblDatabase.getModel();
        
        for (int i = 0; i < Navigation.StaffTbl.get(1).size(); i++)
        {
            Object[] rowData = { 
                Navigation.StaffTbl.get(0).get(i), 
                Navigation.StaffTbl.get(1).get(i), 
                Navigation.StaffTbl.get(2).get(i), 
                Navigation.StaffTbl.get(3).get(i),
                Navigation.StaffTbl.get(4).get(i),
                Navigation.StaffTbl.get(5).get(i),
                Navigation.StaffTbl.get(6).get(i),
                Navigation.StaffTbl.get(7).get(i)
            };
            tableModel.addRow(rowData);
        }
        tblDatabase.setEnabled(false);
    }//GEN-LAST:event_formWindowOpened

    private void tgbtn_EditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tgbtn_EditActionPerformed
    }//GEN-LAST:event_tgbtn_EditActionPerformed

    private void tgbtn_EditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tgbtn_EditMouseClicked
        if (tgbtn_Edit.getText().equals("Edit Record"))
        {
            tgbtn_Edit.setText("New Record");
            tblDatabase.setEnabled(true);
        }
        else if (tgbtn_Edit.getText().equals("New Record"))
        {
            tgbtn_Edit.setText("Edit Record");
            tblDatabase.setEnabled(false);
        }
    }//GEN-LAST:event_tgbtn_EditMouseClicked

    private void txt_StaffIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_StaffIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_StaffIDActionPerformed

    private void btnSaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveMouseClicked
        Pattern pat = Pattern.compile("[^a-z ]", Pattern.CASE_INSENSITIVE);
        Pattern pat2 = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
        Pattern pat3 = Pattern.compile("[^a-z0-9 ]", Pattern.CASE_INSENSITIVE);
        Pattern pat4 = Pattern.compile("\\d{4}/\\d{2}/\\d{2}", Pattern.CASE_INSENSITIVE);
        Matcher match1 = pat.matcher(txt_FName.getText());
        Matcher match2 = pat.matcher(txt_Surname.getText());
        Matcher match3 = pat2.matcher(txt_Email.getText());
        Matcher match4 = pat3.matcher(txt_Address.getText());
        Matcher match5 = pat3.matcher(txt_PostCode.getText());
        Matcher match6 = pat4.matcher(txt_DoB.getText());
        
        if (txt_FName.getText().equals("") || txt_Surname.getText().equals("") || txt_Email.getText().equals("") || txt_Address.getText().equals("") || txt_PostCode.getText().equals("") || txt_DoB.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Please fill in all sections of the form!", "Error", JOptionPane.WARNING_MESSAGE);
        }
        else
        {
            if (match1.find() || match2.find() || match3.find() || match4.find() || match5.find() || match6.find())
            {
                if (txt_Email.getText().contains("@"))
                {
                    if (txt_PostCode.getText().length() < 9)
                    {
                        AddData();
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, "Please enter a valid Post Code!", "Error", JOptionPane.WARNING_MESSAGE);
                    }
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Please enter a valid Email!", "Error", JOptionPane.WARNING_MESSAGE);
                }
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Please only input valid characters!", "Error", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnSaveMouseClicked

    public void AddData()
    {
        try 
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/helpline?allowMultiQueries=true","user","user");
            Statement stmt = (Statement)con.createStatement();
            
            String sql = "INSERT INTO `staff information form` (`StaffID`, `FirstName`, `LastName`, `Address`, `PostCode`, `Email`, `DateOfBirth`) VALUES ('"+Integer.parseInt(txt_StaffID.getText())+"', '"+txt_FName.getText()+"', '"+txt_Surname.getText()+"', '"+txt_Address.getText()+"', '"+txt_PostCode.getText()+"', '"+txt_Email.getText()+"', '"+txt_DoB.getText()+"')";
            stmt.execute(sql);
            con.close();            
        } 
        catch (Exception ex) 
        {
            Logger.getLogger(HelpLine.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void btnDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeleteMouseClicked

    private void pnlPictureMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlPictureMouseClicked
        final JFileChooser fc = new JFileChooser();
        FileFilter imageFilter = new FileNameExtensionFilter("Image files", ImageIO.getReaderFileSuffixes());
        fc.addChoosableFileFilter(imageFilter);
        fc.setAcceptAllFileFilterUsed(false);
        int returnVal = fc.showDialog(Staff_Information.this, "Open");      
               
        try 
        {
            image = ImageIO.read(fc.getSelectedFile());
            int type = image.getType() == 0? BufferedImage.TYPE_INT_ARGB : image.getType();
            pnlPicture.repaint();
        } 
        catch (IOException ex) 
        {
            Logger.getLogger(Staff_Information.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_pnlPictureMouseClicked

    private static BufferedImage resizeImage(BufferedImage originalImage, int type){
	BufferedImage resizedImage = new BufferedImage(IMG_WIDTH, IMG_HEIGHT, type);
	Graphics2D g = resizedImage.createGraphics();
	g.drawImage(originalImage, 0, 0, IMG_WIDTH, IMG_HEIGHT, null);
	g.dispose();

	return resizedImage;
    }

    @Override
    protected void paintComponents(Graphics g) {
        super.paintComponent(g);
        g.drawImage(image, 0, 0, this);
    }
    
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
            java.util.logging.Logger.getLogger(Staff_Information.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Staff_Information.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Staff_Information.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Staff_Information.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
       
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Staff_Information().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btn_QuitInfo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblPicture;
    private javax.swing.JLabel lbl_Address;
    private javax.swing.JLabel lbl_DoB;
    private javax.swing.JLabel lbl_Email;
    private javax.swing.JLabel lbl_FName;
    private javax.swing.JLabel lbl_Info;
    private javax.swing.JLabel lbl_PostCode;
    private javax.swing.JLabel lbl_StaffID;
    private javax.swing.JLabel lbl_Surname;
    private javax.swing.JPanel pnlPicture;
    private javax.swing.JTable tblDatabase;
    private javax.swing.JToggleButton tgbtn_Edit;
    private javax.swing.JTextField txt_Address;
    private javax.swing.JTextField txt_DoB;
    private javax.swing.JTextField txt_Email;
    private javax.swing.JTextField txt_FName;
    private javax.swing.JTextField txt_PostCode;
    private javax.swing.JTextField txt_StaffID;
    private javax.swing.JTextField txt_Surname;
    // End of variables declaration//GEN-END:variables
}