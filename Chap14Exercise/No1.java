package Chap14Exercise;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class No1 extends JFrame implements ActionListener {
    private JTextField num1Field,num2Field,resultField;
    private JButton add,subtract,multiply,divide,clear;
    private JLabel num1,num2,result;
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        No1 frame=new No1();
        frame.setVisible(true);
	}
	public No1() {
		
		setTitle("Calculator");
		setLocation(150,200);
		setSize(300,220);
		Container contentPane=getContentPane();
		contentPane.setBackground(Color.white);
		contentPane.setLayout(new FlowLayout());
		num1=new JLabel("Number1");
		contentPane.add(num1);
		num1Field=new JTextField(20);
		contentPane.add(num1Field);
		num2=new JLabel("Number2");
		contentPane.add(num2);
		num2Field=new JTextField(20);
		contentPane.add(num2Field);
		result=new JLabel("Answer");
		contentPane.add(result);
		resultField=new JTextField(20);
		contentPane.add(resultField);
		add=new JButton("Add");
		add.addActionListener(this);
		contentPane.add(add);
		subtract=new JButton("Subtract");
		subtract.addActionListener(this);
		contentPane.add(subtract);
		multiply=new JButton("Multiply");
		multiply.addActionListener(this);
		contentPane.add(multiply);
		divide=new JButton("Divide");
		divide.addActionListener(this);
		contentPane.add(divide);
		clear=new JButton("Clear");
		clear.addActionListener(this);
		contentPane.add(clear);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e)
	{
		int num1=Integer.parseInt(num1Field.getText());
		int num2=Integer.parseInt(num2Field.getText());
		int ans;
		if(e.getSource().equals(add))
		{
			ans=num1+num2;
			resultField.setText(Integer.toString(ans));
		}
		if(e.getSource().equals(subtract))
		{
			ans=num1-num2;
			resultField.setText(Integer.toString(ans));
		}
		if(e.getSource().equals(multiply))
		{
			ans=num1*num2;
			resultField.setText(Integer.toString(ans));
		}
		if(e.getSource().equals(divide))
		{
			ans=num1/num2;
			resultField.setText(Integer.toString(ans));
		}
		if(e.getSource().equals(clear))
		{
			num1Field.setText("");
			num2Field.setText("");
			resultField.setText("");
		}
	}

}
