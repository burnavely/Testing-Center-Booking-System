package com.bookingsystem.testing;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;


@SuppressWarnings("serial")
public class SelectAction extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public SelectAction() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(175, 238, 238));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		
		JButton btnBookNewPatient = new JButton("Book New Patient");
		btnBookNewPatient.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//To show/select New Booking Jframe
				BookNewPatient booknew = new BookNewPatient();
				booknew.setVisible(true);
				dispose(); //To close current Jframe
			}
		});
		
		btnBookNewPatient.setForeground(new Color(0, 0, 0));
		btnBookNewPatient.setBackground(new Color(240, 255, 240));
		btnBookNewPatient.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		JButton btnRescheduleBooking = new JButton("Reschedule Booking");
		btnRescheduleBooking.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//To show/select Reschedule Book Jframe
				RescheduleBooking reschedbook = new RescheduleBooking();
				reschedbook.setVisible(true);
				dispose(); //To close current Jframe
			}
		});
		btnRescheduleBooking.setBackground(new Color(255, 248, 220));
		btnRescheduleBooking.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		JButton btnCancelBooking = new JButton("Cancel Booking");
		btnCancelBooking.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//To show/select Cencel Book Jframe
				CancelBooking cancelbook = new CancelBooking();
				cancelbook.setVisible(true);
				dispose(); //To close current Jframe
			}
		});
		btnCancelBooking.setBackground(new Color(255, 228, 225));
		btnCancelBooking.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		JButton btnViewAllRecords = new JButton("View All Records");
		btnViewAllRecords.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//To show/select View All Records Jframe
				ViewAllRecords viewall = new ViewAllRecords();
				viewall.setVisible(true);
				dispose(); //To close current Jframe
			}
		});
		btnViewAllRecords.setBackground(new Color(245, 245, 245));
		btnViewAllRecords.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		JLabel lblNewLabel = new JLabel("Select Action");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Stencil", Font.BOLD, 40));
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/*
				 * LoginForm login = new LoginForm(); login.setVisible(true); dispose();
				 */
			}
		});
		
		btnLogout.addMouseListener(new java.awt.event.MouseAdapter() {
		    public void mouseEntered(java.awt.event.MouseEvent evt) {
		    	btnLogout.setBackground(Color.LIGHT_GRAY);
		    }
		    public void mouseExited(java.awt.event.MouseEvent evt) {
				btnLogout.setBackground(new Color(211, 211, 211));
		    }
		});
		
		btnLogout.setFont(new Font("Segoe UI Semibold", Font.BOLD, 13));
		btnLogout.setBackground(new Color(211, 211, 211));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(5)
					.addComponent(btnLogout, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(390, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(80)
					.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGap(103))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(5)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 464, Short.MAX_VALUE)
					.addGap(15))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(6)
					.addComponent(btnLogout, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
					.addGap(50)
					.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
					.addGap(11)
					.addComponent(panel, GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
					.addGap(16))
		);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(btnBookNewPatient, GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
						.addComponent(btnCancelBooking, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE))
					.addGap(5)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(btnRescheduleBooking, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 234, Short.MAX_VALUE)
						.addComponent(btnViewAllRecords, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addComponent(btnBookNewPatient, GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
						.addComponent(btnRescheduleBooking, GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE))
					.addGap(5)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(btnCancelBooking, GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
						.addComponent(btnViewAllRecords, GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE))
					.addGap(1))
		);
		panel.setLayout(gl_panel);
		contentPane.setLayout(gl_contentPane);
	}
}
