package com.bookingsystem.testing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.DropMode;

@SuppressWarnings("serial")
public class LoginForm extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginForm frame = new LoginForm();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	Connection conn;
	PreparedStatement pst;
	ResultSet rs;	
	private JTextField txtUsername;
	private JPasswordField txtPassword;
	
	 public void Connect()
	    {
	        try {
	        	Class.forName("com.mysql.cj.jdbc.Driver");
	            conn = DriverManager.getConnection("jdbc:mysql://localhost/booking_system", "root","root");
	        }
	        catch (ClassNotFoundException ex) 
	        {
	          ex.printStackTrace();
	        }
	        catch (SQLException ex) 
	        
	        {
	        	   ex.printStackTrace();
	        }
	    }

	/**
	 * Create the frame.
	 */
	public LoginForm() {
		setTitle("Login Form");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 710, 500);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(153, 180, 209));
		contentPane.setBackground(new Color(102, 153, 153));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		setResizable(false);
		
		JButton btnLogin = new JButton("LOGIN");
		btnLogin.setBounds(530, 334, 98, 53);
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		
				if (txtUsername == null || txtPassword == null) {
					
					JOptionPane.showMessageDialog(null, "Some fields are empty!");
					
				} else { 
					
					try {
						pst = conn.prepareStatement("SELECT * FROM user WHERE Username=? and Password=?");
						
						pst.setString(1, txtUsername.getText());
						pst.setString(2, (String.valueOf(txtPassword.getPassword())));
					
						rs = pst.executeQuery();
						
						if (rs.next()) {
							
							JOptionPane.showMessageDialog(null, "Login Success!");
							SelectAction selectAction = new SelectAction();
							selectAction.setVisible(true);
							dispose();
							
						} else {
							JOptionPane.showMessageDialog(null, "Incorrect Credentials!");
							txtUsername.setText("");
							txtPassword.setText("");
							return;
						}
						
				} catch (Exception ex) {
					JOptionPane.showMessageDialog(null,ex);
				}
				
			}
				
			}
		});
		btnLogin.setFont(new Font("Arial Black", Font.BOLD, 15));
		btnLogin.setForeground(Color.WHITE);
		btnLogin.setBackground(new Color(128, 0, 0));
		
		btnLogin.grabFocus();
		
		JLabel lblNewLabel_3 = new JLabel("PASSWORD: ");
		lblNewLabel_3.setBounds(59, 373, 164, 23);
		lblNewLabel_3.setForeground(new Color(128, 0, 0));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_3.setFont(new Font("Arial Black", Font.PLAIN, 18));
		
		JLabel lblNewLabel_1 = new JLabel("USERNAME: ");
		lblNewLabel_1.setBounds(59, 325, 164, 23);
		lblNewLabel_1.setForeground(new Color(128, 0, 0));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1.setFont(new Font("Arial Black", Font.BOLD, 18));
		
		txtPassword = new JPasswordField();
		txtPassword.setBounds(226, 371, 260, 32);
		char passwordChar = txtPassword.getEchoChar();
		txtPassword.setEchoChar ((char) 0);
		txtPassword.addFocusListener(new FocusListener() {
			//@Override
			public void focusGained(FocusEvent e) {
				txtPassword.setText("");
				txtPassword.setEchoChar(passwordChar);
			}

			@Override
			public void focusLost(FocusEvent e) {
				// TODO Auto-generated method stub
			}
		});
		txtPassword.setBackground(Color.WHITE);
		txtPassword.setForeground(new Color(0, 100, 0));
		txtPassword.setColumns(10);
		
		txtUsername = new JTextField();
		txtUsername.setBounds(226, 322, 260, 32);
//		txtUsername.addFocusListener(new FocusListener(){
//			public void focusGained(FocusEvent e) {
//				txtUsername.setText("");
//			}
//
//			@Override
//			public void focusLost(FocusEvent e) {
//				// TODO Auto-generated method stub
//				
//			}
//		});
		
		txtUsername.setEnabled(true);
		txtUsername.setEditable(true);
		txtUsername.setDropMode(DropMode.USE_SELECTION);
		txtUsername.setBackground(Color.WHITE);
		txtUsername.setForeground(new Color(0, 100, 0));
		txtUsername.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("COVID-19 TESTING CENTER");
		lblNewLabel.setBounds(138, 10, 546, 60);
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Arial Black", Font.PLAIN, 34));
		
		JLabel lblNewLabel_2 = new JLabel("Booking System");
		lblNewLabel_2.setBounds(138, 65, 428, 31);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2.setFont(new Font("Arial Black", Font.PLAIN, 30));
		lblNewLabel_2.setForeground(Color.WHITE);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setBounds(20, 10, 185, 111);
		lblNewLabel_4.setIcon(new ImageIcon(LoginForm.class.getResource("/photos/1111.jpg")));
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setBounds(10, 11, 684, 449);
		lblNewLabel_5.setIcon(new ImageIcon(LoginForm.class.getResource("/photos/part2.jpg")));
		contentPane.setLayout(null);
		contentPane.add(lblNewLabel_3);
		contentPane.add(lblNewLabel_1);
		contentPane.add(btnLogin);
		contentPane.add(txtPassword);
		contentPane.add(txtUsername);
		contentPane.add(lblNewLabel);
		contentPane.add(lblNewLabel_2);
		contentPane.add(lblNewLabel_4);
		contentPane.add(lblNewLabel_5);
		Connect();
	}
}
