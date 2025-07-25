package Chap14;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class JMenuSample extends JFrame implements ActionListener {
    private JMenu file,edit;
    private JLabel response;
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       JMenuSample frame=new JMenuSample();
       frame.setVisible(true);
	}
	public JMenuSample() {
	     setTitle("JMenu Sample");
	     setLocation(150,200);
	     setSize(300,250);
	     setResizable(false);
	     Container contentPane=getContentPane();
	     contentPane.setBackground(Color.white);
	     contentPane.setLayout(new FlowLayout());
	     createfileMenu();
	     createEditMenu();
	     JMenuBar menuBar=new JMenuBar();
	     setJMenuBar(menuBar);
	     menuBar.add(file);
	     menuBar.add(edit);
	     
	     response=new JLabel("Hello,This is your menu taster.");
	     response.setSize(250,50);
	     contentPane.add(response);
	     setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public void createfileMenu() {
		JMenuItem item;
		file=new JMenu("File");
		item=new JMenuItem("New");
		item.addActionListener(this);
		file.add(item);
		item=new JMenuItem("Open");
		item.addActionListener(this);
		file.add(item);
		item=new JMenuItem("Save");
		item.addActionListener(this);
		file.add(item);
		item=new JMenuItem("Save as..");
		item.addActionListener(this);
		file.add(item);
		file.addSeparator();
		item=new JMenuItem("Quit");
		item.addActionListener(this);
		file.add(item);
		
	}
	public void createEditMenu() {
		JMenuItem item;
		edit=new JMenu("Edit");
		item=new JMenuItem("Cut");
		item.addActionListener(this);
		edit.add(item);
		item=new JMenuItem("Copy");
		item.addActionListener(this);
		edit.add(item);
		item=new JMenuItem("Paste");
		item.addActionListener(this);
		edit.add(item);
	}
	public void actionPerformed(ActionEvent e) {
		String menuName=e.getActionCommand();
		if(menuName.equals("Quit"))
		{
			System.exit(0);
		}
		else {
		  response.setText("Menu Item"+menuName+" is clicked");
		}
	}

}
