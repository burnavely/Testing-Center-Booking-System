package com.bookingsystem.testing;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.SwingConstants;

public class ViewDetails extends JFrame {

	private JPanel contentPane;
	private int ID;
	private int type;
	private String[] information = new String[15]; 
	
	JLabel lblNewLabel_18;
	JLabel lblNewLabel_19;
	JLabel lblNewLabel_20;
	JLabel lblNewLabel_21;
	JLabel lblNewLabel_22;
	JLabel lblNewLabel_23;
	JLabel lblNewLabel_24;
	JLabel lblNewLabel_25;
	JLabel lblNewLabel_26;
	JLabel lblNewLabel_27;
	JLabel lblNewLabel_28;
	JLabel lblNewLabel_29;
	JLabel lblNewLabel_30;
	JLabel lblNewLabel_31;
	JLabel lblNewLabel_32;
	JLabel lblNewLabel_33;
	JLabel lblNewLabel_34;
	JLabel lblNewLabel_35;
	
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
	
	public void passInfo(String[] infoArray) {
		
	}

	/**
	 * Create the frame.
	 */
	public ViewDetails(int newID, int newType) {
		ID = newID;
		type = newType;
		Connect();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 10, 450, 600);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ID Number");
		lblNewLabel.setFont(new Font("Sitka Text", Font.BOLD, 13));
		lblNewLabel.setBounds(34, 33, 129, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("First Name");
		lblNewLabel_1.setFont(new Font("Sitka Text", Font.BOLD, 13));
		lblNewLabel_1.setBounds(34, 61, 129, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Middle Name");
		lblNewLabel_2.setFont(new Font("Sitka Text", Font.BOLD, 13));
		lblNewLabel_2.setBounds(34, 86, 129, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Last Name");
		lblNewLabel_3.setFont(new Font("Sitka Text", Font.BOLD, 13));
		lblNewLabel_3.setBounds(34, 111, 129, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Address 1");
		lblNewLabel_4.setFont(new Font("Sitka Text", Font.BOLD, 13));
		lblNewLabel_4.setBounds(34, 147, 129, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Address 2");
		lblNewLabel_5.setFont(new Font("Sitka Text", Font.BOLD, 13));
		lblNewLabel_5.setBounds(34, 172, 129, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Barangay");
		lblNewLabel_6.setFont(new Font("Sitka Text", Font.BOLD, 13));
		lblNewLabel_6.setBounds(34, 199, 129, 14);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Municipality/City");
		lblNewLabel_7.setFont(new Font("Sitka Text", Font.BOLD, 13));
		lblNewLabel_7.setBounds(34, 224, 129, 14);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Province");
		lblNewLabel_8.setFont(new Font("Sitka Text", Font.BOLD, 13));
		lblNewLabel_8.setBounds(34, 249, 129, 14);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Zip Code");
		lblNewLabel_9.setFont(new Font("Sitka Text", Font.BOLD, 13));
		lblNewLabel_9.setBounds(34, 274, 129, 14);
		contentPane.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Email Add");
		lblNewLabel_10.setFont(new Font("Sitka Text", Font.BOLD, 13));
		lblNewLabel_10.setBounds(34, 309, 129, 14);
		contentPane.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("Contact no.");
		lblNewLabel_11.setFont(new Font("Sitka Text", Font.BOLD, 13));
		lblNewLabel_11.setBounds(34, 334, 129, 14);
		contentPane.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("Occupation");
		lblNewLabel_12.setFont(new Font("Sitka Text", Font.BOLD, 13));
		lblNewLabel_12.setBounds(34, 359, 129, 14);
		contentPane.add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("Gender");
		lblNewLabel_13.setFont(new Font("Sitka Text", Font.BOLD, 13));
		lblNewLabel_13.setBounds(34, 384, 129, 14);
		contentPane.add(lblNewLabel_13);
		
		JLabel lblNewLabel_14 = new JLabel("D.O.B");
		lblNewLabel_14.setFont(new Font("Sitka Text", Font.BOLD, 13));
		lblNewLabel_14.setBounds(34, 424, 129, 14);
		contentPane.add(lblNewLabel_14);
		
		JLabel lblNewLabel_15 = new JLabel("Age");
		lblNewLabel_15.setFont(new Font("Sitka Text", Font.BOLD, 13));
		lblNewLabel_15.setBounds(34, 449, 129, 14);
		contentPane.add(lblNewLabel_15);
		
		JLabel lblNewLabel_16 = new JLabel("Place of Birth");
		lblNewLabel_16.setFont(new Font("Sitka Text", Font.BOLD, 13));
		lblNewLabel_16.setBounds(34, 474, 129, 14);
		contentPane.add(lblNewLabel_16);
		
		JLabel lblNewLabel_17 = new JLabel("Nationality");
		lblNewLabel_17.setFont(new Font("Sitka Text", Font.BOLD, 13));
		lblNewLabel_17.setBounds(34, 499, 129, 14);
		contentPane.add(lblNewLabel_17);
		
		lblNewLabel_18 = new JLabel("//id number");
		lblNewLabel_18.setFont(new Font("Sitka Text", Font.PLAIN, 13));
		lblNewLabel_18.setBounds(214, 31, 210, 14);
		contentPane.add(lblNewLabel_18);
		
		lblNewLabel_19 = new JLabel("//fname");
		lblNewLabel_19.setFont(new Font("Sitka Text", Font.PLAIN, 13));
		lblNewLabel_19.setBounds(214, 59, 210, 14);
		contentPane.add(lblNewLabel_19);
		
		lblNewLabel_20 = new JLabel("//mname");
		lblNewLabel_20.setFont(new Font("Sitka Text", Font.PLAIN, 13));
		lblNewLabel_20.setBounds(214, 84, 210, 14);
		contentPane.add(lblNewLabel_20);
		
		lblNewLabel_21 = new JLabel("//lname");
		lblNewLabel_21.setFont(new Font("Sitka Text", Font.PLAIN, 13));
		lblNewLabel_21.setBounds(214, 109, 210, 14);
		contentPane.add(lblNewLabel_21);
		
		lblNewLabel_22 = new JLabel("//address1");
		lblNewLabel_22.setFont(new Font("Sitka Text", Font.PLAIN, 13));
		lblNewLabel_22.setBounds(214, 145, 210, 14);
		contentPane.add(lblNewLabel_22);
		
		lblNewLabel_23 = new JLabel("//address2");
		lblNewLabel_23.setFont(new Font("Sitka Text", Font.PLAIN, 13));
		lblNewLabel_23.setBounds(214, 170, 210, 14);
		contentPane.add(lblNewLabel_23);
		
		lblNewLabel_24 = new JLabel("//brgy");
		lblNewLabel_24.setFont(new Font("Sitka Text", Font.PLAIN, 13));
		lblNewLabel_24.setBounds(214, 197, 210, 14);
		contentPane.add(lblNewLabel_24);
		
		lblNewLabel_25 = new JLabel("//mun_city");
		lblNewLabel_25.setFont(new Font("Sitka Text", Font.PLAIN, 13));
		lblNewLabel_25.setBounds(214, 222, 210, 14);
		contentPane.add(lblNewLabel_25);
		
		lblNewLabel_26 = new JLabel("//province");
		lblNewLabel_26.setFont(new Font("Sitka Text", Font.PLAIN, 13));
		lblNewLabel_26.setBounds(214, 247, 210, 14);
		contentPane.add(lblNewLabel_26);
		
		lblNewLabel_27 = new JLabel("//zip");
		lblNewLabel_27.setFont(new Font("Sitka Text", Font.PLAIN, 13));
		lblNewLabel_27.setBounds(214, 274, 210, 14);
		contentPane.add(lblNewLabel_27);
		
		lblNewLabel_28 = new JLabel("//email");
		lblNewLabel_28.setFont(new Font("Sitka Text", Font.PLAIN, 13));
		lblNewLabel_28.setBounds(214, 307, 210, 14);
		contentPane.add(lblNewLabel_28);
		
		lblNewLabel_29 = new JLabel("//Contact");
		lblNewLabel_29.setFont(new Font("Sitka Text", Font.PLAIN, 13));
		lblNewLabel_29.setBounds(214, 334, 210, 14);
		contentPane.add(lblNewLabel_29);
		
		lblNewLabel_30 = new JLabel("//Occup");
		lblNewLabel_30.setFont(new Font("Sitka Text", Font.PLAIN, 13));
		lblNewLabel_30.setBounds(214, 357, 210, 14);
		contentPane.add(lblNewLabel_30);
		
		lblNewLabel_31 = new JLabel("//gender");
		lblNewLabel_31.setFont(new Font("Sitka Text", Font.PLAIN, 13));
		lblNewLabel_31.setBounds(214, 382, 210, 14);
		contentPane.add(lblNewLabel_31);
		
		lblNewLabel_32 = new JLabel("//dob");
		lblNewLabel_32.setFont(new Font("Sitka Text", Font.PLAIN, 13));
		lblNewLabel_32.setBounds(214, 422, 210, 14);
		contentPane.add(lblNewLabel_32);
		
		lblNewLabel_33 = new JLabel("age");
		lblNewLabel_33.setFont(new Font("Sitka Text", Font.PLAIN, 13));
		lblNewLabel_33.setBounds(214, 447, 210, 14);
		contentPane.add(lblNewLabel_33);
		
		lblNewLabel_34 = new JLabel("//pob");
		lblNewLabel_34.setFont(new Font("Sitka Text", Font.PLAIN, 13));
		lblNewLabel_34.setBounds(214, 472, 210, 14);
		contentPane.add(lblNewLabel_34);
		
		lblNewLabel_35 = new JLabel("//nation");
		lblNewLabel_35.setFont(new Font("Sitka Text", Font.PLAIN, 13));
		lblNewLabel_35.setBounds(214, 497, 210, 14);
		contentPane.add(lblNewLabel_35);
		
		try {
			pst = conn.prepareStatement("SELECT * FROM book WHERE ID = ?");
			pst.setInt(1, ID);
			
			rs = pst.executeQuery();
			rs.next();
			
			lblNewLabel_18.setText(Integer.toString(ID));
			lblNewLabel_19.setText(rs.getString("first_name"));
			lblNewLabel_20.setText(rs.getString("middle_name"));
			lblNewLabel_21.setText(rs.getString("last_name"));
			lblNewLabel_22.setText(rs.getString("address_1"));
			lblNewLabel_23.setText(rs.getString("address_2"));
			lblNewLabel_24.setText(rs.getString("barangay"));
			lblNewLabel_25.setText(rs.getString("municipality_city"));
			lblNewLabel_26.setText(rs.getString("province"));
			lblNewLabel_27.setText(rs.getString("zip"));
			lblNewLabel_28.setText(rs.getString("email"));
			lblNewLabel_29.setText(rs.getString("contact"));
			lblNewLabel_30.setText(rs.getString("occupation"));
			lblNewLabel_31.setText(rs.getString("gender"));
			lblNewLabel_32.setText(rs.getString("date_of_birth"));
			lblNewLabel_33.setText(rs.getString("age"));
			lblNewLabel_34.setText(rs.getString("place_of_birth"));
			lblNewLabel_35.setText(rs.getString("nationality"));
			
	
		}catch(SQLException e1) {
			e1.printStackTrace();				
		}
		
			
		JButton btnConfirmButton = new JButton("Confirm");
		btnConfirmButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
//				ViewAllRecords var = new ViewAllRecords();
//				var.setVisible(true);
				dispose();
				
			}
			
		});
		btnConfirmButton.setVerticalAlignment(SwingConstants.TOP);
		btnConfirmButton.setFont(new Font("Sitka Text", Font.BOLD, 13));
		btnConfirmButton.setBounds(132, 524, 159, 23);
		contentPane.add(btnConfirmButton);
	}
}

