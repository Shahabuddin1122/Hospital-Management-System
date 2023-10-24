package Pack_1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JTabbedPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Home extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
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
	public Home() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1600, 900);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 128, 128));
		panel.setBounds(10, 11, 344, 841);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();

		panel_1.setBackground(new Color(29, 190, 182));
		panel_1.setBounds(0, 204, 344, 58);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Home");
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 24));
		lblNewLabel_1.setBounds(78, 0, 192, 58);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(Home.class.getResource("/Image/icons8-hospital-64.png")));
		lblNewLabel_2.setBounds(0, 0, 68, 58);
		panel_1.add(lblNewLabel_2);
		
		JPanel panel_1_1 = new JPanel();

		panel_1_1.setBackground(new Color(29, 190, 182));
		panel_1_1.setBounds(0, 397, 344, 58);
		panel.add(panel_1_1);
		panel_1_1.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(Home.class.getResource("/Image/rsz_icons8-appointment-64.png")));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_3.setBounds(0, 0, 62, 58);
		panel_1_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Appointment");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_4.setBounds(78, 0, 183, 58);
		panel_1_1.add(lblNewLabel_4);
		
		JPanel panel_1_1_1_1 = new JPanel();

		panel_1_1_1_1.setBackground(new Color(29, 190, 182));
		panel_1_1_1_1.setBounds(0, 488, 344, 58);
		panel.add(panel_1_1_1_1);
		panel_1_1_1_1.setLayout(null);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("");
		lblNewLabel_3_1_1.setIcon(new ImageIcon(Home.class.getResource("/Image/rsz_bill.png")));
		lblNewLabel_3_1_1.setBounds(0, 0, 71, 58);
		panel_1_1_1_1.add(lblNewLabel_3_1_1);
		
		JLabel lblNewLabel_4_1_1 = new JLabel("Bill History");
		lblNewLabel_4_1_1.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_4_1_1.setBounds(81, 0, 183, 58);
		panel_1_1_1_1.add(lblNewLabel_4_1_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Home.class.getResource("/Image/resized.png")));
		lblNewLabel.setBounds(66, 24, 174, 158);
		panel.add(lblNewLabel);
		
		JPanel panel_1_1_1 = new JPanel();

		panel_1_1_1.setLayout(null);
		panel_1_1_1.setBackground(new Color(29, 190, 182));
		panel_1_1_1.setBounds(0, 307, 344, 58);
		panel.add(panel_1_1_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("");
		lblNewLabel_3_1.setIcon(new ImageIcon(Home.class.getResource("/Image/1564534_customer_man_user_account_profile_icon (1).png")));
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_3_1.setBounds(0, 0, 62, 58);
		panel_1_1_1.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_4_1 = new JLabel("Profile");
		lblNewLabel_4_1.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel_4_1.setBounds(72, 0, 183, 58);
		panel_1_1_1.add(lblNewLabel_4_1);
		
		JPanel panel_1_1_1_1_1 = new JPanel();

		panel_1_1_1_1_1.setLayout(null);
		panel_1_1_1_1_1.setBackground(new Color(29, 190, 182));
		panel_1_1_1_1_1.setBounds(0, 586, 344, 58);
		panel.add(panel_1_1_1_1_1);
		
		JLabel lblNewLabel_3_1_1_1 = new JLabel("");
		lblNewLabel_3_1_1_1.setIcon(new ImageIcon(Home.class.getResource("/Image/rsz_booking.png")));
		lblNewLabel_3_1_1_1.setBounds(0, 0, 71, 58);
		panel_1_1_1_1_1.add(lblNewLabel_3_1_1_1);
		
		JLabel lblNewLabel_4_1_1_1 = new JLabel("Booking");
		lblNewLabel_4_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_4_1_1_1.setBounds(81, 0, 183, 58);
		panel_1_1_1_1_1.add(lblNewLabel_4_1_1_1);
		
		JLabel lblNewLabel_5 = new JLabel("@ right reserved");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_5.setBounds(79, 789, 174, 28);
		panel.add(lblNewLabel_5);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(0, 255, 255));
		panel_2.setBounds(356, 11, 1220, 155);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JButton btnNewButton = new JButton("Log in");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login_page frame = new Login_page();
				frame.setVisible(true);
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 21));
		btnNewButton.setBounds(955, 118, 121, 37);
		panel_2.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Register");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Registration_patients frame = new Registration_patients();
				frame.setVisible(true);
				
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_1.setBounds(1086, 118, 124, 37);
		panel_2.add(btnNewButton_1);
		
		JLabel lblNewLabel_6 = new JLabel("UNITED HOSPITAL");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_6.setBounds(471, 11, 286, 52);
		panel_2.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Telemedicine");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_7.setBounds(57, 74, 155, 37);
		panel_2.add(lblNewLabel_7);
		
		JLabel lblNewLabel_7_1 = new JLabel("Hot Line-02-564644");
		lblNewLabel_7_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_7_1.setBounds(222, 74, 203, 37);
		panel_2.add(lblNewLabel_7_1);
		
		JLabel lblNewLabel_7_1_1 = new JLabel("Appointment Hot Line-02-564644");
		lblNewLabel_7_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_7_1_1.setBounds(751, 74, 358, 37);
		panel_2.add(lblNewLabel_7_1_1);
		
		JLabel lblNewLabel_7_1_1_1 = new JLabel("Emergeny : 02-644578");
		lblNewLabel_7_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_7_1_1_1.setBounds(471, 74, 238, 37);
		panel_2.add(lblNewLabel_7_1_1_1);
		
		final JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(356, 138, 1220, 714);
		contentPane.add(tabbedPane);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(255, 128, 0));
		tabbedPane.addTab("New tab", null, panel_3, null);
		panel_3.setLayout(null);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(0, 64, 128));
		tabbedPane.addTab("New tab", null, panel_4, null);
		panel_4.setLayout(null);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(255, 0, 0));
		tabbedPane.addTab("New tab", null, panel_5, null);
		panel_5.setLayout(null);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(new Color(0, 255, 64));
		tabbedPane.addTab("New tab", null, panel_6, null);
		panel_6.setLayout(null);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBackground(new Color(0, 0, 0));
		tabbedPane.addTab("New tab", null, panel_7, null);
		panel_7.setLayout(null);
		panel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				tabbedPane.setSelectedIndex(0);
			}

		});
		panel_1_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				tabbedPane.setSelectedIndex(1);
			}
		});
		panel_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				tabbedPane.setSelectedIndex(2);
			}
		});
		panel_1_1_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				tabbedPane.setSelectedIndex(3);
			}
		});
		panel_1_1_1_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				tabbedPane.setSelectedIndex(4);
			}
		});
		
	}
}
