package Chap14;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class EventHandling extends JFrame implements ActionListener {
     JButton ok,cancel;
     JPanel buttonPanel;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        EventHandling frame=new EventHandling();
        frame.setVisible(true);
	}
	public EventHandling() {
		setTitle("Event Handling");
		setSize(300,230);
		setLocation(150,200);
		Container contentPane=getContentPane();
		contentPane.setBackground(Color.pink);
		contentPane.setLayout(new BorderLayout());
		buttonPanel=new JPanel();
		
		buttonPanel.add(ok=new JButton("OK"));
		buttonPanel.add(cancel=new JButton("Cancel"));
		ok.addActionListener(this);
		cancel.addActionListener(this);
		contentPane.add(buttonPanel,BorderLayout.SOUTH);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(ok))
		{
			JOptionPane.showMessageDialog(null,"ok button is clicked.");
		}
		if(e.getSource().equals(cancel))
		{
			JOptionPane.showMessageDialog(null,"Cancel button is clicked.");
		}
	}

}
