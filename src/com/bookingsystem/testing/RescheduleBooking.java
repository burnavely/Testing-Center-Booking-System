package com.bookingsystem.testing;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JComboBox;
import com.toedter.calendar.JDateChooser;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;


@SuppressWarnings("serial")
public class RescheduleBooking extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

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
	public RescheduleBooking() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 0, 1000, 800);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		setResizable(false);
		
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
		
		JButton btnCancelBooking = new JButton("Cancel Booking");
		btnCancelBooking.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				//To show/select Cencel Book Jframe
				CancelBooking cancelbook = new CancelBooking();
				cancelbook.setVisible(true);
				dispose(); //To close current Jframe
			}
		});
		btnCancelBooking.setFont(new Font("Sitka Text", Font.BOLD, 16));
		btnCancelBooking.setBackground(new Color(240, 248, 255));
		
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
		
		JLabel lblNewLabel = new JLabel("Reschedule Booking");
		lblNewLabel.setFont(new Font("Sitka Heading", Font.BOLD, 48));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		JPanel panel_1 = new JPanel();
		
		JLabel lblNewLabel_1 = new JLabel("ID Number: ");
		lblNewLabel_1.setFont(new Font("Sitka Text", Font.BOLD, 21));
		
		textField = new JTextField();
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Reason for Rescheduling");
		lblNewLabel_2.setFont(new Font("Sitka Text", Font.BOLD, 21));
		
		JTextPane textPane = new JTextPane();
		
		JLabel lblNewLabel_3 = new JLabel("Type of Test");
		lblNewLabel_3.setFont(new Font("Sitka Text", Font.BOLD, 21));
		
		JLabel lblNewLabel_4 = new JLabel("Facility Name");
		lblNewLabel_4.setFont(new Font("Sitka Text", Font.BOLD, 21));
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select Type of Test", "Molecular Test (RNA or PCR test)", "Antigen Test (Rapid Test)", "Antibody Test (Blood Test)"}));
		comboBox.setBackground(Color.WHITE);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Select Facility Name", "Amang Rodriguez Memorial Medical Center", "Asian Hospital and Medical Center", "Chinese General Hospital", "Detoxicare Molecular Diagnostics Laboratory", "Makati Medical Center", "San Lazaro Hospital", "The Medical City", "Hi-Precision", "Tondo Medical Center"}));
		comboBox_1.setBackground(Color.WHITE);
		
		JLabel lblNewLabel_5 = new JLabel("Schedule Date");
		lblNewLabel_5.setFont(new Font("Sitka Text", Font.BOLD, 21));
		
		JLabel lblNewLabel_6 = new JLabel("Schedule Time");
		lblNewLabel_6.setFont(new Font("Sitka Text", Font.BOLD, 21));
		
		JDateChooser dateChooser = new JDateChooser();
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"Select Time", "Morning (8:00 AM - 11:00 AM)", "Afternoon (1:00 PM - 10:00 PM)"}));
		comboBox_2.setBackground(Color.WHITE);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		
		JButton btnResetButton = new JButton("Reset Form");
		btnResetButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				textPane.setText("");
				dateChooser.setCalendar(null);
				
				comboBox.setSelectedIndex(0);
				comboBox_1.setSelectedIndex(0);
				comboBox_2.setSelectedIndex(0);
			}
		});
		btnResetButton.setBackground(new Color(255, 218, 185));
		btnResetButton.setFont(new Font("Tahoma", Font.BOLD, 17));
		
		JButton btnSaveButton = new JButton("Save");
		btnSaveButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int answer = JOptionPane.showConfirmDialog(null, "Are you sure?");
				if (answer == JOptionPane.YES_OPTION) {
					String reason_testing, type_testing, facility, schedule_time;
					
					java.util.Date d = dateChooser.getDate();
					java.sql.Date schedule_date = new java.sql.Date(d.getTime());
					
					int id = Integer.parseInt(textField.getText());
					reason_testing = textPane.getText();
					type_testing = comboBox.getSelectedItem().toString();
					facility = comboBox_1.getSelectedItem().toString();
					schedule_time = comboBox_2.getSelectedItem().toString();
					
					try {
						pst = conn.prepareStatement("SELECT first_name, middle_name,last_name,age,email,contact FROM book where ID = ?");
						pst.setInt(1, id);
		                ResultSet rs = pst.executeQuery();
		                
		                if(rs.next() != true) {
		                	System.out.println("User not found!");
		                	JOptionPane.showMessageDialog(null, "User not found!");
		                }else {
		                	 try {
		    					 pst = conn.prepareStatement("UPDATE book SET reason_testing= ?,type_testing= ?,facility= ?,schedule_time= ?,schedule_date= ? WHERE ID = ?");
		    					pst.setString(1, reason_testing);
		    					pst.setString(2, type_testing);
		    					pst.setString(3, facility);
		    					pst.setString(4, schedule_time);
		    					pst.setDate(5, schedule_date);
		    					pst.setInt(6, id);
		    					
		    					pst.executeUpdate();
		    					JOptionPane.showMessageDialog(null, "Record Successfuly Updated!");
		    					
		    					textField.setText("");
		    					textPane.setText("");
		    					dateChooser.setCalendar(null);
		    					
		    					comboBox.setSelectedIndex(0);
		    					comboBox_1.setSelectedIndex(0);
		    					comboBox_2.setSelectedIndex(0);
		    					
		    				   }
		    			 
		    				catch (SQLException e1) 
		    			        {
		    									
		    				e1.printStackTrace();
		    			        }
		                	
		                }
		                
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				    } else if (answer == JOptionPane.NO_OPTION) {
				    	
				    }

			}
		});
		btnSaveButton.setBackground(new Color(0, 250, 154));
		btnSaveButton.setFont(new Font("Tahoma", Font.BOLD, 17));
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(panel, GroupLayout.DEFAULT_SIZE, 969, Short.MAX_VALUE)
					.addGap(5))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 969, Short.MAX_VALUE)
					.addGap(5))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(5)
					.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 964, Short.MAX_VALUE)
					.addGap(5))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(5)
					.addComponent(panel_2, GroupLayout.DEFAULT_SIZE, 964, Short.MAX_VALUE)
					.addGap(5))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
					.addGap(11)
					.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 442, Short.MAX_VALUE)
					.addGap(22)
					.addComponent(panel_2, GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
					.addGap(36))
		);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(10)
					.addComponent(btnBookNewPatient, GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
					.addGap(10)
					.addComponent(btnCancelBooking, GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
					.addGap(10)
					.addComponent(btnViewAllRecords, GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
					.addGap(241)
					.addComponent(btnLogout, GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
					.addGap(12))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(5)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(btnBookNewPatient)
						.addComponent(btnCancelBooking)
						.addComponent(btnViewAllRecords)
						.addComponent(btnLogout)))
		);
		panel.setLayout(gl_panel);
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGap(378)
					.addComponent(btnResetButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGap(5)
					.addComponent(btnSaveButton, GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
					.addGap(379))
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGap(5)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addComponent(btnResetButton)
						.addComponent(btnSaveButton)))
		);
		panel_2.setLayout(gl_panel_2);
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(56)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addComponent(lblNewLabel_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addGap(61)
							.addComponent(textField, GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)
							.addGap(365))
						.addComponent(textPane, GroupLayout.DEFAULT_SIZE, 861, Short.MAX_VALUE)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addComponent(comboBox, 0, 248, Short.MAX_VALUE)
							.addGap(142)
							.addComponent(comboBox_1, 0, 471, Short.MAX_VALUE))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addComponent(dateChooser, GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
							.addGap(142)
							.addComponent(comboBox_2, 0, 240, Short.MAX_VALUE)
							.addGap(231))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addComponent(lblNewLabel_5, GroupLayout.DEFAULT_SIZE, 387, Short.MAX_VALUE)
							.addGap(474))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(390)
							.addComponent(lblNewLabel_6, GroupLayout.DEFAULT_SIZE, 471, Short.MAX_VALUE))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addComponent(lblNewLabel_2, GroupLayout.DEFAULT_SIZE, 853, Short.MAX_VALUE)
							.addGap(8))
						.addGroup(Alignment.TRAILING, gl_panel_1.createSequentialGroup()
							.addGap(390)
							.addComponent(lblNewLabel_4, GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
							.addGap(233))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addComponent(lblNewLabel_3, GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
							.addGap(671)))
					.addGap(47))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(30)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(6)
							.addComponent(lblNewLabel_1))
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
					.addGap(41)
					.addComponent(lblNewLabel_2)
					.addGap(5)
					.addComponent(textPane, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
					.addGap(40)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(lblNewLabel_3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
					.addGap(41)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_5, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(lblNewLabel_6, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(dateChooser, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboBox_2, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
					.addGap(32))
		);
		panel_1.setLayout(gl_panel_1);
		contentPane.setLayout(gl_contentPane);
		
		Connect();
		
	}
}
