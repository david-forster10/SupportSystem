package helpline;

import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

public class Staff_Information extends javax.swing.JFrame {

    private boolean bEdit = false;
    private static final int IMG_WIDTH = 180;
    private static final int IMG_HEIGHT = 180;
    private static String SelectedImg = "";
    private static int Size = 0;
    private static int NewID = 0;
    
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
        jPanel2 = new javax.swing.JPanel();
        lblPlace = new javax.swing.JLabel();
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
        tblDatabase.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblDatabase.getTableHeader().setResizingAllowed(false);
        tblDatabase.getTableHeader().setReorderingAllowed(false);
        tblDatabase.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDatabaseMouseClicked(evt);
            }
        });
        tblDatabase.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tblDatabaseKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(tblDatabase);

        txt_FName.setNextFocusableComponent(txt_Surname);

        txt_Surname.setNextFocusableComponent(txt_Email);

        txt_Email.setNextFocusableComponent(txt_Address);

        txt_Address.setNextFocusableComponent(txt_PostCode);

        txt_PostCode.setNextFocusableComponent(txt_DoB);

        txt_DoB.setNextFocusableComponent(btnSave);

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

        lbl_DoB.setText("DOB (YYYY-MM-DD)");

        lbl_PostCode.setText("Post Code");

        btnSave.setText("Save");
        btnSave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSaveMouseClicked(evt);
            }
        });

        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.setPreferredSize(new java.awt.Dimension(170, 170));
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel2MouseClicked(evt);
            }
        });

        lblPlace.setText("Click to add picture");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPicture)
                    .addComponent(lblPlace))
                .addGap(41, 41, 41))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(lblPicture)
                .addGap(68, 68, 68)
                .addComponent(lblPlace)
                .addContainerGap(98, Short.MAX_VALUE))
        );

        tgbtn_Edit.setText("Edit Record");
        tgbtn_Edit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tgbtn_EditMouseClicked(evt);
            }
        });

        lbl_StaffID.setText("Staff ID");

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
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void btn_QuitInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_QuitInfoActionPerformed
        Navigation BackStaff = new Navigation();
        BackStaff.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_QuitInfoActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        txt_StaffID.setEnabled(false);
        Size = Navigation.StaffTbl.get(0).size();
        String StaffIDLast = Navigation.StaffTbl.get(0).get(Size - 1);
        NewID = Integer.parseInt(StaffIDLast) + 1;
        txt_StaffID.setText(Integer.toString(NewID));
        
        TableLoad();
        tblDatabase.setEnabled(false);
    }//GEN-LAST:event_formWindowOpened

    private void tgbtn_EditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tgbtn_EditMouseClicked
        if (tgbtn_Edit.getText().equals("Edit Record"))
        {
            tgbtn_Edit.setText("New Record");
            tblDatabase.setEnabled(true);
            bEdit = true;
        }
        else if (tgbtn_Edit.getText().equals("New Record"))
        {
            tgbtn_Edit.setText("Edit Record");
            tblDatabase.setEnabled(false);
            bEdit = false;
            Clear();
        }
    }//GEN-LAST:event_tgbtn_EditMouseClicked

    private void btnSaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveMouseClicked
        Pattern pat = Pattern.compile("[^a-z ]", Pattern.CASE_INSENSITIVE);
        Pattern pat2 = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
        Pattern pat3 = Pattern.compile("[^a-z0-9 ]", Pattern.CASE_INSENSITIVE);
        Pattern pat4 = Pattern.compile("\\d{4}-\\d{2}-\\d{2}", Pattern.CASE_INSENSITIVE);
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
            if (!SelectedImg.equals(""))
            {
                if (match1.find() || match2.find() || match3.find() || match4.find() || match5.find() || match6.find())
                {
                    if (txt_Email.getText().contains("@"))
                    {
                        if (txt_PostCode.getText().length() < 9)
                        {
                            if (bEdit == false)
                            {
                                AddData();
                            }
                            else
                            {
                                UpdateData();
                            }
                            Clear();
                            TableLoad();
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
            else
            {
                JOptionPane.showMessageDialog(null, "Please select a picture for the member of staff!", "Error", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnSaveMouseClicked

    public void AddData() {
        try 
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/helpline?allowMultiQueries=true","user","user");
            Statement stmt = (Statement)con.createStatement();
            
            String sql = "INSERT INTO `staff information form` (`StaffID`, `FirstName`, `LastName`, `Address`, `PostCode`, `Email`, `DateOfBirth`, `PictureURL`) VALUES ('"+Integer.parseInt(txt_StaffID.getText())+"', '"+txt_FName.getText()+"', '"+txt_Surname.getText()+"', '"+txt_Address.getText()+"', '"+txt_PostCode.getText()+"', '"+txt_Email.getText()+"', '"+txt_DoB.getText()+"', '"+SelectedImg+"')";
            stmt.execute(sql);
            con.close();            
        } 
        catch (Exception ex) 
        {
            Logger.getLogger(HelpLine.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Navigation.StaffTbl.get(0).add(txt_StaffID.getText());
        Navigation.StaffTbl.get(1).add(txt_FName.getText());
        Navigation.StaffTbl.get(2).add(txt_Surname.getText());
        Navigation.StaffTbl.get(3).add(txt_Address.getText());
        Navigation.StaffTbl.get(4).add(txt_PostCode.getText());
        Navigation.StaffTbl.get(5).add(txt_Email.getText());
        Navigation.StaffTbl.get(6).add(txt_DoB.getText());
        Navigation.StaffTbl.get(7).add(SelectedImg);
    }
    
    public void UpdateData() {
        try 
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/helpline?allowMultiQueries=true","user","user");
            Statement stmt = (Statement)con.createStatement();
            
            String sql = "UPDATE `staff information form` SET `StaffID` = '"+Integer.parseInt(txt_StaffID.getText())+"' , `FirstName` = '"+txt_FName.getText()+"' , `LastName` = '"+txt_Surname.getText()+"', `Address` = '"+txt_Address.getText()+"', `PostCode` = '"+txt_PostCode.getText()+"', `Email` = '"+txt_Email.getText()+"', `DateOfBirth` = '"+txt_DoB.getText()+"', `PictureURL` = '"+SelectedImg+"' WHERE `StaffID` = '"+Integer.parseInt(txt_StaffID.getText())+"'";
            stmt.execute(sql);
            con.close();            
        } 
        catch (Exception ex) 
        {
            Logger.getLogger(HelpLine.class.getName()).log(Level.SEVERE, null, ex);
        }
        int index = 0;
        for (int i = 0; i < Size; i++)
        {
            if (Navigation.StaffTbl.get(0).get(i).equals(txt_StaffID.getText()))
            {
                index = i;
            }
        }
        Navigation.StaffTbl.get(0).set(index, txt_StaffID.getText());
        Navigation.StaffTbl.get(1).set(index, txt_FName.getText());
        Navigation.StaffTbl.get(2).set(index, txt_Surname.getText());
        Navigation.StaffTbl.get(3).set(index, txt_Address.getText());
        Navigation.StaffTbl.get(4).set(index, txt_PostCode.getText());
        Navigation.StaffTbl.get(5).set(index, txt_Email.getText());
        Navigation.StaffTbl.get(6).set(index, txt_DoB.getText());
        Navigation.StaffTbl.get(7).set(index, SelectedImg);
    }
    
    private void btnDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMouseClicked
    }//GEN-LAST:event_btnDeleteMouseClicked

    private void jPanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseClicked
        final JFileChooser fc = new JFileChooser();
        FileFilter imageFilter = new FileNameExtensionFilter("Image files", ImageIO.getReaderFileSuffixes());
        fc.addChoosableFileFilter(imageFilter);
        fc.setAcceptAllFileFilterUsed(false);
        int returnVal = fc.showDialog(Staff_Information.this, "Open");      
        
        try 
        {
            SelectedImg = fc.getSelectedFile().getPath();
            ExtensionFormat();
            BufferedImage img = ImageIO.read(fc.getSelectedFile());
            int type = img.getType() == 0? BufferedImage.TYPE_INT_ARGB : img.getType();

            BufferedImage resizeImageJpg = resizeImage(img, type);
            lblPlace.setText("");
            lblPicture.setIcon(new ImageIcon(resizeImageJpg));
        } 
        catch (IOException ex) 
        {
            SelectedImg = "";
            lblPicture.setIcon(null);
            lblPlace.setText("Click to add picture");
            Logger.getLogger(Staff_Information.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jPanel2MouseClicked

    private void tblDatabaseKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblDatabaseKeyPressed
        switch(evt.getExtendedKeyCode())
        {
            case KeyEvent.VK_UP:
            case KeyEvent.VK_DOWN:
                SelectedRecord();
                break;
        }
    }//GEN-LAST:event_tblDatabaseKeyPressed

    private void tblDatabaseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDatabaseMouseClicked
        SelectedRecord();
    }//GEN-LAST:event_tblDatabaseMouseClicked
    
    private static void ExtensionFormat() {
        SelectedImg = SelectedImg.replaceAll("\\\\", "\\\\\\\\");
    }
    
    private static BufferedImage resizeImage(BufferedImage originalImage, int type){
	BufferedImage resizedImage = new BufferedImage(IMG_WIDTH, IMG_HEIGHT, type);
	Graphics2D g = resizedImage.createGraphics();
	g.drawImage(originalImage, 0, 0, IMG_WIDTH, IMG_HEIGHT, null);
	g.dispose();

	return resizedImage;
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

    private void Clear() {
        txt_StaffID.setText(Integer.toString(NewID+1));
        txt_FName.setText("");
        txt_Surname.setText("");
        txt_Email.setText("");
        txt_Address.setText("");
        txt_PostCode.setText("");
        txt_DoB.setText("");
        lblPicture.setIcon(null);
        lblPlace.setText("Click to add picture");
    }
    
    private void TableLoad() {
        DefaultTableModel tableModel = (DefaultTableModel) tblDatabase.getModel();
        
        tableModel.setRowCount(0);
        
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
    }    
    
    private void SelectedRecord() {
        int SelectedData = tblDatabase.getSelectedRow();
        
        txt_StaffID.setText(Navigation.StaffTbl.get(0).get(SelectedData));
        txt_FName.setText(Navigation.StaffTbl.get(1).get(SelectedData));
        txt_Surname.setText(Navigation.StaffTbl.get(2).get(SelectedData));
        txt_Email.setText(Navigation.StaffTbl.get(5).get(SelectedData));
        txt_Address.setText(Navigation.StaffTbl.get(3).get(SelectedData));
        txt_PostCode.setText(Navigation.StaffTbl.get(4).get(SelectedData));
        txt_DoB.setText(Navigation.StaffTbl.get(6).get(SelectedData));
        SelectedImg = Navigation.StaffTbl.get(7).get(SelectedData);
        File imgLoc = new File(Navigation.StaffTbl.get(7).get(SelectedData));
                
        try {
            BufferedImage img = ImageIO.read(imgLoc);
            int type = img.getType() == 0? BufferedImage.TYPE_INT_ARGB : img.getType();
            
            BufferedImage resizeImageJpg = resizeImage(img, type);
            lblPlace.setText("");
            lblPicture.setIcon(new ImageIcon(resizeImageJpg));
        } catch (IOException ex) {
            lblPlace.setText("Error Loading Picture - File not found");
            Logger.getLogger(Staff_Information.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btn_QuitInfo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblPicture;
    private javax.swing.JLabel lblPlace;
    private javax.swing.JLabel lbl_Address;
    private javax.swing.JLabel lbl_DoB;
    private javax.swing.JLabel lbl_Email;
    private javax.swing.JLabel lbl_FName;
    private javax.swing.JLabel lbl_Info;
    private javax.swing.JLabel lbl_PostCode;
    private javax.swing.JLabel lbl_StaffID;
    private javax.swing.JLabel lbl_Surname;
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