package Chap14;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.util.List;
public class JavaList extends JFrame implements ActionListener{
    private JList list;
    private JPanel listPanel,okPanel;
    private JButton ok;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         JavaList frame=new JavaList();
         frame.setVisible(true);
	}
	public JavaList() {
		setTitle("Java List Example");
		setLocation(200,230);
		setSize(300,250);
	    Container contentPane=getContentPane();
	    
	    contentPane.setBackground(Color.WHITE);
	    contentPane.setLayout(new BorderLayout());
	    String[] names= {"Apple","Mango","Orange","Pineapple","WaterMelon"};
	    listPanel = new JPanel(new GridLayout(0,1));
		listPanel.setBorder(BorderFactory.createTitledBorder(
		"Three-letter Animal Names"));
		list = new JList(names);
		listPanel.add(new JScrollPane(list));
		list.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
	    
	    
	    okPanel=new JPanel(new FlowLayout());
	    ok=new JButton("OK");
	    ok.addActionListener(this);
	    okPanel.add(ok);
	    contentPane.add(okPanel,BorderLayout.SOUTH);
	    contentPane.add(listPanel,BorderLayout.CENTER);
	    setDefaultCloseOperation(EXIT_ON_CLOSE);
	    
	}
	public void actionPerformed(ActionEvent event) {
		List names;
		int[] count;
		names=list.getSelectedValuesList();
		count=list.getSelectedIndices();
		System.out.print("Currently Selected Fruit are");
		for(int i=0;i<names.size();i++)
		{
			System.out.print(names.get(i)+" at position "+count[i]);
		}
		
	}

}
