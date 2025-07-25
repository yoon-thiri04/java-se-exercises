package Chap14;
import javax.swing.*;
import java.awt.*;
public class Chap14FlowLayout extends JFrame {
    private JButton button1,button2,button3,button4,button5;
    private static final int FRAME_WIDTH=300;
    private static final int FRAME_HEIGHT=200;
    private static final int FRAME_X_ORIGIN=150;
    private static final int FRAME_Y_ORIGIN=250;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Chap14FlowLayout frame=new Chap14FlowLayout();
         frame.setVisible(true);
	}
	public Chap14FlowLayout() {
		setTitle("Flow Layout");
		setSize(FRAME_WIDTH,FRAME_HEIGHT);
		setLocation(FRAME_X_ORIGIN,FRAME_Y_ORIGIN);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container contentPane=getContentPane();
		contentPane.setBackground(Color.pink);
		contentPane.setLayout(new FlowLayout(FlowLayout.LEFT));
		button1=new JButton("Button1");
		button2=new JButton("Button2");
		button3=new JButton("Button3");
		button4=new JButton("Button4");
		button5=new JButton("Button5");
		contentPane.add(button1);
		contentPane.add(button2);
		contentPane.add(button3);
		contentPane.add(button4);
		contentPane.add(button5);
	}

}
