package Exam;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class myFile extends JFrame implements ActionListener {
    JMenu file,edit;
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        myFile f=new myFile();
        f.setVisible(true);
	}
     public myFile()
     {
    	 setSize(300,200);
    	 setLocation(100,150);
    	 Container contentPane=getContentPane();
    	 contentPane.setBackground(Color.WHITE);
    	 contentPane.setLayout(new FlowLayout());
    	 JMenuBar menuBar=new JMenuBar();
    	 setJMenuBar(menuBar);
    	 createFileMenu();
    	 menuBar.add(file);
    	 createEditMenu();
    	 menuBar.add(edit);
    	 setDefaultCloseOperation(EXIT_ON_CLOSE);
    	 
     }
     public void createFileMenu() {
    	 file=new JMenu("File");
    	 JMenuItem  item;
    	 item=new JMenuItem("Open");
    	 item.addActionListener(this);
    	 file.add(item);
    	 item=new JMenuItem("Close");
    	 item.addActionListener(this);
    	 file.add(item);
     }
     public void createEditMenu() {
    	 edit=new JMenu("Edit");
    	 JMenuItem item;
    	 item=new JMenuItem("Yellow");
    	 item.addActionListener(this);
    	 edit.add(item);
    	 item=new JMenuItem("Pink");
    	 item.addActionListener(this);
    	 edit.add(item);
    	 item=new JMenuItem("Red");
    	 item.addActionListener(this);
    	 edit.add(item);
    	 item=new JMenuItem("Black");
    	 item.addActionListener(this);
    	 edit.add(item);
    	 item=new JMenuItem("Null");
    	 item.addActionListener(this);
    	 edit.add(item);
    	 
     }
     public void actionPerformed(ActionEvent e)
     {
    	 Container contentPane=getContentPane();
    	 contentPane.setBackground(Color.WHITE);
    	 if(e.getActionCommand().equals("Open"))
    	 {
    		 information in=new information();
    		 in.setVisible(true);
    	 }
    	 else if(e.getActionCommand().equals("Close"))
    	 {
    		 System.exit(0);
    	 }
    	 else if(e.getActionCommand().equals("Yellow"))
    	 {
    		 contentPane.setBackground(Color.yellow);
    	 }
    	 else if(e.getActionCommand().equals("Pink"))
    	 {
    		 contentPane.setBackground(Color.pink);
    	 }
    	 else if(e.getActionCommand().equals("Red"))
    	 {
    		 contentPane.setBackground(Color.red);
    	 }
    	 else if(e.getActionCommand().equals("Null"))
    	 {
    		 contentPane.setBackground(Color.white);
    	 }
    	 else if(e.getActionCommand().equals("Black"))
    	 {
    		 contentPane.setBackground(Color.black);
    	 }
    		 
     }
}
class information extends JFrame implements ActionListener{
    JLabel fname,lname,nname,title,display,email,format;
    JTextField ffield,lfield,titlefield,nfield,emailfield;
    JList list;
    JComboBox formatBox;
    JRadioButton[] radio;
    ButtonGroup group;
    JButton add,edit,remove,fault,ok,cancel;
    JPanel panel,mailPanel1,mailPanel2,mailPanel,mainPanel,namePanel,grid,emailPanel1,emailPanel2,emailPanel,formatPanel,btnPanel1,btnPanel2;
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	public information() {
		setSize(500,550);
		setLocation(350,250);
		setTitle("Design Preview [ContactEditor]");
		Container content=getContentPane();
		content.setBackground(Color.gray);
		content.setLayout(new BorderLayout());
		namePanel=new JPanel(new FlowLayout());
		namePanel.setBorder(BorderFactory.createTitledBorder("Name"));;
		fname=new JLabel("First Name:");
		namePanel.add(fname);
		ffield=new JTextField(15);
		namePanel.add(ffield);
		lname=new JLabel("Last Name:");
		namePanel.add(lname);
		lfield=new JTextField(15);
		namePanel.add(lfield);
		title=new JLabel("Title:");
		namePanel.add(title);
		titlefield=new JTextField(15);
		namePanel.add(titlefield);
		nname=new JLabel("Nickname:");
		nfield=new JTextField(15);
		namePanel.add(nname);
		namePanel.add(nfield);
		display=new JLabel("Display Format:");
		namePanel.add(display);
		String item[]= {"Item1","Item2","Item3","Item4","Item5"};
		formatBox=new JComboBox(item);
		namePanel.add(formatBox);
		mainPanel=new JPanel(new BorderLayout());
		emailPanel1=new JPanel(new BorderLayout());
		emailPanel1.setBorder(BorderFactory.createTitledBorder("E-mail"));
		grid=new JPanel(new GridLayout(0,1));
		email=new JLabel("E-mail Address:");
		emailPanel2=new JPanel(new FlowLayout());
		emailfield=new JTextField(15);
		emailPanel2.add(email);
		emailPanel2.add(emailfield);
		String[] l= {"Item1","Item2","Item3","Item4","Item5"};
		list=new JList(l);
		list.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		mailPanel1=new JPanel(new FlowLayout(FlowLayout.LEFT));
		mailPanel=new JPanel(new BorderLayout());
		format=new JLabel("Mail Format:");
		mailPanel1.add(format);
		String[] r= {"HTML","Plain Text","Custom"};
		radio=new JRadioButton[r.length];
		group=new ButtonGroup();
		mailPanel2=new JPanel(new FlowLayout());
		for(int i=0;i<radio.length;i++)
		{
			radio[i]=new JRadioButton(r[i]);
			group.add(radio[i]);
			radio[i].addActionListener(this);
			mailPanel2.add(radio[i]);
		}
		mailPanel.add(mailPanel1,BorderLayout.CENTER);
		mailPanel.add(mailPanel2,BorderLayout.SOUTH);
		panel=new JPanel(new BorderLayout());
		panel.add(emailPanel2,BorderLayout.CENTER);
		panel.add(list,BorderLayout.SOUTH);
		
		emailPanel1.add(panel,BorderLayout.CENTER);
		emailPanel1.add(mailPanel,BorderLayout.SOUTH);
		
		emailPanel=new JPanel(new BorderLayout());
		emailPanel.add(emailPanel1,BorderLayout.WEST);
		
		add=new JButton("Add");
		add.addActionListener(this);
		grid.add(add);
		edit=new JButton("Edit");
		edit.addActionListener(this);
		grid.add(edit);
		remove=new JButton("Remove");
		grid.add(remove);
		fault=new JButton("As Default");
		grid.add(fault);
		emailPanel.add(grid,BorderLayout.EAST);
		btnPanel1=new JPanel(new FlowLayout(FlowLayout.RIGHT));
		ok=new JButton("OK");
		ok.addActionListener(this);
		btnPanel2=new JPanel(new FlowLayout());
		btnPanel2.add(ok);
		cancel=new JButton("Cancel");
		btnPanel2.add(cancel);
		btnPanel1.add(btnPanel2);
		mainPanel.add(namePanel,BorderLayout.CENTER);
		mainPanel.add(emailPanel,BorderLayout.SOUTH);
		content.add(mainPanel,BorderLayout.CENTER);
		content.add(btnPanel1,BorderLayout.SOUTH);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
}
