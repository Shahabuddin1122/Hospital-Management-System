package Pack_1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTabbedPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;

public class Home_Doctor extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home_Doctor frame = new Home_Doctor();
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
	public Home_Doctor() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1600, 900);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 255, 255));
		panel.setBounds(336, 0, 1250, 166);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_10 = new JLabel("");
		lblNewLabel_10.setBounds(0, 127, 1250, 725);
		panel.add(lblNewLabel_10);
		
		JLabel lblNewLabel_9 = new JLabel("");
		lblNewLabel_9.setIcon(new ImageIcon(Home_Doctor.class.getResource("/Image/25604.jpg")));
		lblNewLabel_9.setBounds(-14, 127, 1254, 734);
		panel.add(lblNewLabel_9);
		
		JLabel lblNewLabel_11 = new JLabel("New label");
		lblNewLabel_11.setBounds(0, 127, 1240, 725);
		panel.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("");
		lblNewLabel_12.setBounds(-4, 127, 1244, 734);
		panel.add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("New label");
		lblNewLabel_13.setIcon(new ImageIcon(Home_Doctor.class.getResource("/Image/25604.jpg")));
		lblNewLabel_13.setBounds(10, 142, 1240, 710);
		panel.add(lblNewLabel_13);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 128, 128));
		panel_1.setBounds(0, 0, 337, 863);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Home_Doctor.class.getResource("/Image/resized.png")));
		lblNewLabel.setBounds(58, 51, 174, 163);
		panel_1.add(lblNewLabel);
		
		JPanel panel_2 = new JPanel();
		
		panel_2.setBackground(new Color(128, 255, 255));
		panel_2.setBounds(0, 284, 337, 65);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Home");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblNewLabel_1.setBounds(85, 11, 208, 54);
		panel_2.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(Home_Doctor.class.getResource("/Image/icons8-hospital-64.png")));
		lblNewLabel_2.setBounds(10, 11, 65, 54);
		panel_2.add(lblNewLabel_2);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setBackground(new Color(128, 255, 255));
		panel_2_1.setLayout(null);
		panel_2_1.setBounds(0, 397, 337, 65);
		panel_1.add(panel_2_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Profile");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblNewLabel_1_1.setBounds(85, 11, 229, 54);
		panel_2_1.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("");
		lblNewLabel_2_1.setIcon(new ImageIcon(Home_Doctor.class.getResource("/Image/1564534_customer_man_user_account_profile_icon (1).png")));
		lblNewLabel_2_1.setBounds(10, 11, 65, 54);
		panel_2_1.add(lblNewLabel_2_1);
		
		JPanel panel_2_2 = new JPanel();
		panel_2_2.setBackground(new Color(128, 255, 255));
		panel_2_2.setLayout(null);
		panel_2_2.setBounds(0, 504, 337, 65);
		panel_1.add(panel_2_2);
		
		JLabel lblNewLabel_1_2 = new JLabel("Scedules Check");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblNewLabel_1_2.setBounds(83, 11, 229, 54);
		panel_2_2.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_2_2 = new JLabel("");
		lblNewLabel_2_2.setIcon(new ImageIcon(Home_Doctor.class.getResource("/Image/icons8-view-schedule-50.png")));
		lblNewLabel_2_2.setBounds(10, 11, 63, 54);
		panel_2_2.add(lblNewLabel_2_2);
		
		JPanel panel_2_3 = new JPanel();
		panel_2_3.setBackground(new Color(128, 255, 255));
		panel_2_3.setLayout(null);
		panel_2_3.setBounds(0, 606, 337, 65);
		panel_1.add(panel_2_3);
		
		JLabel lblNewLabel_1_3 = new JLabel("Payment");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblNewLabel_1_3.setBounds(75, 11, 229, 54);
		panel_2_3.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_2_3 = new JLabel("");
		lblNewLabel_2_3.setIcon(new ImageIcon(Home_Doctor.class.getResource("/Image/icons8-card-payment-80.png")));
		lblNewLabel_2_3.setBounds(0, 11, 65, 54);
		panel_2_3.add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_3 = new JLabel("@ right reseved");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 23));
		lblNewLabel_3.setBounds(29, 811, 203, 29);
		panel_1.add(lblNewLabel_3);
		
		final JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(336, 108, 1250, 755);
		contentPane.add(tabbedPane);
		
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("New tab", null, panel_3, null);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_8 = new JLabel("Feel better about your Health care");
		lblNewLabel_8.setForeground(new Color(255, 255, 255));
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 35));
		lblNewLabel_8.setBounds(260, 75, 629, 84);
		panel_3.add(lblNewLabel_8);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon(Home_Doctor.class.getResource("/Image/blue.jpg")));
		lblNewLabel_4.setBounds(0, 0, 1245, 756);
		panel_3.add(lblNewLabel_4);
		
		JPanel panel_4 = new JPanel();
		tabbedPane.addTab("New tab", null, panel_4, null);
		panel_4.setLayout(null);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBackground(new Color(1.0f,1.0f,1.0f,0.5f));
		panel_7.setBounds(197, 11, 836, 745);
		panel_4.add(panel_7);
		panel_7.setLayout(null);
		
		JLabel lblNewLabel_6 = new JLabel("Profile");
		lblNewLabel_6.setForeground(new Color(0, 128, 64));
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 44));
		lblNewLabel_6.setBounds(281, 36, 170, 72);
		panel_7.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setIcon(new ImageIcon(Home_Doctor.class.getResource("/Image/icons8-male-user-96.png")));
		lblNewLabel_7.setBounds(262, 119, 189, 192);
		panel_7.add(lblNewLabel_7);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon(Home_Doctor.class.getResource("/Image/green.jpg")));
		lblNewLabel_5.setBounds(0, 0, 1245, 756);
		panel_4.add(lblNewLabel_5);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(255, 255, 255));
		tabbedPane.addTab("New tab", null, panel_5, null);
		panel_5.setLayout(null);
		
		JLabel lblNewLabel_14 = new JLabel("");
		lblNewLabel_14.setIcon(new ImageIcon(Home_Doctor.class.getResource("/Image/25604.jpg")));
		lblNewLabel_14.setBounds(0, 11, 1245, 716);
		panel_5.add(lblNewLabel_14);
		
		JPanel panel_8 = new JPanel();
		panel_8.setLayout(null);
		panel_8.setBackground(new Color(255, 255, 255, 128));
		panel_8.setBounds(295, 11, 682, 716);
		panel_5.add(panel_8);
		
		JLabel lblNewLabel_15 = new JLabel("Scedules  Check");
		lblNewLabel_15.setFont(new Font("Tahoma", Font.BOLD, 28));
		lblNewLabel_15.setBounds(211, 57, 257, 84);
		panel_8.add(lblNewLabel_15);
		
		JLabel lblNewLabel_16 = new JLabel("Date       :");
		lblNewLabel_16.setFont(new Font("Tahoma", Font.BOLD, 23));
		lblNewLabel_16.setBounds(87, 154, 124, 49);
		panel_8.add(lblNewLabel_16);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.BOLD, 18));
		comboBox.setBounds(221, 152, 85, 40);
		panel_8.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		comboBox_1.setBounds(343, 152, 85, 40);
		panel_8.add(comboBox_1);
		
		JComboBox comboBox_1_1 = new JComboBox();
		comboBox_1_1.setFont(new Font("Tahoma", Font.BOLD, 19));
		comboBox_1_1.setBounds(478, 154, 104, 40);
		panel_8.add(comboBox_1_1);
		
		JLabel lblNewLabel_16_1 = new JLabel("Time     :");
		lblNewLabel_16_1.setFont(new Font("Tahoma", Font.BOLD, 23));
		lblNewLabel_16_1.setBounds(87, 240, 124, 49);
		panel_8.add(lblNewLabel_16_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		comboBox_2.setBounds(221, 238, 124, 40);
		panel_8.add(comboBox_2);
		
		JPanel panel_6 = new JPanel();
		tabbedPane.addTab("New tab", null, panel_6, null);
		panel_6.setLayout(null);
		panel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				tabbedPane.setSelectedIndex(0);
			}
		});
		panel_2_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				tabbedPane.setSelectedIndex(1);
			}
		});
		panel_2_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				tabbedPane.setSelectedIndex(2);
			}
		});
		panel_2_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				tabbedPane.setSelectedIndex(3);
			}
		});
	}
}