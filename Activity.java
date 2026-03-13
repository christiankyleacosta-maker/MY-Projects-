import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;

public class Activity extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtAnimalname;
	private JTextField txtAnimalage;
	private JTextField txtAnimalWeight;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Activity frame = new Activity();
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
	public Activity() {
		setTitle("Activity Monitoring System");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 574, 362);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(197, 173, 124));
		contentPane.setForeground(new Color(197, 173, 124));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel header = new JLabel("Activity Monitoring System");
		header.setForeground(new Color(255, 255, 255));
		header.setHorizontalAlignment(SwingConstants.CENTER);
		header.setFont(new Font("Sitka Banner", Font.PLAIN, 29));
		header.setBounds(135, 11, 326, 33);
		contentPane.add(header);
		
		JLabel lblAnimalName = new JLabel("Animal Name:");
		lblAnimalName.setForeground(new Color(0, 0, 0));
		lblAnimalName.setFont(new Font("Sitka Text", Font.PLAIN, 14));
		lblAnimalName.setBounds(36, 53, 114, 21);
		contentPane.add(lblAnimalName);
		
		txtAnimalname = new JTextField();
		txtAnimalname.setBounds(170, 51, 200, 21);
		contentPane.add(txtAnimalname);
		txtAnimalname.setColumns(10);
		
		JLabel lblAnimalAge = new JLabel("Animal Age:");
		lblAnimalAge.setFont(new Font("Sitka Text", Font.PLAIN, 14));
		lblAnimalAge.setBounds(36, 96, 114, 21);
		contentPane.add(lblAnimalAge);
		
		txtAnimalage = new JTextField();
		txtAnimalage.setColumns(10);
		txtAnimalage.setBounds(170, 94, 200, 21);
		contentPane.add(txtAnimalage);
		
		JComboBox AnimalType = new JComboBox();
		AnimalType.setModel(new DefaultComboBoxModel(new String[] {"N/A", "Lion", "Elephant", "Giraffe", "Zebra"}));
		AnimalType.setEditable(true);
		AnimalType.setBounds(21, 247, 148, 22);
		contentPane.add(AnimalType);
		
		JLabel lblAnimalType = new JLabel("Animal Type");
		lblAnimalType.setHorizontalAlignment(SwingConstants.CENTER);
		lblAnimalType.setFont(new Font("Sitka Text", Font.PLAIN, 14));
		lblAnimalType.setBounds(36, 215, 114, 21);
		contentPane.add(lblAnimalType);
		
		JLabel lblAnimalHealthStatus = new JLabel("Animal Health Status");
		lblAnimalHealthStatus.setHorizontalAlignment(SwingConstants.CENTER);
		lblAnimalHealthStatus.setFont(new Font("Sitka Text", Font.PLAIN, 14));
		lblAnimalHealthStatus.setBounds(192, 215, 161, 21);
		contentPane.add(lblAnimalHealthStatus);
		
		JComboBox AnimalCondition = new JComboBox();
		AnimalCondition.setModel(new DefaultComboBoxModel(new String[] {"N/A", "Healthy", "Under Observation", "Sick"}));
		AnimalCondition.setEditable(true);
		AnimalCondition.setBounds(199, 247, 154, 22);
		contentPane.add(AnimalCondition);
		
		JLabel lblSpecialCondiotions = new JLabel("Special Condiotions");
		lblSpecialCondiotions.setHorizontalAlignment(SwingConstants.CENTER);
		lblSpecialCondiotions.setFont(new Font("Sitka Text", Font.PLAIN, 14));
		lblSpecialCondiotions.setBounds(373, 215, 151, 21);
		contentPane.add(lblSpecialCondiotions);
		
		JComboBox AnimalSCondition = new JComboBox();
		AnimalSCondition.setModel(new DefaultComboBoxModel(new String[] {"N/A", "Vaccinated", "Healthy", "In Quarantine Monitoring"}));
		AnimalSCondition.setEditable(true);
		AnimalSCondition.setBounds(376, 247, 161, 22);
		contentPane.add(AnimalSCondition);
		
		JLabel lblAnimalWeight = new JLabel("Animal Weight:");
		lblAnimalWeight.setFont(new Font("Sitka Text", Font.PLAIN, 14));
		lblAnimalWeight.setBounds(36, 138, 114, 21);
		contentPane.add(lblAnimalWeight);
		
		txtAnimalWeight = new JTextField();
		txtAnimalWeight.setColumns(10);
		txtAnimalWeight.setBounds(170, 136, 200, 21);
		contentPane.add(txtAnimalWeight);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setBounds(135, 280, 114, 23);
		contentPane.add(btnSubmit);
		btnSubmit.addActionListener(e ->{
			try {
				String name = txtAnimalname.getText();
				int age = Integer.parseInt(txtAnimalage.getText());
				int weight = Integer.parseInt(txtAnimalWeight.getText());
				
				String type = (String) AnimalType.getSelectedItem();
				String stat = (String) AnimalCondition.getSelectedItem();
				String special = (String) AnimalSCondition.getSelectedItem();
				
				int vaccinated = 0;
				int specialDiet = 0;
				int quarantine = 0;
				
				if(special.equals("Vaccinated")) {
				    vaccinated = 1;
				}
				if(special.equals("Healthy")) {
				    specialDiet = 1;
				}
				if(special.equals("In Quarantine Monitoring")) {
				    quarantine = 1;
				}
				
				int min = 0;
				int max = 0;
				if(type.equals("Lion")) {
					min = 150;
					max = 250;
				}else if(type.equals("Elephant")) {
					min = 2000;
					max = 6000;
				}else if(type.equals("Giraffe")) {
					min = 800;
					max = 1200;
				}else if(type.equals("Zebra")) {
					min = 200;
					max = 450;
				}
				
				if(age < 0) {
					JOptionPane.showMessageDialog(Activity.this, "Invalid Input Try Again");
				}
				
				String alertStats = "";
				if(stat.equals("Sick")) {
				    alertStats = "Medical Attention Required";
				}

				String alertCondition = "";
				String alertCondition2 = "";
				String alertCondition3 = "";
				if(quarantine != 0) {
				    alertCondition = "Animal Under Quarantine Monitoring";
				}
				if(weight > max || weight < min) {
				    alertCondition2 = "Weight Outside Normal Range";
				}
				if(vaccinated != 0 && stat.equals("Healthy")) {
				    alertCondition3 = "Animal Cleared for Public Viewing";
				}

				String finalAlert = "";
				if(!alertStats.isBlank())      finalAlert += alertStats + " ";
				if(!alertCondition.isBlank())  finalAlert += alertCondition + " ";
				if(!alertCondition2.isBlank()) finalAlert += alertCondition2 + " ";
				if(!alertCondition3.isBlank()) finalAlert += alertCondition3 + " ";
				if(finalAlert.isBlank())       finalAlert = "None";
				finalAlert = finalAlert.trim();

				if(vaccinated != 0 && quarantine != 0 && specialDiet != 0) {
				    JOptionPane.showMessageDialog(Activity.this, "Animals Name: " + name + "\nAge: " + age + "\nWeight: " + weight + "\nAnimal Type: " + type + "\nHealth Status: " + stat + "\nConditions: Vaccinated, In Quarantine, On Special Diet" + "\nAlerts: " + finalAlert);
				} else if(vaccinated != 0 && quarantine != 0 && specialDiet == 0) {
				    JOptionPane.showMessageDialog(Activity.this, "Animals Name: " + name + "\nAge: " + age + "\nWeight: " + weight + "\nAnimal Type: " + type + "\nHealth Status: " + stat + "\nConditions: Vaccinated, In Quarantine" + "\nAlerts: " + finalAlert);
				} else if(vaccinated != 0 && quarantine == 0 && specialDiet != 0) {
				    JOptionPane.showMessageDialog(Activity.this, "Animals Name: " + name + "\nAge: " + age + "\nWeight: " + weight + "\nAnimal Type: " + type + "\nHealth Status: " + stat + "\nConditions: Vaccinated, On Special Diet" + "\nAlerts: " + finalAlert);
				} else if(vaccinated == 0 && quarantine != 0 && specialDiet != 0) {
				    JOptionPane.showMessageDialog(Activity.this, "Animals Name: " + name + "\nAge: " + age + "\nWeight: " + weight + "\nAnimal Type: " + type + "\nHealth Status: " + stat + "\nConditions: In Quarantine, On Special Diet" + "\nAlerts: " + finalAlert);
				} else if(vaccinated != 0 && quarantine == 0 && specialDiet == 0) {
				    JOptionPane.showMessageDialog(Activity.this, "Animals Name: " + name + "\nAge: " + age + "\nWeight: " + weight + "\nAnimal Type: " + type + "\nHealth Status: " + stat + "\nConditions: Vaccinated" + "\nAlerts: " + finalAlert);
				} else if(vaccinated == 0 && quarantine != 0 && specialDiet == 0) {
				    JOptionPane.showMessageDialog(Activity.this, "Animals Name: " + name + "\nAge: " + age + "\nWeight: " + weight + "\nAnimal Type: " + type + "\nHealth Status: " + stat + "\nConditions: In Quarantine" + "\nAlerts: " + finalAlert);
				} else if(vaccinated == 0 && quarantine == 0 && specialDiet != 0) {
				    JOptionPane.showMessageDialog(Activity.this, "Animals Name: " + name + "\nAge: " + age + "\nWeight: " + weight + "\nAnimal Type: " + type + "\nHealth Status: " + stat + "\nConditions: On Special Diet" + "\nAlerts: " + finalAlert);
				} else {
				    JOptionPane.showMessageDialog(Activity.this, "Animals Name: " + name + "\nAge: " + age + "\nWeight: " + weight + "\nAnimal Type: " + type + "\nHealth Status: " + stat + "\nConditions: None" + "\nAlerts: " + finalAlert);
				}
				
				txtAnimalname.setText("");
				txtAnimalage.setText("");
				txtAnimalWeight.setText("");
				AnimalType.setSelectedIndex(0);
				AnimalCondition.setSelectedIndex(0);
				AnimalSCondition.setSelectedIndex(0);
				
				
			} catch(NumberFormatException num) {
				JOptionPane.showMessageDialog(Activity.this, "Invalid Input Try Again");
			}
		});
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setBounds(293, 280, 114, 23);
		contentPane.add(btnCancel);
		btnCancel.addActionListener(e ->{
			txtAnimalname.setText("");
			txtAnimalage.setText("");
			txtAnimalWeight.setText("");
			AnimalType.setSelectedIndex(0);
			AnimalCondition.setSelectedIndex(0);
			AnimalSCondition.setSelectedIndex(0);
			
		});

	}
}
