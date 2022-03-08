package com.bookingsystem.testing;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JTextPane;


@SuppressWarnings("serial")
public class CancelBooking extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextPane textPane;

	/**
	 * Launch the application.
	 */

	Connection conn;
	PreparedStatement pst;
	ResultSet rs;
	
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
	public CancelBooking() {
		setForeground(Color.BLACK);
		setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		setTitle("Cancel Booking");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 500);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(47, 79, 79));
		
		JButton btnBookNewPatient = new JButton("Book New Patient");
		btnBookNewPatient.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//To show/select New Booking Jframe
				BookNewPatient booknew = new BookNewPatient();
				booknew.setVisible(true);
				dispose(); //To close current Jframe
			}
		});
		btnBookNewPatient.setFont(new Font("Sitka Text", Font.BOLD, 16));
		btnBookNewPatient.setBackground(new Color(240, 248, 255));

		JButton btnRescheduleBooking = new JButton("Reschedule Booking");
		btnRescheduleBooking.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//To show/select Reschedule Book Jframe
				RescheduleBooking reschedbook = new RescheduleBooking();
				reschedbook.setVisible(true);
				dispose(); //To close current Jframe
			}
		});
		btnRescheduleBooking.setFont(new Font("Sitka Text", Font.BOLD, 16));
		btnRescheduleBooking.setBackground(new Color(240, 248, 255));
		
		JButton btnViewAllRecords = new JButton("View All Records");
		btnViewAllRecords.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//To show/select View All Records Jframe
				ViewAllRecords viewall = new ViewAllRecords();
				viewall.setVisible(true);
				dispose(); //To close current Jframe
			}
		});
		btnViewAllRecords.setFont(new Font("Sitka Text", Font.BOLD, 16));
		btnViewAllRecords.setBackground(new Color(240, 248, 255));
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LoginForm loginForm = new LoginForm();
				loginForm.setVisible(true);
				dispose();
			}
		});
		btnLogout.setFont(new Font("Sitka Text", Font.BOLD, 16));
		btnLogout.setBackground(new Color(240, 248, 255));
		
		JLabel lblNewLabel = new JLabel("Cancel Booking");
		lblNewLabel.setFont(new Font("Sitka Heading", Font.BOLD, 48));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		JPanel panel_1 = new JPanel();
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(panel, GroupLayout.DEFAULT_SIZE, 769, Short.MAX_VALUE)
						.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 769, Short.MAX_VALUE))
					.addGap(5))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 754, Short.MAX_VALUE)
					.addContainerGap())
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel_2, GroupLayout.DEFAULT_SIZE, 754, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addComponent(lblNewLabel)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
					.addGap(7))
		);
		
		JLabel lblNewLabel_1 = new JLabel("ID Number");
		lblNewLabel_1.setFont(new Font("Sitka Text", Font.BOLD, 16));
		
		textField = new JTextField();
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Reason for Cancelling");
		lblNewLabel_2.setFont(new Font("Sitka Text", Font.BOLD, 16));
		
		JButton btnResetButton = new JButton("Reset");
		btnResetButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
	            textPane.setText("");
			}
		});
		btnResetButton.setBackground(new Color(255, 218, 185));
		btnResetButton.setFont(new Font("Tahoma", Font.BOLD, 17));
		
		JButton btnSaveButton = new JButton("Save");
		btnSaveButton.addActionListener(new ActionListener() {
			@SuppressWarnings("unused")
			public void actionPerformed(ActionEvent e) {
				String reason_cancel;
				int id;
				
				int answer = JOptionPane.showConfirmDialog(null, "Are you sure you want to cancel?");
				if (answer == JOptionPane.YES_OPTION) {
					id = Integer.parseInt(textField.getText());
					reason_cancel = textPane.getText();
					
					try {
						pst = conn.prepareStatement("SELECT first_name, middle_name,last_name,age,email,contact FROM book where ID = ?");
						pst.setInt(1, id);
		                ResultSet rs = pst.executeQuery();
		                
		                if(rs.next() != true) {
		                	System.out.println("User not found!");
		                	JOptionPane.showMessageDialog(null, "User not found!");
		                }else {
		                	pst = conn.prepareStatement("DELETE FROM book WHERE ID =?");
		                	pst.setInt(1, id);
				            pst.executeUpdate();
				            JOptionPane.showMessageDialog(null, "Record has been Deleted!");
				            
				            textField.setText("");
				            textPane.setText("");
		                }
		                
					}catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}else {
					
				}
				
			}
		});
		
		btnSaveButton.setBackground(new Color(0, 250, 154));
		btnSaveButton.setFont(new Font("Tahoma", Font.BOLD, 17));
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel_2.createSequentialGroup()
					.addGap(288)
					.addComponent(btnResetButton, GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
					.addGap(5)
					.addComponent(btnSaveButton, GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
					.addGap(276))
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGap(5)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addComponent(btnResetButton, GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
						.addComponent(btnSaveButton, GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)))
		);
		panel_2.setLayout(gl_panel_2);
		
		textPane = new JTextPane();
		
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(106)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addComponent(lblNewLabel_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addGap(130)
							.addComponent(textField, GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addComponent(lblNewLabel_2, GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
							.addGap(4)
							.addComponent(textPane, GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE)))
					.addGap(121))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(30)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_1, GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
						.addComponent(textField, GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE))
					.addGap(40)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(11)
							.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
						.addComponent(textPane, GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE))
					.addGap(11))
		);
		panel_1.setLayout(gl_panel_1);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(10)
					.addComponent(btnBookNewPatient, GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
					.addGap(10)
					.addComponent(btnRescheduleBooking, GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
					.addGap(10)
					.addComponent(btnViewAllRecords, GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
					.addGap(12)
					.addComponent(btnLogout, GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
					.addGap(10))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(5)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(btnBookNewPatient, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(btnRescheduleBooking, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(btnViewAllRecords, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(btnLogout, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addGap(8))
		);
		panel.setLayout(gl_panel);
		contentPane.setLayout(gl_contentPane);
		
		JButton btnNewButton = new JButton("Reset Form");
		btnNewButton.setBackground(new Color(255, 218, 185));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 17));
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Save");
		btnNewButton_1.setBackground(new Color(0, 250, 154));
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		panel.add(btnNewButton_1);
		
		Connect();
	}
}
