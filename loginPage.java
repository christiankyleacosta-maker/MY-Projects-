package GUIfirst;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JPasswordField;

public class loginPage extends JFrame {

	private static final long serialVersionUID = 1L;
	protected static String txt;
	private JPanel contentPane;
	private JTextField txtName;
	private JTextField GmailNumber;
	private JPasswordField Secure;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					loginPage frame = new loginPage();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public loginPage() {
		setTitle("Team Hiraya");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\EJO MULTIFOODS3\\Pictures\\Sky\\2325290_49.jpg"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 748, 452);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(102, 204, 153));
		contentPane.setForeground(new Color(255, 51, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel header = new JLabel("Team Hiraya");
		header.setForeground(new Color(51, 0, 51));
		header.setHorizontalAlignment(SwingConstants.CENTER);
		header.setFont(new Font("Viner Hand ITC", Font.BOLD | Font.ITALIC, 30));
		header.setBounds(105, 11, 506, 59);
		header.setBackground(new Color(0, 102, 204));
		contentPane.add(header);
		
		JLabel nametext = new JLabel("Name:");
		nametext.setFont(new Font("Sylfaen", Font.ITALIC, 14));
		nametext.setHorizontalAlignment(SwingConstants.CENTER);
		nametext.setBounds(170, 132, 79, 20);
		contentPane.add(nametext);
		
		txtName = new JTextField();
		txtName.setFont(new Font("Sylfaen", Font.PLAIN, 14));
		txtName.setBounds(249, 127, 224, 30);
		contentPane.add(txtName);
		txtName.setColumns(10);
		
		JLabel infotext = new JLabel("Log-in/Sign-up");
		infotext.setHorizontalAlignment(SwingConstants.CENTER);
		infotext.setFont(new Font("Sylfaen", Font.ITALIC, 14));
		infotext.setBounds(249, 65, 197, 20);
		contentPane.add(infotext);
		
		GmailNumber = new JTextField();
		GmailNumber.setFont(new Font("Sylfaen", Font.PLAIN, 14));
		GmailNumber.setColumns(10);
		GmailNumber.setBounds(249, 180, 224, 30);
		contentPane.add(GmailNumber);
		
		JLabel lblGmailnumber = new JLabel("Gmail/Number:");
		lblGmailnumber.setHorizontalAlignment(SwingConstants.CENTER);
		lblGmailnumber.setFont(new Font("Sylfaen", Font.ITALIC, 14));
		lblGmailnumber.setBounds(133, 190, 106, 20);
		contentPane.add(lblGmailnumber);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setHorizontalAlignment(SwingConstants.CENTER);
		lblPassword.setFont(new Font("Sylfaen", Font.ITALIC, 14));
		lblPassword.setBounds(160, 245, 89, 20);
		contentPane.add(lblPassword);
		
		JButton btnLogin = new JButton("Log-in");
		btnLogin.setBackground(new Color(0, 153, 102));
		btnLogin.setFont(new Font("Sylfaen", Font.PLAIN, 15));
		btnLogin.setBounds(246, 309, 89, 30);
		contentPane.add(btnLogin);
		
		JButton btnSignup = new JButton("Sign-up");
		btnSignup.setFont(new Font("Sylfaen", Font.PLAIN, 15));
		btnSignup.setBackground(new Color(0, 153, 102));
		btnSignup.setBounds(384, 311, 89, 30);
	
		contentPane.add(btnSignup);
	
		
		Secure = new JPasswordField();
		Secure.setFont(new Font("Sylfaen", Font.PLAIN, 14));
		Secure.setBounds(249, 237, 224, 30);
		contentPane.add(Secure);

		
		btnSignup.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				String name = txtName.getText();
				String contact = GmailNumber.getText();
				String password = new String(Secure.getPassword());
//				variable name     create variable (name of the variable. What type of input will you get)
				
				if(name.isEmpty() || contact.isEmpty() || password.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Please fill the box with correct information");
				}else if(!contact.endsWith("@gmail.com")) {
					JOptionPane.showMessageDialog(null,"Please enter the right gmail");
				}else {
					try {
						FileWriter writer = new FileWriter("users.txt",true);
						writer.write("Name: " + name + "\n");
		                writer.write("Contact: " + contact + "\n");
		                writer.write("Password: " + password + "\n");
		                writer.write("---------------------------\n");
		                writer.close();
		                
		                JOptionPane.showMessageDialog(null, "Sign-up Successful!");
		                
		                txtName.setText("");
		                Secure.setText("");
		                GmailNumber.setText("");
						
					}catch(IOException ex) {
						JOptionPane.showMessageDialog(null,"Error Saving Data!");
					}
				}
				
			}
		});
	}
}
