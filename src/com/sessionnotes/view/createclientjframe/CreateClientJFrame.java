package com.sessionnotes.view.createclientjframe;

import java.awt.Color;
import java.awt.Component;
import java.awt.ComponentOrientation;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import javax.swing.border.EmptyBorder;
import javax.swing.SwingConstants;
import javax.swing.JSpinner;
import javax.swing.SpinnerListModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.SpinnerDateModel;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Arrays;
import java.util.Calendar;

/**
 * 
 * <h1>CreateClientJFrame.java</h1>
 * 
 * This is the main UI for creating a new client
 * in the application. The main logic is controlled
 * by the CreateClientJFrameController.
 * 
 *  Some of the text fields (birthday, City, etc.) will
 *  be updated in the future with proper swing components that
 *  can handle these fields better, such as, JSpinner selector.
 *  There are also text tool tips that will be embedded directly
 *  into the text fields that will disappear once the user starts
 *  typing into the field. As of now, you can only
 *  see the text field tool tip when hovering over the text fields.
 *  
 *
 * @author David Garcia
 * @version 1.0
 * @since 06-17-2018
 *
 */
public class CreateClientJFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@SuppressWarnings("unused")
	private CreateClientJFrameController clientJFrameController;	//suppressing warning
	private JButton JBtnSaveClient;
	private JButton JBtnCancel;
	private JCheckBox JChkBox_copyClientInfo;
	
	
	//Auto generated code
	private JPanel contentPane;
	private JPanel JPanel_ClientInfo;
	private JTextField JTxtField_firstName;
	private JTextField JTxtField_lastName;
	private JTextField JTxtField_middleName;
	private JTextField JTxtField_Address1;
	private JTextField JTxtField_Address2;
	private JTextField JTxtField_City;
	private JComboBox JComBox_ClientState;
	private JTextField JTxtField_Zip;
	private JLabel JLbl_ClientBirthDate;
	private JComboBox JComBox_ClientBirthMonth;
	private JComboBox JComBox_ClientBirthDay;
	private JComboBox JComBox_BirthYear;
	private JLabel JLbl_ClientPhone;
	private JTextField JTxtField_ClientPhone;
	private JLabel JLbl_ClientEmail;
	private JTextField JTxtField_ClientEmail;
	private JLabel JLbl_ClientFee;
	private JTextField JTxtField_ClientFee;
	private JLabel JLbl_SecondaryClients;
	private JTextField JTxtField_SecondaryFirstName;
	private JTextField JTxtField_SecondaryLastName;
	private JTextField JTxtField_SecondaryMiddleName;
	private JPanel JPanel_InsuranceInfo;
	private JLabel JLbl_Insurance;
	private JLabel lblNewClientForm;
	private JTextField JTxtField_insuranceType;
	private JTextField JTxtField_IdNumber;
	private JTextField JTxtField_GroupNumber;
	private JTextField JTxtField_InsuredFirstName;
	private JTextField JTxtField_InsuredLastName;
	private JTextField JTxtField_InsuredMiddleName;
	private JLabel JLbl_InsuredAddress;
	private JTextField JTxtField_InsuredAddress1;
	private JTextField JTxtField_InsuredAddress2;
	private JTextField JTxtField_InsuredCity;
	private JTextField JTxtField_InsuredState;
	private JTextField JTxtField_InsuredZip;
	private JLabel JLbl_InsuredBirthDate;
	private JTextField JTxtField_InsuredBirthMonth;
	private JTextField JTxtField_InsuredBirthDay;
	private JTextField JTxtField_InsuredBirthYear;
	private JLabel JLbl_InsuredPhone;
	private JTextField JTxtField_InsuredPhone;
	private JLabel JLbl_ClientStreet;
	private JLabel JLbl_ClientAptSuite;
	private JLabel JLbl_ClientCity;
	private JLabel JLbl_ClientState;
	private JLabel JLbl_ClientZip;
	private JLabel lblNewLabel;
	
	

	//Auto generated code
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					@SuppressWarnings("unused")	// suppressing warning. 
					CreateClientJFrame frame = new CreateClientJFrame();
//					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	//Auto generated code
	/**
	 * Create the frame.
	 */
	public CreateClientJFrame() {
		
		
		//Auto generated code below this line.
		setTitle("Session Notes - Create New Client");
		setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 852, 440);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		SpringLayout sl_contentPane = new SpringLayout();
		contentPane.setLayout(sl_contentPane);
		
		JPanel_ClientInfo = new JPanel();
		sl_contentPane.putConstraint(SpringLayout.NORTH, JPanel_ClientInfo, 46, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, JPanel_ClientInfo, 10, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, JPanel_ClientInfo, -49, SpringLayout.SOUTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, JPanel_ClientInfo, 408, SpringLayout.WEST, contentPane);
		JPanel_ClientInfo.setBackground(new Color(230, 230, 250));
		JPanel_ClientInfo.setAlignmentX(Component.LEFT_ALIGNMENT);
		contentPane.add(JPanel_ClientInfo);
		SpringLayout sl_JPanel_ClientInfo = new SpringLayout();
		JPanel_ClientInfo.setLayout(sl_JPanel_ClientInfo);
		
		JLabel JLbl_ClientName = new JLabel("Client - First Name");
		sl_JPanel_ClientInfo.putConstraint(SpringLayout.WEST, JLbl_ClientName, 10, SpringLayout.WEST, JPanel_ClientInfo);
		JLbl_ClientName.setFont(new Font("Tahoma", Font.BOLD, 11));
		JPanel_ClientInfo.add(JLbl_ClientName);
		
		JTxtField_firstName = new JTextField();
		JTxtField_firstName.setToolTipText("First Name");
		sl_JPanel_ClientInfo.putConstraint(SpringLayout.SOUTH, JLbl_ClientName, -6, SpringLayout.NORTH, JTxtField_firstName);
		sl_JPanel_ClientInfo.putConstraint(SpringLayout.WEST, JTxtField_firstName, 10, SpringLayout.WEST, JPanel_ClientInfo);
		sl_JPanel_ClientInfo.putConstraint(SpringLayout.EAST, JTxtField_firstName, 140, SpringLayout.WEST, JPanel_ClientInfo);
		JPanel_ClientInfo.add(JTxtField_firstName);
		JTxtField_firstName.setColumns(10);
		
		JTxtField_lastName = new JTextField();
		JTxtField_lastName.setToolTipText("Last Name");
		sl_JPanel_ClientInfo.putConstraint(SpringLayout.WEST, JTxtField_lastName, 6, SpringLayout.EAST, JTxtField_firstName);
		sl_JPanel_ClientInfo.putConstraint(SpringLayout.EAST, JTxtField_lastName, 276, SpringLayout.WEST, JPanel_ClientInfo);
		JPanel_ClientInfo.add(JTxtField_lastName);
		JTxtField_lastName.setColumns(10);
		
		JTxtField_middleName = new JTextField();
		sl_JPanel_ClientInfo.putConstraint(SpringLayout.WEST, JTxtField_middleName, 6, SpringLayout.EAST, JTxtField_lastName);
		sl_JPanel_ClientInfo.putConstraint(SpringLayout.EAST, JTxtField_middleName, -10, SpringLayout.EAST, JPanel_ClientInfo);
		JTxtField_middleName.setToolTipText("Middle Name");
		JPanel_ClientInfo.add(JTxtField_middleName);
		JTxtField_middleName.setColumns(10);
		
		JLabel JLbl_ClientAddress = new JLabel("Client Address");
		sl_JPanel_ClientInfo.putConstraint(SpringLayout.WEST, JLbl_ClientAddress, 10, SpringLayout.WEST, JPanel_ClientInfo);
		sl_JPanel_ClientInfo.putConstraint(SpringLayout.SOUTH, JTxtField_firstName, -6, SpringLayout.NORTH, JLbl_ClientAddress);
		JLbl_ClientAddress.setFont(new Font("Tahoma", Font.BOLD, 11));
		JPanel_ClientInfo.add(JLbl_ClientAddress);
		
		JTxtField_Address1 = new JTextField();
		sl_JPanel_ClientInfo.putConstraint(SpringLayout.EAST, JTxtField_Address1, -10, SpringLayout.EAST, JPanel_ClientInfo);
		sl_JPanel_ClientInfo.putConstraint(SpringLayout.SOUTH, JLbl_ClientAddress, -6, SpringLayout.NORTH, JTxtField_Address1);
		sl_JPanel_ClientInfo.putConstraint(SpringLayout.NORTH, JTxtField_Address1, 77, SpringLayout.NORTH, JPanel_ClientInfo);
		JTxtField_Address1.setToolTipText("Address 1");
		JPanel_ClientInfo.add(JTxtField_Address1);
		JTxtField_Address1.setColumns(10);
		
		JTxtField_Address2 = new JTextField();
		sl_JPanel_ClientInfo.putConstraint(SpringLayout.WEST, JTxtField_Address2, 61, SpringLayout.WEST, JPanel_ClientInfo);
		sl_JPanel_ClientInfo.putConstraint(SpringLayout.SOUTH, JTxtField_Address2, -174, SpringLayout.SOUTH, JPanel_ClientInfo);
		sl_JPanel_ClientInfo.putConstraint(SpringLayout.EAST, JTxtField_Address2, -10, SpringLayout.EAST, JPanel_ClientInfo);
		JTxtField_Address2.setToolTipText("Address 2");
		JPanel_ClientInfo.add(JTxtField_Address2);
		JTxtField_Address2.setColumns(10);
		
		JTxtField_City = new JTextField();
		sl_JPanel_ClientInfo.putConstraint(SpringLayout.SOUTH, JTxtField_City, -148, SpringLayout.SOUTH, JPanel_ClientInfo);
		sl_JPanel_ClientInfo.putConstraint(SpringLayout.EAST, JTxtField_City, -202, SpringLayout.EAST, JPanel_ClientInfo);
		JTxtField_City.setToolTipText("City");
		JPanel_ClientInfo.add(JTxtField_City);
		JTxtField_City.setColumns(10);
		
		JComBox_ClientState = new JComboBox();
		sl_JPanel_ClientInfo.putConstraint(SpringLayout.NORTH, JComBox_ClientState, 6, SpringLayout.SOUTH, JTxtField_Address2);
		JComBox_ClientState.setModel(new DefaultComboBoxModel(new String[] {"AL", "AK", "AZ", "AR", "CA", "CO", "CT", "DE", "FL", "GA", "HI", "ID", "IL", "IN", "IA", "KS", "KY", "LA", "ME", "MD", "MA", "MI", "MN", "MS", "MO", "MT", "NE", "NV", "NH", "NJ", "NM", "NY", "NC", "ND", "OH", "OK", "OR", "PA", "RI", "SC", "SD", "TN", "TX", "UT", "VT", "VA", "WA", "WV", "WI", "WY"}));
		JComBox_ClientState.setToolTipText("State");
		JPanel_ClientInfo.add(JComBox_ClientState);
		
		JTxtField_Zip = new JTextField();
		sl_JPanel_ClientInfo.putConstraint(SpringLayout.NORTH, JTxtField_Zip, 6, SpringLayout.SOUTH, JTxtField_Address2);
		sl_JPanel_ClientInfo.putConstraint(SpringLayout.WEST, JTxtField_Zip, -80, SpringLayout.EAST, JPanel_ClientInfo);
		sl_JPanel_ClientInfo.putConstraint(SpringLayout.EAST, JTxtField_Zip, 0, SpringLayout.EAST, JTxtField_middleName);
		JTxtField_Zip.setToolTipText("Zip Code");
		JPanel_ClientInfo.add(JTxtField_Zip);
		JTxtField_Zip.setColumns(10);
		
		JLbl_ClientBirthDate = new JLabel("Client Birth Date");
		sl_JPanel_ClientInfo.putConstraint(SpringLayout.WEST, JLbl_ClientBirthDate, 0, SpringLayout.WEST, JLbl_ClientName);
		JLbl_ClientBirthDate.setFont(new Font("Tahoma", Font.BOLD, 11));
		JPanel_ClientInfo.add(JLbl_ClientBirthDate);
		
		JComBox_ClientBirthMonth = new JComboBox();
		sl_JPanel_ClientInfo.putConstraint(SpringLayout.NORTH, JComBox_ClientBirthMonth, -3, SpringLayout.NORTH, JLbl_ClientBirthDate);
		sl_JPanel_ClientInfo.putConstraint(SpringLayout.WEST, JComBox_ClientBirthMonth, 6, SpringLayout.EAST, JLbl_ClientBirthDate);
		sl_JPanel_ClientInfo.putConstraint(SpringLayout.EAST, JComBox_ClientBirthMonth, -13, SpringLayout.EAST, JTxtField_City);
		JComBox_ClientBirthMonth.setModel(new DefaultComboBoxModel(new String[] {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"}));
		JComBox_ClientBirthMonth.setToolTipText("Month");
		JPanel_ClientInfo.add(JComBox_ClientBirthMonth);
		
		JComBox_ClientBirthDay = new JComboBox();
		sl_JPanel_ClientInfo.putConstraint(SpringLayout.NORTH, JComBox_ClientBirthDay, -3, SpringLayout.NORTH, JLbl_ClientBirthDate);
		sl_JPanel_ClientInfo.putConstraint(SpringLayout.WEST, JComBox_ClientBirthDay, 6, SpringLayout.EAST, JComBox_ClientBirthMonth);
		sl_JPanel_ClientInfo.putConstraint(SpringLayout.EAST, JComBox_ClientBirthDay, 56, SpringLayout.EAST, JComBox_ClientBirthMonth);
		JComBox_ClientBirthDay.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		JComBox_ClientBirthDay.setToolTipText("Day");
		JPanel_ClientInfo.add(JComBox_ClientBirthDay);
		
		JComBox_BirthYear = new JComboBox();
		sl_JPanel_ClientInfo.putConstraint(SpringLayout.NORTH, JComBox_BirthYear, -3, SpringLayout.NORTH, JLbl_ClientBirthDate);
		sl_JPanel_ClientInfo.putConstraint(SpringLayout.WEST, JComBox_BirthYear, 6, SpringLayout.EAST, JComBox_ClientBirthDay);
		sl_JPanel_ClientInfo.putConstraint(SpringLayout.EAST, JComBox_BirthYear, -85, SpringLayout.EAST, JPanel_ClientInfo);
		JComBox_BirthYear.setModel(new DefaultComboBoxModel(getYearsFromCurrent()));	//My code to get an array of past years
		JComBox_BirthYear.setToolTipText("Year");
		JPanel_ClientInfo.add(JComBox_BirthYear);
		
		JLbl_ClientPhone = new JLabel("Client Phone");
		sl_JPanel_ClientInfo.putConstraint(SpringLayout.SOUTH, JLbl_ClientBirthDate, -17, SpringLayout.NORTH, JLbl_ClientPhone);
		sl_JPanel_ClientInfo.putConstraint(SpringLayout.WEST, JLbl_ClientPhone, 10, SpringLayout.WEST, JPanel_ClientInfo);
		JLbl_ClientPhone.setFont(new Font("Tahoma", Font.BOLD, 11));
		JPanel_ClientInfo.add(JLbl_ClientPhone);
		
		JTxtField_ClientPhone = new JTextField();
		sl_JPanel_ClientInfo.putConstraint(SpringLayout.WEST, JTxtField_ClientPhone, 10, SpringLayout.WEST, JPanel_ClientInfo);
		JTxtField_ClientPhone.setToolTipText("###-###-####");
		sl_JPanel_ClientInfo.putConstraint(SpringLayout.SOUTH, JLbl_ClientPhone, -6, SpringLayout.NORTH, JTxtField_ClientPhone);
		JPanel_ClientInfo.add(JTxtField_ClientPhone);
		JTxtField_ClientPhone.setColumns(10);
		
		JLbl_ClientEmail = new JLabel("Client Email");
		sl_JPanel_ClientInfo.putConstraint(SpringLayout.WEST, JLbl_ClientEmail, 42, SpringLayout.EAST, JLbl_ClientPhone);
		sl_JPanel_ClientInfo.putConstraint(SpringLayout.NORTH, JLbl_ClientEmail, 0, SpringLayout.NORTH, JLbl_ClientPhone);
		JLbl_ClientEmail.setFont(new Font("Tahoma", Font.BOLD, 11));
		JPanel_ClientInfo.add(JLbl_ClientEmail);
		
		JTxtField_ClientEmail = new JTextField();
		sl_JPanel_ClientInfo.putConstraint(SpringLayout.WEST, JTxtField_ClientEmail, 122, SpringLayout.WEST, JPanel_ClientInfo);
		sl_JPanel_ClientInfo.putConstraint(SpringLayout.EAST, JTxtField_ClientEmail, -121, SpringLayout.EAST, JPanel_ClientInfo);
		sl_JPanel_ClientInfo.putConstraint(SpringLayout.EAST, JTxtField_ClientPhone, -6, SpringLayout.WEST, JTxtField_ClientEmail);
		JTxtField_ClientEmail.setToolTipText("johnD@abc.com");
		sl_JPanel_ClientInfo.putConstraint(SpringLayout.NORTH, JTxtField_ClientEmail, 6, SpringLayout.SOUTH, JLbl_ClientEmail);
		JPanel_ClientInfo.add(JTxtField_ClientEmail);
		JTxtField_ClientEmail.setColumns(10);
		
		JLbl_ClientFee = new JLabel("Client Fee");
		sl_JPanel_ClientInfo.putConstraint(SpringLayout.NORTH, JLbl_ClientFee, 0, SpringLayout.NORTH, JLbl_ClientPhone);
		JLbl_ClientFee.setFont(new Font("Tahoma", Font.BOLD, 11));
		JPanel_ClientInfo.add(JLbl_ClientFee);
		
		JTxtField_ClientFee = new JTextField();
		sl_JPanel_ClientInfo.putConstraint(SpringLayout.NORTH, JTxtField_ClientFee, 6, SpringLayout.SOUTH, JLbl_ClientFee);
		sl_JPanel_ClientInfo.putConstraint(SpringLayout.WEST, JLbl_ClientFee, 0, SpringLayout.WEST, JTxtField_ClientFee);
		sl_JPanel_ClientInfo.putConstraint(SpringLayout.EAST, JTxtField_ClientFee, -17, SpringLayout.EAST, JPanel_ClientInfo);
		JTxtField_ClientFee.setToolTipText("123");
		JPanel_ClientInfo.add(JTxtField_ClientFee);
		JTxtField_ClientFee.setColumns(10);
		
		JLbl_SecondaryClients = new JLabel("Secondary Client");
		sl_JPanel_ClientInfo.putConstraint(SpringLayout.WEST, JLbl_SecondaryClients, 10, SpringLayout.WEST, JPanel_ClientInfo);
		sl_JPanel_ClientInfo.putConstraint(SpringLayout.SOUTH, JTxtField_ClientPhone, -6, SpringLayout.NORTH, JLbl_SecondaryClients);
		JLbl_SecondaryClients.setFont(new Font("Tahoma", Font.BOLD, 11));
		JPanel_ClientInfo.add(JLbl_SecondaryClients);
		
		JTxtField_SecondaryFirstName = new JTextField();
		JTxtField_SecondaryFirstName.setToolTipText("First Name");
		sl_JPanel_ClientInfo.putConstraint(SpringLayout.SOUTH, JLbl_SecondaryClients, -6, SpringLayout.NORTH, JTxtField_SecondaryFirstName);
		sl_JPanel_ClientInfo.putConstraint(SpringLayout.EAST, JTxtField_SecondaryFirstName, 116, SpringLayout.WEST, JPanel_ClientInfo);
		sl_JPanel_ClientInfo.putConstraint(SpringLayout.WEST, JTxtField_SecondaryFirstName, 10, SpringLayout.WEST, JPanel_ClientInfo);
		sl_JPanel_ClientInfo.putConstraint(SpringLayout.NORTH, JTxtField_SecondaryFirstName, 266, SpringLayout.NORTH, JPanel_ClientInfo);
		JPanel_ClientInfo.add(JTxtField_SecondaryFirstName);
		JTxtField_SecondaryFirstName.setColumns(10);
		
		JTxtField_SecondaryLastName = new JTextField();
		JTxtField_SecondaryLastName.setToolTipText("Last Name");
		sl_JPanel_ClientInfo.putConstraint(SpringLayout.NORTH, JTxtField_SecondaryLastName, 26, SpringLayout.SOUTH, JTxtField_ClientEmail);
		sl_JPanel_ClientInfo.putConstraint(SpringLayout.WEST, JTxtField_SecondaryLastName, 6, SpringLayout.EAST, JTxtField_SecondaryFirstName);
		JPanel_ClientInfo.add(JTxtField_SecondaryLastName);
		JTxtField_SecondaryLastName.setColumns(10);
		
		JTxtField_SecondaryMiddleName = new JTextField();
		sl_JPanel_ClientInfo.putConstraint(SpringLayout.SOUTH, JTxtField_SecondaryMiddleName, -11, SpringLayout.SOUTH, JPanel_ClientInfo);
		JTxtField_SecondaryMiddleName.setToolTipText("Middle Name");
		sl_JPanel_ClientInfo.putConstraint(SpringLayout.EAST, JTxtField_SecondaryLastName, -6, SpringLayout.WEST, JTxtField_SecondaryMiddleName);
		sl_JPanel_ClientInfo.putConstraint(SpringLayout.WEST, JTxtField_SecondaryMiddleName, 258, SpringLayout.WEST, JPanel_ClientInfo);
		sl_JPanel_ClientInfo.putConstraint(SpringLayout.EAST, JTxtField_SecondaryMiddleName, 388, SpringLayout.WEST, JPanel_ClientInfo);
		JPanel_ClientInfo.add(JTxtField_SecondaryMiddleName);
		JTxtField_SecondaryMiddleName.setColumns(10);
		
		JPanel_InsuranceInfo = new JPanel();
		sl_contentPane.putConstraint(SpringLayout.NORTH, JPanel_InsuranceInfo, 0, SpringLayout.NORTH, JPanel_ClientInfo);
		sl_contentPane.putConstraint(SpringLayout.WEST, JPanel_InsuranceInfo, 6, SpringLayout.EAST, JPanel_ClientInfo);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, JPanel_InsuranceInfo, -49, SpringLayout.SOUTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, JPanel_InsuranceInfo, 408, SpringLayout.EAST, JPanel_ClientInfo);
		
		JLabel JLbl_ClientFirstName = new JLabel("Last Name");
		sl_JPanel_ClientInfo.putConstraint(SpringLayout.NORTH, JTxtField_lastName, 6, SpringLayout.SOUTH, JLbl_ClientFirstName);
		sl_JPanel_ClientInfo.putConstraint(SpringLayout.NORTH, JLbl_ClientFirstName, 0, SpringLayout.NORTH, JLbl_ClientName);
		sl_JPanel_ClientInfo.putConstraint(SpringLayout.WEST, JLbl_ClientFirstName, 0, SpringLayout.WEST, JTxtField_lastName);
		JLbl_ClientFirstName.setFont(new Font("Tahoma", Font.BOLD, 11));
		JPanel_ClientInfo.add(JLbl_ClientFirstName);
		
		JLabel JLb_ClientlMiddleName = new JLabel("Middle Name");
		sl_JPanel_ClientInfo.putConstraint(SpringLayout.WEST, JLb_ClientlMiddleName, 77, SpringLayout.EAST, JLbl_ClientFirstName);
		sl_JPanel_ClientInfo.putConstraint(SpringLayout.NORTH, JTxtField_middleName, 6, SpringLayout.SOUTH, JLb_ClientlMiddleName);
		JLb_ClientlMiddleName.setFont(new Font("Tahoma", Font.BOLD, 11));
		sl_JPanel_ClientInfo.putConstraint(SpringLayout.NORTH, JLb_ClientlMiddleName, 0, SpringLayout.NORTH, JLbl_ClientName);
		JPanel_ClientInfo.add(JLb_ClientlMiddleName);
		
		JLbl_ClientStreet = new JLabel("Street");
		sl_JPanel_ClientInfo.putConstraint(SpringLayout.WEST, JTxtField_Address1, 6, SpringLayout.EAST, JLbl_ClientStreet);
		sl_JPanel_ClientInfo.putConstraint(SpringLayout.NORTH, JLbl_ClientStreet, 3, SpringLayout.NORTH, JTxtField_Address1);
		sl_JPanel_ClientInfo.putConstraint(SpringLayout.WEST, JLbl_ClientStreet, 0, SpringLayout.WEST, JLbl_ClientName);
		sl_JPanel_ClientInfo.putConstraint(SpringLayout.EAST, JLbl_ClientStreet, -343, SpringLayout.EAST, JPanel_ClientInfo);
		JLbl_ClientStreet.setHorizontalAlignment(SwingConstants.TRAILING);
		JLbl_ClientStreet.setFont(new Font("Tahoma", Font.BOLD, 11));
		JPanel_ClientInfo.add(JLbl_ClientStreet);
		
		JLbl_ClientAptSuite = new JLabel("Apt/Ste");
		sl_JPanel_ClientInfo.putConstraint(SpringLayout.NORTH, JLbl_ClientAptSuite, 3, SpringLayout.NORTH, JTxtField_Address2);
		sl_JPanel_ClientInfo.putConstraint(SpringLayout.EAST, JLbl_ClientAptSuite, -6, SpringLayout.WEST, JTxtField_Address2);
		JLbl_ClientAptSuite.setFont(new Font("Tahoma", Font.BOLD, 11));
		JPanel_ClientInfo.add(JLbl_ClientAptSuite);
		
		JLbl_ClientCity = new JLabel("City");
		sl_JPanel_ClientInfo.putConstraint(SpringLayout.NORTH, JLbl_ClientCity, 12, SpringLayout.SOUTH, JLbl_ClientAptSuite);
		sl_JPanel_ClientInfo.putConstraint(SpringLayout.EAST, JLbl_ClientCity, -342, SpringLayout.EAST, JPanel_ClientInfo);
		sl_JPanel_ClientInfo.putConstraint(SpringLayout.WEST, JTxtField_City, 5, SpringLayout.EAST, JLbl_ClientCity);
		JLbl_ClientCity.setFont(new Font("Tahoma", Font.BOLD, 11));
		JPanel_ClientInfo.add(JLbl_ClientCity);
		
		JLbl_ClientState = new JLabel("State");
		sl_JPanel_ClientInfo.putConstraint(SpringLayout.WEST, JComBox_ClientState, 6, SpringLayout.EAST, JLbl_ClientState);
		sl_JPanel_ClientInfo.putConstraint(SpringLayout.NORTH, JLbl_ClientState, 3, SpringLayout.NORTH, JTxtField_City);
		sl_JPanel_ClientInfo.putConstraint(SpringLayout.WEST, JLbl_ClientState, 6, SpringLayout.EAST, JTxtField_City);
		sl_JPanel_ClientInfo.putConstraint(SpringLayout.EAST, JLbl_ClientState, -165, SpringLayout.EAST, JPanel_ClientInfo);
		JLbl_ClientState.setFont(new Font("Tahoma", Font.BOLD, 11));
		JPanel_ClientInfo.add(JLbl_ClientState);
		
		JLbl_ClientZip = new JLabel("Zip");
		sl_JPanel_ClientInfo.putConstraint(SpringLayout.EAST, JComBox_ClientState, -11, SpringLayout.WEST, JLbl_ClientZip);
		sl_JPanel_ClientInfo.putConstraint(SpringLayout.NORTH, JLbl_ClientZip, 3, SpringLayout.NORTH, JTxtField_City);
		sl_JPanel_ClientInfo.putConstraint(SpringLayout.EAST, JLbl_ClientZip, -6, SpringLayout.WEST, JTxtField_Zip);
		JLbl_ClientZip.setFont(new Font("Tahoma", Font.BOLD, 11));
		JPanel_ClientInfo.add(JLbl_ClientZip);
		
		lblNewLabel = new JLabel(" $");
		sl_JPanel_ClientInfo.putConstraint(SpringLayout.WEST, JTxtField_ClientFee, -4, SpringLayout.EAST, lblNewLabel);
		sl_JPanel_ClientInfo.putConstraint(SpringLayout.WEST, lblNewLabel, 5, SpringLayout.EAST, JTxtField_ClientEmail);
		sl_JPanel_ClientInfo.putConstraint(SpringLayout.SOUTH, lblNewLabel, -29, SpringLayout.NORTH, JTxtField_SecondaryMiddleName);
		sl_JPanel_ClientInfo.putConstraint(SpringLayout.EAST, lblNewLabel, -99, SpringLayout.EAST, JPanel_ClientInfo);
		JPanel_ClientInfo.add(lblNewLabel);
		JPanel_InsuranceInfo.setBackground(new Color(255, 255, 204));
		contentPane.add(JPanel_InsuranceInfo);
		SpringLayout sl_JPanel_InsuranceInfo = new SpringLayout();
		JPanel_InsuranceInfo.setLayout(sl_JPanel_InsuranceInfo);
		
		JLbl_Insurance = new JLabel("Insurance");
		sl_JPanel_InsuranceInfo.putConstraint(SpringLayout.NORTH, JLbl_Insurance, 10, SpringLayout.NORTH, JPanel_InsuranceInfo);
		sl_JPanel_InsuranceInfo.putConstraint(SpringLayout.WEST, JLbl_Insurance, 10, SpringLayout.WEST, JPanel_InsuranceInfo);
		JLbl_Insurance.setFont(new Font("Tahoma", Font.BOLD, 11));
		JPanel_InsuranceInfo.add(JLbl_Insurance);
		
		JTxtField_insuranceType = new JTextField();
		JTxtField_insuranceType.setToolTipText("Type (Medicare, etc.)");
		sl_JPanel_InsuranceInfo.putConstraint(SpringLayout.NORTH, JTxtField_insuranceType, 6, SpringLayout.SOUTH, JLbl_Insurance);
		sl_JPanel_InsuranceInfo.putConstraint(SpringLayout.WEST, JTxtField_insuranceType, 10, SpringLayout.WEST, JPanel_InsuranceInfo);
		sl_JPanel_InsuranceInfo.putConstraint(SpringLayout.EAST, JTxtField_insuranceType, 140, SpringLayout.WEST, JPanel_InsuranceInfo);
		JPanel_InsuranceInfo.add(JTxtField_insuranceType);
		JTxtField_insuranceType.setColumns(10);
		
		JTxtField_IdNumber = new JTextField();
		JTxtField_IdNumber.setToolTipText("ID Number");
		sl_JPanel_InsuranceInfo.putConstraint(SpringLayout.NORTH, JTxtField_IdNumber, 30, SpringLayout.NORTH, JPanel_InsuranceInfo);
		sl_JPanel_InsuranceInfo.putConstraint(SpringLayout.WEST, JTxtField_IdNumber, 6, SpringLayout.EAST, JTxtField_insuranceType);
		sl_JPanel_InsuranceInfo.putConstraint(SpringLayout.EAST, JTxtField_IdNumber, 136, SpringLayout.EAST, JTxtField_insuranceType);
		JPanel_InsuranceInfo.add(JTxtField_IdNumber);
		JTxtField_IdNumber.setColumns(10);
		
		JTxtField_GroupNumber = new JTextField();
		JTxtField_GroupNumber.setToolTipText("Group Number");
		sl_JPanel_InsuranceInfo.putConstraint(SpringLayout.NORTH, JTxtField_GroupNumber, 30, SpringLayout.NORTH, JPanel_InsuranceInfo);
		sl_JPanel_InsuranceInfo.putConstraint(SpringLayout.WEST, JTxtField_GroupNumber, 6, SpringLayout.EAST, JTxtField_IdNumber);
		sl_JPanel_InsuranceInfo.putConstraint(SpringLayout.EAST, JTxtField_GroupNumber, 116, SpringLayout.EAST, JTxtField_IdNumber);
		JPanel_InsuranceInfo.add(JTxtField_GroupNumber);
		JTxtField_GroupNumber.setColumns(10);
		
		JCheckBox JCheckbox_CopyClientInfo = new JCheckBox("Same as Client");
		sl_JPanel_InsuranceInfo.putConstraint(SpringLayout.NORTH, JCheckbox_CopyClientInfo, 2, SpringLayout.SOUTH, JTxtField_IdNumber);
		sl_JPanel_InsuranceInfo.putConstraint(SpringLayout.WEST, JCheckbox_CopyClientInfo, 0, SpringLayout.WEST, JTxtField_IdNumber);
		JCheckbox_CopyClientInfo.setBackground(new Color(255, 255, 204));
		JPanel_InsuranceInfo.add(JCheckbox_CopyClientInfo);
		
		JLabel JLbl_InsuredName = new JLabel("Insured Name");
		sl_JPanel_InsuranceInfo.putConstraint(SpringLayout.NORTH, JLbl_InsuredName, 4, SpringLayout.NORTH, JCheckbox_CopyClientInfo);
		sl_JPanel_InsuranceInfo.putConstraint(SpringLayout.WEST, JLbl_InsuredName, 0, SpringLayout.WEST, JLbl_Insurance);
		JLbl_InsuredName.setFont(new Font("Tahoma", Font.BOLD, 11));
		JPanel_InsuranceInfo.add(JLbl_InsuredName);
		
		JTxtField_InsuredFirstName = new JTextField();
		JTxtField_InsuredFirstName.setToolTipText("First Name");
		sl_JPanel_InsuranceInfo.putConstraint(SpringLayout.NORTH, JTxtField_InsuredFirstName, 6, SpringLayout.SOUTH, JLbl_InsuredName);
		sl_JPanel_InsuranceInfo.putConstraint(SpringLayout.WEST, JTxtField_InsuredFirstName, 0, SpringLayout.WEST, JLbl_Insurance);
		sl_JPanel_InsuranceInfo.putConstraint(SpringLayout.EAST, JTxtField_InsuredFirstName, 0, SpringLayout.EAST, JTxtField_insuranceType);
		JPanel_InsuranceInfo.add(JTxtField_InsuredFirstName);
		JTxtField_InsuredFirstName.setColumns(10);
		
		JTxtField_InsuredLastName = new JTextField();
		JTxtField_InsuredLastName.setToolTipText("Last Name");
		sl_JPanel_InsuranceInfo.putConstraint(SpringLayout.NORTH, JTxtField_InsuredLastName, 0, SpringLayout.NORTH, JTxtField_InsuredFirstName);
		sl_JPanel_InsuranceInfo.putConstraint(SpringLayout.WEST, JTxtField_InsuredLastName, 0, SpringLayout.WEST, JTxtField_IdNumber);
		sl_JPanel_InsuranceInfo.putConstraint(SpringLayout.EAST, JTxtField_InsuredLastName, 0, SpringLayout.EAST, JTxtField_IdNumber);
		JPanel_InsuranceInfo.add(JTxtField_InsuredLastName);
		JTxtField_InsuredLastName.setColumns(10);
		
		JTxtField_InsuredMiddleName = new JTextField();
		JTxtField_InsuredMiddleName.setToolTipText("Middle Name");
		sl_JPanel_InsuranceInfo.putConstraint(SpringLayout.NORTH, JTxtField_InsuredMiddleName, 0, SpringLayout.NORTH, JTxtField_InsuredFirstName);
		sl_JPanel_InsuranceInfo.putConstraint(SpringLayout.WEST, JTxtField_InsuredMiddleName, 0, SpringLayout.WEST, JTxtField_GroupNumber);
		sl_JPanel_InsuranceInfo.putConstraint(SpringLayout.EAST, JTxtField_InsuredMiddleName, 0, SpringLayout.EAST, JTxtField_GroupNumber);
		JPanel_InsuranceInfo.add(JTxtField_InsuredMiddleName);
		JTxtField_InsuredMiddleName.setColumns(10);
		
		JLbl_InsuredAddress = new JLabel("Insured Address");
		sl_JPanel_InsuranceInfo.putConstraint(SpringLayout.NORTH, JLbl_InsuredAddress, 6, SpringLayout.SOUTH, JTxtField_InsuredFirstName);
		sl_JPanel_InsuranceInfo.putConstraint(SpringLayout.WEST, JLbl_InsuredAddress, 0, SpringLayout.WEST, JLbl_Insurance);
		JLbl_InsuredAddress.setFont(new Font("Tahoma", Font.BOLD, 11));
		JPanel_InsuranceInfo.add(JLbl_InsuredAddress);
		
		JTxtField_InsuredAddress1 = new JTextField();
		JTxtField_InsuredAddress1.setToolTipText("Address 1");
		sl_JPanel_InsuranceInfo.putConstraint(SpringLayout.NORTH, JTxtField_InsuredAddress1, 6, SpringLayout.SOUTH, JLbl_InsuredAddress);
		sl_JPanel_InsuranceInfo.putConstraint(SpringLayout.WEST, JTxtField_InsuredAddress1, 0, SpringLayout.WEST, JLbl_Insurance);
		sl_JPanel_InsuranceInfo.putConstraint(SpringLayout.EAST, JTxtField_InsuredAddress1, 0, SpringLayout.EAST, JTxtField_GroupNumber);
		JPanel_InsuranceInfo.add(JTxtField_InsuredAddress1);
		JTxtField_InsuredAddress1.setColumns(10);
		
		JTxtField_InsuredAddress2 = new JTextField();
		JTxtField_InsuredAddress2.setToolTipText("Address 2");
		sl_JPanel_InsuranceInfo.putConstraint(SpringLayout.NORTH, JTxtField_InsuredAddress2, 6, SpringLayout.SOUTH, JTxtField_InsuredAddress1);
		sl_JPanel_InsuranceInfo.putConstraint(SpringLayout.WEST, JTxtField_InsuredAddress2, 0, SpringLayout.WEST, JLbl_Insurance);
		sl_JPanel_InsuranceInfo.putConstraint(SpringLayout.EAST, JTxtField_InsuredAddress2, 0, SpringLayout.EAST, JTxtField_GroupNumber);
		JPanel_InsuranceInfo.add(JTxtField_InsuredAddress2);
		JTxtField_InsuredAddress2.setColumns(10);
		
		JTxtField_InsuredCity = new JTextField();
		JTxtField_InsuredCity.setToolTipText("City");
		sl_JPanel_InsuranceInfo.putConstraint(SpringLayout.NORTH, JTxtField_InsuredCity, 6, SpringLayout.SOUTH, JTxtField_InsuredAddress2);
		sl_JPanel_InsuranceInfo.putConstraint(SpringLayout.WEST, JTxtField_InsuredCity, 0, SpringLayout.WEST, JLbl_Insurance);
		sl_JPanel_InsuranceInfo.putConstraint(SpringLayout.EAST, JTxtField_InsuredCity, 0, SpringLayout.EAST, JTxtField_insuranceType);
		JPanel_InsuranceInfo.add(JTxtField_InsuredCity);
		JTxtField_InsuredCity.setColumns(10);
		
		JTxtField_InsuredState = new JTextField();
		JTxtField_InsuredState.setToolTipText("State");
		sl_JPanel_InsuranceInfo.putConstraint(SpringLayout.NORTH, JTxtField_InsuredState, 6, SpringLayout.SOUTH, JTxtField_InsuredAddress2);
		sl_JPanel_InsuranceInfo.putConstraint(SpringLayout.WEST, JTxtField_InsuredState, 0, SpringLayout.WEST, JTxtField_IdNumber);
		sl_JPanel_InsuranceInfo.putConstraint(SpringLayout.EAST, JTxtField_InsuredState, 0, SpringLayout.EAST, JTxtField_IdNumber);
		JPanel_InsuranceInfo.add(JTxtField_InsuredState);
		JTxtField_InsuredState.setColumns(10);
		
		JTxtField_InsuredZip = new JTextField();
		JTxtField_InsuredZip.setToolTipText("Zip");
		sl_JPanel_InsuranceInfo.putConstraint(SpringLayout.NORTH, JTxtField_InsuredZip, 6, SpringLayout.SOUTH, JTxtField_InsuredAddress2);
		sl_JPanel_InsuranceInfo.putConstraint(SpringLayout.WEST, JTxtField_InsuredZip, 0, SpringLayout.WEST, JTxtField_GroupNumber);
		sl_JPanel_InsuranceInfo.putConstraint(SpringLayout.EAST, JTxtField_InsuredZip, 0, SpringLayout.EAST, JTxtField_GroupNumber);
		JPanel_InsuranceInfo.add(JTxtField_InsuredZip);
		JTxtField_InsuredZip.setColumns(10);
		
		JLbl_InsuredBirthDate = new JLabel("Insured Birth Date");
		sl_JPanel_InsuranceInfo.putConstraint(SpringLayout.NORTH, JLbl_InsuredBirthDate, 6, SpringLayout.SOUTH, JTxtField_InsuredCity);
		sl_JPanel_InsuranceInfo.putConstraint(SpringLayout.WEST, JLbl_InsuredBirthDate, 0, SpringLayout.WEST, JLbl_Insurance);
		JLbl_InsuredBirthDate.setFont(new Font("Tahoma", Font.BOLD, 11));
		JPanel_InsuranceInfo.add(JLbl_InsuredBirthDate);
		
		JTxtField_InsuredBirthMonth = new JTextField();
		JTxtField_InsuredBirthMonth.setToolTipText("Month");
		sl_JPanel_InsuranceInfo.putConstraint(SpringLayout.NORTH, JTxtField_InsuredBirthMonth, 6, SpringLayout.SOUTH, JLbl_InsuredBirthDate);
		sl_JPanel_InsuranceInfo.putConstraint(SpringLayout.WEST, JTxtField_InsuredBirthMonth, 0, SpringLayout.WEST, JLbl_Insurance);
		JPanel_InsuranceInfo.add(JTxtField_InsuredBirthMonth);
		JTxtField_InsuredBirthMonth.setColumns(10);
		
		JTxtField_InsuredBirthDay = new JTextField();
		JTxtField_InsuredBirthDay.setToolTipText("Day");
		sl_JPanel_InsuranceInfo.putConstraint(SpringLayout.NORTH, JTxtField_InsuredBirthDay, 6, SpringLayout.SOUTH, JLbl_InsuredBirthDate);
		sl_JPanel_InsuranceInfo.putConstraint(SpringLayout.WEST, JTxtField_InsuredBirthDay, 6, SpringLayout.EAST, JTxtField_InsuredBirthMonth);
		JPanel_InsuranceInfo.add(JTxtField_InsuredBirthDay);
		JTxtField_InsuredBirthDay.setColumns(10);
		
		JTxtField_InsuredBirthYear = new JTextField();
		JTxtField_InsuredBirthYear.setToolTipText("Year");
		sl_JPanel_InsuranceInfo.putConstraint(SpringLayout.NORTH, JTxtField_InsuredBirthYear, 0, SpringLayout.NORTH, JTxtField_InsuredBirthMonth);
		sl_JPanel_InsuranceInfo.putConstraint(SpringLayout.WEST, JTxtField_InsuredBirthYear, 6, SpringLayout.EAST, JTxtField_InsuredBirthDay);
		JPanel_InsuranceInfo.add(JTxtField_InsuredBirthYear);
		JTxtField_InsuredBirthYear.setColumns(10);
		
		JLbl_InsuredPhone = new JLabel("Phone");
		JLbl_InsuredPhone.setFont(new Font("Tahoma", Font.BOLD, 11));
		sl_JPanel_InsuranceInfo.putConstraint(SpringLayout.NORTH, JLbl_InsuredPhone, 6, SpringLayout.SOUTH, JTxtField_InsuredBirthMonth);
		sl_JPanel_InsuranceInfo.putConstraint(SpringLayout.WEST, JLbl_InsuredPhone, 0, SpringLayout.WEST, JLbl_Insurance);
		JPanel_InsuranceInfo.add(JLbl_InsuredPhone);
		
		JTxtField_InsuredPhone = new JTextField();
		JTxtField_InsuredPhone.setToolTipText("###-###-####");
		sl_JPanel_InsuranceInfo.putConstraint(SpringLayout.EAST, JTxtField_InsuredPhone, 0, SpringLayout.EAST, JLbl_InsuredBirthDate);
		sl_JPanel_InsuranceInfo.putConstraint(SpringLayout.NORTH, JTxtField_InsuredPhone, 6, SpringLayout.SOUTH, JLbl_InsuredPhone);
		sl_JPanel_InsuranceInfo.putConstraint(SpringLayout.WEST, JTxtField_InsuredPhone, 0, SpringLayout.WEST, JLbl_Insurance);
		JPanel_InsuranceInfo.add(JTxtField_InsuredPhone);
		JTxtField_InsuredPhone.setColumns(10);
		
		lblNewClientForm = new JLabel("New Client Form");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblNewClientForm, 0, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblNewClientForm, 10, SpringLayout.WEST, contentPane);
		lblNewClientForm.setFont(new Font("Tahoma", Font.PLAIN, 26));
		contentPane.add(lblNewClientForm);
		
		JButton JBtn_SaveClient = new JButton("Save Client");
		JBtn_SaveClient.setFont(new Font("Tahoma", Font.BOLD, 11));
		sl_contentPane.putConstraint(SpringLayout.NORTH, JBtn_SaveClient, 6, SpringLayout.SOUTH, JPanel_InsuranceInfo);
		sl_contentPane.putConstraint(SpringLayout.WEST, JBtn_SaveClient, 610, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, JBtn_SaveClient, -15, SpringLayout.SOUTH, contentPane);
		JBtn_SaveClient.setBackground(SystemColor.menu);
		contentPane.add(JBtn_SaveClient);
		
		JButton JBtn_CanelCreateNewClient = new JButton("Cancel");
		JBtn_CanelCreateNewClient.setBackground(SystemColor.menu);
		JBtn_CanelCreateNewClient.setFont(new Font("Tahoma", Font.BOLD, 11));
		sl_contentPane.putConstraint(SpringLayout.NORTH, JBtn_CanelCreateNewClient, 6, SpringLayout.SOUTH, JPanel_InsuranceInfo);
		sl_contentPane.putConstraint(SpringLayout.WEST, JBtn_CanelCreateNewClient, 716, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, JBtn_CanelCreateNewClient, -15, SpringLayout.SOUTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, JBtn_CanelCreateNewClient, -3, SpringLayout.EAST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, JBtn_SaveClient, -6, SpringLayout.WEST, JBtn_CanelCreateNewClient);
		contentPane.add(JBtn_CanelCreateNewClient);
		
		//My code
		JBtnSaveClient = JBtn_SaveClient;	// get reference to auto generated buttons
		JBtnCancel = JBtn_CanelCreateNewClient;
		JChkBox_copyClientInfo = JCheckbox_CopyClientInfo;
		setControllerAndVisibility();	//my method
	}
	
	
	/**
	 * Basic method to set controller and frame visibility
	 */
	private void setControllerAndVisibility() {
		clientJFrameController = new CreateClientJFrameController(this);	//sets up controller for this view
		this.setVisible(true);	//show frame
	}


	/**
	 * Method to return the last 120 years from current year.
	 * Used in JComboBox.
	 * @return String[] Array of past 120 years. 
	 */
	private String[] getYearsFromCurrent() {
		
		int MAX_YEARS = 120;
		String[] years = new String[MAX_YEARS];
		int currentYear = Calendar.getInstance().get(Calendar.YEAR);
		
		for(int i = 0; i < MAX_YEARS; i++) {
			years[i] = Integer.toString(currentYear - i);
		}
		
		return years;
	}
	
	
	/**
	 * 
	 * @return save client button
	 */
	public JButton getSaveClientBtn() {
		return JBtnSaveClient;
	}
	
	
	/**
	 * 
	 * @return cancel button
	 */
	public JButton getCancelButton() {
		return JBtnCancel;
	}
	
	
	/**
	 * 
	 * @return copyClentInfo check box
	 */
	public JCheckBox getCopyClientInfoChkBox() {
		return JChkBox_copyClientInfo;
	}
	
	//Auto generated getters/setters of text fields below this line
	/**
	 * @return the jTxtField_firstName
	 */
	public JTextField getJTxtField_firstName() {
		return JTxtField_firstName;
	}

	/**
	 * @param jTxtField_firstName the jTxtField_firstName to set
	 */
	public void setJTxtField_firstName(JTextField jTxtField_firstName) {
		JTxtField_firstName = jTxtField_firstName;
	}

	/**
	 * @return the jTxtField_lastName
	 */
	public JTextField getJTxtField_lastName() {
		return JTxtField_lastName;
	}

	/**
	 * @param jTxtField_lastName the jTxtField_lastName to set
	 */
	public void setJTxtField_lastName(JTextField jTxtField_lastName) {
		JTxtField_lastName = jTxtField_lastName;
	}

	/**
	 * @return the jTxtField_middleName
	 */
	public JTextField getJTxtField_middleName() {
		return JTxtField_middleName;
	}

	/**
	 * @param jTxtField_middleName the jTxtField_middleName to set
	 */
	public void setJTxtField_middleName(JTextField jTxtField_middleName) {
		JTxtField_middleName = jTxtField_middleName;
	}

	/**
	 * @return the jTxtField_Address1
	 */
	public JTextField getJTxtField_Address1() {
		return JTxtField_Address1;
	}

	/**
	 * @param jTxtField_Address1 the jTxtField_Address1 to set
	 */
	public void setJTxtField_Address1(JTextField jTxtField_Address1) {
		JTxtField_Address1 = jTxtField_Address1;
	}

	/**
	 * @return the jTxtField_Address2
	 */
	public JTextField getJTxtField_Address2() {
		return JTxtField_Address2;
	}

	/**
	 * @param jTxtField_Address2 the jTxtField_Address2 to set
	 */
	public void setJTxtField_Address2(JTextField jTxtField_Address2) {
		JTxtField_Address2 = jTxtField_Address2;
	}

	/**
	 * @return the jTxtField_City
	 */
	public JTextField getJTxtField_City() {
		return JTxtField_City;
	}

	/**
	 * @param jTxtField_City the jTxtField_City to set
	 */
	public void setJTxtField_City(JTextField jTxtField_City) {
		JTxtField_City = jTxtField_City;
	}

	/**
	 * @return the jTxtField_State
	 */
	public JTextField getJTxtField_State() {
		return JComBox_ClientState;
	}

	/**
	 * @param jTxtField_State the jTxtField_State to set
	 */
	public void setJTxtField_State(JTextField jTxtField_State) {
		JComBox_ClientState = jTxtField_State;
	}

	/**
	 * @return the jTxtField_Zip
	 */
	public JTextField getJTxtField_Zip() {
		return JTxtField_Zip;
	}

	/**
	 * @param jTxtField_Zip the jTxtField_Zip to set
	 */
	public void setJTxtField_Zip(JTextField jTxtField_Zip) {
		JTxtField_Zip = jTxtField_Zip;
	}

	/**
	 * @return the jTxtFIeld_BirthMonth
	 */
	public JTextField getJTxtFIeld_BirthMonth() {
		return JComBox_ClientBirthMonth;
	}

	/**
	 * @param jTxtFIeld_BirthMonth the jTxtFIeld_BirthMonth to set
	 */
	public void setJTxtFIeld_BirthMonth(JTextField jTxtFIeld_BirthMonth) {
		JComBox_ClientBirthMonth = jTxtFIeld_BirthMonth;
	}

	/**
	 * @return the jTxtField_BirthDay
	 */
	public JTextField getJTxtField_BirthDay() {
		return JComBox_ClientBirthDay;
	}

	/**
	 * @param jTxtField_BirthDay the jTxtField_BirthDay to set
	 */
	public void setJTxtField_BirthDay(JTextField jTxtField_BirthDay) {
		JComBox_ClientBirthDay = jTxtField_BirthDay;
	}

	/**
	 * @return the jTxtField_BirthYear
	 */
	public JTextField getJTxtField_BirthYear() {
		return JComBox_BirthYear;
	}

	/**
	 * @param jTxtField_BirthYear the jTxtField_BirthYear to set
	 */
	public void setJTxtField_BirthYear(JTextField jTxtField_BirthYear) {
		JComBox_BirthYear = jTxtField_BirthYear;
	}

	/**
	 * @return the jTxtField_ClientPhone
	 */
	public JTextField getJTxtField_ClientPhone() {
		return JTxtField_ClientPhone;
	}

	/**
	 * @param jTxtField_ClientPhone the jTxtField_ClientPhone to set
	 */
	public void setJTxtField_ClientPhone(JTextField jTxtField_ClientPhone) {
		JTxtField_ClientPhone = jTxtField_ClientPhone;
	}

	/**
	 * @return the jTxtField_ClientEmail
	 */
	public JTextField getJTxtField_ClientEmail() {
		return JTxtField_ClientEmail;
	}

	/**
	 * @param jTxtField_ClientEmail the jTxtField_ClientEmail to set
	 */
	public void setJTxtField_ClientEmail(JTextField jTxtField_ClientEmail) {
		JTxtField_ClientEmail = jTxtField_ClientEmail;
	}

	/**
	 * @return the jTxtField_ClientFee
	 */
	public JTextField getJTxtField_ClientFee() {
		return JTxtField_ClientFee;
	}

	/**
	 * @param jTxtField_ClientFee the jTxtField_ClientFee to set
	 */
	public void setJTxtField_ClientFee(JTextField jTxtField_ClientFee) {
		JTxtField_ClientFee = jTxtField_ClientFee;
	}

	/**
	 * @return the jTxtField_SecondaryFirstName
	 */
	public JTextField getJTxtField_SecondaryFirstName() {
		return JTxtField_SecondaryFirstName;
	}

	/**
	 * @param jTxtField_SecondaryFirstName the jTxtField_SecondaryFirstName to set
	 */
	public void setJTxtField_SecondaryFirstName(JTextField jTxtField_SecondaryFirstName) {
		JTxtField_SecondaryFirstName = jTxtField_SecondaryFirstName;
	}

	/**
	 * @return the jTxtField_SecondaryLastName
	 */
	public JTextField getJTxtField_SecondaryLastName() {
		return JTxtField_SecondaryLastName;
	}

	/**
	 * @param jTxtField_SecondaryLastName the jTxtField_SecondaryLastName to set
	 */
	public void setJTxtField_SecondaryLastName(JTextField jTxtField_SecondaryLastName) {
		JTxtField_SecondaryLastName = jTxtField_SecondaryLastName;
	}

	/**
	 * @return the jTxtField_SecondaryMiddleName
	 */
	public JTextField getJTxtField_SecondaryMiddleName() {
		return JTxtField_SecondaryMiddleName;
	}

	/**
	 * @param jTxtField_SecondaryMiddleName the jTxtField_SecondaryMiddleName to set
	 */
	public void setJTxtField_SecondaryMiddleName(JTextField jTxtField_SecondaryMiddleName) {
		JTxtField_SecondaryMiddleName = jTxtField_SecondaryMiddleName;
	}

	/**
	 * @return the jTxtField_insuranceType
	 */
	public JTextField getJTxtField_insuranceType() {
		return JTxtField_insuranceType;
	}

	/**
	 * @param jTxtField_insuranceType the jTxtField_insuranceType to set
	 */
	public void setJTxtField_insuranceType(JTextField jTxtField_insuranceType) {
		JTxtField_insuranceType = jTxtField_insuranceType;
	}

	/**
	 * @return the jTxtField_IdNumber
	 */
	public JTextField getJTxtField_IdNumber() {
		return JTxtField_IdNumber;
	}

	/**
	 * @param jTxtField_IdNumber the jTxtField_IdNumber to set
	 */
	public void setJTxtField_IdNumber(JTextField jTxtField_IdNumber) {
		JTxtField_IdNumber = jTxtField_IdNumber;
	}

	/**
	 * @return the jTxtField_GroupNumber
	 */
	public JTextField getJTxtField_GroupNumber() {
		return JTxtField_GroupNumber;
	}

	/**
	 * @param jTxtField_GroupNumber the jTxtField_GroupNumber to set
	 */
	public void setJTxtField_GroupNumber(JTextField jTxtField_GroupNumber) {
		JTxtField_GroupNumber = jTxtField_GroupNumber;
	}

	/**
	 * @return the jTxtField_InsuredFirstName
	 */
	public JTextField getJTxtField_InsuredFirstName() {
		return JTxtField_InsuredFirstName;
	}

	/**
	 * @param jTxtField_InsuredFirstName the jTxtField_InsuredFirstName to set
	 */
	public void setJTxtField_InsuredFirstName(JTextField jTxtField_InsuredFirstName) {
		JTxtField_InsuredFirstName = jTxtField_InsuredFirstName;
	}

	/**
	 * @return the jTxtField_InsuredLastName
	 */
	public JTextField getJTxtField_InsuredLastName() {
		return JTxtField_InsuredLastName;
	}

	/**
	 * @param jTxtField_InsuredLastName the jTxtField_InsuredLastName to set
	 */
	public void setJTxtField_InsuredLastName(JTextField jTxtField_InsuredLastName) {
		JTxtField_InsuredLastName = jTxtField_InsuredLastName;
	}

	/**
	 * @return the jTxtField_InsuredMiddleName
	 */
	public JTextField getJTxtField_InsuredMiddleName() {
		return JTxtField_InsuredMiddleName;
	}

	/**
	 * @param jTxtField_InsuredMiddleName the jTxtField_InsuredMiddleName to set
	 */
	public void setJTxtField_InsuredMiddleName(JTextField jTxtField_InsuredMiddleName) {
		JTxtField_InsuredMiddleName = jTxtField_InsuredMiddleName;
	}

	/**
	 * @return the jTxtField_InsuredAddress1
	 */
	public JTextField getJTxtField_InsuredAddress1() {
		return JTxtField_InsuredAddress1;
	}

	/**
	 * @param jTxtField_InsuredAddress1 the jTxtField_InsuredAddress1 to set
	 */
	public void setJTxtField_InsuredAddress1(JTextField jTxtField_InsuredAddress1) {
		JTxtField_InsuredAddress1 = jTxtField_InsuredAddress1;
	}

	/**
	 * @return the jTxtField_InsuredAddress2
	 */
	public JTextField getJTxtField_InsuredAddress2() {
		return JTxtField_InsuredAddress2;
	}

	/**
	 * @param jTxtField_InsuredAddress2 the jTxtField_InsuredAddress2 to set
	 */
	public void setJTxtField_InsuredAddress2(JTextField jTxtField_InsuredAddress2) {
		JTxtField_InsuredAddress2 = jTxtField_InsuredAddress2;
	}

	/**
	 * @return the jTxtField_InsuredCity
	 */
	public JTextField getJTxtField_InsuredCity() {
		return JTxtField_InsuredCity;
	}

	/**
	 * @param jTxtField_InsuredCity the jTxtField_InsuredCity to set
	 */
	public void setJTxtField_InsuredCity(JTextField jTxtField_InsuredCity) {
		JTxtField_InsuredCity = jTxtField_InsuredCity;
	}

	/**
	 * @return the jTxtField_InsuredState
	 */
	public JTextField getJTxtField_InsuredState() {
		return JTxtField_InsuredState;
	}

	/**
	 * @param jTxtField_InsuredState the jTxtField_InsuredState to set
	 */
	public void setJTxtField_InsuredState(JTextField jTxtField_InsuredState) {
		JTxtField_InsuredState = jTxtField_InsuredState;
	}

	/**
	 * @return the jTxtField_InsuredZip
	 */
	public JTextField getJTxtField_InsuredZip() {
		return JTxtField_InsuredZip;
	}

	/**
	 * @param jTxtField_InsuredZip the jTxtField_InsuredZip to set
	 */
	public void setJTxtField_InsuredZip(JTextField jTxtField_InsuredZip) {
		JTxtField_InsuredZip = jTxtField_InsuredZip;
	}

	/**
	 * @return the jTxtField_InsuredBirthMonth
	 */
	public JTextField getJTxtField_InsuredBirthMonth() {
		return JTxtField_InsuredBirthMonth;
	}

	/**
	 * @param jTxtField_InsuredBirthMonth the jTxtField_InsuredBirthMonth to set
	 */
	public void setJTxtField_InsuredBirthMonth(JTextField jTxtField_InsuredBirthMonth) {
		JTxtField_InsuredBirthMonth = jTxtField_InsuredBirthMonth;
	}

	/**
	 * @return the jTxtField_InsuredBirthDay
	 */
	public JTextField getJTxtField_InsuredBirthDay() {
		return JTxtField_InsuredBirthDay;
	}

	/**
	 * @param jTxtField_InsuredBirthDay the jTxtField_InsuredBirthDay to set
	 */
	public void setJTxtField_InsuredBirthDay(JTextField jTxtField_InsuredBirthDay) {
		JTxtField_InsuredBirthDay = jTxtField_InsuredBirthDay;
	}

	/**
	 * @return the jTxtField_InsuredBirthYear
	 */
	public JTextField getJTxtField_InsuredBirthYear() {
		return JTxtField_InsuredBirthYear;
	}

	/**
	 * @param jTxtField_InsuredBirthYear the jTxtField_InsuredBirthYear to set
	 */
	public void setJTxtField_InsuredBirthYear(JTextField jTxtField_InsuredBirthYear) {
		JTxtField_InsuredBirthYear = jTxtField_InsuredBirthYear;
	}

	/**
	 * @return the jTxtField_InsuredPhone
	 */
	public JTextField getJTxtField_InsuredPhone() {
		return JTxtField_InsuredPhone;
	}

	/**
	 * @param jTxtField_InsuredPhone the jTxtField_InsuredPhone to set
	 */
	public void setJTxtField_InsuredPhone(JTextField jTxtField_InsuredPhone) {
		JTxtField_InsuredPhone = jTxtField_InsuredPhone;
	}
}
