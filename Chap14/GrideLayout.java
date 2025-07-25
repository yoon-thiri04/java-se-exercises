package Chap14;
import javax.swing.*;
import java.awt.*;
public class GrideLayout extends JFrame {
    private static final  int W=300;
    private static final int H=200;
    private static final int X=150;
    private static final int Y=200;
    JButton btn1,btn2,btn3,btn4,btn5;
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        GrideLayout frame=new GrideLayout();
        frame.setVisible(true);
	}
	public GrideLayout() {
		setTitle("Grid Layout");
		setSize(W,H);
		setLocation(X,Y);
		Container contentPane=getContentPane();
		contentPane.setBackground(Color.red);
		contentPane.setLayout(new GridLayout(0,2));
		btn1=new JButton("btn1");
		btn2=new JButton("btn2");
		btn3=new JButton("btn3");
		btn4=new JButton("btn4");
		btn5=new JButton("btn5");
		contentPane.add(btn1);
		contentPane.add(btn2);
		contentPane.add(btn3);
		contentPane.add(btn4);
		contentPane.add(btn5);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}

}
