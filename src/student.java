import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/*<applet code=student height=500 width=500 ></applet>*/

class student extends JFrame implements ActionListener
{
	JButton b1,b2,b3;
	ImageIcon i1;
	JTextField t1;JPasswordField t2;
	JLabel l1,l2,background;
	student()
	{	setSize(1500,950);
		setUndecorated(true);
		setLayout(new BorderLayout());
		background=new JLabel(new ImageIcon("images/sback.jpg"));
		add(background);
		
		b1=new JButton("Login");
		b2=new JButton("Forgot Password");
		t1=new JTextField(10);
		t2=new JPasswordField(10);
		l1=new JLabel("Username");
		l2=new JLabel("Password");
		l1.setFont(new Font("Arial Black", Font.BOLD, 14));
		l2.setFont(new Font("Arial Black", Font.BOLD, 14));
		i1=new ImageIcon("images/close.jpg");
		b3=new JButton(i1);
		
		background.add(l1);
		background.add(t1);
		background.add(l2);
		background.add(t2);
		background.add(b1);
		background.add(b2);
		background.add(b3);
		l1.setBounds(new Rectangle(450,250,150,30));
		t1.setBounds(new Rectangle(620,250,150,20));
		l2.setBounds(new Rectangle(450,280,150,30));
		t2.setBounds(new Rectangle(620,280,150,20));
		b1.setBounds(new Rectangle(450,310,150,30));
		b2.setBounds(new Rectangle(620,310,150,30));
		b3.setBounds(new Rectangle(1340,0,19,19));
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		setVisible(true);		
		
	}
		public void actionPerformed(ActionEvent ae)
		{
			if(ae.getSource()==b1)
			{
			
				if((t1.getText().equals("admin")) && (new String(t2.getText())).equals("12345"))
				{
					logins l=new logins();
					l.setVisible(true);
				}
				else
				{
					JOptionPane.showMessageDialog(null,"Enter valid Username/Password");
				}
			t1.setText(" ");
			t2.setText(" ");
			}
			else if(ae.getSource()==b2)
			{
				forgots f=new forgots();
				f.setVisible(true);
			}
			else
			{dispose();}
		}
		public static void main(String ss[])
		{ 	
			student s=new student();

		}
}
			