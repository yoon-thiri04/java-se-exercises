package Chap14;
import javax.swing.*;
import java.awt.*;
public class Chap14BorderLayout extends JFrame {
    private static final int WIDTH=300;
    private static final int HEIGHT=200;
    private static final int X=150;
    private static final int Y=200;
    private JButton button1,button2,button3,button4,button5;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Chap14BorderLayout frame=new Chap14BorderLayout();
         frame.setVisible(true);
	}
	public Chap14BorderLayout() {
		setTitle("Border Layout");
		setSize(WIDTH,HEIGHT);
		setLocation(X,Y);
		Container contentPane=getContentPane();
		contentPane.setBackground(Color.red);
		contentPane.setLayout(new BorderLayout());
		button1=new JButton("button1");
		button2=new JButton("button2");
		button3=new JButton("button3");
		button4=new JButton("button4");
		button5=new JButton("button5");
		contentPane.add(button1,BorderLayout.EAST);
		contentPane.add(button2,BorderLayout.CENTER);
		contentPane.add(button3,BorderLayout.WEST);
		contentPane.add(button4,BorderLayout.NORTH);
		contentPane.add(button5,BorderLayout.SOUTH);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

}
