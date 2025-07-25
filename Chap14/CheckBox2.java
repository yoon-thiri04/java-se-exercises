package Chap14;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class CheckBox2 extends JFrame implements ActionListener,ItemListener{
    private JCheckBox[] checkbox;
    private JPanel checkPanel,okPanel;
    private JButton ok;
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        CheckBox2 frame=new CheckBox2();
        frame.setVisible(true);
	}
	public CheckBox2() {
		setTitle("Check Box Sample");
		setSize(300,200);
		setLocation(150,200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container contentPane=getContentPane();
		contentPane.setBackground(Color.pink);
		contentPane.setLayout(new BorderLayout());
		String[] check= {"Java","C++","SmallTalk","Ada","Python"};
		checkPanel=new JPanel(new GridLayout(0,1));
		checkPanel.setBorder(BorderFactory.createTitledBorder("Can Program in"));
		checkbox=new JCheckBox[check.length];
		for(int i=0;i<checkbox.length;i++)
		{
			checkbox[i]=new JCheckBox(check[i]);
			checkPanel.add(checkbox[i]);
			checkbox[i].addItemListener(this);
			
		}
		contentPane.add(checkPanel,BorderLayout.CENTER);
		okPanel=new JPanel(new FlowLayout());
		ok=new JButton("OK");
		ok.addActionListener(this);
		okPanel.add(ok);
		contentPane.add(okPanel,BorderLayout.SOUTH);
		
	}
	public void actionPerformed(ActionEvent e)
	{
		StringBuffer str=new StringBuffer("You can Program in ");
		for(int j=0;j<checkbox.length;j++) {
			if(checkbox[j].isSelected())
			{
				str.append(checkbox[j].getText()+"\n");
			}
		}
		JOptionPane.showMessageDialog(this, str);
	}
	public void itemStateChanged(ItemEvent event)
	{
		JCheckBox source=(JCheckBox) event.getSource();
		String state;
		if(event.getStateChange()==ItemEvent.SELECTED)
		{
			state="is selected";
		}
		else {
			state="is deselected";
		
		}
		JOptionPane.showMessageDialog(null, "JCheckbox "+source.getText()+" "+state);
	}

}
