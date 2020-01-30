import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener
{
public static String  un ,pass;
JButton b1,b2,b4,b3;
JLabel label1,label2,label3;
JTextField tf1;
JPasswordField p1;

public Login()
{
super("Login Form");
setLayout(null);
b1 = new JButton("Login");
b2 = new JButton("Cancel");
b3 = new JButton("Sign up");
ImageIcon image = new ImageIcon("Log.jpg");

label3 = new JLabel(image);
b4 = new JButton("Forgot Password");
label1 = new JLabel("Enter User Name");
label2 = new JLabel("Enter Password");
tf1 = new JTextField(20);
p1 = new JPasswordField(10);

label3.setBounds(3, 3, 220, 300);
label1.setBounds(225, 30, 100, 20);
label2.setBounds(225, 70, 110, 20);
tf1.setBounds(340, 30, 140, 20);
p1.setBounds(340, 70, 140, 20);
b1.setBounds(225, 100, 100, 30);
b2.setBounds(340, 100, 140, 30);
b3.setBounds(225, 180, 100, 60);
b4.setBounds(340, 180, 140, 60);
b1.setToolTipText("Click Here to Login");
b2.setToolTipText("Click Here to Reset");
b3.setToolTipText("Click here to sing up");
b4.setToolTipText("Click Here to Recover your forget password");
add(label3);
add(label1);
add(label2);
add(tf1);
add(p1);
add(b1);
add(b2);
add(b3);
add(b4);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
setSize(500,300);
setVisible(true);
setResizable(false);
}
public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==b1)
{
String un = tf1.getText();
String pass = p1.getText();
try 
{
	Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection(  
"jdbc:mysql://localhost:3306/bankdb","root",""); 

String SQL = "select * from urt where Username = '"+un+"' And Password='"+pass+"'";
  Statement stmt = con.createStatement();

   ResultSet rs =   stmt.executeQuery(SQL);

if(rs.next())
{
mainmenu m1 = new mainmenu();
setVisible(false);
}
else
{
int mc = JOptionPane.WARNING_MESSAGE;
JOptionPane.showMessageDialog (null, "Authentication Failed.", "Login Failed", mc);

}

}
catch(Exception e)
{}
}
else if(ae.getSource()==b2)
{
tf1.setText("");
p1.setText("");
tf1.requestFocus();
}
else if(ae.getSource() == b3)
{
Signup1 s5 = new Signup1();
setVisible(false);
}
else if(ae.getSource()==b4)
{

un = tf1.getText();

passrecovery pr = new passrecovery();
setVisible(false);
}
}
public static void main(String args[])
{
Login l1 = new Login();
}
}