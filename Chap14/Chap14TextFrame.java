package Chap14;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Chap14TextFrame extends JFrame implements ActionListener {
    JLabel img,prompt;
    JTextField input;
    JButton ok,cancel;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Chap14TextFrame frame=new Chap14TextFrame();
       frame.setVisible(true);
	}
	public Chap14TextFrame() {
		setTitle("Example");
		setSize(300,300);
		setLocation(150,200);
		Container contentPane=getContentPane();
		contentPane.setBackground(Color.pink);
		contentPane.setLayout(new FlowLayout());
		img=new JLabel(new ImageIcon("ethics!.jpg"));
		img.setSize(50,50);
		contentPane.add(img);
		prompt=new JLabel();
		prompt.setText("Enter your name");
		prompt.setSize(150,25);
		contentPane.add(prompt);
		input=new JTextField();
		input.setColumns(22);
		input.addActionListener(this);
		contentPane.add(input);
		
		ok=new JButton("OK");
		contentPane.add(ok);
		ok.addActionListener(this);
		cancel=new JButton("Cancel");
		contentPane.add(cancel);
		cancel.addActionListener(this);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource().equals(ok))
		{
			JOptionPane.showMessageDialog(null,"Your name is "+input.getText());
		}
		if(e.getSource().equals(cancel)) {
			JOptionPane.showMessageDialog(null,"Cancel button is clicked.");
			input.setText("");
		}
	}

}
