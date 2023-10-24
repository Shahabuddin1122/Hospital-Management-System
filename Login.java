package Pack_1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JPasswordField;

public class Login_page extends JFrame {

	private JPanel contentPane;
	private JPasswordField passwordField;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login_page frame = new Login_page();
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
	public Login_page() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1600, 900);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("E-mail             :");
		lblNewLabel.setBounds(381, 300, 165, 65);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 22));
		contentPane.add(lblNewLabel);
		
		JLabel lblPassword = new JLabel("Password        :");
		lblPassword.setBounds(381, 435, 196, 65);
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 22));
		contentPane.add(lblPassword);
		
		JLabel lblNewLabel_1 = new JLabel("User                 :");
		lblNewLabel_1.setBounds(381, 563, 171, 45);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 22));
		contentPane.add(lblNewLabel_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(582, 552, 228, 56);
		//comboBox.setBackground(new Color(0, 0, 0,0));
		comboBox.setFont(new Font("Tahoma", Font.BOLD, 22));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Patient", "Admin", "Doctor"}));
		contentPane.add(comboBox);
		
		JLabel lblNewLabel_2 = new JLabel("Forget Password?");
		lblNewLabel_2.setBounds(608, 758, 228, 33);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 22));
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setBounds(529, 678, 188, 50);
		lblNewLabel_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				check();
			}
		});
		lblNewLabel_3.setIcon(new ImageIcon(Login_page.class.getResource("/Image/button (1).png")));
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setBounds(738, 672, 204, 56);
		lblNewLabel_4.setIcon(new ImageIcon(Login_page.class.getResource("/Image/button (3).png")));
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setBackground(new Color(0, 0,0));
		lblNewLabel_6.setBounds(608, 11, 165, 200);
		lblNewLabel_6.setIcon(new ImageIcon(Login_page.class.getResource("/Image/ezgif-5-ce32050c19.gif")));
		contentPane.add(lblNewLabel_6);
		
		passwordField = new JPasswordField();
		//passwordField.setBackground(new Color(0, 0, 0,0));
		passwordField.setBounds(582, 433, 432, 67);
		passwordField.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 128, 192)));
		contentPane.add(passwordField);
		
		textField = new JTextField();
		//textField.setBackground(new Color(0, 0, 0,0));
		textField.setBounds(582, 300, 432, 65);
		textField.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 128, 192)));
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Login Form");
		lblNewLabel_5.setBackground(new Color(0, 255, 255));
		lblNewLabel_5.setBounds(618, 204, 165, 65);
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 23));
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setBounds(0, 0, 1600, 900);
		lblNewLabel_7.setIcon(new ImageIcon(Login_page.class.getResource("/Image/vivid-blurred-colorful-wallpaper-background (1).jpg")));
		contentPane.add(lblNewLabel_7);
	}
	public void check() {
		
	}
}
