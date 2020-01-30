import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
import java.io.*;
import java.util.*;
import java.lang.*;
public class newfixedaccount extends JFrame implements FocusListener , ActionListener
{

Connection cn;
Statement st;

JTextField an,nm,add,phno,san,od,am,pe,ir,ma,md;
JLabel lan,lnm,ladd,lphno,lsan,lod,lam,lpe,lir,lma,lmd;
JButton save,n,e;
public newfixedaccount()
{
super("New Fixed Account Creation");
setSize(400,400);
an=new JTextField(20);
nm=new JTextField(20);
add=new JTextField(20);
phno=new JTextField(20);
san=new JTextField(20);
od=new JTextField(20);
am=new JTextField(20);
pe=new JTextField(20);
ir=new JTextField(20);
ma=new JTextField(20);
md=new JTextField(20);


lan=new JLabel("Account No");
lnm=new JLabel("Name");
ladd=new JLabel("Address");
lphno=new JLabel("Phone no");
lsan=new JLabel("Saving Account NO");
lod =new JLabel("Opening Date");
lam =new JLabel("Amount");
lpe =new JLabel("Period");
lir =new JLabel("Interest Rate");
lma=new JLabel("Maturity Amount");
lmd =new JLabel("Maturity Date");
save=new JButton("SAVE");

e=new JButton("EXIT");

setLayout(new GridLayout(12,2));

add(lan);
add(an);
add(lnm);
add(nm);
add(ladd);
add(add);
add(lphno);
add(phno);
add(lsan);
add(san);
add(lod);
add(od);
add(lam);
add(am);
add(lpe);
add(pe);
add(lir);
add(ir);
add(lma);
add(ma);
add(lmd);
add(md);
add(save);
add(e);
ma.addFocusListener(this);
save.addActionListener(this);
e.addActionListener(this);
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
  ResultSet rec = st.executeQuery("select max(AccountNo) from FixedAccount");
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
//save.addActionListener(this);
//e.addActionListener(this);
}
public void focusLost(FocusEvent fe)
{
}
public void focusGained(FocusEvent fe)
{
int principal = Integer.parseInt(am.getText());
int period = Integer.parseInt(pe.getText());
int ir1 = Integer.parseInt(ir.getText());
int rate = principal*period*ir1/100;
int ma1 = principal+rate;
ma.setText(String.valueOf(ma1));
}
public void actionPerformed(ActionEvent ae)
{
if (ae.getSource()==save)
{
System.out.println("hello");
connect();
}
else if(ae.getSource()==e)
{

setVisible(false);

}

}

public void connect()
{
System.out.println("hello");
String can=an.getText();
String cnm=nm.getText();
String cadd=add.getText();
String cphno=phno.getText();
String csan=san.getText();
String cod=od.getText();
String cam=am.getText();
String cpe=pe.getText();
String cir=ir.getText();
String cma=ma.getText();
String cmd1=md.getText();
String str="insert into fixedaccount values("+can+",'"+cnm+"','"+cadd+"','"+cphno+"','"+csan+"','"+cod+"','"+cam+"','"+cpe+"','"+cir+"','"+cma+"','"+cmd1+"')";

System.out.println("hello");
          try
	{	
	   
		System.out.println("hello123");
        
	
Connection cn=DriverManager.getConnection(  
"jdbc:mysql://localhost:3306/bankdb","root",""); 
Statement st=cn.createStatement();
System.out.println("hello123");
st.executeUpdate(str);
System.out.println("hello123");
}
catch(SQLException sqlExcep)
{
System.out.println(sqlExcep);
}


}



                                    
}
	