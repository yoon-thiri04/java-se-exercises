package Chap14;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class No4 extends JFrame implements ActionListener{
	 private JLabel name,rollNo,address,paper1,paper2,paper3,gender,major,class1;
	 private JTextField nameField,rollNoField,addressField,paper1Field,paper2Field,paper3Field;
	 private JRadioButton male,female;
	 private JComboBox majorCombo,classCombo;
	 private JButton ok,result;
	 private JPanel panel1,panel2;
	 private ButtonGroup group;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        No4 frame=new No4();
        frame.setVisible(true);
	}
	public No4() {
		String[] Major= {"CS","CT"};
		String[] Class= {"Second Year","Third Year","Fourth Year","Final Year"};
		setTitle("Student Form");
		setLocation(100,130);
		setSize(350,420);
		Container contentPane=getContentPane();
		contentPane.setBackground(Color.white);
		contentPane.setLayout(new GridLayout(0,2));
		
		panel2=new JPanel(new FlowLayout() );
		name=new JLabel("Name");
		contentPane.add(name);
		nameField=new JTextField();
		contentPane.add(nameField);
		rollNo=new JLabel("Roll Number");
		contentPane.add(rollNo);
		rollNoField=new JTextField();
		contentPane.add(rollNoField);
		gender=new JLabel("Gender");
		contentPane.add(gender);
        panel2=new JPanel(new FlowLayout());
        group=new ButtonGroup();
        male=new JRadioButton("Male");
        panel2.add(male);
        female=new JRadioButton("Female");
        panel2.add(female);
        group.add(male);
        group.add(female);
        contentPane.add(panel2);
		address=new JLabel("Address");
		contentPane.add(address);
		addressField=new JTextField();
		contentPane.add(addressField);
		major=new JLabel("Major");
		contentPane.add(major);
		majorCombo=new JComboBox(Major);
		contentPane.add(majorCombo);
		class1=new JLabel("Class");
		contentPane.add(class1);
		classCombo=new JComboBox(Class);
		contentPane.add(classCombo);
		paper1=new JLabel("PaperI");
		contentPane.add(paper1);
		paper1Field=new JTextField();
		contentPane.add(paper1Field);
		paper2=new JLabel("PaperII");
		contentPane.add(paper2);
		paper2Field=new JTextField();
		contentPane.add(paper2Field);
		paper3=new JLabel("PaperIII");
		contentPane.add(paper3);
		paper3Field=new JTextField();
		contentPane.add(paper3Field);
		ok=new JButton("OK");
		ok.addActionListener(this);
		contentPane.add(ok);
		result=new JButton("Result");
		result.addActionListener(this);
		contentPane.add(result);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
        
	}
	public void actionPerformed(ActionEvent e)
	{
		
		if(e.getSource().equals(ok))
		{
			String choice=null;
			while(choice==null)
			{
				if(male.isSelected())
				{
					choice=male.getText();
				}
				else if(female.isSelected())
				{
					choice=female.getText();
				}
			}
			JOptionPane.showMessageDialog(this, "Name:"+nameField.getText()+"\n"+
			"RollNumber:"+rollNoField.getText()+"\n"+"Gender:"+choice+"\n"+"Address:"+addressField.getText()+
			"\n"+"Major:"+majorCombo.getSelectedItem()+"\n"+"Class:"+classCombo.getSelectedItem()+"\n"+"Paper1 Mark:"+paper1Field.getText()+
			"\n"+"Paper2 Mark:"+paper2Field.getText()+"\n"+"Paper3 Mark:"+paper3Field.getText());
		}
		 if(e.getSource().equals(result))
		{
			int mark1=Integer.parseInt(paper1Field.getText());
			int mark2=Integer.parseInt(paper2Field.getText());
			int mark3=Integer.parseInt(paper3Field.getText());
			if(mark1>=50 && mark2>=50 && mark3>=50)
			{
				JOptionPane.showMessageDialog(this, "You Pass the Exam.");
			}
			else JOptionPane.showMessageDialog(this, "You Fail the Exam.");
		}
	}

}
