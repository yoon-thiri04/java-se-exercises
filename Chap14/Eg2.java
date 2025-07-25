package Chap14;
import javax.swing.*;
import java.awt.*;
import java.util.*;
public class Eg2 extends JFrame{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Eg2 frame=new Eg2();
        frame.setTitle("My Frame.");
        frame.setVisible(true);
        frame.setSize(300,300);
        frame.setLocation(150,200);
        
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        String name=JOptionPane.showInputDialog(frame,"What is your name.");
        JOptionPane.showMessageDialog(frame,"My name is "+name);
        
	}
	public Eg2()
	{
		Container contentPane=getContentPane();
		contentPane.setBackground(Color.pink);
	}

}
