package Chap14Exercise;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class setBounds extends JFrame{
    private JLabel name,phone;
    private JTextField nameF,phoneF;
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         setBounds frame=new setBounds();
         frame.setVisible(true);
	}
	public setBounds() {
		setLocation(150,200);
		setSize(300,350);
		Container contentPane=getContentPane();
		contentPane.setBackground(Color.green);
		contentPane.setLayout(null);
		name=new JLabel("Name");
		name.setBounds(30,50,50,50);
		contentPane.add(name);
		nameF=new JTextField();
		nameF.setBounds(80,50,200,80);
		contentPane.add(nameF);
		phone=new JLabel("Phone");
		phone.setBounds(30,150,70,50);
		contentPane.add(phone);
		phoneF=new JTextField();
		phoneF.setBounds(80,150,200,80);
		contentPane.add(phoneF);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

}
