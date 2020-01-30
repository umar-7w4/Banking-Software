import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.lang.*;
import java.util.*;
import java.sql.*;
import java.util.*;
public class savingwithdraw extends JFrame implements ActionListener,FocusListener
{
String sacno,str1="",str2="";
int num=0;
TextField a,b,c,z,e,f;
JLabel la,lb,lc,lz,le,lf;
JButton bexit,save;
Connection cn;
Statement st;
public savingwithdraw()
{
setSize(800,800);
Container  con;
con=this.getContentPane();
a=new TextField(10);
b=new TextField(10);
b.setEditable(false);
c=new TextField(10);
z=new TextField(10);
e=new TextField(10);
f=new TextField(10);
la=new JLabel("Account No ");
lb=new JLabel("Transaction Date ");
lc=new JLabel("Name ");
lz=new JLabel("Balance ");
le=new JLabel("Withdraw Amount ");
lf=new JLabel("New Balance ");
bexit=new JButton("EXIT");
save=new JButton("SAVE");
con.setLayout(new GridLayout(8,2));
con.add(la);
con.add(a);
con.add(lb);
con.add(b);
con.add(lc);
con.add(c); 
con.add(lz);
con.add(z); 
con.add(le);
con.add(e); 
con.add(lf);
con.add(f);  
con.add(bexit);
con.add(save);
bexit.addActionListener(this);
save.addActionListener(this);
a.addFocusListener(this);
e.addFocusListener(this);
f.addFocusListener(this);
setVisible(true);
java.util.Date dt=new java.util.Date();
String s="";
int mon=0;
mon=dt.getMonth() +1;
int a=0;
a= dt.getYear()+1900;
s=""+ dt.getDate() + "/" + mon + "/"+a;
b.setText(s);
}

public void focusGained(FocusEvent fe1)
{
int z1 = Integer.parseInt(z.getText());
int e1 = Integer.parseInt(e.getText());
int cb =z1-e1;
f.setText(String.valueOf(cb));
}
public void actionPerformed(ActionEvent ae)
{

int accno =Integer.parseInt(a.getText());
String b1 =b.getText();
String w1 =e.getText();
String d1="0";
String cb=f.getText();
try
		{
	Class.forName("com.mysql.jdbc.Driver");
Connection cn=DriverManager.getConnection(  
"jdbc:mysql://localhost:3306/bankdb","root",""); 
Statement st=cn.createStatement();
st.executeUpdate("insert Transactiontable (AccountNo,Date , Deposit , Withdraw , Balance) values("+accno+",'"+b1+"','"+d1+"','"+w1+"','"+cb+"')");
}
catch(Exception e){}
}
public void focusLost(FocusEvent fe)
{
String sacno=a.getText();

		 try
		{
	Class.forName("com.mysql.jdbc.Driver");
Connection cn=DriverManager.getConnection(  
"jdbc:mysql://localhost:3306/bankdb","root",""); 
		Statement st=cn.createStatement();
		ResultSet rs=st.executeQuery("select * from SavingAccount where AccountNo=" + sacno + "");
                        rs.next();
		
			String vnm=rs.getString("name");
			c.setText(vnm);
cn.close();
st.close();
	Class.forName("com.mysql.jdbc.Driver");
Connection cn1=DriverManager.getConnection(  
"jdbc:mysql://localhost:3306/bankdb","root",""); 
		Statement st1=cn1.createStatement();
		ResultSet rs1=st1.executeQuery("select * from Transactiontable where AccountNo=" + sacno + " order by tid desc Limit 1 ");
                        rs1.next();
		
			String cb=rs1.getString("Balance");
			z.setText(cb);



}
catch(Exception e){}
}
public static void main(String args[])
{
savingwithdraw sd = new savingwithdraw();
}
}	