import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class forgotm extends JFrame implements ActionListener
{
	JButton b1,b2;
	ImageIcon i1;
	JLabel l1,l2;
	JTextField t1,t2;
	forgotm()
	{
		setSize(1500,650);
		setUndecorated(true);
		b1=new JButton("Generate Password");
		l1=new JLabel("Username");
		l2=new JLabel("SecurityQuestion: Favourite Color?");
		t1=new JTextField(20);
		t2=new JTextField(20);
		i1=new ImageIcon("images/close.jpg");
		b2=new JButton(i1);
		setLayout(null);
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(b1);
		add(b2);
		l1.setBounds(new Rectangle(550,275,150,30));
		t1.setBounds(new Rectangle(750,275,150,30));
		l2.setBounds(new Rectangle(450,325,250,30));
		t2.setBounds(new Rectangle(750,325,150,30));
		b1.setBounds(new Rectangle(600,375,150,30));
		b2.setBounds(new Rectangle(1340,0,19,19));
		b1.addActionListener(this);
		b2.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
		{
			if((t1.getText().equals("admin")) && (t2.getText().equals("violet")))
				{
					JOptionPane.showMessageDialog(null,"Password: 721214");
				}
				else
				{
					JOptionPane.showMessageDialog(null,"Enter valid Username/Answer");
				}
				t1.setText("");
				t2.setText("");
		}
		else
		{dispose();}
	}
	public static void main(String s[])
	{
		forgotm b=new forgotm();
		b.setVisible(true);
	}
}