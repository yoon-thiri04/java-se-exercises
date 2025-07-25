package Chap14;
import javax.swing.*;
import java.awt.*;
public class JframeSubClass extends JFrame{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          JframeSubClass frame=new JframeSubClass();
          frame.setVisible(true);
	}
	public JframeSubClass() {
		setTitle("JFrame Sub Clas");
		setLocation(300,200);
		setSize(300,250);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container contentPane=getContentPane();
		contentPane.setBackground(Color.PINK);
		JOptionPane.showMessageDialog(null, "Who are you?");
		
	}

}
