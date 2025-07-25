package Chap14;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RadionBtn extends JFrame implements ActionListener,ItemListener{
    private JRadioButton[] radio;
    private JPanel radioPanel,okPanel;
    private JButton okbtn;
    private ButtonGroup langGroup;
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         RadionBtn frame=new RadionBtn();
         frame.setVisible(true);
	}
	public RadionBtn() {
		setTitle("Radio Button");
		setSize(300,200);
		setLocation(150,200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container contentPane=getContentPane();
		contentPane.setBackground(Color.cyan);
		contentPane.setLayout(new BorderLayout());
		String[] rad= {"Java","C++","Python","SmallTalk","Ada"};
		radioPanel=new JPanel(new FlowLayout());
		radioPanel.setBorder(BorderFactory.createTitledBorder("Pick your favourite"));
		radio=new JRadioButton[rad.length];
		langGroup=new ButtonGroup();
		for(int i=0;i<radio.length;i++)
		{
			radio[i]=new JRadioButton(rad[i]);
			radio[i].addItemListener(this);
			langGroup.add(radio[i]);
			radioPanel.add(radio[i]);
		}
		contentPane.add(radioPanel,BorderLayout.CENTER);
		okPanel=new JPanel(new FlowLayout());
		okbtn=new JButton("OK");
		okbtn.addActionListener(this);
		okPanel.add(okbtn);
		contentPane.add(okPanel,BorderLayout.SOUTH);
	}
	public void actionPerformed(ActionEvent event)
	{
		String str=null;
		int i=0;
		while(str==null) {
			if(radio[i].isSelected())
			{
				str=radio[i].getText();
			}
			i++;
			
		}
		JOptionPane.showMessageDialog(this, "Your favourite language is "+str);
	}
	public void itemStateChanged(ItemEvent event) {
		JRadioButton source=(JRadioButton)event.getSource();
		String state;
		if(event.getStateChange()==ItemEvent.SELECTED)
		{
			state="is selected";
		}
		else {
			state="is deselected";
		}
		JOptionPane.showMessageDialog(this,"JRadionButton"+source.getText()+" "+state);
	}

}
