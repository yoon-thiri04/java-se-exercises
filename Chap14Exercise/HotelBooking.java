package Chap14Exercise;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class HotelBooking extends JFrame implements ActionListener{
    private JLabel name,gender,nrc,phNo,hotel,room,date;
    private JTextField nameF,nrcF,phNoF,dateF;
    private JRadioButton male,female;
    private ButtonGroup group;
    private JComboBox hotelCombo,roomCombo;
    private JPanel mainPanel,radioPanel,btnPanel1,btnPanel2;
    private JButton submit,cancel;
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        HotelBooking frame=new HotelBooking();
        frame.setVisible(true);
	}
	public HotelBooking() {
		setTitle("Hotel Booking");
		setSize(350,300);
		setLocation(150,200);
		Container contentPane=getContentPane();
	    contentPane.setLayout(new BorderLayout());
		mainPanel=new JPanel();
		mainPanel.setLayout(new GridLayout(0,2));
		mainPanel.setBackground(Color.green);
		name=new JLabel("Name");
		mainPanel.add(name);
		nameF=new JTextField();
		mainPanel.add(nameF);
		gender=new JLabel("Gender");
		mainPanel.add(gender);
		radioPanel=new JPanel();
		group=new ButtonGroup();
		male=new JRadioButton("Male");
		group.add(male);
		radioPanel.add(male);
		female=new JRadioButton("Female");
		group.add(female);
		radioPanel.add(female);
		mainPanel.add(radioPanel);
		nrc=new JLabel("NRC");
		mainPanel.add(nrc);
		nrcF=new JTextField();
		mainPanel.add(nrcF);
		phNo=new JLabel("PhoneNo");
		mainPanel.add(phNo);
	    phNoF=new JTextField();
	    mainPanel.add(phNoF);
	    hotel=new JLabel("Hotel Name");
	    mainPanel.add(hotel);
	    String[] hotelName= {"Golden Hill","Sedona","Myat Mingalar","Mandalay Hotel"};
	    hotelCombo=new JComboBox(hotelName);
	    mainPanel.add(hotelCombo);
	    room=new JLabel("Room Type");
	    mainPanel.add(room);
	    String[] roomType= {"Superior Room","Delux Room","Family Delux Room"};
	    roomCombo=new JComboBox(roomType);
	    mainPanel.add(roomCombo);
	    date=new JLabel("Date");
	    mainPanel.add(date);
	    dateF=new JTextField();
	    mainPanel.add(dateF);
	    btnPanel1=new JPanel(new FlowLayout(FlowLayout.LEFT));
	    submit=new JButton("Submit");
	    submit.addActionListener(this);
	    btnPanel1.add(submit);
	    mainPanel.add(btnPanel1);
	    btnPanel2=new JPanel(new FlowLayout(FlowLayout.LEFT));
	    
	    cancel=new JButton("Cancel");
	    cancel.addActionListener(this);
	    btnPanel2.add(cancel);
	    mainPanel.add(btnPanel2);
	    contentPane.add(mainPanel,BorderLayout.CENTER);
	    setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e) {
		String gen;
		if(male.isSelected())
		{
			gen=male.getText();
		}
		else if(female.isSelected())
		{
			gen=female.getText();
		}
		if(e.getSource().equals(cancel)) {
			System.exit(0);
		}
		else if(e.getSource().equals(submit))
		{
			JOptionPane.showMessageDialog(this,"You have booked a "+(String)roomCombo.getSelectedItem()+
			" at "+hotelCombo.getSelectedItem()+" on "+dateF.getText());
		}
	}

}
