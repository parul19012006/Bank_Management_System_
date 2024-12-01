package Banking;


import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.awt.event.*;

public class SignupTwo {
	
	JComboBox religion,category,income,education,occupation;
	JTextField tfPAN , tfaadhar;
	ButtonGroup seniorcitizen ,Existing_account;
	String formno;
	
	SignupTwo() {
		
		this.formno = formno;
		setTitle("NEW ACCOUNT APPLICATION FORM -- PAGE 2");
		
		setLayout(null);
		
	
		
		JLabel additionaldetails = new JLabel("Page 2 : additionaldetails ");
		additionaldetails.setFont(new Font("Raleway",Font.BOLD,22));
		additionaldetails.setBounds(290,80,400,30);
		add(additionaldetails);
		
		
		JLabel Religion = new JLabel("Religion");
		Religion.setFont(new Font("Raleway",Font.BOLD,22));
		Religion.setBounds(100,140,100,30);
		add(Religion);
		
		JComboBox religion = new JCombobox("Hindu" , "Muslim" , "Sikh" , "Chreistion" , "Others");
		religion.setFont(new Font("Raleway",Font.BOLD,14));
		religion.setBounds(300,140,100,30);
		religion.setBackground(Color.WHITE);
		add(religion);
		
		JLabel Category = new JLabel("Category");
		Category.setFont(new Font("Raleway",Font.BOLD,22));
		Category.setBounds(100,190,100,30);
		add(Category);
		
		JComboBox category = new JCombobox("General" , "OBC" , "SC" , "ST" , "Others");
		category.setFont(new Font("Raleway",Font.BOLD,14));
		category.setBounds(300,190,100,30);
		category.setBackground(Color.WHITE);
		add(category);
		
		JLabel Income = new JLabel("Income");
		Income.setFont(new Font("Raleway",Font.BOLD,22));
		Income.setBounds(100,240,100,30);
		add(Income);
		
		JComboBox income = new JCombobox("Null" , "< 1,50,000" , "< 2,50,000" , "< 5,00,000" , "Above 5 Lacs");
		income.setFont(new Font("Raleway",Font.BOLD,14));
		income.setBounds(300,240,100,30);
		income.setBackground(Color.WHITE);
		add(income);
		
		JLabel Education = new JLabel("Education");
		Education.setFont(new Font("Raleway",Font.BOLD,22));
		Education.setBounds(100,290,100,30);
		add(Education);
		
		JLabel Qualification = new JLabel("Qualification");
		Qualification.setFont(new Font("Raleway",Font.BOLD,22));
		Qualification.setBounds(100,315,100,30);
		add(Qualification);
		
		JComboBox education = new JCombobox("Non Graduate" , "Graduate" , "Post Graduate" , "Doctors" , "Others");
		education.setFont(new Font("Raleway",Font.BOLD,14));
		education.setBounds(300,315,100,30);
		education.setBackground(Color.WHITE);
		add(education);
		
		JLabel Occupation = new JLabel("Occupation");
		Occupation.setFont(new Font("Raleway",Font.BOLD,22));
		Occupation.setBounds(100,390,100,30);
		add(Occupation);
		
		JComboBox occupation = new JCombobox("Self Employed" , "Salaried" , "Business" , "Student" , "Others");
		occupation.setFont(new Font("Raleway",Font.BOLD,14));
		occupation.setBounds(300,315,100,30);
		occupation.setBackground(Color.WHITE);
		add(occupation);
		
		JLabel PAN = new JLabel("PAN Number");
		PAN.setFont(new Font("Raleway",Font.BOLD,22));
		PAN.setBounds(100,440,100,30);
		add(PAN);
		
		JTextField tfPAN = new JTextField();
		tfPAN.setFont(new Font("Raleway",Font.BOLD,14));
		tfPAN.setBounds(300,390,100,30);
		add(tfPAN);
		
		JLabel Aadhar = new JLabel("Aadhar Number");
		Aadhar.setFont(new Font("Raleway",Font.BOLD,22));
		Aadhar.setBounds(100,440,100,30);
		add(Aadhar);
		
		JTextField tfaadhar = new JTextField();
		tfaadhar.setFont(new Font("Raleway",Font.BOLD,14));
		tfaadhar.setBounds(300,440,100,30);
		add(tfaadhar);
		
		JLabel senior_citizen = new JLabel("Senior Cititzen");
		senior_citizen.setFont(new Font("Raleway",Font.BOLD,22));
		senior_citizen.setBounds(100,490,100,30);
		add(senior_citizen);
		
		JRadioButton scyes = new JRadioButton("Yes");
		scyes.setBounds(300,390,100,30);
		scyes.setBackground(Color.WHITE);
		add(scyes);
		
		JRadioButton scno = new JRadioButton("No");
		scno.setBounds(450,390,100,30);
		scno.setBackground(Color.WHITE);
		add(scno);
		
		ButtonGroup seniorcitizen = new ButtonGroup();
		seniorcitizen.add(scno);
		seniorcitizen.add(scyes);
		
		JLabel existing_account = new JLabel("Existing Account");
		existing_account.setFont(new Font("Raleway",Font.BOLD,22));
		existing_account.setBounds(100,440,100,30);
		add(existing_account);
		
		JRadioButton ecyes = new JRadioButton("Yes");
		ecyes.setBounds(300,440,100,30);
		ecyes.setBackground(Color.WHITE);
		add(ecyes);
		
		JRadioButton ecno = new JRadioButton("No");
		ecno.setBounds(450,440,100,30);
		ecno.setBackground(Color.WHITE);
		add(ecno);
		
		ButtonGroup Existing_account = new ButtonGroup();
		Existing_account.add(ecno);
		Existing_account.add(ecyes);
		

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
		String religion = (String) religion.getSelectedItem();
		String category = (String) category.getSelectedItem();
		String income = (String) income.getSelectedItem();
		String education = (String) education.getSelectedItem();
		String occupation = (String) occupation.getSelectedItem();
		
		
		String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
		
		String seniorcitizen = null;
		if(scyes.isSelelected) {
			seniorcitizen = "Yes"";
		}else if(scno.isSelelected) {
			seniorcitizen = "No";
		}
		
		
		
		String existing_account = null;
		if(ecyes.isSelelected) {
			Existing_account = "Yes";
		}else if(ecno.isSelelected) {
			Existing_account = "No";
		}
		
		String pan = tfpan.getText();
		String aadhar = tfaadhar.getText();
		
		
		try {
			
			Conn c = new Conn();
			String query = "Insert into singuptwo values(" + formno + " ."+ religion + " ."+ category + " ."+ income + " ."+ education + " ."+ occupation + " ."+ dob + " ."+ seniorcitizen + " ."+ existing_account + " ."+ pan + " ." + aadhar;
			c.s.executeUpdate(query);
			
		}
		catch(Exception ae) {
			System.out.println(ae);
		}
	}
	
	

	public static void main(String[] args) {
		new SignupTwo("");

	}

}
