package Chap14Exercise;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class No5 extends JFrame implements ActionListener{
    private JMenu file,edit,color;
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         No5 frame=new No5();
         frame.setVisible(true);
	}
	public No5() {
		setSize(300,200);
		setLocation(150,200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JMenuBar menuBar=new JMenuBar();
		setJMenuBar(menuBar);
		createFileMenu();
		createEditMenu();
		createColorMenu();
		menuBar.add(file);
		menuBar.add(edit);
		menuBar.add(color);
		
	}
	public void createFileMenu() {
		JMenuItem item;
		file=new JMenu("File");
		item=new JMenuItem("Quit");
		item.addActionListener(this);
		file.add(item);
	}
	public void createEditMenu() {
		JMenuItem item;
		edit=new JMenu("Edit");
		item=new JMenuItem("Erase");
		item.addActionListener(this);
		edit.add(item);
	}
	public void createColorMenu() {
		JMenuItem item;
		color=new JMenu("Color");
		item=new JMenuItem("Red");
		item.addActionListener(this);
		color.add(item);
		item=new JMenuItem("Green");
		item.addActionListener(this);
		color.add(item);
		item=new JMenuItem("Blue");
		item.addActionListener(this);
		color.add(item);
		item=new JMenuItem("Pink");
		item.addActionListener(this);
		color.add(item);
		item=new JMenuItem("Black");
		item.addActionListener(this);
		color.add(item);
	}
	public void actionPerformed(ActionEvent e)
	{
		String menuSelect=e.getActionCommand();
		Container contentPane=getContentPane();
		contentPane.setLayout(new FlowLayout());
		if(menuSelect.equals("Quit"))
		{
			System.exit(0);
		}
		if(menuSelect.equals("Erase") || menuSelect.equals("Black"))
		{
			contentPane.setBackground(Color.white);
		}
		if(menuSelect.equals("Red"))
		{
			contentPane.setBackground(Color.RED);
		}
		if(menuSelect.equals("Green"))
		{
			contentPane.setBackground(Color.GREEN);
		}
		if(menuSelect.equals("Blue"))
		{
			contentPane.setBackground(Color.BLUE);
		}
		if(menuSelect.equals("Pink"))
		{
			contentPane.setBackground(Color.PINK);
		}
		
	}

}
