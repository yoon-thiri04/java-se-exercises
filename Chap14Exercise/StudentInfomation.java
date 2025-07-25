package Chap14Exercise;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class StudentInfomation extends JFrame implements ActionListener{
    JLabel name,rollNo,gender,major,text;
    JTextField nameF,rollF;
    JRadioButton male,female;
    JComboBox majorCombo;
    JCheckBox[] checkBox;
    JPanel mainPanel,majorPanel,radioPanel,submitPanel,checkPanel;
    ButtonGroup group;
    JButton submit;
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        StudentInfomation f=new StudentInfomation();
        f.setVisible(true);
	}
	public StudentInfomation() {
		setLocation(150,200);
		setTitle("Student Info");
		setSize(270,280);
		Container contentPane=getContentPane();
		contentPane.setLayout(new BorderLayout());
		mainPanel=new JPanel(new FlowLayout(FlowLayout.LEFT));
		name=new JLabel("Name");
		mainPanel.add(name);
		nameF=new JTextField(20);
		mainPanel.add(nameF);
		rollNo=new JLabel("RollNo");
		mainPanel.add(rollNo);
		rollF=new JTextField(20);
		mainPanel.add(rollF);
		radioPanel=new JPanel(new FlowLayout(FlowLayout.LEFT));
		group=new ButtonGroup();
		gender=new JLabel("Gender");
		radioPanel.add(gender);
		male=new JRadioButton("Male");
		
		group.add(male);
		radioPanel.add(male);
		female=new JRadioButton("Female");
		group.add(female);
		radioPanel.add(female);
		mainPanel.add(radioPanel);
		majorPanel=new JPanel(new FlowLayout(FlowLayout.LEFT));
		major=new JLabel("Major");
		majorPanel.add(major);
		String[] m= {"CS","CT"};
		majorCombo=new JComboBox(m);
		majorPanel.add(majorCombo);
		mainPanel.add(majorPanel);
		text=new JLabel("Select Programming Language:");
		mainPanel.add(text);
		checkPanel=new JPanel(new FlowLayout(FlowLayout.LEFT));
		String[] c= {"Java","C++","Python"};
		checkBox=new JCheckBox[c.length];
		for(int i=0;i<checkBox.length;i++)
		{
			checkBox[i]=new JCheckBox(c[i]);
			checkPanel.add(checkBox[i]);
		}
		mainPanel.add(checkPanel);
		submitPanel=new JPanel(new FlowLayout());
		submit=new JButton("Submit");
		submit.addActionListener(this);
		submitPanel.add(submit);
		contentPane.add(mainPanel,BorderLayout.CENTER);
		contentPane.add(submitPanel,BorderLayout.SOUTH);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
    public void actionPerformed(ActionEvent e)
    {
    	String g=null;
    	StringBuffer str=new StringBuffer("");
    	if(male.isSelected())
    	{
    		g=male.getText();
    	}
    	else if (female.isSelected())
    	{
    		g=female.getText();
    	}
    	for(int i=0;i<checkBox.length;i++)
    	{
    		if(checkBox[i].isSelected())
    		{
    			str.append(checkBox[i].getText()+" ");
    		}
    	}
    	JOptionPane.showMessageDialog(this, name.getText()+" is "+nameF.getText()
    	+"\n"+rollNo.getText()+" is "+rollF.getText()+"\n"+gender.getText()+" is "
    	+g+"\n"+major.getText()+" is "+(String)majorCombo.getSelectedItem()+"\nProgramming Language are/is"
    	
    	+str);
    }
}
