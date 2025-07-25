package Chap14;
import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;
public class No7 extends JFrame implements ActionListener{
    private JTextField field;
    private JTextArea textArea;
    private JButton btn;
    private JPanel panel;
    private JScrollPane scroll;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       No7 frame=new No7();
       frame.setVisible(true);
	}
	public No7() {
		setTitle("Prime Number");
		setLocation(100,150);
		setSize(300,250);
		Container contentPane=getContentPane();
		contentPane.setBackground(Color.white);
		contentPane.setLayout(new FlowLayout());
		
		field=new JTextField();
		field.setColumns(10);		
		contentPane.add(field);
		btn=new JButton("Generate");
		
		btn.addActionListener(this);
		contentPane.add(btn);
		textArea=new JTextArea(5,20);
		scroll=new JScrollPane(textArea);
		
		contentPane.add(scroll);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource().equals(btn))
		{
			boolean ans;
			int num=2;
			int target=Integer.parseInt(field.getText());
			int k=0;
			while(k<target) {
				ans=true;
				for(int i=2;i<num-1;i++)
				{
					if(num%i==0) {
						ans=false;
						break;
					}
					
				}
				if(ans==true) {
					k++;
					String number=Integer.toString(num);
					textArea.append(number+"\n");
				}
				num++;
			}
			
		}
	}

}
