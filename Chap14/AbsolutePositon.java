package Chap14;
import javax.swing.*;
import java.awt.*;
public class AbsolutePositon extends JFrame{
    private static final int W=300;
    private static final int H=200;
    private static final int X=150;
    private static final int Y=200;
    private static final int BtnW=80;
    private static final int BtnH=30;
    private JButton okbtn,cancelbtn;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         AbsolutePositon frame=new AbsolutePositon();
         frame.setVisible(true);
	}
	public AbsolutePositon() {
		setTitle("Absolute Positon");
		setSize(W,H);
		setLocation(X,Y);
		setResizable(false);
		Container contentPane=getContentPane();
		contentPane.setBackground(Color.pink);
		okbtn=new JButton("OK");
		cancelbtn=new JButton("Cancel");
		contentPane.setLayout(null);
		okbtn.setBounds(70,125,BtnW,BtnH);
		contentPane.add(okbtn);
		cancelbtn.setBounds(160,125,BtnW,BtnH);
		contentPane.add(cancelbtn);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

}
