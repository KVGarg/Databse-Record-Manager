import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class mrecord extends JFrame implements ActionListener
{
	JButton b1,b2;
	ImageIcon i1;
	JTable t1;
	mrecord()
	{
		setSize(1500,950);
		setLayout(new BorderLayout());
		String h[]={"S.No","Patient_Name","Gender","DOB","Age","Blood Group","Father Name","Mother Name","Address","Mobile Number","Medical_Detail"};
		String d[][]=new String[60][11];
		try
		{
			int i=0,j=0;
			conn c=new conn();
			ResultSet rs=c.execute("select * from medical");
			while(rs.next())
			{
				d[i][j++]=rs.getString("Sno");
				d[i][j++]=rs.getString("Patient_Name");
				d[i][j++]=rs.getString("Gender");
				d[i][j++]=rs.getString("DOB");
				d[i][j++]=rs.getString("Age");
				d[i][j++]=rs.getString("Blood_Group");
				d[i][j++]=rs.getString("Father_Name");
				d[i][j++]=rs.getString("Mother_Name");
				d[i][j++]=rs.getString("Address");
				d[i][j++]=rs.getString("Mobile_No");
				d[i][j++]=rs.getString("Medical_Detail");
				i++;j=0;
			}
			t1=new JTable(d,h);
			JScrollPane js=new JScrollPane(t1,20,30);
			add(js,BorderLayout.CENTER);
			b1=new JButton("PRINT");
			add(b1,BorderLayout.SOUTH);
			b1.addActionListener(this);
		
		}
		catch(Exception e){}
		t1.setVisible(true);
		i1=new ImageIcon("../images/close.jpg");
		b2=new JButton(i1);
		b2.setBounds(new Rectangle(1340,0,19,19));
	}
	public void actionPerformed(ActionEvent ae)
	{
		try{t1.print();}
		catch(Exception e){}
	}
	public static void main(String s[])
	{
		mrecord kk=new mrecord();
		kk.setVisible(true);
	}
}