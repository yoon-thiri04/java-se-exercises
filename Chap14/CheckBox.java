package Chap14;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class CheckBox extends JFrame implements ActionListener {
    private JPanel checkPanel,okPanel;
    private JCheckBox[] chkbox;
    private JButton ok;
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          CheckBox frame=new CheckBox();
          frame.setVisible(true);
	}
	public CheckBox() {
		setTitle("Check Box Example");
		setSize(300,300);
		setLocation(200,200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container contentPane=getContentPane();
		contentPane.setBackground(Color.white);
		contentPane.setLayout(new BorderLayout());
		checkPanel=new JPanel(new GridLayout(0,1));
		checkPanel.setBorder(BorderFactory.createTitledBorder("Can Program in"));
		
		String[] chk= {"Java","C++","Python","Ada","SmallTalk"};
		chkbox=new JCheckBox[chk.length];
		for(int i=0;i<chkbox.length;i++)
		{
			chkbox[i]=new JCheckBox(chk[i]);
			checkPanel.add(chkbox[i]);
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
	    	StringBuffer str=new StringBuffer("You can program in\n");
	    	
	    	for(int i=0;i<chkbox.length;i++)
	    	{
	    		if(chkbox[i].isSelected()) {
	    			str.append(chkbox[i].getText()+"\n");
	    		}
	    	}
	    	JOptionPane.showMessageDialog(this, str.toString());
	    	
	    }

}
