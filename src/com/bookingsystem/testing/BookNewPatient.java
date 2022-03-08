package com.bookingsystem.testing;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import com.toedter.calendar.JDateChooser;

import javax.swing.JComboBox;
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
public class BookNewPatient extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;

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
	public BookNewPatient() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 920, 680); //edit
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(47, 79, 79));
		
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
		
		JLabel lblNewLabel = new JLabel("Book New Patient");
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel.setFont(new Font("Sitka Heading", Font.BOLD, 48));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		JPanel panel_1 = new JPanel();
		
		JLabel lblNewLabel_2 = new JLabel("ID Number");
		lblNewLabel_2.setFont(new Font("Sitka Text", Font.BOLD, 18));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		
		textField_18 = new JTextField();
		textField_18.setColumns(10);
		textField_18.setEnabled(false);
		
		JLabel lblNewLabel_3 = new JLabel("First Name");
		lblNewLabel_3.setFont(new Font("Sitka Text", Font.BOLD, 13));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.LEFT);
		
		JLabel lblNewLabel_4 = new JLabel("MIddle Name");
		lblNewLabel_4.setFont(new Font("Sitka Text", Font.BOLD, 13));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.LEFT);
		
		JLabel lblNewLabel_5 = new JLabel("Last Name");
		lblNewLabel_5.setFont(new Font("Sitka Text", Font.BOLD, 13));
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.LEFT);
		
		JLabel lblNewLabel_6 = new JLabel("Suffix");
		lblNewLabel_6.setFont(new Font("Sitka Text", Font.BOLD, 13));
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.LEFT);
		
		textField = new JTextField();
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Address 1");
		lblNewLabel_7.setFont(new Font("Sitka Text", Font.BOLD, 13));
		
		JLabel lblNewLabel_9 = new JLabel("Address 2");
		lblNewLabel_9.setFont(new Font("Sitka Text", Font.BOLD, 13));
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("Barangay");
		lblNewLabel_8.setFont(new Font("Sitka Text", Font.BOLD, 13));
		
		JLabel lblNewLabel_10 = new JLabel("Minicipality/City");
		lblNewLabel_10.setFont(new Font("Sitka Text", Font.BOLD, 13));
		
		JLabel lblNewLabel_11 = new JLabel("Province");
		lblNewLabel_11.setFont(new Font("Sitka Text", Font.BOLD, 13));
		
		JLabel lblNewLabel_12 = new JLabel("Zip");
		lblNewLabel_12.setFont(new Font("Sitka Text", Font.BOLD, 13));
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		
		JLabel lblNewLabel_14 = new JLabel("Email Address");
		lblNewLabel_14.setFont(new Font("Sitka Text", Font.BOLD, 13));
		
		JLabel lblNewLabel_13 = new JLabel("Contact Number");
		lblNewLabel_13.setFont(new Font("Sitka Text", Font.BOLD, 13));
		
		JLabel lblNewLabel_15 = new JLabel("Occupation");
		lblNewLabel_15.setFont(new Font("Sitka Text", Font.BOLD, 13));
		
		JLabel lblNewLabel_16 = new JLabel("Gender");
		lblNewLabel_16.setFont(new Font("Sitka Text", Font.BOLD, 13));
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		
		JLabel lblNewLabel_17 = new JLabel("Date of Birth");
		lblNewLabel_17.setFont(new Font("Sitka Text", Font.BOLD, 13));
		
		JLabel lblNewLabel_18 = new JLabel("Age");
		lblNewLabel_18.setFont(new Font("Sitka Text", Font.BOLD, 13));
		
		JLabel lblNewLabel_19 = new JLabel("Place of Birth");
		lblNewLabel_19.setFont(new Font("Sitka Text", Font.BOLD, 13));
		
		JLabel lblNewLabel_20 = new JLabel("Nationality");
		lblNewLabel_20.setFont(new Font("Sitka Text", Font.BOLD, 13));
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.getCalendarButton().setBackground(new Color(204, 255, 204));

		textField_15 = new JTextField();
		textField_15.setColumns(10);
		
		textField_16 = new JTextField();
		textField_16.setColumns(10);
		
		textField_17 = new JTextField();
		textField_17.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		
		JLabel lblNewLabel_22 = new JLabel("Reason for Testing");
		lblNewLabel_22.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_22.setFont(new Font("Sitka Text", Font.BOLD, 13));
		
		JLabel lblNewLabel_23 = new JLabel("Type of Testing");
		lblNewLabel_23.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_23.setFont(new Font("Sitka Text", Font.BOLD, 13));
		
		JLabel lblNewLabel_24 = new JLabel("Facility Name");
		lblNewLabel_24.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_24.setFont(new Font("Sitka Text", Font.BOLD, 13));
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBackground(Color.WHITE);
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Select Type of Test", "Molecular Test (RNA or PCR test)", "Antigen Test (Rapid Test)", "Antibody Test (Blood Test)"}));
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"Select Facility Name", "Amang Rodriguez Memorial Medical Center", "Asian Hospital and Medical Center", "Chinese General Hospital", "Detoxicare Molecular Diagnostics Laboratory", "Makati Medical Center", "San Lazaro Hospital", "The Medical City", "Hi-Precision", "Tondo Medical Center"}));
		comboBox_2.setBackground(Color.WHITE);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setBackground(Color.WHITE);
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"Select a Reason for Testing", "With symptoms", "Healthcare Worker", "History of contact with a confirmed COVID-19 case", "Patients for clearance prior medical and surgical procedures", "Returning OFW", "Person who will be admitted in enclosed institutions(dormitories, nursing homes, jails)", "Relevant history of travel", "Economic zone employees", "Travel requirement", "Work Requirement"}));
		
		JLabel lblNewLabel_25 = new JLabel("Schedule Date");
		lblNewLabel_25.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_25.setFont(new Font("Sitka Text", Font.BOLD, 13));
		
		JLabel lblNewLabel_26 = new JLabel("Schedule Time");
		lblNewLabel_26.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_26.setFont(new Font("Sitka Text", Font.BOLD, 13));
		
		JDateChooser dateChooser_1 = new JDateChooser();
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select Time", "Morning (8:00 AM - 11:00 AM)", "Afternoon (1:00 PM - 10:00 PM)"}));
		comboBox.setBackground(Color.WHITE);
		
		
		JButton btnSaveButton = new JButton("Save Appointment");
		btnSaveButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String fname, mname, lname, suffix, add1, add2, barangay, mun_city;
				String province, email, occupation, gender, place_of_birth, nationality;
				String reason_testing, type_testing, facility, schedule_time;
				int id, contact, zip, age;
				
				java.util.Date d = dateChooser.getDate();
				java.util.Date d2 = dateChooser_1.getDate();
				
				if(d == null || d2 == null) {
					JOptionPane.showMessageDialog(null, "Missing fields!");
				}else {
					
					java.sql.Date date_of_birth = new java.sql.Date(d.getTime());
					java.sql.Date schedule_date = new java.sql.Date(d2.getTime());
					
					if(textField.getText().equals("") || textField_1.getText().equals("") ||textField_2.getText().equals("") ||textField_3.getText().equals("") ||textField_4.getText().equals("") ||textField_5.getText().equals("") ||textField_6.getText().equals("") ||textField_7.getText().equals("") ||comboBox_2.getSelectedItem().toString().equals("") ||textField_8.getText().equals("") ||textField_9.getText().equals("") ||comboBox.getSelectedItem().toString().equals("") ||textField_10.getText().equals("") ||textField_11.getText().equals("") ||textField_12.getText().equals("") ||textField_13.getText().equals("") ||textField_15.getText().equals("") ||textField_16.getText().equals("") ||textField_17.getText().equals("") ||comboBox_3.getSelectedItem().toString().equals("") ||comboBox_1.getSelectedItem().toString().equals("")) {
						JOptionPane.showMessageDialog(null, "Missing fields!");
					}else {
						
						try {
							fname = textField.getText();
							mname = textField_1.getText();
							lname = textField_2.getText();
							suffix = textField_3.getText();
							
							add1 = textField_4.getText();
							add2 = textField_5.getText();
							
							barangay = textField_6.getText();
							mun_city = textField_7.getText();
							province = textField_8.getText();
							zip = Integer.parseInt(textField_9.getText());
							
							email = textField_10.getText();
							contact = Integer.parseInt(textField_11.getText());
							occupation = textField_12.getText();
							gender = textField_13.getText();
							
							age = Integer.parseInt(textField_15.getText());
							place_of_birth = textField_16.getText();
							nationality = textField_17.getText();
							
							reason_testing = comboBox_3.getSelectedItem().toString();
							type_testing = comboBox_1.getSelectedItem().toString();
							facility = comboBox_2.getSelectedItem().toString();
							schedule_time = comboBox.getSelectedItem().toString();
							
							String infoArray[] = new String[15];
							
							infoArray[0] = fname;
							infoArray[1] = mname;
							infoArray[2] = lname;
							infoArray[3] = suffix;
							infoArray[4] = add1;
							infoArray[5] = add2;
							infoArray[6] = barangay;
							infoArray[7] = mun_city;
							infoArray[8] = province;
							infoArray[9] = email;
							infoArray[10] = occupation;
							infoArray[11] = gender;
							infoArray[12] = place_of_birth;
							infoArray[13] = nationality;
							infoArray[14] = fname;
									
							try {
								pst = conn.prepareStatement("INSERT INTO `book` (`first_name`, `middle_name`, `last_name`, `suffix`, `address_1`, `address_2`, `barangay`, `municipality_city`, `province`, `zip`, `email`, `contact`, `occupation`, `gender`, `date_of_birth`, `age`, `place_of_birth`, `nationality`, `reason_testing`, `type_testing`, `facility`, `schedule_time`, `schedule_date`)values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
								pst.setString(1, fname);
								pst.setString(2, mname);
								pst.setString(3, lname);
								pst.setString(4, suffix);
								
								pst.setString(5, add1);
								pst.setString(6, add2);
								
								pst.setString(7, barangay);
								pst.setString(8, mun_city);
								pst.setString(9, province);
								pst.setInt(10, zip);
								
								pst.setString(11, email);
								pst.setInt(12, contact);
								pst.setString(13, occupation);
								pst.setString(14, gender);
								
								pst.setDate(15, date_of_birth);
								pst.setInt(16, age);
								pst.setString(17, place_of_birth);
								pst.setString(18, nationality);
								
								pst.setString(19, reason_testing);
								pst.setString(20, type_testing);
								pst.setString(21, facility);
								pst.setString(22, schedule_time);
								pst.setDate(23, schedule_date);
								
								pst.executeUpdate();
								JOptionPane.showMessageDialog(null, "Record Successfuly Added!");
								
								textField.setText("");
								textField_1.setText("");
								textField_2.setText("");
								textField_3.setText("");
								textField_4.setText("");
								textField_5.setText("");
								textField_6.setText("");
								textField_7.setText("");
								textField_8.setText("");
								textField_9.setText("");
								textField_10.setText("");
								textField_11.setText("");
								textField_12.setText("");
								textField_13.setText("");
								textField_15.setText("");
								textField_16.setText("");
								textField_17.setText("");
								textField_18.setText("");
								dateChooser.setCalendar(null);
								
								comboBox.setSelectedIndex(0);
								comboBox_1.setSelectedIndex(0);
								comboBox_2.setSelectedIndex(0);
								dateChooser_1.setCalendar(null);
								
							}
							
							catch (SQLException e1) 
							{
								
								e1.printStackTrace();
							}
							
						}catch(NumberFormatException e1) {
							JOptionPane.showMessageDialog(null, "Invalid fields!");
						}
					}
				}
				
				
			}
		});
		btnSaveButton.setBackground(new Color(0, 250, 154));
		btnSaveButton.setFont(new Font("Tahoma", Font.BOLD, 17));
		
		JButton btnResetButton = new JButton("Reset Form");
		btnResetButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
				textField_3.setText("");
				textField_4.setText("");
				textField_5.setText("");
				textField_6.setText("");
				textField_7.setText("");
				textField_8.setText("");
				textField_9.setText("");
				textField_10.setText("");
				textField_11.setText("");
				textField_12.setText("");
				textField_13.setText("");
//				textField_14.setText("");
				textField_15.setText("");
				textField_16.setText("");
				textField_17.setText("");
				textField_18.setText("");
				dateChooser.setCalendar(null);
				
				comboBox.setSelectedIndex(0);
				comboBox_1.setSelectedIndex(0);
				comboBox_2.setSelectedIndex(0);
				dateChooser_1.setCalendar(null);
				}
		});
		btnResetButton.setBackground(new Color(255, 218, 185));
		btnResetButton.setFont(new Font("Tahoma", Font.BOLD, 17));
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(10)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(textField_18, GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
							.addGap(603))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addComponent(lblNewLabel_3, GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
							.addGap(195)
							.addComponent(lblNewLabel_4, GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
							.addGap(153)
							.addComponent(lblNewLabel_5, GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
							.addGap(203)
							.addComponent(lblNewLabel_6, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addGap(39))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addComponent(textField, GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
							.addGap(29)
							.addComponent(textField_1, GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
							.addGap(31)
							.addComponent(textField_2, GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
							.addGap(40)
							.addComponent(textField_3, GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addComponent(textField_4, GroupLayout.DEFAULT_SIZE, 359, Short.MAX_VALUE)
								.addGroup(gl_panel_1.createSequentialGroup()
									.addComponent(lblNewLabel_7, GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
									.addGap(296)))
							.addGap(144)
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_1.createSequentialGroup()
									.addGap(2)
									.addComponent(lblNewLabel_9, GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
									.addGap(284))
								.addComponent(textField_5, GroupLayout.DEFAULT_SIZE, 351, Short.MAX_VALUE))
							.addGap(1))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_1.createSequentialGroup()
									.addComponent(lblNewLabel_8, GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
									.addGap(174))
								.addComponent(textField_6, GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE))
							.addGap(29)
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_1.createSequentialGroup()
									.addGap(4)
									.addComponent(lblNewLabel_10, GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
									.addGap(94))
								.addComponent(textField_7, GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE))
							.addGap(31)
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addComponent(textField_8, GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
								.addGroup(gl_panel_1.createSequentialGroup()
									.addGap(4)
									.addComponent(lblNewLabel_11, GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
									.addGap(142)))
							.addGap(40)
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_1.createSequentialGroup()
									.addGap(4)
									.addComponent(lblNewLabel_12, GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
									.addGap(17))
								.addComponent(textField_9, GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addComponent(lblNewLabel_14, GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
							.addGap(172)
							.addComponent(lblNewLabel_13, GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
							.addGap(136)
							.addComponent(lblNewLabel_15, GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
							.addGap(200)
							.addComponent(lblNewLabel_16, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addGap(33))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addComponent(textField_10, GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
							.addGap(29)
							.addComponent(textField_11, GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
							.addGap(31)
							.addComponent(textField_12, GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
							.addGap(40)
							.addComponent(textField_13, GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_1.createSequentialGroup()
									.addComponent(lblNewLabel_17, GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
									.addGap(154))
								.addComponent(dateChooser, GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE))
							.addGap(29)
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_1.createSequentialGroup()
									.addComponent(lblNewLabel_18, GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
									.addGap(145))
								.addComponent(textField_15, GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE))
							.addGap(29)
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_1.createSequentialGroup()
									.addComponent(lblNewLabel_19, GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
									.addGap(142))
								.addGroup(gl_panel_1.createSequentialGroup()
									.addGap(2)
									.addComponent(textField_16, GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)))
							.addGap(40)
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_1.createSequentialGroup()
									.addGap(1)
									.addComponent(lblNewLabel_20, GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
									.addGap(7))
								.addComponent(textField_17, GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE))))
					.addGap(22))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(11)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(1)
							.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
						.addComponent(textField_18, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
					.addGap(6)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_4, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_5, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(1)
							.addComponent(lblNewLabel_6)))
					.addGap(5)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(1)
							.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)))
					.addGap(5)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(17)
							.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblNewLabel_7, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_9, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(17)
							.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)))
					.addGap(10)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(1)
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_8, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_panel_1.createSequentialGroup()
									.addGap(17)
									.addComponent(textField_6, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(1)
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_10, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_panel_1.createSequentialGroup()
									.addGap(17)
									.addComponent(textField_7, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(1)
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_1.createSequentialGroup()
									.addGap(17)
									.addComponent(textField_8, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
								.addComponent(lblNewLabel_11, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)))
						.addComponent(lblNewLabel_12, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(17)
							.addComponent(textField_9, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)))
					.addGap(11)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_14, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_13, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_15, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(1)
							.addComponent(lblNewLabel_16)))
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(textField_10, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_11, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_12, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(1)
							.addComponent(textField_13, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)))
					.addGap(10)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_17, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(19)
							.addComponent(dateChooser, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblNewLabel_18, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(19)
							.addComponent(textField_15, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblNewLabel_19, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(19)
							.addComponent(textField_16, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(1)
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_20, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_panel_1.createSequentialGroup()
									.addGap(19)
									.addComponent(textField_17, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))))))
		);
		panel_1.setLayout(gl_panel_1);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(10)
					.addComponent(btnRescheduleBooking, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGap(13)
					.addComponent(btnCancelBooking, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGap(10)
					.addComponent(btnViewAllRecords, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGap(246)
					.addComponent(btnLogout, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(5)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(btnRescheduleBooking, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnCancelBooking, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
							.addComponent(btnViewAllRecords, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
							.addComponent(btnLogout, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE))))
		);
		panel.setLayout(gl_panel);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(panel, GroupLayout.DEFAULT_SIZE, 889, Short.MAX_VALUE)
					.addGap(5))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 889, Short.MAX_VALUE)
					.addGap(5))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 885, Short.MAX_VALUE)
					.addGap(9))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(panel_2, GroupLayout.DEFAULT_SIZE, 885, Short.MAX_VALUE)
					.addGap(9))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(255)
					.addComponent(btnResetButton, GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
					.addGap(113)
					.addComponent(btnSaveButton, GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
					.addGap(192))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
					.addGap(6)
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE)
					.addGap(6)
					.addComponent(panel_2, GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
					.addGap(11)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(btnResetButton)
						.addComponent(btnSaveButton))
					.addGap(21))
		);
		
		
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGap(10)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_2.createSequentialGroup()
							.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_2.createSequentialGroup()
									.addComponent(lblNewLabel_22, GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
									.addGap(315))
								.addComponent(comboBox_3, 0, 470, Short.MAX_VALUE))
							.addGap(31)
							.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_2.createSequentialGroup()
									.addComponent(lblNewLabel_23, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addGap(198))
								.addComponent(comboBox_1, 0, 299, Short.MAX_VALUE))
							.addGap(51))
						.addGroup(gl_panel_2.createSequentialGroup()
							.addComponent(lblNewLabel_24, GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
							.addGap(415)
							.addComponent(lblNewLabel_25, GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
							.addGap(103)
							.addComponent(lblNewLabel_26, GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
							.addGap(26))
						.addGroup(gl_panel_2.createSequentialGroup()
							.addComponent(comboBox_2, 0, 470, Short.MAX_VALUE)
							.addGap(31)
							.addComponent(dateChooser_1, GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
							.addGap(10)
							.addComponent(comboBox, 0, 157, Short.MAX_VALUE)))
					.addGap(24))
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGap(11)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_2.createSequentialGroup()
							.addComponent(lblNewLabel_22, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
							.addGap(1)
							.addComponent(comboBox_3, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_2.createSequentialGroup()
							.addGap(9)
							.addComponent(lblNewLabel_23)
							.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)))
					.addGap(8)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_24)
						.addComponent(lblNewLabel_25)
						.addComponent(lblNewLabel_26))
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addComponent(comboBox_2, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(dateChooser_1, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)))
		);
		panel_2.setLayout(gl_panel_2);
		contentPane.setLayout(gl_contentPane);
		Connect();
		
	}
}
