/*
* Code for form load
*/
txt_ID.setEnabled(false); //disabling the autogenerated StaffID text file
int IDGen = Navigation.Tbl.get(1).size(); //getting size of array for last ID generated
txt_ID.setText(Integer.toString(Integer.parseInt(Navigation.Tbl.get(1).get(IDGen)) + 1)); //Generating a new ID
DefaultTableModel tableModel = (DefaultTableModel) tbl.getModel(); //declaring a tablemodel for adding records to the JTable
       
for (int i = 0; i < Navigation.Tbl.get(1).size(); i++) //loop to add all records to table
{
    Object[] rowData = { 
        Navigation.StaffTbl.get(0).get(i), //each comma is info for a new row
        Navigation.StaffTbl.get(1).get(i), 
        Navigation.StaffTbl.get(2).get(i), 
        Navigation.StaffTbl.get(3).get(i),
        Navigation.StaffTbl.get(4).get(i),
        Navigation.StaffTbl.get(5).get(i),
        Navigation.StaffTbl.get(6).get(i),
        Navigation.StaffTbl.get(7).get(i)
    };
    tableModel.addRow(rowData); //adding the data into the table
}
tbl.setEnabled(false); //disabling the table on load

/*
* Code for Save button
*/
Pattern pat = Pattern.compile("[^a-z ]", Pattern.CASE_INSENSITIVE); //allows only text inputs e.g. name fields
Pattern pat2 = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE); //validation for an email address field
Pattern pat3 = Pattern.compile("[^a-z0-9 ]", Pattern.CASE_INSENSITIVE); //validation for only allowing numbers & letters, e.g. an address
Pattern pat4 = Pattern.compile("\\d{4}/\\d{2}/\\d{2}", Pattern.CASE_INSENSITIVE); //validation for a date, format "YYYY/MM/DD"
Matcher match1 = pat.matcher(txt_.getText()); //Add names of text fields that need to be validated against the patterns listed above (if need to add more/change, declare new matcher & use the pattern that is needed from above)
Matcher match2 = pat.matcher(txt_.getText());
Matcher match3 = pat2.matcher(txt_.getText());
Matcher match4 = pat3.matcher(txt_.getText());
Matcher match5 = pat3.matcher(txt_.getText());
Matcher match6 = pat4.matcher(txt_.getText());
        
if (txt_.getText().equals("") || txt_.getText().equals("") || txt_.getText().equals("") || txt_.getText().equals("") || txt_.getText().equals("") || txt_.getText().equals("")) //validating making sure fields aren't empty (add names of text boxes)
{
    JOptionPane.showMessageDialog(null, "Please fill in all sections of the form!", "Error", JOptionPane.WARNING_MESSAGE);
}
else
{
    if (match1.find() || match2.find() || match3.find() || match4.find() || match5.find() || match6.find()) //uses matchers from above, add/remove as needed
    {
        if (txt_.getText().contains("@")) //ensuring the email field contains an '@'
        {
            if (txt_.getText().length() < 8) //ensuring the postcode field isn't too long
            {
				AddData(); //calls function for generating the sql
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

/*
* Function for generating Insert SQL
*/
try 
{
    Class.forName("com.mysql.jdbc.Driver"); //don't need to change anything here
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/helpline?allowMultiQueries=true","user","user");
    Statement stmt = (Statement)con.createStatement(); 
 
	//in first marks input table name, then in the marks in the brackets, the column headings, add/remove as needed.
	//in second brackets, change names of text fields, add more as needed
    String sql = "INSERT INTO `` (``, ``, ``, ``, ``, ``, ``) VALUES ('"+txt_.getText()+"', '"+txt_.getText()+"', '"+txt_.getText()+"', '"+txt_.getText()+"', '"+txt_.getText()+"', '"+txt_.getText()+"', '"+txt_.getText()+"')";
    stmt.execute(sql);
    con.close();            
} 
catch (Exception ex) 
{
	Logger.getLogger(HelpLine.class.getName()).log(Level.SEVERE, null, ex);
}