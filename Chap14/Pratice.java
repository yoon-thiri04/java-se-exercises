package Chap14;
import javax.swing.*;
import java.awt.*;
public class Pratice extends JFrame {
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Pratice f=new Pratice();
       f.setVisible(true);
	}
    public Pratice() {
    	setSize(300,200);
    	setLocation(150,200);
    	Container contentPane=getContentPane();
    	contentPane.setLayout(new GridLayout(0,2));
    	JPanel p1=new JPanel(new BorderLayout());
    	JLabel name,address,phone;
    	JPanel p2=new JPanel(new BorderLayout());
    	p1.add(name=new JLabel("Name"));
    	
    	p1.add(address=new JLabel("My address"));
    	
    	p1.add(phone=new JLabel("Number"));
    	contentPane.add(p1);
    	JTextField f1,f2,f3;
    	p2.add(f1=new JTextField(15));
    	p2.add(f2=new JTextField(15));
    	p2.add(f3=new JTextField(15));
    	contentPane.add(p2);
    	setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
}
