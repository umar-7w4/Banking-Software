import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
import java.io.*;
import java.util.*;
import java.lang.*;
public class newsavingaccount extends JFrame implements ActionListener
{
String can,cnm,cadd,cphno,ciacno,cbal,str,cod;
Connection cn;
Statement st;

JTextField an,nm,add,phno,iacno,bal,od;
JLabel lan,lnm,ladd,lphno,liacno,lbal,h,lod;
JButton save,exit;
Font f,f1;
public newsavingaccount()
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
save=new JButton("SAVE");

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
add(save);
add(exit);
java.util.Date dt=new java.util.Date();
String s="";
int mon=0;
mon=dt.getMonth() +1;
int a=0;
a= dt.getYear()+1900;
s=dt.getDate()+"/"+ mon + "/" + a;
od.setText(s);
od.setEditable(false);
try
	{	
	Class.forName("com.mysql.jdbc.Driver");
Connection cn=DriverManager.getConnection(  
"jdbc:mysql://localhost:3306/bankdb","root",""); 


       		  Statement st=cn.createStatement();
System.out.println("ok1");
  ResultSet rec = st.executeQuery("select max(AccountNo) from SavingAccount");
System.out.println("ok1");
    		 int i=0;

		rec.next();
		
       		 i=rec.getInt(1);
		

		 i=i+1;

       		 an.setText(String.valueOf(i));
       		
rec.close();
		cn.close();
		}
	catch(Exception e2){}
save.addActionListener(this);

exit.addActionListener(this);
}


public void actionPerformed(ActionEvent ae)
{
if (ae.getSource()==save)
{
connect();
}
else if(ae.getSource()==exit)
{
setVisible(false);
}

}

public void connect()
{
can=an.getText();
cnm=nm.getText();
cadd=add.getText();
cphno=phno.getText();
ciacno=iacno.getText();
cbal=bal.getText();
cod=od.getText();
str="insert into SavingAccount values ("+can+",'"+cnm+"','"+cadd+"','"+cphno+"','"+ciacno+"',"+cbal+",'"+cod+"')";
    try
{
	
Connection cn=DriverManager.getConnection(  
"jdbc:mysql://localhost:3306/bankdb","root",""); 
Statement st=cn.createStatement();
st.executeUpdate(str);
st.close();
cn.close();

System.out.println("dfwsjdfbj");
int with=0;
String str1="insert into transactiontable(AccountNo,Date , Deposit , Withdraw , Balance) values ("+can+",'"+cod+"','"+cbal+"','"+with+"','"+cbal+"')";

System.out.println("dfwsjdfbj");
         
		
  
	
Connection cn1=DriverManager.getConnection(  
"jdbc:mysql://localhost:3306/bankdb","root",""); 
Statement st1=cn1.createStatement();

System.out.println("77777777");
st1.executeUpdate(str1);
System.out.println("kkkkkk");
}

catch(SQLException sqlExcep)
{
System.out.println(sqlExcep);
}
                                   
}
}	