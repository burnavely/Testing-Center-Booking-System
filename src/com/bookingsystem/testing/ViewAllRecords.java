package com.bookingsystem.testing;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import java.awt.Color;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.border.LineBorder;

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.TableColumnModel;

import net.proteanit.sql.DbUtils;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;


@SuppressWarnings("serial")
public class ViewAllRecords extends JFrame {

	private JPanel contentPane;
	private JTable table;
	
	private int clickedDataID;
	private boolean isDataClicked = false;
	int dataCount;
	java.util.Date d;

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
 
 
	public void table_load()
	    {
	    	try 
	    	{
		    pst = conn.prepareStatement("select * from book");
		    rs = pst.executeQuery();
		    table.setModel(DbUtils.resultSetToTableModel(rs));
		} 
	    	catch (SQLException e) 
	    	 {
	    		e.printStackTrace();
		  } 
	    }

	/**
	 * Create the frame.
	 */
	public ViewAllRecords() {
		Connect();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1200, 680);
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
		
		JLabel lblNewLabel = new JLabel("All Records");
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel.setFont(new Font("Sitka Heading", Font.BOLD, 48));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		JButton btnUpdateButton = new JButton("UPDATE RECORD");
		btnUpdateButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Clicked Update Record");
				if(isDataClicked) {

					clickedDataID = Integer.parseInt(table.getValueAt(table.getSelectedRow(), 0).toString());
					
					String fname, mname, lname, suffix, add1, add2, barangay, mun_city;
					String province, email, occupation, gender, place_of_birth, nationality;
					int contact, zip, age;
					
					
//					try {
//						d = new SimpleDateFormat("yyyy-MM-dd").parse((String)table.getValueAt(table.getSelectedRow(), 15));
//					} catch (ParseException e2) {
//						// TODO Auto-generated catch block
//						e2.printStackTrace();
//					}
//					java.sql.Date date_of_birth = new java.sql.Date(d.getTime());


					fname = table.getValueAt(table.getSelectedRow(), 1).toString();
					mname = table.getValueAt(table.getSelectedRow(), 2).toString();
					lname = table.getValueAt(table.getSelectedRow(), 3).toString();
					suffix = table.getValueAt(table.getSelectedRow(), 4).toString();
					
					add1 = table.getValueAt(table.getSelectedRow(), 5).toString();
					add2 = table.getValueAt(table.getSelectedRow(), 6).toString();
					
					barangay = table.getValueAt(table.getSelectedRow(), 7).toString();
					mun_city = table.getValueAt(table.getSelectedRow(), 8).toString();
					province = table.getValueAt(table.getSelectedRow(), 9).toString();
					zip = Integer.parseInt(table.getValueAt(table.getSelectedRow(), 10).toString());
					
					email = table.getValueAt(table.getSelectedRow(), 11).toString();
					contact = Integer.parseInt(table.getValueAt(table.getSelectedRow(), 12).toString());
					occupation = table.getValueAt(table.getSelectedRow(), 13).toString();
					gender = table.getValueAt(table.getSelectedRow(), 14).toString();
					
					age = Integer.parseInt(table.getValueAt(table.getSelectedRow(), 16).toString());
					place_of_birth = table.getValueAt(table.getSelectedRow(), 17).toString();
					nationality = table.getValueAt(table.getSelectedRow(), 18).toString();
					
					try {
						pst = conn.prepareStatement("UPDATE book SET first_name= ?, middle_name= ?, last_name= ?, suffix= ?, address_1= ?, address_2= ?, barangay= ?, municipality_city= ?, province= ?, zip= ?, email= ?, contact= ?, occupation= ?, gender= ?, age= ?, place_of_birth= ?, nationality =? WHERE ID = ?");
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
						
//						pst.setDate(15, date_of_birth);
						pst.setInt(15, age);
						pst.setString(16, place_of_birth);
						pst.setString(17, nationality);
						pst.setInt(18, clickedDataID);
						pst.executeUpdate();
						JOptionPane.showMessageDialog(null, "Record Updated Successfuly!");
						table_load();	
						
					   }
				 
					catch (SQLException e1) 
				        {
				        }
				}
			}
		});
		btnUpdateButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		JButton btnDeleteButton = new JButton("DELETE RECORD");
		btnDeleteButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(isDataClicked) {
					int tSearch;
					
					clickedDataID = Integer.parseInt(table.getValueAt(table.getSelectedRow(), 0).toString()) ;
					tSearch  = clickedDataID;
					
					try {
						pst = conn.prepareStatement("DELETE FROM book WHERE ID =?");
				
			            pst.setInt(1, tSearch);
			            pst.executeUpdate();
			            JOptionPane.showMessageDialog(null, "Record has been Deleted!");
			         
			            
					}
	 
		            catch (SQLException e1) {
						
						e1.printStackTrace();
					}
				}else {
					JOptionPane.showMessageDialog(null, "No data selected");
				}
			}
		});
		btnDeleteButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		JButton btnResetButton = new JButton("RESET TABLE");
		btnResetButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewAllRecords var = new ViewAllRecords();
				var.setVisible(true);
				dispose();
				
//				clickedDataID = table.getValueAt(table.getSelectedRow(), 0).toString();
//				String tSearch  = clickedDataID;
//				
//				try {
//					pst = conn.prepareStatement("SELECT * FROM book WHERE ID = ?");
//					pst.setString(1, tSearch);
//					
//				rs = pst.executeQuery();
//				rs.next();
//				System.out.println("First Name: " + rs.getString("first_name"));
//			
//				
//				}catch(SQLException e1) {
//					e1.printStackTrace();				
//				}
				
			}
		});
		btnResetButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(10)
					.addComponent(btnRescheduleBooking, GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
					.addGap(10)
					.addComponent(btnBookNewPatient, GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
					.addGap(10)
					.addComponent(btnCancelBooking, GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
					.addGap(442)
					.addComponent(btnLogout, GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
					.addGap(24))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(5)
					.addComponent(btnRescheduleBooking, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(5)
					.addComponent(btnBookNewPatient, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(5)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnCancelBooking, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnLogout, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)))
		);
		panel.setLayout(gl_panel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		
		table = new JTable(100,24);
		table.setAutoCreateRowSorter(true);
		table.setRowHeight(30);
		TableColumnModel columnModel = table.getColumnModel();
		columnModel.getColumn(0).setPreferredWidth(200);
		table.setFillsViewportHeight(true); 
		scrollPane.setViewportView(table);
		table.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
				table.getSelectionModel().addListSelectionListener(new ListSelectionListener(){
					public void valueChanged(ListSelectionEvent e) {
						isDataClicked = true;
					}
			    });
		
		JButton btnViewRecord = new JButton("VIEW RECORD");
		btnViewRecord.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(isDataClicked) {
					clickedDataID = Integer.parseInt(table.getValueAt(table.getSelectedRow(), 0).toString());
					ViewDetails vd = new ViewDetails(clickedDataID, 1);
					vd.setVisible(true);
//					dispose();
				}else {
					JOptionPane.showMessageDialog(null, "No data clicked!");
				}
			}
			
		});
		btnViewRecord.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		
		try {
			pst = conn.prepareStatement("select count(*) from book");
			rs = pst.executeQuery();
			rs.next();
		    dataCount = rs.getInt(1);
		    
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		JLabel lblNewLabel_1 = new JLabel("Number of Records: ");
		lblNewLabel_1.setFont(new Font("Sitka Text", Font.BOLD, 20));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.TRAILING);
		
		JLabel lblNewLabel_2 = new JLabel("" + dataCount);
		lblNewLabel_2.setFont(new Font("Sitka Text", Font.PLAIN, 20));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.LEFT);
		
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(panel, GroupLayout.DEFAULT_SIZE, 1164, Short.MAX_VALUE)
					.addGap(10))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(5)
					.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 1159, Short.MAX_VALUE)
					.addGap(10))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(5)
					.addComponent(lblNewLabel_1, GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
					.addGap(6)
					.addComponent(lblNewLabel_2, GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
					.addGap(827))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(5)
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 1159, Short.MAX_VALUE)
					.addGap(10))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(148)
					.addComponent(btnResetButton, GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
					.addGap(57)
					.addComponent(btnDeleteButton, GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
					.addGap(66)
					.addComponent(btnUpdateButton, GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
					.addGap(54)
					.addComponent(btnViewRecord, GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
					.addGap(81))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
					.addGap(6)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(lblNewLabel_2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addGap(25)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 347, GroupLayout.PREFERRED_SIZE)
					.addGap(46)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(2)
							.addComponent(btnResetButton, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
						.addComponent(btnDeleteButton, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(2)
							.addComponent(btnUpdateButton, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(2)
							.addComponent(btnViewRecord, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)))
					.addGap(41))
		);
		contentPane.setLayout(gl_contentPane);
		
		table_load();
		
	}
}
