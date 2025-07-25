package Chap14;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.util.List;

public class Chap14JList extends JFrame implements ActionListener{
	private JList list;
	private JPanel listPanel,okPanel;
	private JButton ok;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Chap14JList frame=new Chap14JList();
         frame.setVisible(true);
	}
	public Chap14JList() {
		String[] names= {"Apa","Bat","Bee","Cat","Dog","Exl","Fox","Gnu"};
		setTitle("JList");
		setSize(300,250);
		setLocation(150,200);
		Container contentPane=getContentPane();
		contentPane.setLayout(new BorderLayout());
		listPanel=new JPanel(new GridLayout(0,1));
		listPanel.setBorder(BorderFactory.createTitledBorder("Three-letter Animals"));
		list=new JList(names);
		list.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		listPanel.add(new JScrollPane(list));
		contentPane.add(listPanel,BorderLayout.CENTER);
		okPanel=new JPanel(new FlowLayout());
		ok=new JButton("OK");
		okPanel.add(ok);
		ok.addActionListener(this);
		contentPane.add(okPanel,BorderLayout.SOUTH);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	public void actionPerformed(ActionEvent event) {
		List name=list.getSelectedValuesList();
		int[] count;
		StringBuffer str=new StringBuffer("Current Seleced Items are\n");
	     name=list.getSelectedValuesList();
		count=list.getSelectedIndices();
		System.out.print("Current Selected Items are ");
		for(int i=0;i<name.size();i++)
		{
			str.append(name.get(i)+" is at position "+count[i]);
		}
		JOptionPane.showMessageDialog(this, str);

	}
}
