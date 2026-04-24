import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.border.MatteBorder;
import javax.swing.UIManager;
import javax.swing.border.BevelBorder;
import javax.swing.JProgressBar;
import javax.swing.JScrollBar;
import javax.swing.JSlider;

public class Main extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField Size;

	/**
	 * Launch the application.
	 */
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

	/**
	 * Create the frame.
	 */
	public Main() {
		setResizable(false);
		setTitle("Mang Juan Guppy Collection");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 616, 489);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel BodyPattern = new JPanel();
		BodyPattern.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(216, 240, 142), new Color(255, 255, 128), new Color(0, 64, 0), new Color(0, 128, 64)));
		BodyPattern.setBackground(new Color(253, 163, 81));
		BodyPattern.setForeground(new Color(255, 255, 255));
		BodyPattern.setBounds(10, 11, 310, 415);
		contentPane.add(BodyPattern);
		BodyPattern.setLayout(null);
		
		JLabel Header = new JLabel("Guppy Grader");
		Header.setForeground(new Color(255, 255, 255));
		Header.setFont(new Font("Lucida Bright", Font.BOLD | Font.ITALIC, 20));
		Header.setHorizontalAlignment(SwingConstants.CENTER);
		Header.setBounds(48, 11, 202, 29);
		BodyPattern.add(Header);
		
		JLabel lbl1 = new JLabel("Guppy Size(Cm):");
		lbl1.setFont(new Font("Lucida Bright", Font.PLAIN, 13));
		lbl1.setBounds(10, 54, 119, 14);
		BodyPattern.add(lbl1);
		
		Size = new JTextField();
		Size.setFont(new Font("Lucida Bright", Font.PLAIN, 12));
		Size.setBounds(131, 52, 119, 16);
		BodyPattern.add(Size);
		Size.setColumns(10);
		
		JComboBox Color = new JComboBox();
		Color.setBackground(new Color(216, 240, 142));
		Color.setModel(new DefaultComboBoxModel(new String[] {"Red", "Blue", "Yellow", "Green", "Metallic", "Black"}));
		Color.setFont(new Font("Lucida Bright", Font.PLAIN, 12));
		Color.setBounds(110, 92, 140, 22);
		BodyPattern.add(Color);
		
		JLabel lblBodyColor = new JLabel("Body Color: ");
		lblBodyColor.setFont(new Font("Lucida Bright", Font.PLAIN, 13));
		lblBodyColor.setBounds(10, 95, 85, 14);
		BodyPattern.add(lblBodyColor);
		
		JLabel lblBodyPattern = new JLabel("Body Pattern:");
		lblBodyPattern.setFont(new Font("Lucida Bright", Font.PLAIN, 13));
		lblBodyPattern.setBounds(10, 137, 96, 14);
		BodyPattern.add(lblBodyPattern);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBackground(new Color(216, 240, 142));
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Plain", "Snake Skin", "Lace", "Zebra Pattern"}));
		comboBox_1.setBounds(110, 134, 140, 22);
		BodyPattern.add(comboBox_1);
		
		JLabel lblTailShape = new JLabel("Tail Shape: ");
		lblTailShape.setFont(new Font("Lucida Bright", Font.PLAIN, 13));
		lblTailShape.setBounds(10, 175, 96, 14);
		BodyPattern.add(lblTailShape);
		
		JComboBox TailShape = new JComboBox();
		TailShape.setBackground(new Color(216, 240, 142));
		TailShape.setModel(new DefaultComboBoxModel(new String[] {"Fan Shaped", "Half Moon", "Delta Shaped", "Round"}));
		TailShape.setBounds(110, 172, 140, 22);
		BodyPattern.add(TailShape);
		
		JLabel lblTailShape_1 = new JLabel("Tail Pattern: ");
		lblTailShape_1.setFont(new Font("Lucida Bright", Font.PLAIN, 13));
		lblTailShape_1.setBounds(10, 212, 96, 14);
		BodyPattern.add(lblTailShape_1);
		
		JComboBox TailPattern = new JComboBox();
		TailPattern.setBackground(new Color(216, 240, 142));
		TailPattern.setModel(new DefaultComboBoxModel(new String[] {"Plain", "Mosaic", "Lace"}));
		TailPattern.setBounds(110, 209, 140, 22);
		BodyPattern.add(TailPattern);
		
		textField = new JTextField();
		textField.setBackground(new Color(245, 232, 137));
		
		JButton Submit = new JButton("Submit");
		Submit.setBackground(new Color(216, 240, 142));
		Submit.setFont(new Font("Lucida Bright", Font.PLAIN, 14));
		Submit.setBounds(104, 367, 89, 23);
		BodyPattern.add(Submit);
		
		JLabel lblTailShape_1_1 = new JLabel("Color Consistency: ");
		lblTailShape_1_1.setFont(new Font("Lucida Bright", Font.PLAIN, 13));
		lblTailShape_1_1.setBounds(10, 263, 140, 14);
		BodyPattern.add(lblTailShape_1_1);
		
		JComboBox Rating1 = new JComboBox();
		Rating1.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		Rating1.setBackground(new Color(216, 240, 142));
		Rating1.setBounds(160, 260, 62, 22);
		BodyPattern.add(Rating1);
		
		JLabel lblTailShape_1_1_1 = new JLabel("Pattern Consistency: ");
		lblTailShape_1_1_1.setFont(new Font("Lucida Bright", Font.PLAIN, 13));
		lblTailShape_1_1_1.setBounds(10, 294, 140, 14);
		BodyPattern.add(lblTailShape_1_1_1);
		
		JLabel lblTailShape_1_1_1_1 = new JLabel("Body Form:");
		lblTailShape_1_1_1_1.setFont(new Font("Lucida Bright", Font.PLAIN, 13));
		lblTailShape_1_1_1_1.setBounds(10, 326, 140, 14);
		BodyPattern.add(lblTailShape_1_1_1_1);
		
		JComboBox Rating2 = new JComboBox();
		Rating2.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		Rating2.setBackground(new Color(216, 240, 142));
		Rating2.setBounds(160, 291, 62, 22);
		BodyPattern.add(Rating2);
		
		JComboBox Rating3 = new JComboBox();
		Rating3.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		Rating3.setBackground(new Color(216, 240, 142));
		Rating3.setBounds(160, 323, 62, 22);
		BodyPattern.add(Rating3);
		textField.setEditable(false);
		textField.setFont(new Font("Lucida Bright", Font.PLAIN, 12));
		textField.setBounds(330, 42, 260, 384);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("OVERALL");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Lucida Bright", Font.BOLD | Font.ITALIC, 17));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(361, 11, 204, 28);
		contentPane.add(lblNewLabel);

	}
}
