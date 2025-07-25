package Chap14Exercise;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StudentInfo extends JFrame implements ActionListener {
    private JLabel name,gender,major,hobby;
    private JTextField nameF;
    private JRadioButton male,female;
    ButtonGroup group;
    private JCheckBox[] checkBox;
    private JComboBox majorCombo;
    private JButton ok,close;
    private JPanel mainPanel,okPanel,checkPanel,radioPanel,comBoPanel;
    private static final String LINE=System.getProperty("line.separator");
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        StudentInfo frame=new StudentInfo();
        frame.setVisible(true);
	}
	public StudentInfo() {
		setTitle("Student Info");
		setSize(280,350);
		setLocation(150,200);
		Container contentPane=getContentPane();
		contentPane.setLayout(new BorderLayout());
		mainPanel=new JPanel(new FlowLayout());
		name=new JLabel("Name");
		mainPanel.add(name);
		nameF=new JTextField(18);
		mainPanel.add(nameF);
		gender=new JLabel("Gender");
		mainPanel.add(gender);
		radioPanel=new JPanel(new FlowLayout());
		group=new ButtonGroup();
		male=new JRadioButton("Male");
		group.add(male);
		radioPanel.add(male);
		female=new JRadioButton("Female");
		group.add(female);
		radioPanel.add(female);
		mainPanel.add(radioPanel);
		
		
		comBoPanel=new JPanel(new FlowLayout());
		major=new JLabel("Major");
		comBoPanel.add(major);
		String[] Major= {"Software Engineering","Knowledge Engineering","Business Information System"};
		majorCombo=new JComboBox(Major);
		comBoPanel.add(majorCombo);
		mainPanel.add(comBoPanel);
		hobby=new JLabel("Hobby");
		mainPanel.add(hobby);
		checkPanel=new JPanel(new FlowLayout());
		
		String[] Hobby= {"Reading","Cooking","Gaming"};
		checkBox=new JCheckBox[Hobby.length];
		for(int i=0;i<checkBox.length;i++)
		{
			checkBox[i]=new JCheckBox(Hobby[i]);
			checkPanel.add(checkBox[i]);
		}
		
		mainPanel.add(checkPanel);
		okPanel=new JPanel(new FlowLayout());
		ok=new JButton("OK");
		ok.addActionListener(this);
		okPanel.add(ok);
		close=new JButton("Cancel");
		close.addActionListener(this);
		okPanel.add(close);
		contentPane.add(mainPanel,BorderLayout.CENTER);
		contentPane.add(okPanel,BorderLayout.SOUTH);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e)
	{
		String gen=null;
		StringBuffer str=new StringBuffer("Hobby is ");
		if(male.isSelected())
		{
			gen=male.getText();
		}
		else if(female.isSelected())
		{
			gen=female.getText();
		}
	
		for(int i=0;i<checkBox.length;i++)
		{
			if(checkBox[i].isSelected())
			{
				str.append(checkBox[i].getText()+" ");
			}
		}
		if(e.getSource().equals(close))
		{
			majorCombo.setSelectedIndex(0);
			for(int i=0;i<checkBox.length;i++)
			{
				checkBox[i].setSelected(false);
			}
			nameF.setText("");
			group.clearSelection();
		}
		
		else if(e.getSource().equals(ok))
		{
			JOptionPane.showMessageDialog(null,"Student Info"+LINE+name.getText()+" is "+
		nameF.getText()+LINE+gender.getText()+" is "+gen+LINE+major.getText()+" is "+(String)majorCombo.getSelectedItem()+
		LINE+str);
		}
	}

}
