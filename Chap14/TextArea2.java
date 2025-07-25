package Chap14;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class TextArea2 extends JFrame implements ActionListener{
    private JTextField input;
    private JButton add,clear;
    private JTextArea textA;
    Container contentPane;
    private static final String NEWLINE=System.getProperty("line.separator");
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        TextArea2 frame=new TextArea2();
        frame.setVisible(true);
	}

	public TextArea2() {
		setTitle("Text Area");
		setSize(300,250);
		setLocation(150,200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		contentPane=getContentPane();
		contentPane.setBackground(Color.blue);
		contentPane.setLayout(new FlowLayout());
		
		textA=new JTextArea();
		textA.setColumns(22);
		textA.setRows(8);
		textA.setBorder(BorderFactory.createLineBorder(Color.red));
		textA.setEditable(false);
		contentPane.add(textA);
		
		input=new JTextField();
		input.setColumns(22);
		
		contentPane.add(input);
		
		add=new JButton("ADD");
		add.addActionListener(this);
		contentPane.add(add);
		clear=new JButton("CLEAR");
		clear.addActionListener(this);
		contentPane.add(clear);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(add)) {
			addText(input.getText());
		}
		else if(e.getSource().equals(input)){
			addText(input.getText());
		}
		else clear();
	}
	public void addText(String newLine) {
		textA.append(newLine+NEWLINE);
		input.setText("");
	}
	public void clear() {
		textA.setText("");
		input.setText("");
	}


}
