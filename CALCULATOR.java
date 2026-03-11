package GUIfirst;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class CALCULATOR extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JButton btn8;
	private JButton btn9;
	private JButton btn4;
	private JButton btn5;
	private JButton btn6;
	private JButton btn1;
	private JButton btn2;
	private JButton btn3;
	private JButton btn0;
	private JButton btnC;
	private JButton btnEQ;
	private JButton btnDVD;
	private JButton btnMTP;
	private JButton btnSBT;
	private JButton btnPLS;
	private double firstNumber;
	private double secondNumber;
	private String operation;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CALCULATOR frame = new CALCULATOR();
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
	public CALCULATOR() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 517, 511);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(240, 240, 240));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Times New Roman", Font.BOLD, 17));
		textField.setBackground(new Color(255, 255, 255));
		textField.setEditable(false);
		textField.setBounds(10, 10, 481, 84);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btn7 = new JButton("7");
		btn7.setFont(new Font("Arial Black", Font.BOLD, 17));
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 textField.setText(textField.getText() + "7");
			}
		});
		btn7.setBounds(31, 126, 81, 74);
		contentPane.add(btn7);
		
		btn8 = new JButton("8");
		btn8.setFont(new Font("Arial Black", Font.BOLD, 17));
		btn8.addActionListener(e -> textField.setText(textField.getText() + "8"));
		btn8.setBounds(130, 126, 81, 74);
		contentPane.add(btn8);
		
		btn9 = new JButton("9");
		btn9.setFont(new Font("Arial Black", Font.BOLD, 17));
		btn9.addActionListener(e -> textField.setText(textField.getText() + "9"));
		btn9.setBounds(234, 126, 81, 74);
		contentPane.add(btn9);
		
		btn4 = new JButton("4");
		btn4.setFont(new Font("Arial Black", Font.BOLD, 17));
		btn4.addActionListener(e -> textField.setText(textField.getText() + "4"));
		btn4.setBounds(31, 211, 81, 74);
		contentPane.add(btn4);
		
		btn5 = new JButton("5");
		btn5.setFont(new Font("Arial Black", Font.BOLD, 17));
		btn5.addActionListener(e -> textField.setText(textField.getText() + "5"));
		btn5.setBounds(130, 211, 81, 74);
		contentPane.add(btn5);
		
		btn6 = new JButton("6");
		btn6.setFont(new Font("Arial Black", Font.BOLD, 17));
		btn6.addActionListener(e -> textField.setText(textField.getText() + "6"));
		btn6.setBounds(234, 211, 81, 74);
		contentPane.add(btn6);
		
		btn1 = new JButton("1");
		btn1.setFont(new Font("Arial Black", Font.BOLD, 17));
		btn1.addActionListener(e -> textField.setText(textField.getText() + "1"));
		btn1.setBounds(31, 296, 81, 74);
		contentPane.add(btn1);
		
		btn2 = new JButton("2");
		btn2.setFont(new Font("Arial Black", Font.BOLD, 17));
		btn2.addActionListener(e -> textField.setText(textField.getText() + "2"));
		btn2.setBounds(130, 296, 81, 74);
		contentPane.add(btn2);
		
		btn3 = new JButton("3");
		btn3.setFont(new Font("Arial Black", Font.BOLD, 17));
		btn3.addActionListener(e -> textField.setText(textField.getText() + "3"));
		btn3.setBounds(234, 296, 81, 74);
		contentPane.add(btn3);
		
		btn0 = new JButton("0");
		btn0.setFont(new Font("Arial Black", Font.BOLD, 17));
		btn0.addActionListener(e -> textField.setText(textField.getText() + "0"));
		btn0.setBounds(31, 381, 81, 74);
		contentPane.add(btn0);
		
		btnC = new JButton("c");
		btnC.setFont(new Font("Arial Black", Font.BOLD, 17));
		btnC.addActionListener(e -> {
		    textField.setText("");
		    firstNumber = 0;
		    secondNumber = 0;
		    operation = null;
		});
		btnC.setBounds(130, 381, 81, 74);
		contentPane.add(btnC);
		
		btnEQ = new JButton("=");
		btnEQ.setFont(new Font("Arial Black", Font.BOLD, 17));
		btnEQ.addActionListener(e -> {

		    secondNumber = Double.parseDouble(textField.getText());
		    double result = 0;

		    switch (operation) {
		        case "+":
		            result = firstNumber + secondNumber;
		            break;

		        case "-":
		            result = firstNumber - secondNumber;
		            break;

		        case "*":
		            result = firstNumber * secondNumber;
		            break;

		        case "/":
		            result = firstNumber / secondNumber;
		            break;
		    }

		    textField.setText(String.valueOf(result));
		});
		btnEQ.setBounds(234, 381, 81, 74);
		contentPane.add(btnEQ);
		
		btnDVD = new JButton("/");
		btnDVD.setFont(new Font("Arial Black", Font.BOLD, 17));
		btnDVD.addActionListener(e -> {
		    firstNumber = Double.parseDouble(textField.getText());
		    operation = "/";
		    textField.setText("");
		});
		btnDVD.setBounds(380, 126, 81, 74);
		contentPane.add(btnDVD);
		
		btnMTP = new JButton("*");
		btnMTP.setFont(new Font("Arial Black", Font.BOLD, 17));
		btnMTP.addActionListener(e -> {
		    firstNumber = Double.parseDouble(textField.getText());
		    operation = "*";
		    textField.setText("");
		});
		btnMTP.setBounds(380, 211, 81, 74);
		contentPane.add(btnMTP);
		
		btnSBT = new JButton("-");
		btnSBT.setFont(new Font("Arial Black", Font.BOLD, 17));
		btnSBT.addActionListener(e -> {
		    firstNumber = Double.parseDouble(textField.getText());
		    operation = "-";
		    textField.setText("");
		});
		btnSBT.setBounds(380, 296, 81, 74);
		contentPane.add(btnSBT);
		
		btnPLS = new JButton("+");
		btnPLS.setFont(new Font("Arial Black", Font.BOLD, 17));
		btnPLS.addActionListener(e -> {
		    firstNumber = Double.parseDouble(textField.getText());
		    operation = "+";
		    textField.setText("");
		});
		btnPLS.setBounds(380, 381, 81, 74);
		contentPane.add(btnPLS);

	}
}
