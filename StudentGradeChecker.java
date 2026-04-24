package challenges;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTree;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class StudentGradeChecker extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField Name;
	private JTextField Grade;
	private String name; 
	private double grade;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentGradeChecker frame = new StudentGradeChecker();
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
	public StudentGradeChecker() {
		setTitle("Student Grade Checker");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblheader = new JLabel("Grade Checker");
		lblheader.setFont(new Font("Lucida Bright", Font.BOLD, 18));
		lblheader.setHorizontalAlignment(SwingConstants.CENTER);
		lblheader.setBounds(61, 11, 284, 35);
		contentPane.add(lblheader);
		
		Name = new JTextField();
		Name.setBounds(100, 80, 220, 35);
		contentPane.add(Name);
		Name.setColumns(10);
		
		JLabel lblName = new JLabel("Student Name");
		lblName.setFont(new Font("Lucida Bright", Font.PLAIN, 13));
		lblName.setHorizontalAlignment(SwingConstants.CENTER);
		lblName.setBounds(151, 57, 106, 14);
		contentPane.add(lblName);
		
		Grade = new JTextField();
		Grade.setColumns(10);
		Grade.setBounds(100, 148, 220, 35);
		contentPane.add(Grade);
		
		JLabel lblGrade = new JLabel("Student Grade");
		lblGrade.setHorizontalAlignment(SwingConstants.CENTER);
		lblGrade.setFont(new Font("Lucida Bright", Font.PLAIN, 13));
		lblGrade.setBounds(151, 123, 106, 14);
		contentPane.add(lblGrade);
		
		JButton btnSubmit = new JButton("SUBMIT");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					try {
						name = Name.getText().toUpperCase().trim();
						grade = Double.parseDouble(Grade.getText().trim());
						if(name.isEmpty() || name.isBlank()) {
							int val = JOptionPane.showConfirmDialog( 
							lblheader,
							"Name Cannot Be Empty",
							"Name is Empty",
							JOptionPane.WARNING_MESSAGE
							);
							return;
						}
							
						if(grade > 100 || grade < 0) {
							JOptionPane.showMessageDialog(null, "Grades must not be greater than 100 or less than 0", "Invalid Grade", JOptionPane.PLAIN_MESSAGE);
							return;
						}
						
						char rate;
						String comment;
						
						if(grade >= 90) {
							rate = 'A';
							comment = "You passed with high grade kept it up!";
						}else if(grade >=80) {
							rate = 'B';
							comment = "You passed keep going your doing great!";
						}else if(grade >=70) {
							rate = 'C';
							comment = "You passed go beyond your limit to become outstanding!";
						}else if(grade >=60) {
							rate = 'D';
							comment = "You passed but next time do your best";
						}else {
							rate = 'F';
							comment = "You Failed try next time";
						}
						
						JOptionPane.showMessageDialog(null, "Hello " + name + String.format("\nYour grade is: $%.1f",grade) + "\nWith a rating of: " + rate + "\n" + comment);
						
						name = "";
						grade = 0;
						comment = "";
						rate = ' ';
						Name.setText("");
						Grade.setText("");
							
						}catch(NumberFormatException c) {
							int val = JOptionPane.showConfirmDialog(
								lblheader,
								"Invalid Grade Input or Empty",
								"Alert",
								JOptionPane.WARNING_MESSAGE
								);
						}
				}
			});
		btnSubmit.setBounds(60, 216, 116, 23);
		contentPane.add(btnSubmit);
		
		JButton btnClear = new JButton("CLEAR");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int con = JOptionPane.showConfirmDialog(getParent(), "Are you sure you want to clear all the inputs?","CONFIRM",JOptionPane.YES_NO_OPTION);
				if (con == JOptionPane.YES_OPTION) {
					name = "";
					grade = 0;
					Name.setText("");
					Grade.setText("");
				}else if (con == JOptionPane.NO_OPTION) {
					return;
				}
				
			}
		});
		btnClear.setBounds(259, 216, 116, 23);
		contentPane.add(btnClear);

	}
}
//🧩 Problem: Simple Student Grade Checker (GUI)
//
//Create a Java Swing application where a user inputs:
//
//Student Name
//Score (0–100)
//🎯 Requirements
//Use getText() to retrieve input from text fields.
//Use try-catch to handle invalid number input.
//Use if statements to validate:
//Name is not empty
//Score is a number
//Score is between 0 and 100
//Display:
//Grade (A, B, C, D, F)
//Error messages when input is invalid

//🖥️ Expected Behavior
//Input	Output
//Name: John, Score: 		85	Grade: B
//Name: (empty), Score: 	90	Error: Name required
//Name: Ana, Score: 		abc	Error: Invalid number
//Name: Mark, Score: 		150	Error: Score must be 0–100
