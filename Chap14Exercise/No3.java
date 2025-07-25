package Chap14Exercise;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class No3 extends JFrame implements ActionListener{
     private JLabel initial,deposit,withdraw,current;
     private JTextField initialF,depositF,withdrawF,currentF;
     private JPanel panel,BtnPanel;
     private JButton btn1,btn2;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        No3 frame=new No3();
        frame.setVisible(true);
	}
	public No3() {
		setTitle("Bank Account");
		setLocation(150,200);
		setSize(370,330);
		Container contentPane=getContentPane();
		contentPane.setLayout(new BorderLayout());
		panel=new JPanel(new GridLayout(0,2));
        initial=new JLabel("Initial Balance");
        panel.add(initial);
        initialF=new JTextField();
        panel.add(initialF);
        deposit=new JLabel("Deposit Balance");
        panel.add(deposit);
        depositF=new JTextField();
        panel.add(depositF);
        withdraw=new JLabel("Withdraw Balance");
        panel.add(withdraw);
        withdrawF=new JTextField();
        panel.add(withdrawF);
        current=new JLabel("Current Balance");
        
        panel.add(current);
        currentF=new JTextField();
        panel.add(currentF);
        contentPane.add(panel,BorderLayout.CENTER);
        BtnPanel=new JPanel(new FlowLayout());
        btn1=new JButton("Withdraw");
        btn1.addActionListener(this);
        BtnPanel.add(btn1);
        btn2=new JButton("Deposit");
        btn2.addActionListener(this);
        BtnPanel.add(btn2);
        contentPane.add(BtnPanel,BorderLayout.SOUTH);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e)
	{
		double initial1=Double.parseDouble(initialF.getText());
		double deposit1=Double.parseDouble(depositF.getText());
		double withdraw1=Double.parseDouble(withdrawF.getText());
		double current1;
		if(e.getSource().equals(btn1))
		{
			current1=initial1-withdraw1;
			currentF.setText(Double.toString(current1));
			
		}
		else if(e.getSource().equals(btn2)) {
			current1=initial1+deposit1;
			currentF.setText(Double.toString(current1));
		}
		
	}
	

}
