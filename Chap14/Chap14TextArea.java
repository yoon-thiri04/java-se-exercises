package Chap14;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Chap14TextArea extends JFrame implements ActionListener {
    JTextField num1,num2,result;
    JButton add,subtract,mutiply,division,clear;
    JPanel Calculator;
    JLabel prompt1,prompt2,prompt3;
    
    	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chap14TextArea frame=new Chap14TextArea();
		frame.setVisible(true);

	}
	public Chap14TextArea() {
		setTitle("My Four Function Calculator");
		setSize(300,200);
		setLocation(150,200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container contentPane=getContentPane();
		contentPane.setBackground(Color.pink);
		contentPane.setLayout(new GridLayout(0,1));
		Calculator=new JPanel();
		Calculator.setBorder(BorderFactory.createTitledBorder("Calculator"));
		
		prompt1=new JLabel();
		prompt1.setText("Number1");
		Calculator.add(prompt1);
		num1=new JTextField();
		num1.setColumns(15);
		Calculator.add(num1);
		prompt2=new JLabel();
		prompt2.setText("Number2");
		Calculator.add(prompt2);
		num2=new JTextField();
		num2.setColumns(15);
	    Calculator.add(num2);
	    prompt3=new JLabel();
	    
	    prompt3.setText("Answer");
	    Calculator.add(prompt3);
	    result=new JTextField();
	    result.setColumns(15);
	    
	    Calculator.add(result);
		
		add=new JButton("Add");
		add.addActionListener(this);
		Calculator.add(add);
		
		subtract=new JButton("Subtract");
		subtract.addActionListener(this);
		Calculator.add(subtract);
		mutiply=new JButton("Mutiply");
		mutiply.addActionListener(this);
		Calculator.add(mutiply);
		division=new JButton("Div");
		division.addActionListener(this);
		Calculator.add(division);
		clear=new JButton("Clear");
		clear.addActionListener(this);
		Calculator.add(clear);
		contentPane.add(Calculator);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource().equals(add)) {
			result.setText(Integer.toString(add(num1.getText(),num2.getText())));
		}
		else if(e.getSource().equals(subtract))
		{
			result.setText(Integer.toString(sub(num1.getText(),num2.getText())));
		}
		else if(e.getSource().equals(mutiply))
		{
			result.setText(Integer.toString(multiply(num1.getText(),num2.getText())));
		}
		else if(e.getSource().equals(division))
		{
			result.setText(Integer.toString(div(num1.getText(),num2.getText())));
		}
		else {
			result.setText("");
			num1.setText("");
			num2.setText("");
		}
	}
	public int add(String num1,String num2)
	{
		int n1=Integer.parseInt(num1);
		int n2=Integer.parseInt(num2);
		return n1+n2;
	}
	public int sub(String num1,String num2)
	{
		int n1=Integer.parseInt(num1);
		int n2=Integer.parseInt(num2);
		return n1-n2;
	}
	public int div(String num1,String num2)
	{
		int n1=Integer.parseInt(num1);
		int n2=Integer.parseInt(num2);
		return n1/n2;
	}
	public int multiply(String num1,String num2)
	{
		int n1=Integer.parseInt(num1);
		int n2=Integer.parseInt(num2);
		return n1*n2;
	}
	
		
		
		
	
	
}
