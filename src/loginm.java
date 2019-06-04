import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
class loginm extends JFrame implements ActionListener
{
	JButton b1,b2,b3,b4,b5,b6,b9;
	ImageIcon i1,i2,i3,i4,i5,i6,i9;
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,background;
	JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11;
	loginm()
	{
		setSize(1500,950);
		setUndecorated(true);
		setLayout(new BorderLayout());
		background=new JLabel(new ImageIcon("../images/mback.jpg"));
		add(background);
		
		i1=new ImageIcon("../images/new.jpg");
		i2=new ImageIcon("../images/save.png");
		i3=new ImageIcon("../images/update.jpg");
		i4=new ImageIcon("../images/search.png");
		i5=new ImageIcon("../images/records.png");
		i6=new ImageIcon("../images/search1.png");
		i9=new ImageIcon("../images/close.jpg");
		b1=new JButton(i1);
		b2=new JButton(i2);
		b3=new JButton(i3);
		b4=new JButton(i4);
		b5=new JButton(i5);
		b6=new JButton(i6);
		b9=new JButton(i9);
		l1=new JLabel("Search",SwingConstants.LEFT);
		l2=new JLabel("Patient_Name",SwingConstants.LEFT);
		l3=new JLabel("Gender",SwingConstants.LEFT);
		l4=new JLabel("DOB",SwingConstants.LEFT);
		l5=new JLabel("Age",SwingConstants.LEFT);
		l6=new JLabel("Blood Group",SwingConstants.LEFT);
		l7=new JLabel("Father Name",SwingConstants.LEFT);
		l8=new JLabel("Mother Name",SwingConstants.LEFT);
		l9=new JLabel("Address",SwingConstants.LEFT);
		l10=new JLabel("Mobile No",SwingConstants.LEFT);
		l11=new JLabel("Medical Detail",SwingConstants.LEFT);
		t1=new JTextField(30);
		t2=new JTextField(30);
		t3=new JTextField(10);
		t4=new JTextField(20);
		t5=new JTextField(30);
		t6=new JTextField(30);
		t7=new JTextField(50);
		t8=new JTextField(5);
		t9=new JTextField(10);
		t10=new JTextField(10);
		t11=new JTextField(50);
		background.add(b1);background.add(b2);background.add(b3);background.add(b4);background.add(b5);background.add(b6);
		background.add(l1);background.add(l2);background.add(l3);background.add(l4);
		background.add(l5);background.add(l6);background.add(l7);background.add(l8);background.add(l9);background.add(t1);
		background.add(t2);background.add(t3);background.add(t4);background.add(t5);background.add(t6);background.add(t7);
		background.add(t8);background.add(t9);background.add(b9);background.add(l10);background.add(l11);background.add(t10);
		background.add(t11);
		b1.setBounds(new Rectangle(1,0,40,40));
		b2.setBounds(new Rectangle(41,0,40,40));
		b3.setBounds(new Rectangle(81,0,40,40));
		b4.setBounds(new Rectangle(121,0,40,40));
		b5.setBounds(new Rectangle(161,0,40,40));
		l1.setBounds(new Rectangle(1,145,150,40));
		l2.setBounds(new Rectangle(1,200,150,30));
		l3.setBounds(new Rectangle(1,231,150,30));
		l4.setBounds(new Rectangle(1,262,150,30));
		l5.setBounds(new Rectangle(1,293,150,30));
		l6.setBounds(new Rectangle(1,324,150,30));
		l7.setBounds(new Rectangle(1,355,150,30));
		l8.setBounds(new Rectangle(1,386,150,30));
		l9.setBounds(new Rectangle(1,417,150,30));
		l10.setBounds(new Rectangle(1,448,150,30));
		l11.setBounds(new Rectangle(1,479,150,30));
		t1.setBounds(new Rectangle(151,145,150,40));
		t2.setBounds(new Rectangle(151,200,150,30));
		t3.setBounds(new Rectangle(151,231,150,30));
		t4.setBounds(new Rectangle(151,262,150,30));
		t5.setBounds(new Rectangle(151,293,150,30));
		t6.setBounds(new Rectangle(151,324,150,30));
		t7.setBounds(new Rectangle(151,355,150,30));
		t8.setBounds(new Rectangle(151,386,150,30));
		t9.setBounds(new Rectangle(151,417,150,30));
		t10.setBounds(new Rectangle(151,448,150,30));
		t11.setBounds(new Rectangle(151,479,150,30));		
		b6.setBounds(new Rectangle(302,145,40,40));
		b9.setBounds(new Rectangle(1340,0,19,19));
		l1.setFont(new Font("Arial BLACK", Font.BOLD, 14));
		l1.setForeground(Color.WHITE);
		l2.setFont(new Font("Arial BLACK", Font.BOLD, 14));
		l2.setForeground(Color.WHITE);
		l3.setFont(new Font("Arial BLACK", Font.BOLD, 14));
		l3.setForeground(Color.WHITE);
		l4.setFont(new Font("Arial BLACK", Font.BOLD, 14));
		l4.setForeground(Color.WHITE);
		l5.setFont(new Font("Arial BLACK", Font.BOLD, 14));
		l5.setForeground(Color.WHITE);
		l6.setFont(new Font("Arial BLACK", Font.BOLD, 14));
		l6.setForeground(Color.WHITE);
		l7.setFont(new Font("Arial BLACK", Font.BOLD, 14));
		l7.setForeground(Color.WHITE);
		l8.setFont(new Font("Arial BLACK", Font.BOLD, 14));
		l8.setForeground(Color.WHITE);
		l9.setFont(new Font("Arial BLACK", Font.BOLD, 14));
		l9.setForeground(Color.WHITE);
		l10.setFont(new Font("Arial BLACK", Font.BOLD, 14));
		l10.setForeground(Color.WHITE);
		l11.setFont(new Font("Arial BLACK", Font.BOLD, 14));
		l11.setForeground(Color.WHITE);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b9.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
		{
			t1.setText("");t2.setText("");t3.setText("");t4.setText("");t5.setText("");t6.setText("");t7.setText("");t8.setText("");t9.setText("");t10.setText("");t11.setText("");
		}
		if(ae.getSource()==b2)
		{
			try{
			conn c1=new conn();
			String qry="insert into medical (Name,Gender,DOB,Age,Blood_Group,Father_Name,Mother_Name,Address,Mobile_No,Medical_Detail) values("+"'"+t2.getText()+"','"+t3.getText()+"','"+t4.getText()+"','"+t5.getText()+"','"+t6.getText()+"','"+t7.getText()+"','"+t8.getText()+"','"+t9.getText()+"','"+t10.getText()+"','"+t11.getText()+"')";
			c1.update(qry);
			JOptionPane.showMessageDialog(null,"Record is Saved");		
			t2.requestFocus();
			}
			catch(Exception e){t2.setText(""+e);}
		}
		if(ae.getSource()==b6);
		{
			try
			{
			conn c2=new conn();
			ResultSet rs=c2.execute("select * from medical where name="+"'"+t1.getText()+"'");
			t1.setText(" ");
			if(rs.next())
			{				
				t2.setText(rs.getString("Name"));
				t3.setText(rs.getString("Gender"));
				t4.setText(rs.getString("DOB"));
				t5.setText(rs.getString("Age"));
				t6.setText(rs.getString("Blood_Group"));
				t7.setText(rs.getString("Father_Name"));
				t8.setText(rs.getString("Mother_Name"));
				t9.setText(rs.getString("Address"));
				t10.setText(rs.getString("Mobile_No"));
				t11.setText(rs.getString("Medical_Detail"));
			}
			else
			{
				t1.setText("");
				JOptionPane.showMessageDialog(null,"Sorry No Record Found :-(");
				
			}
			}
			catch(Exception e){System.out.println(e);}
		}
		if(ae.getSource()==b4)
		{
			JOptionPane.showMessageDialog(null,"Enter Patient Name in Search Bar");
		}
		if(ae.getSource()==b5)
		{
			mrecord sr= new mrecord();
			sr.setVisible(true);
		}
		if(ae.getSource()==b3)
		{
			try
			{
				String s1="update medical set Name='"+t2.getText()+"',Gender='"+t3.getText()+"',DOB='"+t4.getText()+"',Age='"+t5.getText()+"',Blood_Group='"+t6.getText()+"',Father_Name='"+t7.getText()+"',Mother_Name='"+t8.getText()+"',Address='"+t9.getText()+"',Mobile_No='"+t10.getText()+"',Medical_Detail='"+t11.getText()+"'where Name='"+t2.getText()+"'";
				conn c3=new conn();
				c3.update(s1);
				JOptionPane.showMessageDialog(null,"Updated");
			}
			catch(Exception e){e.printStackTrace();}
		}			
		if(ae.getSource()==b9)
		{dispose();}
		
	}
	public static void main(String s[])
	{
		loginm lm=new loginm();
		lm.setVisible(true);
	}
}