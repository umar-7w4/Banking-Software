import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import javax.swing.*;
public class Signup1 extends JFrame implements ActionListener
{
String msg;
JButton b1 = new JButton("Save");
JButton b2 = new JButton("Login");
JLabel l1 = new JLabel("User Name:");
JLabel l20 = new JLabel("Password:");
JLabel l2 = new JLabel("Name:");
JLabel l3 = new JLabel("Age:");
JLabel l4 = new JLabel("Sex:");
JLabel l5 = new JLabel("Dob:");
JLabel l6 = new JLabel("Address:");
JLabel l7 = new JLabel("Mobile No:");
JLabel l8 = new JLabel("Email:");

JLabel l9 = new JLabel("Married:");
JLabel l10 = new JLabel("Children:");
JLabel l11 = new JLabel("Invalid Input");
JLabel l12 = new JLabel("Sequrity Ques:");
JLabel l13 = new JLabel("Answer:");
JTextField t1 = new JTextField();
JTextField t2 = new JTextField();
JTextField t3 = new JTextField();
JTextField t4 = new JTextField();
JTextField t5 = new JTextField();
JTextField t6 = new JTextField();
Choice c1 = new Choice();
CheckboxGroup cbg = new CheckboxGroup();
Checkbox ck1 = new Checkbox("Male",false,cbg);
Checkbox ck2 = new Checkbox("Female",false,cbg);
CheckboxGroup cbg1 = new CheckboxGroup();
Checkbox ck3 = new Checkbox("Yes",false,cbg1);
Checkbox ck4 = new Checkbox("No",false,cbg1);
CheckboxGroup cbg2 = new CheckboxGroup();
Checkbox ck5 = new Checkbox("Yes",false,cbg2);
Checkbox ck6 = new Checkbox("No",false,cbg2);
TextArea ta1 = new TextArea("",200,100,TextArea.SCROLLBARS_VERTICAL_ONLY);
Choice Age = new Choice();
Choice Dob = new Choice();
Choice Seq = new Choice();
public Signup1()
{
super("Registration Form");


setLayout(null);
l11.setVisible(false);
add(l1);
add(l20);
add(l2);
add(l3);
add(l4);
add(l5);
add(l6);
add(l7);
add(l8);
add(l9);
add(l10);
add(l11);
add(l12);
add(l13);
add(t1);
add(t2);
add(t3);
add(t4);
add(t5);
add(t6);
add(ta1);
add(ck1);
add(ck2);
add(ck3);
add(ck4);
add(ck5);
add(ck6);
add(Age);
add(Dob);
add(Seq);
add(b1);
add(b2);
Age.add("10");
Age.add("11");
Age.add("12");
Age.add("13");
Age.add("14");
Age.add("15");
Age.add("16");
Age.add("17");
Age.add("18");
Age.add("20");
Age.add("21");
Age.add("22");
Age.add("23");
Age.add("24");
Age.add("25");
Age.add("26");
Age.add("27");
Age.add("28");
Age.add("29");
Age.add("30");
Dob.add("January");
Dob.add("Feberuary");
Dob.add("March");
Dob.add("April");
Dob.add("May");
Dob.add("June");
Dob.add("July");
Dob.add("August");
Dob.add("September");
Dob.add("October");
Dob.add("November");
Dob.add("December");
Seq.add("What is your pets name");
Seq.add("What is your favourite color");
Seq.add("What is your nick name");
Seq.add("What is your favoutite sport");
l1.setBounds(25,15,90,20);
l20.setBounds(25,40,90,20);
l2.setBounds(25,65,90,20);
  l3.setBounds(25,90,90,20);
  l4.setBounds(25,120,90,20);
  l6.setBounds(25,185,90,20);
  l5.setBounds(25,260,90,20);
  l7.setBounds(25,300,90,20);
l11.setBounds(300,300,90,20);
  l8.setBounds(25,335,90,20);
  l9.setBounds(25,140,90,20);
l10.setBounds(25,160,90,20);
l12.setBounds(25,370,90,20);
l13.setBounds(25,400,90,20);
  t1.setBounds(120,65,170,20);
t4.setBounds(120,15,170,20);
t5.setBounds(120,40,170,20);
t6.setBounds(120,400,170,20);
  t2.setBounds(120,300,170,20);
 t3.setBounds(120,335,170,20);
 ta1.setBounds(120,185,175,60);
  ck1.setBounds(120,120,50,20);
  ck2.setBounds(170,120,60,20);
ck3.setBounds(120,140,50,20);
ck4.setBounds(170,140,60,20);
ck5.setBounds(120,160,50,20);
ck6.setBounds(170,160,60,20);
  Age.setBounds(120,90,50,20);
Dob.setBounds(120,260,100,20);
Seq.setBounds(120,370,170,20);
  b1.setBounds(120,450,80,30);
b2.setBounds(230,450,80,30);
b1.setToolTipText("Click Here to Save Details");
b2.setToolTipText("Click Here to go to Log in");
b1.addActionListener(this);
b2.addActionListener(this);
setSize(500,550);
setVisible(true);
setResizable(false);

this.getContentPane().setBackground(Color.gray);
}
public void actionPerformed(ActionEvent ae)
{
if(ae.getSource() == b1)
{
String nam = t1.getText();

String a = Age.getSelectedItem();
String gen;
if(ck1.getState() == true){
gen = "Male";
}
else {
gen = "Female";
}
String marr;
if(ck3.getState() == true){
marr = "Yes";
}
else {
marr = "no";
}
String chil;
if(ck5.getState() == true){
chil = "Yes";
}
else {
chil = "No";
}
String add = ta1.getText();
String bd = Dob.getSelectedItem();
String mob = t2.getText();
int len = mob.length();
if(len == 10)
{
l11.setVisible(false);
}
else if(len != 10)
{
l11.setVisible(true);
l11.setForeground(Color.red);
t2.requestFocus();
}
String em = t3.getText();
if(nam == " " || a == " " || gen == "false" || marr == "false" || chil == "false" || add == " " || bd == " " || mob == " " || em == " ") {
System.out.println("Error"); }
else {
System.out.println(nam + "\n" + a + "\n" + gen + "\n" + marr + "\n" + chil + "\n" + add + "\n" + bd + "\n" + mob + "\n" + em);
}
t1.setText("");
t2.setText("");
t3.setText("");
ta1.setText("");
ck1.setState(false);
ck2.setState(false);
ck3.setState(false);
ck4.setState(false);
ck5.setState(false);
ck6.setState(false);
t1.requestFocus();
}
else if(ae.getSource() == b2)
{
Login lo = new Login();
setVisible(false);
}
}
public static void main(String args[])
{
Signup1 s1 = new Signup1();
}
}



























