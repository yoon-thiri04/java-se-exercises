package Chap14;
import javax.swing.*;
import java.awt.*;
public class NestedPanel extends JFrame {
    private static final int W=250;
    private static final int H=270;
    private static final int X=150;
    private static final int Y=250;
    private JPanel hintPanel,guessPanel,buttonPanel,controlPanel;
    private JButton ok,enter;
    private JTextField guess;
    private JLabel hint;
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         NestedPanel frame=new NestedPanel();
         frame.setVisible(true);
	}
	public NestedPanel() {
		setTitle("Nested Panel");
		setSize(W,H);
		setLocation(X,Y);
		setResizable(false);
		Container contentPane=getContentPane();
		contentPane.setBackground(Color.pink);
		contentPane.setLayout(new GridLayout(3,1));
		guessPanel=new JPanel();
		guessPanel.setBorder(BorderFactory.createTitledBorder("Your guess"));
		guessPanel.add(guess=new JTextField(10));
		contentPane.add(guessPanel);
		
		buttonPanel=new JPanel();
		buttonPanel.add(ok=new JButton("OK"));
		buttonPanel.add(enter=new JButton("Enter"));
		controlPanel=new JPanel();
		controlPanel.setLayout(new BorderLayout());
		controlPanel.add(buttonPanel,BorderLayout.SOUTH);
		
		
		hintPanel=new JPanel();
		hintPanel.setBorder(BorderFactory.createTitledBorder("Hint"));
		hintPanel.add(hint=new JLabel("Let's get started."));
		contentPane.add(hintPanel);
		contentPane.add(controlPanel);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	
	}

}
