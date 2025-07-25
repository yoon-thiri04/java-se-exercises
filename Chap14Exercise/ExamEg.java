package Chap14Exercise;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class ExamEg extends JFrame implements ActionListener{
    JLabel name,age,semester,prompt,intership;
    JTextField nameF,ageF;
    JComboBox combo;
    JCheckBox[] check;
    JTextArea text;
    JButton ok,cancel;
    JList list;
    JPanel mainPanel,textPanel,btnPanel,main2,checkPanel;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ExamEg f=new ExamEg();
        f.setVisible(true);
	}
    public ExamEg() {
    	setSize(470,500);
    	setLocation(150,200);
    	Container contentPane=getContentPane();
    	contentPane.setBackground(Color.pink);
    	contentPane.setLayout(new BorderLayout());
    	mainPanel=new JPanel(new GridLayout(0,2));
    	name=new JLabel("Name");
    	mainPanel.add(name);
    	nameF=new JTextField();
    	mainPanel.add(nameF);
    	age=new JLabel("Age");
    	mainPanel.add(age);
    	ageF=new JTextField();
    	mainPanel.add(ageF);
    	semester=new JLabel("Semster");
    	mainPanel.add(semester);
    	String[] str= {"SemesterI","SemesterII","SemesterIII","SemsetrIV"};
    	combo=new JComboBox(str);
    	mainPanel.add(combo);
    	intership=new JLabel("Intership Area");
    	mainPanel.add(intership);
    	String[] l= {"Yangon","Mandalay","NayPyi Taw","Taunggyi"};
    	list=new JList(l);
    	list.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
    	mainPanel.add(new JScrollPane(list));
    	prompt=new JLabel("Can Program in ");
    	checkPanel=new JPanel(new FlowLayout());
    	String[] c= {"C++","C#","Java","Python"};
    	check=new JCheckBox[c.length];
    	for(int i=0;i<check.length;i++)
    	{
    		check[i]=new JCheckBox(c[i]);
    		checkPanel.add(check[i]);
    	}
    	mainPanel.add(prompt);
    	mainPanel.add(checkPanel);
    	textPanel=new JPanel(new FlowLayout());
    	text=new JTextArea(10,20);
    	textPanel.add(text);
    	main2=new JPanel(new BorderLayout());
        main2.add(mainPanel,BorderLayout.CENTER);
        main2.add(textPanel,BorderLayout.SOUTH);
        btnPanel=new JPanel(new FlowLayout());
        ok=new JButton("OK");
        ok.addActionListener(this);
        btnPanel.add(ok);
        cancel=new JButton("Cancel");
        cancel.addActionListener(this);
        btnPanel.add(cancel);
        contentPane.add(main2,BorderLayout.CENTER);
        contentPane.add(btnPanel,BorderLayout.SOUTH);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource().equals(ok))
		{
			String str="";
			for(int i=0;i<check.length;i++)
			{
				if(check[i].isSelected())
				{
					str+=check[i].getText();
				}
			}
			text.append("Program are :"+str);
		}
	}
}
