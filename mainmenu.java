import javax.swing.*;
import java.awt.event.*;
public class mainmenu extends JFrame implements ActionListener
{
JMenuItem sa;
JMenuItem fa;
JMenuItem ex;
JMenuItem lt;
JMenuItem with;
JMenuItem dep;
JMenuItem mins;
JMenuItem cs;
JMenuItem cf;
JMenuItem re;
JMenuItem reps;
public mainmenu()
{
super("Welcome To Online Banking");
JMenuBar men = new JMenuBar();
JMenu na = new JMenu("New Account");
JMenu th = new JMenu("Transaction History");
JMenu cl = new JMenu("Closure");
JMenu re = new JMenu("Report");
sa = new JMenuItem("Savings Account");
fa = new JMenuItem("Fixed Account");
mins = new JMenuItem("Mini Statement");
ex = new JMenuItem("Exit");
lt = new JMenuItem("Log Out");
dep = new JMenuItem("Deposit");
with = new JMenuItem("Withdraw");
cs = new JMenuItem("Savings");
cf = new JMenuItem("Fixed");
reps = new JMenuItem("Savings");
na.add(sa);
na.addSeparator();
na.add(fa);
na.addSeparator();
na.add(lt);
na.addSeparator();
na.add(ex);
th.add(dep);
th.addSeparator();
th.add(with);
th.addSeparator();
th.add(mins);
cl.add(cs);
cl.addSeparator();
cl.add(cf);
re.add(reps);
men.add(na);
men.add(th);
men.add(cl);
men.add(re);
setJMenuBar(men);
setSize(450,320);

setVisible(true);
sa.addActionListener(this);
fa.addActionListener(this);
ex.addActionListener(this);
lt.addActionListener(this);
dep.addActionListener(this);
with.addActionListener(this);
mins.addActionListener(this);
cf.addActionListener(this);
cs.addActionListener(this);
reps.addActionListener(this);
}
public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==sa)
{
newsavingaccount nsa = new newsavingaccount();
}
else if(ae.getSource()==fa)
{
newfixedaccount nfa = new newfixedaccount();
nfa.setVisible(true);
}


else if(ae.getSource()==cs)
{
closesavingaccount csa = new closesavingaccount();
csa.setVisible(true);
}
else if(ae.getSource()==cf)
{
closefixedaccount cfa = new closefixedaccount();
cfa.setVisible(true);
}
else if(ae.getSource()==dep)
{
savingdeposit sd = new savingdeposit();
}
else if(ae.getSource()==with)
{
savingwithdraw sw = new savingwithdraw();
}
else if(ae.getSource()==lt)
{
Login ln = new Login();
setVisible(false);
}
else if(ae.getSource()==ex)
{
System.exit(0);
}
else if(ae.getSource()==reps)
{

Report r1 = new Report();

}
}

    public static void main(String[] args) 
{
mainmenu mb1 = new mainmenu();
       
            }

        }

    
