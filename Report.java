import javax.swing.event.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.sql.*;
public class Report extends JFrame implements ActionListener
{
	JTable jtabl;
	JScrollPane pn;
	JButton sr,ex;
JPanel p1;
JLabel l1;
JTextField tf;	
	int i,irow;
	String sacno,stdt,sttyp,samt,sbal;String str="";
public Report()
{
p1 = new JPanel();
p1.setLayout(new GridLayout(2,2));


l1 = new JLabel("Enter Saving AccountNo");
tf = new JTextField(20);
sr = new JButton("SHOW REPORT");
ex = new JButton("EXIT");
p1.add(l1);
p1.add(tf);
p1.add(sr);
p1.add(ex);
sr.addActionListener(this);
ex.addActionListener(this);
add(p1,BorderLayout.NORTH); 
setSize(600,600);
setVisible(true);
}
public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==sr)
{
int acno = Integer.parseInt(tf.getText());
  irow=0;
	i=0;

	try
	{
		try
		{	
			Class.forName("com.mysql.jdbc.Driver");

		}
		catch(Exception ss){}
	      Connection cn=DriverManager.getConnection(  
"jdbc:mysql://localhost:3306/bankdb","root",""); 
		Statement st=cn.createStatement();
		
		str="select * from Transactiontable where AccountNo=" + acno + " order by tid";
                                      System.out.println(str);
 		ResultSet rec=st.executeQuery(str); // + vacno + "'");
	
	        while(rec.next())
		{
		   irow=irow+1;
		}	
	        st.close();
	       cn.close();
	}//try
	catch(Exception e)
	{}   
	System.out.println("irow=" +irow);
	irow=irow+1;
	jtabl=new JTable(irow,5);
	
	i=0;
	jtabl.setValueAt("Account No  ",i,0);
	jtabl.setValueAt("Transt Date ",i,1);
	jtabl.setValueAt("Deposit Amount",i,2);
	jtabl.setValueAt("Withdraw Amount",i,3);
	jtabl.setValueAt("  Balance  ",i,4);

	try
	{
		try
		{	
			Class.forName("com.mysql.jdbc.Driver");
		}
		catch(Exception ss){}
	             Connection cn1=DriverManager.getConnection(  
"jdbc:mysql://localhost:3306/bankdb","root",""); 
		Statement st1=cn1.createStatement();
		ResultSet rec1=st1.executeQuery(str);
		
		String amts="";
		while(rec1.next())
		{
			i=i+1;
			sacno=""+rec1.getInt("AccountNo");
			jtabl.setValueAt(sacno,i,0);	
			System.out.println("accno="+sacno);
	
		                  stdt=""+rec1.getString("Date");
			jtabl.setValueAt(stdt,i,1);
			System.out.println("tr_date="+stdt);
			
			
                        sttyp=""+rec1.getString("Deposit");
                        jtabl.setValueAt(sttyp,i,2);	
			//sttyp=sttyp.trim();
			//System.out.println("tr_type="+sttyp);                      


		 	samt=""+rec1.getString("Withdraw");	
			System.out.println("amts="+samt);
                        jtabl.setValueAt(samt,i,3);

         	     
			sbal=""+rec1.getInt("Balance");
			System.out.println("sbal="+sbal);		                 
		         //        if  (sttyp.equals("w"))
			//{
			    //  jtabl.setValueAt(samt,i,2);
   			   //   jtabl.setValueAt("               ",i,3);
			//}
			//else
			//{
				 // jtabl.setValueAt("               ",i,2);
		 		//  jtabl.setValueAt(samt,i,3);
                     		//   }
			 	jtabl.setValueAt(sbal,i,4);
		}	//while
        		st1.close();
		cn1.close();
	}//try
	catch(Exception e)
	{
			System.out.println(e.getMessage());	
			System.out.println("tr_type="+sttyp);
	}
	
	pn=new JScrollPane();
	pn.setViewportView(jtabl);	
	add(jtabl,BorderLayout.CENTER); 

}
else if(ae.getSource()==ex)
{
   setVisible(false);
}

}

}	