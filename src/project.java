import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/*<applet code=Project height=500 width=500 ></applet>*/
public class project extends JFrame implements ActionListener
{	JButton b1,b2,b3;
    ImageIcon i1,i2,i3;
	project()
	{
	
		setLayout(new FlowLayout());
		setUndecorated(true);
		i1=new ImageIcon("../images/Student.jpg");
		i2=new ImageIcon("../images/Crime.jpg");
		i3=new ImageIcon("../images/Medical.png");
		b1=new JButton(i1);
		b2=new JButton(i2);
		b3=new JButton(i3);
		add(b1);
		add(b2);
		add(b3);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
	
	}

	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
		{student s=new student();
			s.setVisible(true);
		}
		else if(ae.getSource()==b2)
		{criminal c=new criminal();
			c.setVisible(true);
		}
		else if(ae.getSource()==b3)
		{medical m=new medical();
			m.setVisible(true);
		}
	}
	public static void main(String s[])
	{
		project p=new project();
		p.setVisible(true);
		p.setSize(1500,950);
	}
}
	