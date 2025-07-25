package Chap14Exercise;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class No8 extends JFrame implements ActionListener{
    private JList list;
    private JPanel listPanel,detailPanel,showPanel,scrollPanel;
    private JButton show;
    private JLabel label;
    private JTextArea text;
    private static final String LINE=System.getProperty("line.separator");
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         No8 frame=new No8();
         frame.setVisible(true);
	}
	public No8() {
		String[] name= {"Aye Aye","Mya Mya","Aung Aung","Kyaw Kyaw","Su Su","Mon Mon","Htoo Htoo","Phyo Phyo","Zin Zin","Myo Myo","Zaw Zaw"};
		setTitle("Customer");
		setSize(450,280);
		setLocation(150,200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container contentPane=getContentPane();
		contentPane.setBackground(Color.white);
		contentPane.setLayout(new GridLayout(0,2));
		listPanel=new JPanel(new  BorderLayout());
		label=new JLabel("Customer list:");
		
		showPanel=new JPanel(new FlowLayout());
		show=new JButton("Show Detail");
		show.addActionListener(this);
		showPanel.add(show);
		scrollPanel=new JPanel(new GridLayout(0,1));
		list=new JList(name);
		list.setSize(20,10);
		list.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		scrollPanel.add(new JScrollPane(list));
		listPanel.add(label,BorderLayout.NORTH);
		listPanel.add(scrollPanel,BorderLayout.CENTER);
		listPanel.add(showPanel,BorderLayout.SOUTH);
		contentPane.add(listPanel);
		detailPanel=new JPanel(new FlowLayout());
	    text=new JTextArea(20,18);
	    detailPanel.add(text);
	    contentPane.add(detailPanel);
	}
	public void actionPerformed(ActionEvent e)
	{
		text.setText("");
		String[] name= {"Aye Aye","Mya Mya","Aung Aung","Kyaw Kyaw","Su Su","Mon Mon","Htoo Htoo","Phyo Phyo","Zin Zin","Myo Myo","Zaw Zaw"};
		int[] phone= {1235,2345,3346,7889,2449,3767,3764,1344,6899,7563,1254};
		int[] age= {23,34,18,34,50,23,36,19,20,25,33};
		int[] item= {3,5,2,6,10,30,50,22,3,4,5};
		String[] address= {"Yangon","Yangon","Mandalay","Taunggyi","Magway","Sitthway","Thanlyn","Taunggyi","Helho","Nay Pyi Taw","Yangon"};
		for(int i=0;i<phone.length;i++)
		{
			if(name[i].equals((String)list.getSelectedValue()))
		{
				text.append("Name : "+name[i]+LINE+"Address : "+address[i]+LINE+"Phone : "+phone[i]+LINE+
		        "Age : "+age[i]+LINE+"Number of items purchase : "+item[i]);
				
		}
		}
		
	}

}
