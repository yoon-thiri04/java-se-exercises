package Chap14;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class ComboBox extends JFrame implements ActionListener,ItemListener {
    private JComboBox comboBox;
    private JPanel comboPanel,okPanel;
    private JButton ok,cancel;
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ComboBox frame=new ComboBox();
        frame.setVisible(true);
	}
	public ComboBox() {
		setTitle("My Combo Box");
		setSize(300,200);
		setLocation(200,230);
		Container contentPane=getContentPane();
		contentPane.setBackground(Color.CYAN);
		contentPane.setLayout(new BorderLayout());
		comboPanel=new JPanel(new FlowLayout());
		comboPanel.setBorder(BorderFactory.createTitledBorder("Pick your favourite"));
		String[] combo= {"Java","C++","C"+"Python"+"React"};
		comboBox=new JComboBox(combo);
		comboBox.addItemListener(this);
		comboPanel.add(comboBox);
		contentPane.add(comboPanel,BorderLayout.CENTER);
		okPanel=new JPanel(new GridLayout(0,2));
		ok=new JButton("OK");
		ok.addActionListener(this);
		okPanel.add(ok);
		cancel=new JButton("Cancel");
		okPanel.add(cancel);
		contentPane.add(okPanel,BorderLayout.SOUTH);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	public void actionPerformed(ActionEvent event)
	{
		JOptionPane.showMessageDialog(this, "Current Selected Item "+comboBox.getSelectedItem()+" is at index position "+comboBox.getSelectedIndex());
	}
	public void itemStateChanged(ItemEvent event) {
		
		String str;
		if(event.getStateChange()==ItemEvent.SELECTED)
		{
			str="is selected";
		}
		else {
			str="is deselected";
		}
		JOptionPane.showMessageDialog(this, "JComboBox"+event.getItem()+" "+str);
	}

}
