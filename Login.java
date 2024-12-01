package Banking;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class Login extends JFrame implements ActionListener{
	JButton login , signup , clear ;
	JTextField cardtextfield , PINtextfield ;
	Login(){
		setTitle("AUTOMATED TELLER MACHINE");
		setLayout(null);
		
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Icons/logo.jpg"));
		Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel label = new JLabel(i3);
		label.setBounds(70,10,100,100);
		add(label);
		
		JLabel text = new JLabel("Welcome to the ATM");
		text.setFont(new Font("Osward" , Font.BOLD , 38));
		text.setBounds(200,40,400,40);
		add(text);
		
		JLabel cardno = new JLabel("Card Number:");
		cardno.setFont(new Font("Raleway" , Font.BOLD , 28));
		cardno.setBounds(120,150,400,40);
		add(cardno);
		
		JTextField cardtextfield = new JTextField();
		cardtextfield.setBounds(300,150,230,30);
		add(cardtextfield);
		
		JLabel pin = new JLabel("PIN:");
		pin.setFont(new Font("Raleway" , Font.BOLD , 28));
		pin.setBounds(120,220,400,40);
		add(pin);
		
		JTextField PINtextfield = new JTextField();
		PINtextfield.setBounds(300,220,230,30);
		add(PINtextfield);
		
		JButton login = new JButton("SIGN IN");
		login.setBounds(300,300,100,30);
		login.setBackground(Color.BLACK);
		login.setForeground(Color.WHITE);
		login.addActionListener(this);
		add(login);
		
		JButton clear = new JButton("CLEAR");
		clear.setBounds(430,300,100,30);
		clear.setBackground(Color.BLACK);
		clear.setForeground(Color.WHITE);
		clear.addActionListener(this);
		add(clear);
		
		JButton signup = new JButton("SIGN UP");
		signup.setBounds(300,350,230,30);
		signup.setBackground(Color.BLACK);
		signup.setForeground(Color.WHITE);
		signup.addActionListener(this);
		add(signup);
		
		getContentPane().setBackground(Color.WHITE);
		
		setSize(800,480);
		setVisible(true);
		setLocation(350,200);
		}
	
	public void actionPerformed(ActionEvent ae) {
		
		if(ae.getSource() == clear) {
			cardtextfield.setText("");
			PINtextfield.setText("");
		}else if (ae.getSource() == signup) {
			setVisible(false);
			new SignupOne().setVisible(true);
		}else if (ae.getSource() == login) {
			
		}
		}
	public static void main(String[] args) {
		new Login();
	}

}
