package ccs103;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JCheckBox;
import javax.swing.ButtonGroup;

public class Main extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tfName;
	private JTextField txtAge;
	private JTextField txtLength;
	private JTextArea output;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Main() {
		setTitle("Goldfish Collection");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 651, 460);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(223, 249, 243));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblTitle = new JLabel("GoldFish Monitoring Application");
		lblTitle.setFont(new Font("Times New Roman", Font.ITALIC, 25));
		lblTitle.setBounds(10, 11, 371, 43);
		contentPane.add(lblTitle);

		JLabel lblGoldName = new JLabel("GoldFish Name:");
		lblGoldName.setFont(new Font("Sitka Subheading", Font.PLAIN, 12));
		lblGoldName.setBounds(39, 69, 105, 19);
		contentPane.add(lblGoldName);

		tfName = new JTextField();
		tfName.setBounds(211, 65, 149, 22);
		contentPane.add(tfName);

		JLabel lblGoldfishAge = new JLabel("GoldFish Age:");
		lblGoldfishAge.setFont(new Font("Sitka Subheading", Font.PLAIN, 12));
		lblGoldfishAge.setBounds(39, 99, 105, 19);
		contentPane.add(lblGoldfishAge);

		txtAge = new JTextField();
		txtAge.setBounds(211, 98, 149, 22);
		contentPane.add(txtAge);

		JLabel lblGoldfishLengthcm = new JLabel("GoldFish Length(cm):");
		lblGoldfishLengthcm.setFont(new Font("Sitka Subheading", Font.PLAIN, 12));
		lblGoldfishLengthcm.setBounds(39, 135, 125, 19);
		contentPane.add(lblGoldfishLengthcm);

		txtLength = new JTextField();
		txtLength.setBounds(211, 131, 149, 22);
		contentPane.add(txtLength);

		JLabel lblGoldfishType = new JLabel("GoldFish Type:");
		lblGoldfishType.setFont(new Font("Sitka Subheading", Font.PLAIN, 12));
		lblGoldfishType.setBounds(39, 202, 97, 19);
		contentPane.add(lblGoldfishType);

		JComboBox<String> cbType = new JComboBox<>();
		cbType.setFont(new Font("Sitka Text", Font.PLAIN, 14));
		cbType.setModel(new DefaultComboBoxModel<>(new String[] {
				"N/A", "Common Goldfish", "Comet Goldfish", "Oranda Goldfish", "Ryukin Goldfish"
		}));
		cbType.setBounds(211, 200, 149, 22);
		contentPane.add(cbType);

		JLabel lblGoldfishHealthStatus = new JLabel("GoldFish Health Status:");
		lblGoldfishHealthStatus.setFont(new Font("Sitka Subheading", Font.PLAIN, 12));
		lblGoldfishHealthStatus.setBounds(39, 235, 138, 19);
		contentPane.add(lblGoldfishHealthStatus);

		JComboBox<String> HS = new JComboBox<>();
		HS.setFont(new Font("Sitka Text", Font.PLAIN, 14));
		HS.setModel(new DefaultComboBoxModel<>(new String[] {
				"N/A", "Healthy", "Under Observation", "Sick"
		}));
		HS.setBounds(211, 233, 149, 23);
		contentPane.add(HS);

		JLabel lblGoldfishSpecialCondition = new JLabel("GoldFish Special Condition:");
		lblGoldfishSpecialCondition.setFont(new Font("Sitka Subheading", Font.PLAIN, 12));
		lblGoldfishSpecialCondition.setBounds(39, 268, 161, 19);
		contentPane.add(lblGoldfishSpecialCondition);

		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setBackground(new Color(204, 253, 159));
		btnSubmit.setFont(new Font("Sitka Text", Font.PLAIN, 12));
		btnSubmit.setBounds(39, 382, 112, 28);
		contentPane.add(btnSubmit);

		JButton btnCancel = new JButton("Cancel");
		btnCancel.setBackground(new Color(250, 147, 112));
		btnCancel.setFont(new Font("Sitka Text", Font.PLAIN, 12));
		btnCancel.setBounds(213, 382, 112, 28);
		contentPane.add(btnCancel);

	
		JLabel lblOutput = new JLabel("Monitoring Result");
		lblOutput.setFont(new Font("Sitka Heading", Font.BOLD, 14));
		lblOutput.setBounds(457, 39, 150, 20);
		contentPane.add(lblOutput);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(400, 66, 225, 319);
		contentPane.add(scrollPane);

		output = new JTextArea();
		output.setFont(new Font("SansSerif", Font.PLAIN, 13));
		output.setLineWrap(true);
		output.setWrapStyleWord(true);
		output.setEditable(false);
		output.setBackground(new Color(245, 245, 245));

		scrollPane.setViewportView(output);
		
		JCheckBox chcbxRecentlyFed = new JCheckBox("Recently Fed");
		chcbxRecentlyFed.setBackground(new Color(223, 249, 243));
		chcbxRecentlyFed.setFont(new Font("Sitka Text", Font.PLAIN, 11));
		chcbxRecentlyFed.setBounds(39, 296, 138, 28);
		contentPane.add(chcbxRecentlyFed);
		
		JCheckBox chckbxBreedingCandidate = new JCheckBox("Breeding Candidate");
		chckbxBreedingCandidate.setBackground(new Color(223, 249, 243));
		chckbxBreedingCandidate.setFont(new Font("Sitka Text", Font.PLAIN, 11));
		chckbxBreedingCandidate.setBounds(200, 297, 138, 28);
		contentPane.add(chckbxBreedingCandidate);
		
		JCheckBox chckbxInIsolationTank = new JCheckBox("In Isolation Tank");
		chckbxInIsolationTank.setBackground(new Color(223, 249, 243));
		chckbxInIsolationTank.setFont(new Font("Sitka Text", Font.PLAIN, 11));
		chckbxInIsolationTank.setBounds(39, 327, 138, 28);
		contentPane.add(chckbxInIsolationTank);

		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try {

					String name = tfName.getText();
					int age = Integer.parseInt(txtAge.getText());
					double length = Double.parseDouble(txtLength.getText());
					String special ="";
					String special2 ="";
					String condition ="";
					String type = (String) cbType.getSelectedItem();
					String health = (String) HS.getSelectedItem();
					
					if(age < 0 || length < 0) {
						output.setText("Invalid input. Please enter numbers for Age and Length.");
						return;
					}
					
					if(chcbxRecentlyFed.isSelected()) {
						special = "Recently Fed ";
						condition += "Recently Fed\n";
					}
					if(chckbxBreedingCandidate.isSelected()) {
						condition += "Breeding Candidate\n";
					}

					if(chckbxInIsolationTank.isSelected()) {
						special2 = "In Isolation Tank ";
						condition += "In Isolation Tank\n";
					}


					int minLen = 0;
					int maxLen = 0;

					if(type.equals("Common Goldfish")) {
						minLen = 20;
						maxLen = 30;
					}
					else if(type.equals("Comet Goldfish")) {
						minLen = 25;
						maxLen = 35;
					}
					else if(type.equals("Oranda Goldfish")) {
						minLen = 15;
						maxLen = 25;
					}
					else if(type.equals("Ryukin Goldfish")) {
						minLen = 15;
						maxLen = 20;
					}

					String finalAlert = "";

					if ("Sick".equals(health))
						finalAlert += "Aquatic Treatment Required\n";

					if ("In Isolation Tank ".equals(special2))
						finalAlert += "Fish Under Isolation Monitoring\n";

					if (length < minLen || length > maxLen)
						finalAlert += "Size Outside Normal Range\n";

					if ("Recently Fed ".equals(special) && "Healthy".equals(health))
						finalAlert += "Goldfish Active and Ready for Display\n";

					if (finalAlert.isEmpty())
						finalAlert = "No alerts — Record within normal parameters.";

					String result =
							"Name: " + name +
							"\nAge: " + age +
							"\nLength: " + length + " cm" +
							"\nType: " + type +
							"\nHealth: " + health +
							"\n\nSpecial Condition:\n" + condition +
							"\n\nAlerts:\n" + finalAlert;

					output.setText(result);

				} catch (Exception ex) {
					output.setText("Invalid input. Please enter numbers for Age and Length.");
				}
			}
		});

		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				tfName.setText("");
				txtAge.setText("");
				txtLength.setText("");
				output.setText("");
				cbType.setSelectedIndex(0);
				HS.setSelectedIndex(0);
				chcbxRecentlyFed.setSelected(false);
				chckbxBreedingCandidate.setSelected(false);
				chckbxInIsolationTank.setSelected(false);
				
			}
		});
	}
}