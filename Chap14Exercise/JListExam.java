package Chap14Exercise;
import javax.swing.*;
import java.awt.*;
import java.util.List;
import java.awt.event.*;
public class JListExam extends JFrame implements ActionListener{
    JLabel name,age,gender,intership;
    JTextField nameF,ageF;
    JRadioButton male,female;
    JList list;
    ButtonGroup gp;
    JLabel text;
    JButton ok,cancel;
    JPanel radioPanel,btnPanel,LabelPanel,InfoPanel,mainPanel;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         JListExam f=new JListExam();
         f.setVisible(true);
	}
	public JListExam() {
		setSize(400,340);
		setLocation(150,200);
	    Container contentPane=getContentPane();
	    contentPane.setBackground(Color.pink);
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
	    gender=new JLabel("Gender");
	    InfoPanel.add(gender);
	    radioPanel=new JPanel(new FlowLayout());
	    gp=new ButtonGroup();
	    male=new JRadioButton("Male");
	    gp.add(male);
	    radioPanel.add(male);
	    female=new JRadioButton("Female");
	    gp.add(female);
	    radioPanel.add(female);
	    InfoPanel.add(radioPanel);
	    intership=new JLabel("Intership Area");
	    InfoPanel.add(intership);
	    String[] ship= {"Programming","Networking","Database","Accounting"};
	    list=new JList(ship);
	    list.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
	    InfoPanel.add(new JScrollPane(list));
	    mainPanel=new JPanel(new BorderLayout());
	    
	    LabelPanel=new JPanel(new FlowLayout());
	    text=new JLabel("");
	    LabelPanel.add(text);
	    
	    mainPanel.add(LabelPanel,BorderLayout.CENTER);
	    btnPanel=new JPanel(new FlowLayout());
	    ok=new JButton("OK");
	    ok.addActionListener(this);
	    btnPanel.add(ok);
	    cancel=new JButton("Cancel");
	    cancel.addActionListener(this);
	    btnPanel.add(cancel);
	    mainPanel.add(btnPanel,BorderLayout.SOUTH);
	    contentPane.add(InfoPanel,BorderLayout.CENTER);
	    contentPane.add(mainPanel,BorderLayout.SOUTH);
	    setDefaultCloseOperation(EXIT_ON_CLOSE);
	    
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String str=null;
		String l="";
		if(male.isSelected())
		{
			str=male.getText();
		}
		else if(female.isSelected())
		{
			str=female.getText();
		}
		List ship=list.getSelectedValuesList();
		for(int i=0;i<ship.size();i++)
		{
			l+=ship.get(i);
		}
		if(e.getSource().equals(ok)) {
			text.setText("Name: "+nameF.getText()+"\nAge: "+ageF.getText()+
		"\nGender: "+str+"\n "+"Intership Area:"+l);
		}
		else if(e.getSource().equals(cancel))
		{
			male.setSelected(false);
			female.setSelected(false);
		}
	
	}

}
