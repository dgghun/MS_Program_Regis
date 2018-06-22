package com.sessionnotes.view.createsessionjframe;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SpringLayout;
import javax.swing.border.EmptyBorder;

import org.jdatepicker.impl.DateComponentFormatter;
import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;

import com.toedter.calendar.JDateChooser;


public class CreateSessionJFrame extends JFrame {

	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private SpringLayout sl_contentPane;
	private JPanel JPanel_Labels;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CreateSessionJFrame frame = new CreateSessionJFrame();
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
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public CreateSessionJFrame() {
		setTitle("Session Notes - Create New Session");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 699, 485);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		sl_contentPane = new SpringLayout();
		contentPane.setLayout(sl_contentPane);
		
		JLabel JLbl_NewSessionForm = new JLabel("New Session Form");
		sl_contentPane.putConstraint(SpringLayout.NORTH, JLbl_NewSessionForm, 0, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, JLbl_NewSessionForm, 10, SpringLayout.WEST, contentPane);
		JLbl_NewSessionForm.setFont(new Font("Tahoma", Font.PLAIN, 26));
		contentPane.add(JLbl_NewSessionForm);
		
		JPanel_Labels = new JPanel();
		sl_contentPane.putConstraint(SpringLayout.NORTH, JPanel_Labels, 6, SpringLayout.SOUTH, JLbl_NewSessionForm);
		sl_contentPane.putConstraint(SpringLayout.WEST, JPanel_Labels, 0, SpringLayout.WEST, JLbl_NewSessionForm);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, JPanel_Labels, -329, SpringLayout.SOUTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, JPanel_Labels, -433, SpringLayout.EAST, contentPane);
		JPanel_Labels.setBackground(Color.WHITE);
		contentPane.add(JPanel_Labels);
		SpringLayout sl_JPanel_Labels = new SpringLayout();
		JPanel_Labels.setLayout(sl_JPanel_Labels);
		
		JLabel JLbl_ClientFullName = new JLabel("FirstName LastInitial");
		sl_JPanel_Labels.putConstraint(SpringLayout.NORTH, JLbl_ClientFullName, 0, SpringLayout.NORTH, JPanel_Labels);
		sl_JPanel_Labels.putConstraint(SpringLayout.WEST, JLbl_ClientFullName, 0, SpringLayout.WEST, JPanel_Labels);
		sl_contentPane.putConstraint(SpringLayout.NORTH, JLbl_ClientFullName, 6, SpringLayout.SOUTH, JLbl_NewSessionForm);
		sl_contentPane.putConstraint(SpringLayout.WEST, JLbl_ClientFullName, 10, SpringLayout.WEST, contentPane);
		JPanel_Labels.add(JLbl_ClientFullName);
		JLbl_ClientFullName.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JLabel JLbl_ClientID = new JLabel("ID: ####");
		sl_JPanel_Labels.putConstraint(SpringLayout.NORTH, JLbl_ClientID, 6, SpringLayout.SOUTH, JLbl_ClientFullName);
		sl_JPanel_Labels.putConstraint(SpringLayout.WEST, JLbl_ClientID, 0, SpringLayout.WEST, JLbl_ClientFullName);
		JLbl_ClientID.setFont(new Font("Tahoma", Font.PLAIN, 14));
		JPanel_Labels.add(JLbl_ClientID);
		
		JLabel JLbl_ClientPhone = new JLabel("Ph. ###-###-####");
		sl_JPanel_Labels.putConstraint(SpringLayout.NORTH, JLbl_ClientPhone, 6, SpringLayout.SOUTH, JLbl_ClientID);
		sl_JPanel_Labels.putConstraint(SpringLayout.WEST, JLbl_ClientPhone, 0, SpringLayout.WEST, JLbl_ClientFullName);
		JLbl_ClientPhone.setFont(new Font("Tahoma", Font.PLAIN, 14));
		JPanel_Labels.add(JLbl_ClientPhone);
		
		JPanel panel = new JPanel();
		sl_contentPane.putConstraint(SpringLayout.NORTH, panel, 46, SpringLayout.SOUTH, JPanel_Labels);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, panel, 84, SpringLayout.SOUTH, JPanel_Labels);
		panel.setBackground(Color.WHITE);
		sl_contentPane.putConstraint(SpringLayout.WEST, panel, 0, SpringLayout.WEST, JLbl_NewSessionForm);
		sl_contentPane.putConstraint(SpringLayout.EAST, panel, 13, SpringLayout.EAST, JPanel_Labels);
		contentPane.add(panel);
		SpringLayout sl_panel = new SpringLayout();
		panel.setLayout(sl_panel);
		
		JDateChooser dateChooser = new JDateChooser();
		sl_panel.putConstraint(SpringLayout.NORTH, dateChooser, 10, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.WEST, dateChooser, 88, SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.EAST, dateChooser, 0, SpringLayout.EAST, panel);
		dateChooser.setDate(new Date());
		panel.add(dateChooser);
		
		JLabel lblSessionDate = new JLabel("Session Date");
		sl_panel.putConstraint(SpringLayout.NORTH, lblSessionDate, 10, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.WEST, lblSessionDate, 0, SpringLayout.WEST, panel);
		panel.add(lblSessionDate);
		
		JPanel panel_1 = new JPanel();
		sl_contentPane.putConstraint(SpringLayout.NORTH, panel_1, 10, SpringLayout.SOUTH, panel);
		sl_contentPane.putConstraint(SpringLayout.WEST, panel_1, 0, SpringLayout.WEST, JLbl_NewSessionForm);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, panel_1, -197, SpringLayout.SOUTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, panel_1, -420, SpringLayout.EAST, contentPane);
		panel_1.setBackground(Color.WHITE);
		contentPane.add(panel_1);
		SpringLayout sl_panel_1 = new SpringLayout();
		panel_1.setLayout(sl_panel_1);
		
		JLabel lblSessionTime = new JLabel("Session Time");
		sl_panel_1.putConstraint(SpringLayout.NORTH, lblSessionTime, 10, SpringLayout.NORTH, panel_1);
		sl_panel_1.putConstraint(SpringLayout.WEST, lblSessionTime, 0, SpringLayout.WEST, panel_1);
		panel_1.add(lblSessionTime);
		
		JComboBox comboBox = new JComboBox();
		sl_panel_1.putConstraint(SpringLayout.NORTH, comboBox, -3, SpringLayout.NORTH, lblSessionTime);
		sl_panel_1.putConstraint(SpringLayout.WEST, comboBox, 27, SpringLayout.EAST, lblSessionTime);
		sl_panel_1.putConstraint(SpringLayout.EAST, comboBox, 0, SpringLayout.EAST, panel_1);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"12:00 AM", "12:30 AM", "1:00 AM", "1:30 AM", "2:00 AM", "2:30 AM", "3:00 AM", "3:30 AM", "4:00 AM", "4:30 AM", "5:00 AM", "5:30 AM", "6:00 AM", "6:30 AM", "7:00 AM", "7:30 AM", "8:00 AM", "8:30 AM", "9:00 AM", "9:30 AM", "10:00 AM", "10:30 AM", "11:00 AM", "11:30 AM", "12:00 PM", "12:30 PM", "1:00 PM", "1:30 PM", "2:00 PM", "2:30 PM", "3:00 PM", "3:30 PM", "4:00 PM", "4:30 PM", "5:00 PM", "5:30 PM", "6:00 PM", "6:30 PM", "7:00 PM", "7:30 PM", "8:00 PM", "8:30 PM", "9:00 PM", "9:30 PM", "10:00 PM", "10:30 PM", "11:00 PM", "11:30 PM"}));
		comboBox.setSelectedIndex(24);
		panel_1.add(comboBox);
		

	}
	
	
	
	/**
	 * Makes a fully formatted JDatePicker to be used on a 
	 * JFrame.
	 * @return JDatePickerImpl needs to be added to a JFrame or panel.
	 */
	private JDatePickerImpl getDatePickerComponent(){		
		Properties p = new Properties();
		p.put("text.today", "Today");
		p.put("text.month", "Month");
		p.put("text.year", "Year");
		UtilDateModel model = new UtilDateModel();
		JDatePanelImpl datePanel = new JDatePanelImpl(model, p);
		JDatePickerImpl datePickerImpl = new JDatePickerImpl(datePanel, new DateComponentFormatter());
		datePickerImpl.getJFormattedTextField().setText(getCurrentDate());
		datePickerImpl.getJFormattedTextField().setToolTipText("Click button on right to open calendar.");
	
				
		return datePickerImpl;
	}
	
	
	/**
	 * Returns current date in the same format
	 * used by JDatePicker component i.e. "Jan 1, 2018".
	 * @return String the current date.
	 */
	private String getCurrentDate() {
		Date now = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("MMM d, yyyy");
		return dateFormat.format(now);
	}
	
	
}
