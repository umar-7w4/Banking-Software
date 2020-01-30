import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
import java.io.*;
import java.util.*;
import java.lang.*;
public class closesavingaccount extends JFrame implements ActionListener
{
String can,cnm,cadd,cphno,ciacno,cbal,str,cod;
Connection cn;
Statement st;

JTextField an,nm,add,phno,iacno,bal,od;
JLabel lan,lnm,ladd,lphno,liacno,lbal,h,lod;
JButton search,delete,update,exit;
Font f,f1;
public closesavingaccount()
{
super("New Savings Account Creation");
setSize(400,400);
setVisible(true);
an=new JTextField(20);
nm=new JTextField(20);
add=new JTextField(20);
phno=new JTextField(20);
iacno=new JTextField(20);
bal=new JTextField(20);
od=new JTextField(20);
h=new JLabel("OPENING NEW ACCOUNT");

lan=new JLabel("Account No");
lnm=new JLabel("Name");
ladd=new JLabel("Address");
lphno=new JLabel("Phone no");
liacno=new JLabel("Introducee acc no");
lbal =new JLabel("Balance");
lod =new JLabel("Opening_Date");
search=new JButton("SEARCH");
delete=new JButton("DELETE");
update=new JButton("UPDATE");
exit=new JButton("EXIT");


setLayout(new GridLayout(9,2));
add(lan);
add(an);
add(lnm);
add(nm);
add(ladd);
add(add);
add(lphno);
add(phno);
add(liacno);
add(iacno);
add(lbal);
add(bal);
add(lod);
add(od);
add(search);
add(delete);
add(update);
add(exit);

search.addActionListener(this);
delete.addActionListener(this);
update.addActionListener(this);
exit.addActionListener(this);
}


public void actionPerformed(ActionEvent ae)
{
if (ae.getSource()==search)
{
int accno = Integer.parseInt(an.getText());
try
	{	
Class.forName("com.mysql.jdbc.Driver");
Connection cn=DriverManager.getConnection(  
"jdbc:mysql://localhost:3306/bankdb","root",""); 
Statement st=cn.createStatement();
ResultSet rec = st.executeQuery("select * from SavingAccount where AccountNo="+accno+"");
		rec.next();

nm.setText(rec.getString("Name"));
add.setText(rec.getString("Address"));
phno.setText(rec.getString("PhoneNo"));
iacno.setText(rec.getString("intro_acc_no"));
bal.setText(rec.getString("Balance"));
od.setText(rec.getString("Opening_date"));

}
catch(Exception e)
{}
}
else if(ae.getSource()==delete)
{
int accno = Integer.parseInt(an.getText());
try
	{	


Connection cn=DriverManager.getConnection(  
"jdbc:mysql://localhost:3306/bankdb","root",""); 
Statement st=cn.createStatement();
st.executeUpdate("delete from SavingAccount where AccountNo="+accno+"");
}
catch(Exception e){}
}
else if(ae.getSource()==update)
{
can=an.getText();
cnm=nm.getText();
cadd=add.getText();
cphno=phno.getText();
ciacno=iacno.getText();
cbal=bal.getText();
cod=od.getText();
try
	{	

Connection cn=DriverManager.getConnection(  
"jdbc:mysql://localhost:3306/bankdb","root",""); 
Statement st=cn.createStatement();
st.executeUpdate("update SavingAccount set Name='"+cnm+"' ,Address='"+cadd+"' ,PhoneNo='"+cphno+"',intro_acc_no='"+ciacno+"',Balance='"+cbal+"',Opening_date='"+cod+"' where AccountNo="+can+"");
}
catch(Exception e){}


}
else if(ae.getSource()==exit)
{
setVisible(false);
}

}

public static void main(String args[])
{
closesavingaccount csa = new closesavingaccount();
}

                                    
}
	