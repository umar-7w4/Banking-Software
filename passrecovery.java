import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class passrecovery extends JFrame implements ActionListener
{
JButton b1,b2;
JLabel label1,label2;
JTextField tf1;
String ra;
String pass;

passrecovery()
{
super("Password Recovery Form");
setLayout( new GridLayout(5,1));
label1 = new JLabel("");
label2 = new JLabel("");
b1 = new JButton("Submit");
b2 = new JButton("Back to Login");
tf1 = new JTextField(20);

add(label1);
add(tf1);
add(b1);

add(label2);
add(b2);
try 
{
Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection(  
"jdbc:mysql://localhost:3306/bankdb","root",""); 
String SQL = "select * from urt where Username = '"+Login.un+"'";
  Statement stmt = con.createStatement();

   ResultSet rs =   stmt.executeQuery(SQL);
rs.next();
pass = rs.getString("Password");
label1.setText(rs.getString("Sq"));
ra =rs.getString("Ans");
}
catch(Exception e){}

b1.addActionListener(this);
b2.addActionListener(this);
setSize(500,300);
setVisible(true);
setResizable(false);
}
public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==b1)
{
String ua = tf1.getText();
if(ra.equals(ua))
{
label2.setText("Your Password is =  "+pass);
}

else
{
int mc = JOptionPane.WARNING_MESSAGE;
JOptionPane.showMessageDialog (null, "Your Answer is not Right.", "Invalid Answer", mc);

}

}
else if(ae.getSource() == b2)
{
Login btl = new Login();
setVisible(false);
}
}
public static void main(String args[])
{
passrecovery pr = new passrecovery();
}
}