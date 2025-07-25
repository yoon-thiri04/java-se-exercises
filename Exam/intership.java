package Exam;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.FileNotFoundException;
import java.io.IOException;
public class intership extends JFrame implements ActionListener {
    JLabel name,age,gender,inter,lang,city;
    JTextField nameF,ageF;
    JRadioButton male,female;
    JList list;
    ButtonGroup gp;
    JCheckBox[] check;
    JComboBox combo;
    JTextArea area;
    JButton ok,cancel;
    JPanel mainPanel,buttonPanel,radioPanel,checkPanel,areaPanel,txtPanel;
    
	public static void main(String[] args){
		// TODO Auto-generated method stub
        intership f=new intership();
        f.setVisible(true);
	}
    public intership() {
    	setSize(500,500);
    	setLocation(100,150);
    	Container contentPane=getContentPane();
    	contentPane.setBackground(Color.pink);
    	contentPane.setLayout(new BorderLayout());
    	
    	mainPanel=new JPanel(new GridLayout(0,2));
    	mainPanel.setBorder(BorderFactory.createTitledBorder("Information"));
    	name=new JLabel("Name");
    	mainPanel.add(name);
    	nameF=new JTextField();
    	mainPanel.add(nameF);
    	age=new JLabel("Age");
    	mainPanel.add(age);
    	ageF=new JTextField();
    	mainPanel.add(ageF);
    	gender=new JLabel("Gender");
    	mainPanel.add(gender);
    	radioPanel=new JPanel(new FlowLayout());
    	gp=new ButtonGroup();
    	male=new JRadioButton("Male");
    	gp.add(male);
    	radioPanel.add(male);
    	female=new JRadioButton("Female");
    	gp.add(female);
    	radioPanel.add(female);
    	mainPanel.add(radioPanel);
    	lang=new JLabel("Language");
    	mainPanel.add(lang);
    	
    	checkPanel=new JPanel(new FlowLayout());
    	String[] c= {"C++","Phython","Java","J2E"};
    	check=new JCheckBox[c.length];
    	for(int i=0;i<check.length;i++)
    	{
    		check[i]=new JCheckBox(c[i]);
    		checkPanel.add(check[i]);
    	}
    	mainPanel.add(checkPanel);
    	city=new JLabel("City");
    	mainPanel.add(city);
    	String[] town= {"Yangon","Mandalay","NayPyiThaw"};
    	combo=new JComboBox(town);
    	mainPanel.add(combo);
    	inter=new JLabel("InterShip Area");
    	mainPanel.add(inter);
    	String[] i= {"Programming","Networking","Database","Management"};
    	
    	list=new JList(i);
    	list.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
    	mainPanel.add(new JScrollPane(list));
    	areaPanel=new JPanel(new BorderLayout());
    	txtPanel=new JPanel(new FlowLayout());
    	area=new JTextArea(10,26);
    	txtPanel.add(area);
        buttonPanel=new JPanel(new FlowLayout() );
        ok=new JButton("OK");
        ok.addActionListener(this);
        cancel=new JButton("Cancel");
        cancel.addActionListener(this);
        buttonPanel.add(ok);
        buttonPanel.add(cancel);
        areaPanel.add(txtPanel,BorderLayout.SOUTH);
        areaPanel.add(mainPanel,BorderLayout.CENTER);
        contentPane.add(areaPanel,BorderLayout.CENTER);
        contentPane.add(buttonPanel,BorderLayout.SOUTH);
    }
    public void actionPerformed(ActionEvent e)
    {
    	StringBuffer str=new StringBuffer();
    	for(int i=0;i<check.length;i++)
    	{
    		if(check[i].isSelected())
    		{
    			str.append(check[i].getText()+" ");
    		}
    	}
    	String g="";
    	if(male.isSelected()) {
    		g=male.getText();
    	}
    	else if(female.isSelected())
    	{
    		g=female.getText();
    	}
        Object[] ship=list.getSelectedValues();
    	String l="";
    	for(int i=0;i<ship.length;i++)
    	{
    		l+=ship[i];
    	}
    	
    	if(e.getSource().equals(ok))
    	{
    		area.append("Name:"+nameF.getText()+"\nAge:"+
         ageF.getText()+"\nGender:"+g+"\nLanguages :"+str+"\nCity:"+combo.getSelectedItem().toString()+
         "\nIntership Area:"+l);
    	}
    }
}
