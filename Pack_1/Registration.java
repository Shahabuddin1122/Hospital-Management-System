package Pack_1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTabbedPane;
import javax.swing.border.MatteBorder;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Registration_patients extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JPasswordField passwordField_1;
	private JTextField textField_5;
	private JTextField textField_7;
	private JTextField textField_6;
	private JTextField textField_8;
	private JPasswordField passwordField_2;
	private JTextField textField_9;
	private JTextField textField_10;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registration_patients frame = new Registration_patients();
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
	public Registration_patients() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1600, 900);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 128, 128));
		panel.setBounds(0, 0, 325, 863);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Registration_patients.class.getResource("/Image/output-onlinegiftools.gif")));
		lblNewLabel.setBounds(62, 103, 174, 180);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Registration as......");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 29));
		lblNewLabel_1.setBounds(25, 328, 252, 47);
		panel.add(lblNewLabel_1);
		
		final JComboBox comboBox = new JComboBox();
		
		comboBox.setForeground(new Color(0, 128, 128));
		comboBox.setFont(new Font("Tahoma", Font.BOLD, 26));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Patients", "Admin", "Doctor"}));
		comboBox.setBounds(35, 390, 235, 35);
		panel.add(comboBox);
		
		final JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(323, -23, 1263, 886);
		contentPane.add(tabbedPane);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		tabbedPane.addTab("New tab", null, panel_1, null);
		panel_1.setLayout(null);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 128, 128)));
		panel_4.setBounds(667, 24, 562, 823);
		panel_1.add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Name         :");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_2.setBounds(10, 99, 161, 45);
		panel_4.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 128, 128)));
		textField.setBounds(180, 99, 314, 51);
		panel_4.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 128, 128)));
		passwordField.setBounds(180, 611, 314, 51);
		panel_4.add(passwordField);
		
		JLabel lblNewLabel_2_1 = new JLabel("E-mail        :");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_2_1.setBounds(10, 195, 161, 45);
		panel_4.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Address      :");
		lblNewLabel_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_2_1_1.setBounds(10, 287, 161, 45);
		panel_4.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("Birthday     :");
		lblNewLabel_2_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_2_1_1_1.setBounds(10, 370, 161, 45);
		panel_4.add(lblNewLabel_2_1_1_1);
		
		JLabel lblNewLabel_2_1_1_1_1 = new JLabel("Gender       :");
		lblNewLabel_2_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_2_1_1_1_1.setBounds(10, 444, 161, 45);
		panel_4.add(lblNewLabel_2_1_1_1_1);
		
		JLabel lblNewLabel_2_1_1_1_1_1 = new JLabel("Password  :");
		lblNewLabel_2_1_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_2_1_1_1_1_1.setBounds(10, 611, 161, 45);
		panel_4.add(lblNewLabel_2_1_1_1_1_1);
		
		JLabel lblNewLabel_2_1_1_1_1_1_1 = new JLabel("Number     :");
		lblNewLabel_2_1_1_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_2_1_1_1_1_1_1.setBounds(10, 532, 161, 45);
		panel_4.add(lblNewLabel_2_1_1_1_1_1_1);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Male");
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		rdbtnNewRadioButton.setBounds(180, 457, 85, 23);
		panel_4.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnFemale = new JRadioButton("Female");
		buttonGroup.add(rdbtnFemale);
		rdbtnFemale.setFont(new Font("Tahoma", Font.BOLD, 20));
		rdbtnFemale.setBounds(267, 457, 106, 23);
		panel_4.add(rdbtnFemale);
		
		JRadioButton rdbtnNewRadioButton_1_1 = new JRadioButton("Others");
		buttonGroup.add(rdbtnNewRadioButton_1_1);
		rdbtnNewRadioButton_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		rdbtnNewRadioButton_1_1.setBounds(388, 457, 93, 23);
		panel_4.add(rdbtnNewRadioButton_1_1);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		comboBox_1.setBounds(180, 387, 61, 28);
		panel_4.add(comboBox_1);
		
		JComboBox comboBox_1_1 = new JComboBox();
		comboBox_1_1.setFont(new Font("Tahoma", Font.BOLD, 19));
		comboBox_1_1.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"}));
		comboBox_1_1.setBounds(288, 387, 55, 28);
		panel_4.add(comboBox_1_1);
		
		JComboBox comboBox_1_1_1 = new JComboBox();
		comboBox_1_1_1.setModel(new DefaultComboBoxModel(new String[] {"2023", "2022", "2021", "2020", "2019", "2018", "2017", "2016", "2015", "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000"}));
		comboBox_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 19));
		comboBox_1_1_1.setBounds(376, 387, 85, 28);
		panel_4.add(comboBox_1_1_1);
		
		JLabel lblNewLabel_3 = new JLabel("Registration Form");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_3.setBounds(142, 24, 231, 45);
		panel_4.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon(Registration_patients.class.getResource("/Image/button (4).png")));
		lblNewLabel_4.setBounds(149, 735, 280, 62);
		panel_4.add(lblNewLabel_4);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 128, 128)));
		textField_1.setBounds(180, 195, 314, 51);
		panel_4.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 128, 128)));
		textField_2.setBounds(180, 287, 314, 51);
		panel_4.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 128, 128)));
		textField_3.setBounds(180, 532, 314, 51);
		panel_4.add(textField_3);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon(Registration_patients.class.getResource("/Image/My project (1).png")));
		lblNewLabel_5.setBounds(0, 0, 1248, 858);
		panel_1.add(lblNewLabel_5);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("New tab", null, panel_2, null);
		panel_2.setLayout(null);
		
		JPanel panel_4_1 = new JPanel();
		panel_4_1.setLayout(null);
		panel_4_1.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 128, 128)));
		panel_4_1.setBounds(686, 11, 562, 823);
		panel_2.add(panel_4_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("Name         :");
		lblNewLabel_2_2.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_2_2.setBounds(10, 99, 161, 45);
		panel_4_1.add(lblNewLabel_2_2);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 128, 128)));
		textField_4.setBounds(180, 99, 314, 51);
		panel_4_1.add(textField_4);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 128, 128)));
		passwordField_1.setBounds(180, 611, 314, 51);
		panel_4_1.add(passwordField_1);
		
		JLabel lblNewLabel_2_1_2 = new JLabel("E-mail        :");
		lblNewLabel_2_1_2.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_2_1_2.setBounds(10, 195, 161, 45);
		panel_4_1.add(lblNewLabel_2_1_2);
		
		JLabel lblNewLabel_2_1_1_2 = new JLabel("Dept          :");
		lblNewLabel_2_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_2_1_1_2.setBounds(10, 287, 161, 45);
		panel_4_1.add(lblNewLabel_2_1_1_2);
		
		JLabel lblNewLabel_2_1_1_1_2 = new JLabel("Birthday     :");
		lblNewLabel_2_1_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_2_1_1_1_2.setBounds(10, 370, 161, 45);
		panel_4_1.add(lblNewLabel_2_1_1_1_2);
		
		JLabel lblNewLabel_2_1_1_1_1_2 = new JLabel("Gender       :");
		lblNewLabel_2_1_1_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_2_1_1_1_1_2.setBounds(10, 444, 161, 45);
		panel_4_1.add(lblNewLabel_2_1_1_1_1_2);
		
		JLabel lblNewLabel_2_1_1_1_1_1_2 = new JLabel("Password  :");
		lblNewLabel_2_1_1_1_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_2_1_1_1_1_1_2.setBounds(10, 611, 161, 45);
		panel_4_1.add(lblNewLabel_2_1_1_1_1_1_2);
		
		JLabel lblNewLabel_2_1_1_1_1_1_1_1 = new JLabel("Number     :");
		lblNewLabel_2_1_1_1_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_2_1_1_1_1_1_1_1.setBounds(10, 532, 161, 45);
		panel_4_1.add(lblNewLabel_2_1_1_1_1_1_1_1);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Male");
		rdbtnNewRadioButton_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		rdbtnNewRadioButton_1.setBounds(180, 457, 85, 23);
		panel_4_1.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnFemale_1 = new JRadioButton("Female");
		rdbtnFemale_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		rdbtnFemale_1.setBounds(267, 457, 106, 23);
		panel_4_1.add(rdbtnFemale_1);
		
		JRadioButton rdbtnNewRadioButton_1_1_1 = new JRadioButton("Others");
		rdbtnNewRadioButton_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		rdbtnNewRadioButton_1_1_1.setBounds(388, 457, 93, 23);
		panel_4_1.add(rdbtnNewRadioButton_1_1_1);
		
		JComboBox comboBox_1_2 = new JComboBox();
		comboBox_1_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		comboBox_1_2.setBounds(180, 387, 61, 28);
		panel_4_1.add(comboBox_1_2);
		
		JComboBox comboBox_1_1_2 = new JComboBox();
		comboBox_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 19));
		comboBox_1_1_2.setBounds(288, 387, 55, 28);
		panel_4_1.add(comboBox_1_1_2);
		
		JComboBox comboBox_1_1_1_1 = new JComboBox();
		comboBox_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 19));
		comboBox_1_1_1_1.setBounds(376, 387, 85, 28);
		panel_4_1.add(comboBox_1_1_1_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("Registration Form");
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_3_1.setBounds(142, 24, 231, 45);
		panel_4_1.add(lblNewLabel_3_1);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 128, 128)));
		textField_5.setBounds(180, 195, 314, 51);
		panel_4_1.add(textField_5);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 128, 128)));
		textField_7.setBounds(180, 532, 314, 51);
		panel_4_1.add(textField_7);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setFont(new Font("Tahoma", Font.BOLD, 23));
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"Cardiologists", "Medicine", "Dermatologists", "Physicians", "Nephrologists", "Gynecologists", "Pathologists", "Plastic Surgeons", "Neurologists", "Ophthalmologists", "Osteopaths"}));
		comboBox_2.setBounds(180, 287, 303, 45);
		panel_4_1.add(comboBox_2);
		
		JLabel lblNewLabel_6 = new JLabel("CV  Link         :");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblNewLabel_6.setBounds(10, 687, 161, 36);
		panel_4_1.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setIcon(new ImageIcon(Registration_patients.class.getResource("/Image/button (4).png")));
		lblNewLabel_7.setBounds(172, 761, 212, 51);
		panel_4_1.add(lblNewLabel_7);
		
		textField_6 = new JTextField();
		textField_6.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 128, 128)));
		textField_6.setBounds(180, 684, 314, 51);
		panel_4_1.add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("");
		lblNewLabel_8.setIcon(new ImageIcon(Registration_patients.class.getResource("/Image/26835-removebg-preview.png")));
		lblNewLabel_8.setBounds(89, 0, 1511, 858);
		panel_2.add(lblNewLabel_8);
		
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("New tab", null, panel_3, null);
		panel_3.setLayout(null);
		
		JPanel panel_4_1_1 = new JPanel();
		panel_4_1_1.setLayout(null);
		panel_4_1_1.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 128, 128)));
		panel_4_1_1.setBounds(686, 11, 562, 823);
		panel_3.add(panel_4_1_1);
		
		JLabel lblNewLabel_2_2_1 = new JLabel("Name         :");
		lblNewLabel_2_2_1.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_2_2_1.setBounds(10, 99, 161, 45);
		panel_4_1_1.add(lblNewLabel_2_2_1);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 128, 128)));
		textField_8.setBounds(180, 99, 314, 51);
		panel_4_1_1.add(textField_8);
		
		passwordField_2 = new JPasswordField();
		passwordField_2.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 128, 128)));
		passwordField_2.setBounds(180, 523, 314, 51);
		panel_4_1_1.add(passwordField_2);
		
		JLabel lblNewLabel_2_1_2_1 = new JLabel("E-mail        :");
		lblNewLabel_2_1_2_1.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_2_1_2_1.setBounds(10, 195, 161, 45);
		panel_4_1_1.add(lblNewLabel_2_1_2_1);
		
		JLabel lblNewLabel_2_1_1_1_2_1 = new JLabel("Birthday     :");
		lblNewLabel_2_1_1_1_2_1.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_2_1_1_1_2_1.setBounds(10, 283, 161, 45);
		panel_4_1_1.add(lblNewLabel_2_1_1_1_2_1);
		
		JLabel lblNewLabel_2_1_1_1_1_2_1 = new JLabel("Gender       :");
		lblNewLabel_2_1_1_1_1_2_1.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_2_1_1_1_1_2_1.setBounds(10, 357, 161, 45);
		panel_4_1_1.add(lblNewLabel_2_1_1_1_1_2_1);
		
		JLabel lblNewLabel_2_1_1_1_1_1_2_1 = new JLabel("Password  :");
		lblNewLabel_2_1_1_1_1_1_2_1.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_2_1_1_1_1_1_2_1.setBounds(10, 524, 161, 45);
		panel_4_1_1.add(lblNewLabel_2_1_1_1_1_1_2_1);
		
		JLabel lblNewLabel_2_1_1_1_1_1_1_1_1 = new JLabel("Number     :");
		lblNewLabel_2_1_1_1_1_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_2_1_1_1_1_1_1_1_1.setBounds(10, 445, 161, 45);
		panel_4_1_1.add(lblNewLabel_2_1_1_1_1_1_1_1_1);
		
		JRadioButton rdbtnNewRadioButton_1_2 = new JRadioButton("Male");
		rdbtnNewRadioButton_1_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		rdbtnNewRadioButton_1_2.setBounds(180, 369, 85, 23);
		panel_4_1_1.add(rdbtnNewRadioButton_1_2);
		
		JRadioButton rdbtnFemale_1_1 = new JRadioButton("Female");
		rdbtnFemale_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		rdbtnFemale_1_1.setBounds(267, 369, 106, 23);
		panel_4_1_1.add(rdbtnFemale_1_1);
		
		JRadioButton rdbtnNewRadioButton_1_1_1_1 = new JRadioButton("Others");
		rdbtnNewRadioButton_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		rdbtnNewRadioButton_1_1_1_1.setBounds(388, 369, 93, 23);
		panel_4_1_1.add(rdbtnNewRadioButton_1_1_1_1);
		
		JComboBox comboBox_1_2_1 = new JComboBox();
		comboBox_1_2_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		comboBox_1_2_1.setBounds(180, 300, 61, 28);
		panel_4_1_1.add(comboBox_1_2_1);
		
		JComboBox comboBox_1_1_2_1 = new JComboBox();
		comboBox_1_1_2_1.setFont(new Font("Tahoma", Font.BOLD, 19));
		comboBox_1_1_2_1.setBounds(288, 300, 55, 28);
		panel_4_1_1.add(comboBox_1_1_2_1);
		
		JComboBox comboBox_1_1_1_1_1 = new JComboBox();
		comboBox_1_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 19));
		comboBox_1_1_1_1_1.setBounds(376, 300, 85, 28);
		panel_4_1_1.add(comboBox_1_1_1_1_1);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("Registration Form");
		lblNewLabel_3_1_1.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_3_1_1.setBounds(142, 24, 231, 45);
		panel_4_1_1.add(lblNewLabel_3_1_1);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 128, 128)));
		textField_9.setBounds(180, 195, 314, 51);
		panel_4_1_1.add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 128, 128)));
		textField_10.setBounds(180, 444, 314, 51);
		panel_4_1_1.add(textField_10);
		
		JLabel lblNewLabel_7_1 = new JLabel("");
		lblNewLabel_7_1.setIcon(new ImageIcon(Registration_patients.class.getResource("/Image/button (4).png")));
		lblNewLabel_7_1.setBounds(180, 708, 212, 51);
		panel_4_1_1.add(lblNewLabel_7_1);
		
		JLabel lblNewLabel_9 = new JLabel("");
		lblNewLabel_9.setIcon(new ImageIcon(Registration_patients.class.getResource("/Image/26835-removebg-preview.png")));
		lblNewLabel_9.setBounds(0, 0, 1248, 847);
		panel_3.add(lblNewLabel_9);
	
	
	
	comboBox.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			String s =comboBox.getSelectedItem().toString();
			if(s=="Doctor") {
				tabbedPane.setSelectedIndex(1);
			}
			else if(s=="Admin") {
				tabbedPane.setSelectedIndex(2);				}
			else {
				tabbedPane.setSelectedIndex(0);
			}
			
		}
	});
	
	}
}