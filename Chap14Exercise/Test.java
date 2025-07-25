package Chap14Exercise;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Test extends JFrame  {
    private JLabel name,roll,gender,major,text;
    private JRadioButton male,female;
    ButtonGroup group;
    private JTextField nameF,rollF;
    private JCheckBox[] checkBox;
    private JComboBox majorCombo;
    private JButton submit;
    private JPanel submitPanel,mainPanel,radioPanel,comboPanel;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Test f=new Test();
        f.setVisible(true);
	}
	public Test() {
		setTitle("Test");
		setSize(250,250);
		setLocation(150,200);
		Container contentPane=getContentPane();
		contentPane.setLayout(new BorderLayout());
		mainPanel=new JPanel(new FlowLayout());
		name=new JLabel("Name");
		mainPanel.add(name);
		nameF=new JTextField(15);
		mainPanel.add(nameF);
		roll=new JLabel("Roll No");
		mainPanel.add(roll);
		rollF=new JTextField(15);
		mainPanel.add(rollF);
		gender=new JLabel("Gender");
		mainPanel.add(gender);
		group=new ButtonGroup();
		radioPanel=new JPanel(new FlowLayout());
		male=new JRadioButton("Male");
		group.add(male);
		radioPanel.add(male);
		female=new JRadioButton("Female");
		group.add(female);
		radioPanel.add(female);
		
		mainPanel.add(radioPanel);
		comboPanel=new JPanel(new FlowLayout());
		major=new JLabel("Major");
		comboPanel.add(major);
		String[] m= {"CS","CT"};
		majorCombo=new JComboBox(m);
		comboPanel.add(majorCombo);
		mainPanel.add(comboPanel);
		text=new JLabel("Select Programming Language:");
		mainPanel.add(text);
		String[] check= {"Java","C++","Python"};
		checkBox=new JCheckBox[check.length];
		for(int i=0;i<checkBox.length;i++)
		{
			checkBox[i]=new JCheckBox(check[i]);
			mainPanel.add(checkBox[i]);
		}
		submitPanel=new JPanel(new FlowLayout());
		submit=new JButton("Submit");
	    submitPanel.add(submit);
		contentPane.add(submitPanel,BorderLayout.SOUTH);
		contentPane.add(mainPanel,BorderLayout.CENTER);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

}
