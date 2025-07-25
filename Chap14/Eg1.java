package Chap14;
import javax.swing.*;
import java.awt.*;
public class Eg1 extends JFrame{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Eg1 frame=new Eg1();
         frame.setVisible(true);
         frame.setSize(300,200);
         frame.setLocation(200,150);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         
         
         }
	    public Eg1(){
	    	Container contentPane=getContentPane();
	         contentPane.setBackground(Color.red);
	    }

}
