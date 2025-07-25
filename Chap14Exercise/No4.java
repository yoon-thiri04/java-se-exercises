package Chap14Exercise;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class No4 extends JFrame implements ActionListener{
    private JLabel name,rollNo,gender,address,major,class1,paper1Mark,paper2Mark,paper3Mark;
    private JTextField nameF,rollNoF,addressF,paper1F,paper2F,paper3F;
    private JComboBox majorCombo,classCombo;
    private JRadioButton male,female;
    private ButtonGroup group;
    private JButton ok,result;
    private static final String LINE=System.getProperty("line.separator");
    private JPanel textPanel,radioPanel;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        No4 frame=new No4();
        frame.setVisible(true);
	}
	public No4() {
		setLocation(150,200);
		setSize(350,420);
		setTitle("Student Form");
		Container contentPane=getContentPane();
		contentPane.setLayout(new BorderLayout());
		String[] Major= {"CS","CT"};
		String[] Class= {"First Year","Second Year","Third Year","Fourth Year","Fifth Year"};
		textPanel=new JPanel(new GridLayout(0,2));
		name=new JLabel("Name");
		textPanel.add(name);
		nameF=new JTextField();
		textPanel.add(nameF);
		rollNo=new JLabel("Roll Number");
		textPanel.add(rollNo);
		rollNoF=new JTextField();
		textPanel.add(rollNoF);
		gender=new JLabel("Gender");
		textPanel.add(gender);
		radioPanel=new JPanel(new FlowLayout());
		male=new JRadioButton("Male");
		female=new JRadioButton("Female");
		group=new ButtonGroup();
		group.add(male);
		group.add(female);
		radioPanel.add(male);
		radioPanel.add(female);
		textPanel.add(radioPanel);
		address=new JLabel("Address");
		textPanel.add(address);
		addressF=new JTextField();
		textPanel.add(addressF);
		major=new JLabel("Major");
		textPanel.add(major);
		majorCombo=new JComboBox(Major);
		textPanel.add(majorCombo);
		class1=new JLabel("Class");
		textPanel.add(class1);
		classCombo=new JComboBox(Class);
		textPanel.add(classCombo);
		paper1Mark=new JLabel("PaperI Mark");
		textPanel.add(paper1Mark);
		paper1F=new JTextField();
		textPanel.add(paper1F);
		paper2Mark=new JLabel("PaperII Mark");
		textPanel.add(paper2Mark);
		paper2F=new JTextField();
		textPanel.add(paper2F);
		paper3Mark=new JLabel("PaperIII Mark");
		textPanel.add(paper3Mark);
		paper3F=new JTextField();
		textPanel.add(paper3F);
		ok=new JButton("OK");
		ok.addActionListener(this);
		textPanel.add(ok);
		result=new JButton("Result");
		result.addActionListener(this);
		textPanel.add(result);
		contentPane.add(textPanel,BorderLayout.CENTER);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e)
	{
		String choice=null;
		if(male.isSelected())
		{
			choice=male.getText();
		}
		else if(female.isSelected())
		{
			choice=female.getText();
		}
		
		if(e.getSource().equals(ok))
		{
			JOptionPane.showMessageDialog(this, name.getText()+":"+nameF.getText()+LINE
			+rollNo.getText()+":"+rollNoF.getText()+LINE+gender.getText()+":"+choice+LINE
			+address.getText()+":"+addressF.getText()+LINE+major.getText()+":"+(String)majorCombo.getSelectedItem()
			+LINE+class1.getText()+":"+(String)classCombo.getSelectedItem()+LINE+paper1Mark.getText()+":"+
			paper1F.getText()+LINE+paper2Mark.getText()+":"+paper2F.getText()+LINE+
			paper3Mark.getText()+":"+paper3F.getText());
		}
	    if(e.getSource().equals(result))
	    {
	    	int mark1=Integer.parseInt(paper1F.getText());
	    	int mark2=Integer.parseInt(paper2F.getText());
	    	int mark3=Integer.parseInt(paper3F.getText());
	    	if(mark1>=50 && mark2>=50 && mark3>=50)
	    	{
	    		JOptionPane.showMessageDialog(this, "You Pass the Exam.");
	    	}
	    	else JOptionPane.showMessageDialog(this, "You Fail the Exam.");
	    }
	}

}
