package GUIfirst;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JPasswordField;

public class PracticeJoptionPane extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField fName;
	private JTextField fContacts;
	private JPasswordField fPassword; // Use JPasswordField for security

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PracticeJoptionPane frame = new PracticeJoptionPane();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public PracticeJoptionPane() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 780, 600);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(64, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel header = new JLabel("TEAM HIRAYA");
		header.setForeground(new Color(255, 255, 255));
		header.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		header.setHorizontalAlignment(SwingConstants.CENTER);
		header.setBounds(242, 11, 277, 32);
		contentPane.add(header);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblName.setBounds(141, 109, 62, 23);
		contentPane.add(lblName);
		
		JLabel lblGmailcontact = new JLabel("Gmail/Contact:");
		lblGmailcontact.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblGmailcontact.setBounds(141, 162, 119, 23);
		contentPane.add(lblGmailcontact);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblPassword.setBounds(141, 221, 119, 23);
		contentPane.add(lblPassword);
		
		fName = new JTextField();
		fName.setBounds(279, 113, 277, 20);
		contentPane.add(fName);
		
		fContacts = new JTextField();
		fContacts.setBounds(279, 166, 277, 20);
		contentPane.add(fContacts);

		// FIX: Create the password field here so it shows up on screen
		fPassword = new JPasswordField();
		fPassword.setBounds(279, 225, 277, 20);
		contentPane.add(fPassword);
		
		JButton btbLogin = new JButton("Log-in");
		btbLogin.setBounds(211, 349, 140, 23);
		contentPane.add(btbLogin);
		
		JButton btnSignup = new JButton("Sign-up");
		btnSignup.setBounds(477, 349, 140, 23);
		contentPane.add(btnSignup);

		btnSignup.addActionListener(e -> {
			String name = fName.getText();
			String contact = fContacts.getText();
			String password = new String(fPassword.getPassword());
			
				if(name.isEmpty() || contact.isEmpty() || password.isEmpty()) {
					JOptionPane.showMessageDialog(contentPane, "Please Fill all the Requirements", "Error", JOptionPane.ERROR_MESSAGE);
				} else if(!(contact.contains("@gmail.com") || contact.matches("[0-9]+"))) {
					JOptionPane.showMessageDialog(contentPane, "Please enter a valid Gmail or Number", "Error", JOptionPane.ERROR_MESSAGE);
				} else {
					JOptionPane.showMessageDialog(contentPane, "Continue creating Account", "Continue", JOptionPane.OK_OPTION);
					JOptionPane.showMessageDialog(contentPane, "Registration Successful!", "Success", JOptionPane.INFORMATION_MESSAGE);
					name = "";
					contact =  "";
					password = "";
					fName.setText("");
					fContacts.setText("");
					fPassword.setText("");
				}
			});
			
			btbLogin.addActionListener(e ->{
				String name = fName.getText();
				String contact = fContacts.getText();
				String password = new String(fPassword.getPassword());
				
					if(name.isEmpty() || contact.isEmpty() || password.isEmpty()) {
						JOptionPane.showMessageDialog(contentPane, "Please Fill all the Requirements", "Error", JOptionPane.ERROR_MESSAGE);
					} else if(!(contact.contains("@gmail.com") || contact.matches("[0-9]+"))) {
						JOptionPane.showMessageDialog(contentPane, "Please enter a valid Gmail or Number", "Error", JOptionPane.ERROR_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(contentPane, "Continue creating Account", "Continue", JOptionPane.OK_OPTION);
						JOptionPane.showMessageDialog(contentPane, "Registration Successful!", "Success", JOptionPane.INFORMATION_MESSAGE);
						name = "";
						contact =  "";
						password = "";
						fName.setText("");
						fContacts.setText("");
						fPassword.setText("");
					}
			});
	}
}