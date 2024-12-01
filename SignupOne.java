package Banking;


import java.awt.*;
import javax.swing.*;
import java.util.*;
import com.toedter.calender.JDateChooser;
import java.awt.event.*;

public class SignupOne {
	long random;
	JLabel name,fname,dob,gender,email,marital,address,city,state,pincode;
	JTextField tfname,tffname,tfdob,tfgender,tfemail,tfmarital,tfaddress,tfcity,tfstate,tfpincode;
	JButton next;
	JRadioButton male,female,other,married,unmarried;
	
	SignupOne(String formno) {
		
		
		setLayout(null);
		Random ran = new Random();
		long random = Math.abs((ran.nextLong() % 9000L) + 1000L);
		
		
		JLabel formno = new JLabel("APPLICATION FORM NO. " + random);
		formno.setFont(new Font("Raleway",Font.BOLD,38));
		formno.setBounds(140,20,600,40);
		add(formno);
		
		JLabel persondetails = new JLabel("Page 1 : Person Details ");
		persondetails.setFont(new Font("Raleway",Font.BOLD,22));
		persondetails.setBounds(290,80,400,30);
		add(persondetails);
		
		
		JLabel name = new JLabel("Name");
		name.setFont(new Font("Raleway",Font.BOLD,22));
		name.setBounds(100,140,100,30);
		add(name);
		
		JTextField tfname1 = new JTextField();
		tfname1.setFont(new Font("Raleway",Font.BOLD,14));
		tfname1.setBounds(300,140,100,30);
		add(tfname1);
		
		JLabel fname = new JLabel("Father's Name");
		fname.setFont(new Font("Raleway",Font.BOLD,22));
		fname.setBounds(100,190,100,30);
		add(fname);
		
		JTextField tffname = new JTextField();
		tffname.setFont(new Font("Raleway",Font.BOLD,14));
		tffname.setBounds(300,190,100,30);
		add(tffname);
		
		JLabel dob = new JLabel("Date Of Birth");
		dob.setFont(new Font("Raleway",Font.BOLD,22));
		dob.setBounds(100,240,100,30);
		add(dob);
		
		JDateChooser datechooser = new JDateChooser();
		datechooser.setBounds(300,240,400,30);
		datechooser.setForeground(new Color(105,105,105));
		add(datechooser);
		
		JLabel gender = new JLabel("Gender");
		gender.setFont(new Font("Raleway",Font.BOLD,22));
		gender.setBounds(100,290,100,30);
		add(gender);
		
		JRadioButton male = new JRadioButton("Male");
		male.setBounds(300,290,60,30);
		male.setBackground(Color.WHITE);
		add(male);
		
		JRadioButton female = new JRadioButton("Female");
		female.setBounds(450,290,120,30);
		female.setBackground(Color.WHITE);
		add(female);
		
		ButtonGroup gendergroup = new ButtonGroup();
		gendergroup.add(male);
		gendergroup.add(female);
		
		JLabel email = new JLabel("Email Address");
		email.setFont(new Font("Raleway",Font.BOLD,22));
		email.setBounds(100,340,100,30);
		add(email);
		
		JTextField tfemail = new JTextField();
		tfemail.setFont(new Font("Raleway",Font.BOLD,14));
		tfemail.setBounds(300,340,100,30);
		add(tfemail);
		
		JLabel marital = new JLabel("Marital Status");
		marital.setFont(new Font("Raleway",Font.BOLD,22));
		marital.setBounds(100,390,100,30);
		add(marital);
		
		JRadioButton married = new JRadioButton("Married");
		married.setBounds(300,390,60,30);
		married.setBackground(Color.WHITE);
		add(married);
		
		JRadioButton unmarried = new JRadioButton("Single");
		unmarried.setBounds(450,390,120,30);
		unmarried.setBackground(Color.WHITE);
		add(unmarried);
		
		JRadioButton other = new JRadioButton("Others");
		other.setBounds(630,390,120,30);
		other.setBackground(Color.WHITE);
		add(other);
		
		ButtonGroup maritalgroup = new ButtonGroup();
		maritalgroup.add(married);
		maritalgroup.add(unmarried);
		maritalgroup.add(other);
		
		JLabel address = new JLabel("Address");
		address.setFont(new Font("Raleway",Font.BOLD,22));
		address.setBounds(100,440,100,30);
		add(address);
		
		JTextField tfaddress = new JTextField();
		tfaddress.setFont(new Font("Raleway",Font.BOLD,14));
		tfaddress.setBounds(300,390,100,30);
		add(tfaddress);
		
		JLabel city = new JLabel("City");
		city.setFont(new Font("Raleway",Font.BOLD,22));
		city.setBounds(100,440,100,30);
		add(city);
		
		JTextField tfcity = new JTextField();
		tfcity.setFont(new Font("Raleway",Font.BOLD,14));
		tfcity.setBounds(300,440,100,30);
		add(tfcity);
		
		JLabel state = new JLabel("State");
		state.setFont(new Font("Raleway",Font.BOLD,22));
		state.setBounds(100,490,100,30);
		add(state);
		
		JTextField tfstate = new JTextField();
		tfstate.setFont(new Font("Raleway",Font.BOLD,14));
		tfstate.setBounds(300,490,100,30);
		add(tfstate);
		
		JLabel pincode = new JLabel("PIN Code");
		pincode.setFont(new Font("Raleway",Font.BOLD,22));
		pincode.setBounds(100,540,100,30);
		add(pincode);
		
		JTextField tfpincode = new JTextField();
		tfstate.setFont(new Font("Raleway",Font.BOLD,14));
		tfstate.setBounds(300,490,100,30);
		add(tfstate);
			

		JButton next = new JButton("Next");
		next.setBackground(Color.BLACK);
		next.setForeground(Color.WHITE);
		next.setFont(new Font("Raleway" , Font.BOLD , 14));
		next.setBounds(620,660,80,30);
		next.addActionListener(this);
		add(next);
		
		setSize(850,800);
		setVisible(true);
		setLocation(350,10);
		
	}
	
	public void actionPerformed(ActionEvent ae) {
		String formno = "" + random;
		String name = tfname.getText();
		String fname = tffname.getText();
		String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
		
		String gender = null;
		if(male.isSelected()) {
			gender = "Male";
		}else if(female.isSelected()) {
			gender = "Female";
		}
		
		String email = tfemail.getText();
		String marital = null;
		if(married.isSelected()) {
			gender = "Married";
		}else if(unmarried.isSelected()) {
			gender = "Unmarried";
		}else if(other.isSelected()) {
			gender = "Other";
		}
		
		String address = tfaddress.getText();
		String city = tfcity.getText();
		String state = tfstate.getText();
		String pin = tfpin.getText();
		
		
		try {
			if(name.equals("")) {
				JOptionPane.showMessageDialog(null, "Name is required");
			}else {
				Conn c = new Conn();
				String query = "Insert into singupone values(" + formno + " ."+ name + " ."+ fname + " ."+ dob + " ."+ gender + " ."+ email + " ."+ address + " ."+ city + " ."+ state + " ."+ pin + " .";
				c.s.executeUpdate(query);
				
				setVisible(false);
				new SignupTwo(formno).setVisible(true);
			}
			
			
		}
		catch(Exception ae) {
			System.out.println(ae);
		}
	}
	
	

	public static void main(String[] args) {
		new SignupOne();

	}

}
