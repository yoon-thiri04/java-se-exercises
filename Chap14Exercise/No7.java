package Chap14Exercise;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class No7 extends JFrame implements ActionListener {
    private JTextField text;
    private JButton btn;
    private JTextArea area;
    JScrollPane scroll;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        No7 frame=new No7();
        frame.setVisible(true);
	}
	public No7() {
		setTitle("Prime Number");
		setSize(300,240);
		setLocation(150,200);
		Container contentPane=getContentPane();
		contentPane.setLayout(new FlowLayout());
		text=new JTextField();
		text.setColumns(10);
		
		contentPane.add(text);
		btn=new JButton("Generate");
		btn.addActionListener(this);
		contentPane.add(btn);
		area=new JTextArea(8,20);
		scroll=new JScrollPane(area);
		contentPane.add(scroll);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e)
	{
		int target=Integer.parseInt(text.getText());
		int num=0;
		int k=0;
		boolean ans;
		while(k<target)
		{   
			ans=true;
			if(num==0 || num==1)
			{
				ans=false;
			}
			for(int i=2;i<num-1;i++)
			{
				if(num%i==0)
				{
					ans=false;
					break;
				}
			}
			if(ans==true)
			{
				k++;
				String number=Integer.toString(num);
				area.append(number+"\n");
			}
			num++;
		}
	}

}
