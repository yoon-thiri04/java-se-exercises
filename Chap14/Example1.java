package Chap14;
import javax.swing.*;
import java.awt.*;
public class Example1 extends JFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Example1 frame=new Example1();
         frame.setVisible(true);
         frame.setTitle("My Frame");
         frame.setSize(300,250);
         frame.setLocation(200,250);
         String str=JOptionPane.showInputDialog(null,"Enter num1");
         String str2=JOptionPane.showInputDialog(null,"Enter num2");
         int num1=Integer.parseInt(str);
         int num2=Integer.parseInt(str2);
         JOptionPane.showMessageDialog(frame, "Result is "+(num1+num2));
         frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
	}
	public Example1() {
		Container cp=getContentPane();
		cp.setBackground(Color.PINK);
	}

}
