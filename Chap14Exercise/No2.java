package Chap14Exercise;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class No2 extends JFrame implements ActionListener {
    private JMenu file;
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         No2 frame=new No2();
         frame.setVisible(true);
	}
	public No2() {
		setSize(300,200);
		setLocation(150,200);
		setTitle("Staff Information System");
		Container contentPane=getContentPane();
		contentPane.setBackground(Color.pink);
		JMenuBar menuBar=new JMenuBar();
		setJMenuBar(menuBar);
		createFileMenu();
		menuBar.add(file);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public void createFileMenu() {
		JMenuItem item;
		file=new JMenu("File");
		item=new JMenuItem("Open");
		item.addActionListener(this);
		file.add(item);
		item=new JMenuItem("Close");
		item.addActionListener(this);
		file.add(item);
	}
	public void actionPerformed(ActionEvent e)
	{
		String menu=e.getActionCommand();
		if(menu.equals("Open"))
		{
			Staff f=new Staff();
			f.setVisible(true);
		}
		else if(menu.equals("Close")) {
			System.exit(0);
		}
	}
	
class Staff extends JFrame implements ActionListener{
	private JLabel name,dept,uni,div,zip;
    private JTextField nameF,deptF,uniF,divF,zipF;
    private JTextArea textArea;
    private JButton store;
    private JPanel panel1,panel2,BtnPanel,TextPanel;
    private final String LINE=System.getProperty("line.separator");
	public Staff() {
		setSize(370,400);
		setTitle("No-5");
		setLocation(200,200);
		Container contentPane=getContentPane();
		
		contentPane.setLayout(new BorderLayout());
		panel1=new JPanel(new GridLayout(0,2));
		name=new JLabel("Name");
		panel1.add(name);
		nameF=new JTextField();
		panel1.add(nameF);
		dept=new JLabel("Department");
		panel1.add(dept);
		deptF=new JTextField();
		panel1.add(deptF);
		uni=new JLabel("University");
		panel1.add(uni);
		uniF=new JTextField();
		panel1.add(uniF);
		div=new JLabel("Division");
		panel1.add(div);
		divF=new JTextField();
		panel1.add(divF);
		zip=new JLabel("Zip");
		panel1.add(zip);
		zipF=new JTextField();
		panel1.add(zipF);
		contentPane.add(panel1,BorderLayout.NORTH);
		
		panel2=new JPanel(new BorderLayout());
		TextPanel=new JPanel(new FlowLayout());
		textArea=new JTextArea(10,25);
		TextPanel.add(textArea);
		panel2.add(TextPanel,BorderLayout.CENTER);
		BtnPanel=new JPanel(new FlowLayout());
		store=new JButton("store");
		store.addActionListener(this);
		BtnPanel.add(store);
		panel2.add(BtnPanel,BorderLayout.SOUTH);
		
		contentPane.add(panel2,BorderLayout.SOUTH);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e)
	{
		textArea.setText(name.getText()+":"+nameF.getText()+LINE
	    +dept.getText()+":"+deptF.getText()+LINE+uni.getText()+":"+
		uniF.getText()+LINE+div.getText()+":"+divF.getText()+LINE+zip.getText()+
		":"+zipF.getText());
	}
}

}
