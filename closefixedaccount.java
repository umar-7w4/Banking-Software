import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
import java.io.*;
import java.util.*;
import java.lang.*;
public class closefixedaccount extends JFrame //implements ActionListener
{
Connection cn;
Statement st;

JTextField an,nm,add,phno,san,od,am,pe,ir,ma,md;
JLabel lan,lnm,ladd,lphno,lsan,lod,lam,lpe,lir,lma,lmd;
JButton search,delete,update,exit;
public closefixedaccount()
{
super("Close Fixed Account");
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
search=new JButton("SEARCH");
delete=new JButton("DELETE");
update=new JButton("UPDATE");
exit=new JButton("EXIT");

setLayout(new GridLayout(13,2));

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
add(search);
add(delete);
add(update);
add(exit);
setVisible(true);
/*ma.addFocusListener(this);
save.addActionListener(this);
e.addActionListener(this);*/
}


/*public void actionPerformed(ActionEvent ae)
{
if (ae.getSource()==search)
{
int accno = Integer.parseInt(an.getText());
try
	{	
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
Connection cn=DriverManager.getConnection("jdbc:odbc:sa","","");
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

Connection cn=DriverManager.getConnection("jdbc:odbc:sa","","");
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

Connection cn=DriverManager.getConnection("jdbc:odbc:sa","","");
Statement st=cn.createStatement();
st.executeUpdate("update SavingAccount set Name='"+cnm+"' ,Address='"+cadd+"' ,PhoneNo='"+cphno+"',intro_acc_no='"+ciacno+"',Balance='"+cbal+"',Opening_date='"+cod+"' where AccountNo="+can+"");
}
catch(Exception e){}


}
else if(ae.getSource()==exit)
{
setVisible(false);
}

}*/

public static void main(String args[])
{
closefixedaccount csa = new closefixedaccount();
}

                                    
}
	