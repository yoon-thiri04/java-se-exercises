package Chap14Exercise;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class No6 extends JFrame implements ActionListener{
    private JCheckBox[] chkBox;
    private JPanel checkPanel,BtnPanel,SumPanel;
    private JButton orderBtn;
    private JLabel label;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        No6 frame=new No6();
        frame.setVisible(true);
	}
	public No6() {
		setSize(260,240);
		setLocation(150,200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container contentPane=getContentPane();
		contentPane.setLayout(new FlowLayout());
		SumPanel=new JPanel(new BorderLayout());
		label=new JLabel("Food Ordering System");
		SumPanel.add(label,BorderLayout.NORTH);
		checkPanel=new JPanel(new GridLayout(0,1));
		String[] chk= {"Pizza@100","Burger@30","Tea@10"};
		chkBox=new JCheckBox[chk.length];
		for(int i=0;i<chkBox.length;i++)
		{
			chkBox[i]=new JCheckBox(chk[i]);
			checkPanel.add(chkBox[i]);
			
		}
		BtnPanel=new JPanel(new FlowLayout(FlowLayout.LEFT));
		orderBtn=new JButton("Order");
		orderBtn.addActionListener(this);
		BtnPanel.add(orderBtn);
		SumPanel.add(checkPanel,BorderLayout.CENTER);
		SumPanel.add(BtnPanel,BorderLayout.SOUTH);
		contentPane.add(SumPanel);
		
		
	}
	public void actionPerformed(ActionEvent e)
	{  
		int[] price= {100,30,10};
        double total=0;
		StringBuffer str=new StringBuffer();
		for(int j=0;j<chkBox.length;j++) {
			if(chkBox[j].isSelected())
			{
				 str.append(chkBox[j].getText().replaceAll("@",":")+"\n");
				 String sp=chkBox[j].getText().substring(chkBox[j].getText().indexOf('@')+1,chkBox[j].getText().length());
			     int num=Integer.parseInt(sp);
				 total+=num;
			}
			
		}
		str.append("--------------"+"\n");
		str.append("Total:"+total);
        JOptionPane.showMessageDialog(null, str);
       
    }
	
	
	
}
