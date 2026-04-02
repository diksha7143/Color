import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.Random;
class colorchoser implements ActionListener
{
	JFrame f;
	JButton b;
	JTextArea ta;
	JScrollPane js;
	public colorchoser()
	{
		f=new JFrame();
		b=new JButton("CHANGE COLOR RANDOM");
		ta=new JTextArea(10,30);
		js=new JScrollPane(ta);
		b.addActionListener(this);

		FlowLayout ft = new FlowLayout();
		f.add(js);
		f.add(b);
		f.setSize(300,300);
		f.setLayout(ft);
		f.setVisible(true);

	}
	public static Color generateRandomColor()
	{
		Random r =new Random();
		int red = r.nextInt(256);
		int green = r.nextInt(256);
		int blue = r.nextInt(256);
		return new Color(red,green,blue);
	}
	public void actionPerformed(ActionEvent e)
	{
		ta.setBackground(generateRandomColor());
	}
}
class color
{ 
	public static void main(String[] args) {
		colorchoser c=new colorchoser();
	}
}