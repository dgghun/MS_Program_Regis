package com.sessionnotes.view.createsessionjframe;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
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
import com.github.lgooddatepicker.components.DateTimePicker;
import com.github.lgooddatepicker.components.DatePicker;
import com.github.lgooddatepicker.components.DatePickerSettings;
import javax.swing.ImageIcon;
import com.github.lgooddatepicker.components.TimePicker;


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
		
		JPanel JPanel_SessionDate = new JPanel();
		sl_contentPane.putConstraint(SpringLayout.WEST, JPanel_SessionDate, 0, SpringLayout.WEST, JLbl_NewSessionForm);
		JPanel_SessionDate.setBackground(Color.WHITE);
		contentPane.add(JPanel_SessionDate);
		
		DatePicker DatePicker_SessoinDate = new DatePicker(getDatePickerSettings());
		DatePicker_SessoinDate.getComponentToggleCalendarButton().setText("");
		DatePicker_SessoinDate.getComponentToggleCalendarButton().setIcon(new ImageIcon(CreateSessionJFrame.class.getResource("/images/datepickerbutton1.png")));
		DatePicker_SessoinDate.setDateToToday();
		JPanel_SessionDate.add(DatePicker_SessoinDate);
		
		TimePicker TimePicker_SessionTime = new TimePicker();
		JPanel_SessionDate.add(TimePicker_SessionTime);
		
		JLabel JLbl_DateTime = new JLabel("Session Date and Time ");
		sl_contentPane.putConstraint(SpringLayout.NORTH, JPanel_SessionDate, 6, SpringLayout.SOUTH, JLbl_DateTime);
		sl_contentPane.putConstraint(SpringLayout.NORTH, JLbl_DateTime, 20, SpringLayout.SOUTH, JPanel_Labels);
		sl_contentPane.putConstraint(SpringLayout.WEST, JLbl_DateTime, 0, SpringLayout.WEST, JLbl_NewSessionForm);
		contentPane.add(JLbl_DateTime);
		JLbl_DateTime.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		

	}
	
	

	/**
	 * 
	 * @return
	 */
	private DatePickerSettings getDatePickerSettings() {
		DatePickerSettings dateSettings = new DatePickerSettings();
		dateSettings.setAllowKeyboardEditing(false);

		return dateSettings;
	}

	
	/**
	 * Returns current date in the same format
	 * used by JDatePicker component i.e. "Jan 1, 2018".
	 * @return String the current date.
	 */
	private String getCurrentDate() {
		Date now = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("MMMM d, yyyy");
		return dateFormat.format(now);
	}
}
