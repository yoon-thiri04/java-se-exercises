package Chap14Exercise;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class AirTicket extends JFrame implements ActionListener {
    private JLabel name,nrc,from,to,date;
    private JTextField nameF,nrcF,dateF;
    private JRadioButton one,round;
    ButtonGroup group;
    private JComboBox fromCombo,toCombo;
    private JButton submit;
    private JPanel submitPanel,mainPanel,radioPanel,comboPanel;
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       AirTicket frame=new AirTicket();
       frame.setVisible(true);
	}
	public AirTicket() {
		setSize(260,250);
		setLocation(150,200);
		Container contentPane=getContentPane();
		contentPane.setLayout(new BorderLayout());
		mainPanel=new JPanel(new FlowLayout());
		name=new JLabel("Name");
		mainPanel.add(name);
		nameF=new JTextField(20);
		mainPanel.add(nameF);
		nrc=new JLabel("NRC");
		mainPanel.add(nrc);
		nrcF=new JTextField(20);
		mainPanel.add(nrcF);
		radioPanel=new JPanel(new FlowLayout());
		group=new ButtonGroup();
		one=new JRadioButton("One way");
		radioPanel.add(one);
		group.add(one);
		round=new JRadioButton("Round Trip");
		group.add(round);
		radioPanel.add(round);
		mainPanel.add(radioPanel);
		comboPanel=new JPanel(new FlowLayout());
		from=new JLabel("From");
		comboPanel.add(from);
		String[] f= {"Yangon","NayPyi Taw","Mandalay"};
		fromCombo=new JComboBox(f);
		comboPanel.add(fromCombo);
		to=new JLabel("To");
		comboPanel.add(to);
		String[] t= {"Yangon","NayPyi Taw","Mandalay"};
		toCombo=new JComboBox(t);
		comboPanel.add(toCombo);
		mainPanel.add(comboPanel);
		date=new JLabel("Date");
		mainPanel.add(date);
		dateF=new JTextField(20);
		mainPanel.add(dateF);
		submitPanel=new JPanel(new FlowLayout());
		submit=new JButton("Submit");
		submit.addActionListener(this);
		submitPanel.add(submit);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		contentPane.add(mainPanel,BorderLayout.CENTER);
		contentPane.add(submitPanel,BorderLayout.SOUTH);
	}
	public void actionPerformed(ActionEvent e)
	{
		String choice=null;
		if(one.isSelected())
		{
			choice=one.getText();
		}
		else if (round.isSelected())
		{
			choice=round.getText();
		}
		JOptionPane.showMessageDialog(this, "You have booked "+choice+" "+
		from.getText()+" "+(String)fromCombo.getSelectedItem()+" "+
		to.getText()+" "+(String)toCombo.getSelectedItem()+" in "+dateF.getText());
	}

}
