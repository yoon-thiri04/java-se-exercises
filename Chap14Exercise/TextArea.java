package Chap14Exercise;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class TextArea extends JFrame implements ActionListener{
    JLabel name,age,semester,prompt;
    JTextField nameF;
	JTextField ageF;
    JComboBox combo;
    JCheckBox[] checkb;
    JButton ok,cancel;
    JTextArea text;
    JPanel btnPanel,checkPanel,InfoPanel,textPanel,mainPanel;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         TextArea f=new TextArea();
         f.setVisible(true);
	}

	public TextArea()
	{
	   setSize(400,400);
	   setLocation(150,100);
	   Container contentPane=getContentPane();
	   contentPane.setBackground(Color.white);
	   contentPane.setLayout(new BorderLayout());
	   InfoPanel=new JPanel(new GridLayout(0,2));
	   
	   name=new JLabel("Name");
	   InfoPanel.add(name);
	   nameF=new JTextField();
	   InfoPanel.add(nameF);
	   age=new JLabel("Age");
	   InfoPanel.add(age);
	   ageF=new JTextField();
	   InfoPanel.add(ageF);
	   semester=new JLabel("Semester");
	   InfoPanel.add(semester);
	   String[] sem= {"Semester I","Semester II","Semester III","Semester IV"};
	   combo=new JComboBox(sem);
	   InfoPanel.add(combo);
	   prompt=new JLabel("Can program in:");
	   InfoPanel.add(prompt);
	   checkPanel=new JPanel(new FlowLayout());
	   String[] check= {"C++","Java","C#","Python"};
	   checkb=new JCheckBox[check.length];
	   for(int i=0;i<check.length;i++)
	   {
		   checkb[i]=new JCheckBox(check[i]);
		   checkPanel.add(checkb[i]);
	   }
	   
	   InfoPanel.add(checkPanel);
	   textPanel=new JPanel(new FlowLayout());
	   text=new JTextArea(10,20);
	   textPanel.add(text);
	   mainPanel=new JPanel(new BorderLayout());
	   mainPanel.add(InfoPanel,BorderLayout.NORTH);
	   mainPanel.add(textPanel,BorderLayout.CENTER);
	   btnPanel=new JPanel(new FlowLayout());
	   ok=new JButton("OK");
	   ok.addActionListener(this);
	   btnPanel.add(ok);
	   cancel=new JButton("Cancel");
	   cancel.addActionListener(this);
	   btnPanel.add(cancel);
	   contentPane.add(mainPanel,BorderLayout.CENTER);
	   
	   contentPane.add(btnPanel,BorderLayout.SOUTH);
	   
}
	public void actionPerformed(ActionEvent e)
	{
		String str="";
		for(int i=0;i<checkb.length;i++)
		{
			if(checkb[i].isSelected())
			{
				str+=checkb[i].getText();
			}
		}
		if(e.getSource().equals(cancel))
		{
			text.setText("");
			for(int i=0;i<checkb.length;i++)
			{
				checkb[i].setSelected(false);
			}
			nameF.setText("");
			ageF.setText("");
			combo.setSelectedIndex(0);
		}
		else if(e.getSource().equals(ok))
		{
			text.setText("Detail Information:\n");
			text.append("Name: "+nameF.getText()+"\n"+"Age:"+ageF.getText()+
			"\nSemester:"+combo.getSelectedItem()+"\n"+"Program in "+str);
		}
	}
	
	}
