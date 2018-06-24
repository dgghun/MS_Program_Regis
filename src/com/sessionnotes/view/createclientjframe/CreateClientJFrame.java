package com.sessionnotes.view.createclientjframe;

import java.awt.Color;
import java.awt.Component;
import java.awt.ComponentOrientation;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;
import javax.swing.text.NumberFormatter;

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
 *  Suppressed some type checking warnings for JComboBox items. 
 *
 * @author David Garcia
 * @version 1.0
 * @since 06-17-2018
 *
 */
public class CreateClientJFrame extends JInternalFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@SuppressWarnings("unused")
	private CreateClientJFrameController clientJFrameController;	//suppressing warning
	private JButton JBtnSaveClient;
	private JButton JBtnCancel;
	private JButton JBtn_copyClientInfo;
	private MaskFormatter phoneNumFormat;
	
	
	//Auto generated code
	private JPanel contentPane;
	private JPanel JPanel_ClientInfo;
	private JTextField JTxtField_clientFirstName;
	private JTextField JTxtField_clientLastName;
	private JTextField JTxtField_clientMiddleName;
	private JTextField JTxtField_clientAddress1;
	private JTextField JTxtField_clientAddress2;
	private JTextField JTxtField_clientCity;
	private JComboBox<String> JComBox_ClientState;
	private JTextField JTxtField_clientZip;
	private JLabel JLbl_ClientBirthDate;
	private JComboBox<String> JComBox_ClientBirthMonth;
	private JComboBox<String> JComBox_ClientBirthDay;
	private JComboBox<String> JComBox_ClientBirthYear;
	private JLabel JLbl_ClientPhone;
	private JFormattedTextField JTxtField_ClientPhone;
	private JLabel JLbl_ClientEmail;
	private JTextField JTxtField_ClientEmail;
	private JLabel JLbl_ClientFee;
	private JFormattedTextField JFormatTxtField_ClientFee;
	private JLabel JLbl_SecondaryClients;
	private JTextField JTxtField_SecondaryFirstName;
	private JTextField JTxtField_SecondaryLastName;
	private JTextField JTxtField_SecondaryMiddleName;
	private JPanel JPanel_InsuranceInfo;
	private JLabel JLbl_InsuranceType;
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
	private JComboBox<String> JComBox_InsuredState;
	private JTextField JTxtField_InsuredZip;
	private JLabel JLbl_InsuredBirthDate;
	private JComboBox<String> JComBox_InsuredBirthMonth;
	private JComboBox<String> JComBox_InsuredBirthDay;
	private JComboBox<String> JComBox_InsuredBirthYear;
	private JLabel JLbl_InsuredPhone;
	private JFormattedTextField JTxtField_InsuredPhone;
	private JLabel JLbl_ClientStreet;
	private JLabel JLbl_ClientAptSuite;
	private JLabel JLbl_ClientCity;
	private JLabel JLbl_ClientState;
	private JLabel JLbl_ClientZip;
	private JLabel JLbl_MoneySymbol;
	private JLabel JLbl_InsuredCity;
	private JLabel JLbl_InsuredState;
	private JLabel JLbl_InsuredZip;
	
	

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
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public CreateClientJFrame() {
		
		 try {
			phoneNumFormat = new MaskFormatter("###-###-####");
			phoneNumFormat.setAllowsInvalid(true);
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
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
		
		JTxtField_clientFirstName = new JTextField();
		JTxtField_clientFirstName.setToolTipText("First Name");
		sl_JPanel_ClientInfo.putConstraint(SpringLayout.SOUTH, JLbl_ClientName, -6, SpringLayout.NORTH, JTxtField_clientFirstName);
		sl_JPanel_ClientInfo.putConstraint(SpringLayout.WEST, JTxtField_clientFirstName, 10, SpringLayout.WEST, JPanel_ClientInfo);
		sl_JPanel_ClientInfo.putConstraint(SpringLayout.EAST, JTxtField_clientFirstName, 140, SpringLayout.WEST, JPanel_ClientInfo);
		JPanel_ClientInfo.add(JTxtField_clientFirstName);
		JTxtField_clientFirstName.setColumns(10);
		
		JTxtField_clientLastName = new JTextField();
		JTxtField_clientLastName.setToolTipText("Last Name");
		sl_JPanel_ClientInfo.putConstraint(SpringLayout.WEST, JTxtField_clientLastName, 6, SpringLayout.EAST, JTxtField_clientFirstName);
		sl_JPanel_ClientInfo.putConstraint(SpringLayout.EAST, JTxtField_clientLastName, 276, SpringLayout.WEST, JPanel_ClientInfo);
		JPanel_ClientInfo.add(JTxtField_clientLastName);
		JTxtField_clientLastName.setColumns(10);
		
		JTxtField_clientMiddleName = new JTextField();
		sl_JPanel_ClientInfo.putConstraint(SpringLayout.WEST, JTxtField_clientMiddleName, 6, SpringLayout.EAST, JTxtField_clientLastName);
		sl_JPanel_ClientInfo.putConstraint(SpringLayout.EAST, JTxtField_clientMiddleName, -10, SpringLayout.EAST, JPanel_ClientInfo);
		JTxtField_clientMiddleName.setToolTipText("Middle Name");
		JPanel_ClientInfo.add(JTxtField_clientMiddleName);
		JTxtField_clientMiddleName.setColumns(10);
		
		JLabel JLbl_ClientAddress = new JLabel("Client Address");
		sl_JPanel_ClientInfo.putConstraint(SpringLayout.WEST, JLbl_ClientAddress, 10, SpringLayout.WEST, JPanel_ClientInfo);
		sl_JPanel_ClientInfo.putConstraint(SpringLayout.SOUTH, JTxtField_clientFirstName, -6, SpringLayout.NORTH, JLbl_ClientAddress);
		JLbl_ClientAddress.setFont(new Font("Tahoma", Font.BOLD, 11));
		JPanel_ClientInfo.add(JLbl_ClientAddress);
		
		JTxtField_clientAddress1 = new JTextField();
		sl_JPanel_ClientInfo.putConstraint(SpringLayout.EAST, JTxtField_clientAddress1, -10, SpringLayout.EAST, JPanel_ClientInfo);
		sl_JPanel_ClientInfo.putConstraint(SpringLayout.SOUTH, JLbl_ClientAddress, -6, SpringLayout.NORTH, JTxtField_clientAddress1);
		sl_JPanel_ClientInfo.putConstraint(SpringLayout.NORTH, JTxtField_clientAddress1, 77, SpringLayout.NORTH, JPanel_ClientInfo);
		JTxtField_clientAddress1.setToolTipText("Address 1");
		JPanel_ClientInfo.add(JTxtField_clientAddress1);
		JTxtField_clientAddress1.setColumns(10);
		
		JTxtField_clientAddress2 = new JTextField();
		sl_JPanel_ClientInfo.putConstraint(SpringLayout.WEST, JTxtField_clientAddress2, 61, SpringLayout.WEST, JPanel_ClientInfo);
		sl_JPanel_ClientInfo.putConstraint(SpringLayout.SOUTH, JTxtField_clientAddress2, -174, SpringLayout.SOUTH, JPanel_ClientInfo);
		sl_JPanel_ClientInfo.putConstraint(SpringLayout.EAST, JTxtField_clientAddress2, -10, SpringLayout.EAST, JPanel_ClientInfo);
		JTxtField_clientAddress2.setToolTipText("Address 2");
		JPanel_ClientInfo.add(JTxtField_clientAddress2);
		JTxtField_clientAddress2.setColumns(10);
		
		JTxtField_clientCity = new JTextField();
		sl_JPanel_ClientInfo.putConstraint(SpringLayout.SOUTH, JTxtField_clientCity, -148, SpringLayout.SOUTH, JPanel_ClientInfo);
		sl_JPanel_ClientInfo.putConstraint(SpringLayout.EAST, JTxtField_clientCity, -202, SpringLayout.EAST, JPanel_ClientInfo);
		JTxtField_clientCity.setToolTipText("City");
		JPanel_ClientInfo.add(JTxtField_clientCity);
		JTxtField_clientCity.setColumns(10);
		
		JComBox_ClientState = new JComboBox(getAllUSStates());
		sl_JPanel_ClientInfo.putConstraint(SpringLayout.NORTH, JComBox_ClientState, 6, SpringLayout.SOUTH, JTxtField_clientAddress2);
		JComBox_ClientState.setToolTipText("State");
		JPanel_ClientInfo.add(JComBox_ClientState);
		
		JTxtField_clientZip = new JTextField();
		sl_JPanel_ClientInfo.putConstraint(SpringLayout.NORTH, JTxtField_clientZip, 6, SpringLayout.SOUTH, JTxtField_clientAddress2);
		sl_JPanel_ClientInfo.putConstraint(SpringLayout.WEST, JTxtField_clientZip, -80, SpringLayout.EAST, JPanel_ClientInfo);
		sl_JPanel_ClientInfo.putConstraint(SpringLayout.EAST, JTxtField_clientZip, 0, SpringLayout.EAST, JTxtField_clientMiddleName);
		JTxtField_clientZip.setToolTipText("Zip Code");
		JPanel_ClientInfo.add(JTxtField_clientZip);
		JTxtField_clientZip.setColumns(10);
		
		JLbl_ClientBirthDate = new JLabel("Client Birth Date");
		sl_JPanel_ClientInfo.putConstraint(SpringLayout.WEST, JLbl_ClientBirthDate, 0, SpringLayout.WEST, JLbl_ClientName);
		JLbl_ClientBirthDate.setFont(new Font("Tahoma", Font.BOLD, 11));
		JPanel_ClientInfo.add(JLbl_ClientBirthDate);
		
		JComBox_ClientBirthMonth = new JComboBox(getAllMonths());
		sl_JPanel_ClientInfo.putConstraint(SpringLayout.NORTH, JComBox_ClientBirthMonth, -3, SpringLayout.NORTH, JLbl_ClientBirthDate);
		sl_JPanel_ClientInfo.putConstraint(SpringLayout.WEST, JComBox_ClientBirthMonth, 6, SpringLayout.EAST, JLbl_ClientBirthDate);
		sl_JPanel_ClientInfo.putConstraint(SpringLayout.EAST, JComBox_ClientBirthMonth, -13, SpringLayout.EAST, JTxtField_clientCity);
		JComBox_ClientBirthMonth.setToolTipText("Month");
		JPanel_ClientInfo.add(JComBox_ClientBirthMonth);
		
		JComBox_ClientBirthDay = new JComboBox(getDaysOfMonth());
		sl_JPanel_ClientInfo.putConstraint(SpringLayout.NORTH, JComBox_ClientBirthDay, -3, SpringLayout.NORTH, JLbl_ClientBirthDate);
		sl_JPanel_ClientInfo.putConstraint(SpringLayout.WEST, JComBox_ClientBirthDay, 6, SpringLayout.EAST, JComBox_ClientBirthMonth);
		sl_JPanel_ClientInfo.putConstraint(SpringLayout.EAST, JComBox_ClientBirthDay, 56, SpringLayout.EAST, JComBox_ClientBirthMonth);
		JComBox_ClientBirthDay.setToolTipText("Day");
		JPanel_ClientInfo.add(JComBox_ClientBirthDay);
		
		JComBox_ClientBirthYear = new JComboBox(getYearsFromCurrent());
		sl_JPanel_ClientInfo.putConstraint(SpringLayout.NORTH, JComBox_ClientBirthYear, -3, SpringLayout.NORTH, JLbl_ClientBirthDate);
		sl_JPanel_ClientInfo.putConstraint(SpringLayout.WEST, JComBox_ClientBirthYear, 6, SpringLayout.EAST, JComBox_ClientBirthDay);
		sl_JPanel_ClientInfo.putConstraint(SpringLayout.EAST, JComBox_ClientBirthYear, -85, SpringLayout.EAST, JPanel_ClientInfo);
		JComBox_ClientBirthYear.setToolTipText("Year");
		JPanel_ClientInfo.add(JComBox_ClientBirthYear);
		
		JLbl_ClientPhone = new JLabel("Client Phone");
		sl_JPanel_ClientInfo.putConstraint(SpringLayout.SOUTH, JLbl_ClientBirthDate, -17, SpringLayout.NORTH, JLbl_ClientPhone);
		sl_JPanel_ClientInfo.putConstraint(SpringLayout.WEST, JLbl_ClientPhone, 10, SpringLayout.WEST, JPanel_ClientInfo);
		JLbl_ClientPhone.setFont(new Font("Tahoma", Font.BOLD, 11));
		JPanel_ClientInfo.add(JLbl_ClientPhone);
		
		JTxtField_ClientPhone = new JFormattedTextField(phoneNumFormat);
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
		
		JFormatTxtField_ClientFee = new JFormattedTextField(getNumberFormatter(Integer.class, 0, Integer.MAX_VALUE, true, false));
		sl_JPanel_ClientInfo.putConstraint(SpringLayout.NORTH, JFormatTxtField_ClientFee, 6, SpringLayout.SOUTH, JLbl_ClientFee);
		sl_JPanel_ClientInfo.putConstraint(SpringLayout.WEST, JLbl_ClientFee, 0, SpringLayout.WEST, JFormatTxtField_ClientFee);
		sl_JPanel_ClientInfo.putConstraint(SpringLayout.EAST, JFormatTxtField_ClientFee, -17, SpringLayout.EAST, JPanel_ClientInfo);
		JFormatTxtField_ClientFee.setToolTipText("Session Fee");
		JPanel_ClientInfo.add(JFormatTxtField_ClientFee);
		JFormatTxtField_ClientFee.setColumns(10);
		
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
		sl_JPanel_ClientInfo.putConstraint(SpringLayout.NORTH, JTxtField_clientLastName, 6, SpringLayout.SOUTH, JLbl_ClientFirstName);
		sl_JPanel_ClientInfo.putConstraint(SpringLayout.NORTH, JLbl_ClientFirstName, 0, SpringLayout.NORTH, JLbl_ClientName);
		sl_JPanel_ClientInfo.putConstraint(SpringLayout.WEST, JLbl_ClientFirstName, 0, SpringLayout.WEST, JTxtField_clientLastName);
		JLbl_ClientFirstName.setFont(new Font("Tahoma", Font.BOLD, 11));
		JPanel_ClientInfo.add(JLbl_ClientFirstName);
		
		JLabel JLb_ClientlMiddleName = new JLabel("Middle Name");
		sl_JPanel_ClientInfo.putConstraint(SpringLayout.WEST, JLb_ClientlMiddleName, 77, SpringLayout.EAST, JLbl_ClientFirstName);
		sl_JPanel_ClientInfo.putConstraint(SpringLayout.NORTH, JTxtField_clientMiddleName, 6, SpringLayout.SOUTH, JLb_ClientlMiddleName);
		JLb_ClientlMiddleName.setFont(new Font("Tahoma", Font.BOLD, 11));
		sl_JPanel_ClientInfo.putConstraint(SpringLayout.NORTH, JLb_ClientlMiddleName, 0, SpringLayout.NORTH, JLbl_ClientName);
		JPanel_ClientInfo.add(JLb_ClientlMiddleName);
		
		JLbl_ClientStreet = new JLabel("Street");
		sl_JPanel_ClientInfo.putConstraint(SpringLayout.WEST, JTxtField_clientAddress1, 6, SpringLayout.EAST, JLbl_ClientStreet);
		sl_JPanel_ClientInfo.putConstraint(SpringLayout.NORTH, JLbl_ClientStreet, 3, SpringLayout.NORTH, JTxtField_clientAddress1);
		sl_JPanel_ClientInfo.putConstraint(SpringLayout.WEST, JLbl_ClientStreet, 0, SpringLayout.WEST, JLbl_ClientName);
		sl_JPanel_ClientInfo.putConstraint(SpringLayout.EAST, JLbl_ClientStreet, -343, SpringLayout.EAST, JPanel_ClientInfo);
		JLbl_ClientStreet.setHorizontalAlignment(SwingConstants.TRAILING);
		JLbl_ClientStreet.setFont(new Font("Tahoma", Font.BOLD, 11));
		JPanel_ClientInfo.add(JLbl_ClientStreet);
		
		JLbl_ClientAptSuite = new JLabel("Apt/Ste");
		sl_JPanel_ClientInfo.putConstraint(SpringLayout.NORTH, JLbl_ClientAptSuite, 3, SpringLayout.NORTH, JTxtField_clientAddress2);
		sl_JPanel_ClientInfo.putConstraint(SpringLayout.EAST, JLbl_ClientAptSuite, -6, SpringLayout.WEST, JTxtField_clientAddress2);
		JLbl_ClientAptSuite.setFont(new Font("Tahoma", Font.BOLD, 11));
		JPanel_ClientInfo.add(JLbl_ClientAptSuite);
		
		JLbl_ClientCity = new JLabel("City");
		sl_JPanel_ClientInfo.putConstraint(SpringLayout.NORTH, JLbl_ClientCity, 12, SpringLayout.SOUTH, JLbl_ClientAptSuite);
		sl_JPanel_ClientInfo.putConstraint(SpringLayout.EAST, JLbl_ClientCity, -342, SpringLayout.EAST, JPanel_ClientInfo);
		sl_JPanel_ClientInfo.putConstraint(SpringLayout.WEST, JTxtField_clientCity, 5, SpringLayout.EAST, JLbl_ClientCity);
		JLbl_ClientCity.setFont(new Font("Tahoma", Font.BOLD, 11));
		JPanel_ClientInfo.add(JLbl_ClientCity);
		
		JLbl_ClientState = new JLabel("State");
		sl_JPanel_ClientInfo.putConstraint(SpringLayout.WEST, JComBox_ClientState, 6, SpringLayout.EAST, JLbl_ClientState);
		sl_JPanel_ClientInfo.putConstraint(SpringLayout.NORTH, JLbl_ClientState, 3, SpringLayout.NORTH, JTxtField_clientCity);
		sl_JPanel_ClientInfo.putConstraint(SpringLayout.WEST, JLbl_ClientState, 6, SpringLayout.EAST, JTxtField_clientCity);
		sl_JPanel_ClientInfo.putConstraint(SpringLayout.EAST, JLbl_ClientState, -165, SpringLayout.EAST, JPanel_ClientInfo);
		JLbl_ClientState.setFont(new Font("Tahoma", Font.BOLD, 11));
		JPanel_ClientInfo.add(JLbl_ClientState);
		
		JLbl_ClientZip = new JLabel("Zip");
		sl_JPanel_ClientInfo.putConstraint(SpringLayout.EAST, JComBox_ClientState, -11, SpringLayout.WEST, JLbl_ClientZip);
		sl_JPanel_ClientInfo.putConstraint(SpringLayout.NORTH, JLbl_ClientZip, 3, SpringLayout.NORTH, JTxtField_clientCity);
		sl_JPanel_ClientInfo.putConstraint(SpringLayout.EAST, JLbl_ClientZip, -6, SpringLayout.WEST, JTxtField_clientZip);
		JLbl_ClientZip.setFont(new Font("Tahoma", Font.BOLD, 11));
		JPanel_ClientInfo.add(JLbl_ClientZip);
		
		JLbl_MoneySymbol = new JLabel(" $");
		sl_JPanel_ClientInfo.putConstraint(SpringLayout.WEST, JFormatTxtField_ClientFee, -4, SpringLayout.EAST, JLbl_MoneySymbol);
		sl_JPanel_ClientInfo.putConstraint(SpringLayout.WEST, JLbl_MoneySymbol, 5, SpringLayout.EAST, JTxtField_ClientEmail);
		sl_JPanel_ClientInfo.putConstraint(SpringLayout.SOUTH, JLbl_MoneySymbol, -29, SpringLayout.NORTH, JTxtField_SecondaryMiddleName);
		sl_JPanel_ClientInfo.putConstraint(SpringLayout.EAST, JLbl_MoneySymbol, -99, SpringLayout.EAST, JPanel_ClientInfo);
		JPanel_ClientInfo.add(JLbl_MoneySymbol);
		JPanel_InsuranceInfo.setBackground(new Color(255, 255, 204));
		contentPane.add(JPanel_InsuranceInfo);
		SpringLayout sl_JPanel_InsuranceInfo = new SpringLayout();
		JPanel_InsuranceInfo.setLayout(sl_JPanel_InsuranceInfo);
		
		JLbl_InsuranceType = new JLabel("Insurance - Type");
		sl_JPanel_InsuranceInfo.putConstraint(SpringLayout.NORTH, JLbl_InsuranceType, 10, SpringLayout.NORTH, JPanel_InsuranceInfo);
		sl_JPanel_InsuranceInfo.putConstraint(SpringLayout.WEST, JLbl_InsuranceType, 10, SpringLayout.WEST, JPanel_InsuranceInfo);
		JLbl_InsuranceType.setFont(new Font("Tahoma", Font.BOLD, 11));
		JPanel_InsuranceInfo.add(JLbl_InsuranceType);
		
		JTxtField_insuranceType = new JTextField();
		JTxtField_insuranceType.setToolTipText("Type (Medicare, etc.)");
		sl_JPanel_InsuranceInfo.putConstraint(SpringLayout.NORTH, JTxtField_insuranceType, 6, SpringLayout.SOUTH, JLbl_InsuranceType);
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
		
		JButton JBtn_CopyClientInfo = new JButton("Copy Client Info");
		sl_JPanel_InsuranceInfo.putConstraint(SpringLayout.NORTH, JBtn_CopyClientInfo, 6, SpringLayout.SOUTH, JTxtField_insuranceType);
		sl_JPanel_InsuranceInfo.putConstraint(SpringLayout.WEST, JBtn_CopyClientInfo, 0, SpringLayout.WEST, JLbl_InsuranceType);
		JBtn_CopyClientInfo.setBackground(UIManager.getColor("Button.background"));
		JPanel_InsuranceInfo.add(JBtn_CopyClientInfo);
		
		JLabel JLbl_InsuredName = new JLabel("Insured - First Name");
		sl_JPanel_InsuranceInfo.putConstraint(SpringLayout.NORTH, JLbl_InsuredName, 6, SpringLayout.SOUTH, JBtn_CopyClientInfo);
		sl_JPanel_InsuranceInfo.putConstraint(SpringLayout.WEST, JLbl_InsuredName, 0, SpringLayout.WEST, JLbl_InsuranceType);
		JLbl_InsuredName.setFont(new Font("Tahoma", Font.BOLD, 11));
		JPanel_InsuranceInfo.add(JLbl_InsuredName);
		
		JTxtField_InsuredFirstName = new JTextField();
		sl_JPanel_InsuranceInfo.putConstraint(SpringLayout.NORTH, JTxtField_InsuredFirstName, 6, SpringLayout.SOUTH, JLbl_InsuredName);
		sl_JPanel_InsuranceInfo.putConstraint(SpringLayout.WEST, JTxtField_InsuredFirstName, 0, SpringLayout.WEST, JLbl_InsuranceType);
		sl_JPanel_InsuranceInfo.putConstraint(SpringLayout.EAST, JTxtField_InsuredFirstName, 0, SpringLayout.EAST, JTxtField_insuranceType);
		JTxtField_InsuredFirstName.setToolTipText("First Name");
		JPanel_InsuranceInfo.add(JTxtField_InsuredFirstName);
		JTxtField_InsuredFirstName.setColumns(10);
		
		JTxtField_InsuredLastName = new JTextField();
		sl_JPanel_InsuranceInfo.putConstraint(SpringLayout.NORTH, JTxtField_InsuredLastName, 0, SpringLayout.NORTH, JTxtField_InsuredFirstName);
		sl_JPanel_InsuranceInfo.putConstraint(SpringLayout.WEST, JTxtField_InsuredLastName, 0, SpringLayout.WEST, JTxtField_IdNumber);
		sl_JPanel_InsuranceInfo.putConstraint(SpringLayout.EAST, JTxtField_InsuredLastName, 0, SpringLayout.EAST, JTxtField_IdNumber);
		JTxtField_InsuredLastName.setToolTipText("Last Name");
		JPanel_InsuranceInfo.add(JTxtField_InsuredLastName);
		JTxtField_InsuredLastName.setColumns(10);
		
		JTxtField_InsuredMiddleName = new JTextField();
		sl_JPanel_InsuranceInfo.putConstraint(SpringLayout.NORTH, JTxtField_InsuredMiddleName, 0, SpringLayout.NORTH, JTxtField_InsuredFirstName);
		sl_JPanel_InsuranceInfo.putConstraint(SpringLayout.WEST, JTxtField_InsuredMiddleName, 0, SpringLayout.WEST, JTxtField_GroupNumber);
		sl_JPanel_InsuranceInfo.putConstraint(SpringLayout.EAST, JTxtField_InsuredMiddleName, 0, SpringLayout.EAST, JTxtField_GroupNumber);
		JTxtField_InsuredMiddleName.setToolTipText("Middle Name");
		JPanel_InsuranceInfo.add(JTxtField_InsuredMiddleName);
		JTxtField_InsuredMiddleName.setColumns(10);
		
		JLbl_InsuredAddress = new JLabel("Insured Address and Phone");
		sl_JPanel_InsuranceInfo.putConstraint(SpringLayout.WEST, JLbl_InsuredAddress, 0, SpringLayout.WEST, JLbl_InsuranceType);
		sl_JPanel_InsuranceInfo.putConstraint(SpringLayout.SOUTH, JLbl_InsuredAddress, -146, SpringLayout.SOUTH, JPanel_InsuranceInfo);
		JLbl_InsuredAddress.setFont(new Font("Tahoma", Font.BOLD, 11));
		JPanel_InsuranceInfo.add(JLbl_InsuredAddress);
		
		JTxtField_InsuredAddress1 = new JTextField();
		sl_JPanel_InsuranceInfo.putConstraint(SpringLayout.NORTH, JTxtField_InsuredAddress1, 6, SpringLayout.SOUTH, JLbl_InsuredAddress);
		sl_JPanel_InsuranceInfo.putConstraint(SpringLayout.EAST, JTxtField_InsuredAddress1, 0, SpringLayout.EAST, JTxtField_GroupNumber);
		JTxtField_InsuredAddress1.setToolTipText("Address 1");
		JPanel_InsuranceInfo.add(JTxtField_InsuredAddress1);
		JTxtField_InsuredAddress1.setColumns(10);
		
		JTxtField_InsuredAddress2 = new JTextField();
		sl_JPanel_InsuranceInfo.putConstraint(SpringLayout.SOUTH, JTxtField_InsuredAddress2, -94, SpringLayout.SOUTH, JPanel_InsuranceInfo);
		sl_JPanel_InsuranceInfo.putConstraint(SpringLayout.WEST, JTxtField_InsuredAddress1, 0, SpringLayout.WEST, JTxtField_InsuredAddress2);
		sl_JPanel_InsuranceInfo.putConstraint(SpringLayout.EAST, JTxtField_InsuredAddress2, -10, SpringLayout.EAST, JPanel_InsuranceInfo);
		JTxtField_InsuredAddress2.setToolTipText("Address 2");
		JPanel_InsuranceInfo.add(JTxtField_InsuredAddress2);
		JTxtField_InsuredAddress2.setColumns(10);
		
		JTxtField_InsuredCity = new JTextField();
		sl_JPanel_InsuranceInfo.putConstraint(SpringLayout.NORTH, JTxtField_InsuredCity, 6, SpringLayout.SOUTH, JTxtField_InsuredAddress2);
		JTxtField_InsuredCity.setToolTipText("City");
		JPanel_InsuranceInfo.add(JTxtField_InsuredCity);
		JTxtField_InsuredCity.setColumns(10);
		
		JComBox_InsuredState = new JComboBox(getAllUSStates());
		sl_JPanel_InsuranceInfo.putConstraint(SpringLayout.NORTH, JComBox_InsuredState, 0, SpringLayout.NORTH, JTxtField_InsuredCity);
		JComBox_InsuredState.setToolTipText("State");
		JPanel_InsuranceInfo.add(JComBox_InsuredState);
		
		JTxtField_InsuredZip = new JTextField();
		sl_JPanel_InsuranceInfo.putConstraint(SpringLayout.NORTH, JTxtField_InsuredZip, 6, SpringLayout.SOUTH, JTxtField_InsuredAddress2);
		sl_JPanel_InsuranceInfo.putConstraint(SpringLayout.EAST, JTxtField_InsuredZip, -10, SpringLayout.EAST, JPanel_InsuranceInfo);
		JTxtField_InsuredZip.setToolTipText("Zip");
		JPanel_InsuranceInfo.add(JTxtField_InsuredZip);
		JTxtField_InsuredZip.setColumns(10);
		
		JLbl_InsuredBirthDate = new JLabel("Insured Birth Date");
		sl_JPanel_InsuranceInfo.putConstraint(SpringLayout.WEST, JLbl_InsuredBirthDate, 0, SpringLayout.WEST, JLbl_InsuranceType);
		JLbl_InsuredBirthDate.setFont(new Font("Tahoma", Font.BOLD, 11));
		JPanel_InsuranceInfo.add(JLbl_InsuredBirthDate);
		
		JComBox_InsuredBirthMonth = new JComboBox(getAllMonths());
		sl_JPanel_InsuranceInfo.putConstraint(SpringLayout.NORTH, JComBox_InsuredBirthMonth, -3, SpringLayout.NORTH, JLbl_InsuredBirthDate);
		JComBox_InsuredBirthMonth.setToolTipText("Month");
		JPanel_InsuranceInfo.add(JComBox_InsuredBirthMonth);
		
		JComBox_InsuredBirthDay = new JComboBox(getDaysOfMonth());
		sl_JPanel_InsuranceInfo.putConstraint(SpringLayout.WEST, JComBox_InsuredBirthDay, 234, SpringLayout.WEST, JPanel_InsuranceInfo);
		sl_JPanel_InsuranceInfo.putConstraint(SpringLayout.EAST, JComBox_InsuredBirthMonth, -6, SpringLayout.WEST, JComBox_InsuredBirthDay);
		sl_JPanel_InsuranceInfo.putConstraint(SpringLayout.NORTH, JComBox_InsuredBirthDay, -3, SpringLayout.NORTH, JLbl_InsuredBirthDate);
		JComBox_InsuredBirthDay.setToolTipText("Day");
		JPanel_InsuranceInfo.add(JComBox_InsuredBirthDay);
		
		JComBox_InsuredBirthYear = new JComboBox(getYearsFromCurrent());
		sl_JPanel_InsuranceInfo.putConstraint(SpringLayout.WEST, JComBox_InsuredBirthYear, 291, SpringLayout.WEST, JPanel_InsuranceInfo);
		sl_JPanel_InsuranceInfo.putConstraint(SpringLayout.EAST, JComBox_InsuredBirthDay, -5, SpringLayout.WEST, JComBox_InsuredBirthYear);
		sl_JPanel_InsuranceInfo.putConstraint(SpringLayout.NORTH, JComBox_InsuredBirthYear, -3, SpringLayout.NORTH, JLbl_InsuredBirthDate);
		sl_JPanel_InsuranceInfo.putConstraint(SpringLayout.EAST, JComBox_InsuredBirthYear, -39, SpringLayout.EAST, JPanel_InsuranceInfo);
		JComBox_InsuredBirthYear.setToolTipText("Year");
		JPanel_InsuranceInfo.add(JComBox_InsuredBirthYear);
		
		JLbl_InsuredPhone = new JLabel("Phone");
		JLbl_InsuredPhone.setFont(new Font("Tahoma", Font.BOLD, 11));
		JPanel_InsuranceInfo.add(JLbl_InsuredPhone);
		
		JTxtField_InsuredPhone = new JFormattedTextField(phoneNumFormat);
		sl_JPanel_InsuranceInfo.putConstraint(SpringLayout.NORTH, JLbl_InsuredBirthDate, 12, SpringLayout.SOUTH, JTxtField_InsuredPhone);
		sl_JPanel_InsuranceInfo.putConstraint(SpringLayout.WEST, JTxtField_InsuredPhone, 61, SpringLayout.WEST, JPanel_InsuranceInfo);
		sl_JPanel_InsuranceInfo.putConstraint(SpringLayout.EAST, JTxtField_InsuredPhone, -242, SpringLayout.EAST, JPanel_InsuranceInfo);
		sl_JPanel_InsuranceInfo.putConstraint(SpringLayout.NORTH, JLbl_InsuredPhone, 3, SpringLayout.NORTH, JTxtField_InsuredPhone);
		sl_JPanel_InsuranceInfo.putConstraint(SpringLayout.EAST, JLbl_InsuredPhone, -6, SpringLayout.WEST, JTxtField_InsuredPhone);
		sl_JPanel_InsuranceInfo.putConstraint(SpringLayout.NORTH, JTxtField_InsuredPhone, 6, SpringLayout.SOUTH, JTxtField_InsuredCity);
		JTxtField_InsuredPhone.setToolTipText("###-###-####");
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
		JBtn_copyClientInfo = JBtn_CopyClientInfo;
		
		JLabel JLbl_InsuranceIdNumber = new JLabel("ID Number");
		JLbl_InsuranceIdNumber.setFont(new Font("Tahoma", Font.BOLD, 11));
		sl_JPanel_InsuranceInfo.putConstraint(SpringLayout.NORTH, JLbl_InsuranceIdNumber, 0, SpringLayout.NORTH, JLbl_InsuranceType);
		sl_JPanel_InsuranceInfo.putConstraint(SpringLayout.WEST, JLbl_InsuranceIdNumber, 0, SpringLayout.WEST, JTxtField_IdNumber);
		JPanel_InsuranceInfo.add(JLbl_InsuranceIdNumber);
		
		JLabel JLbl_InsuanceGroupNumber = new JLabel("Group Number");
		JLbl_InsuanceGroupNumber.setFont(new Font("Tahoma", Font.BOLD, 11));
		sl_JPanel_InsuranceInfo.putConstraint(SpringLayout.NORTH, JLbl_InsuanceGroupNumber, 0, SpringLayout.NORTH, JLbl_InsuranceType);
		sl_JPanel_InsuranceInfo.putConstraint(SpringLayout.WEST, JLbl_InsuanceGroupNumber, 0, SpringLayout.WEST, JTxtField_GroupNumber);
		JPanel_InsuranceInfo.add(JLbl_InsuanceGroupNumber);
		
		JLabel JLb_InsuredlLastName = new JLabel("Last Name");
		JLb_InsuredlLastName.setFont(new Font("Tahoma", Font.BOLD, 11));
		sl_JPanel_InsuranceInfo.putConstraint(SpringLayout.NORTH, JLb_InsuredlLastName, 0, SpringLayout.NORTH, JLbl_InsuredName);
		sl_JPanel_InsuranceInfo.putConstraint(SpringLayout.WEST, JLb_InsuredlLastName, 0, SpringLayout.WEST, JTxtField_IdNumber);
		JPanel_InsuranceInfo.add(JLb_InsuredlLastName);
		
		JLabel JLbl_InsuredMiddleName = new JLabel("Middle Name");
		JLbl_InsuredMiddleName.setFont(new Font("Tahoma", Font.BOLD, 11));
		sl_JPanel_InsuranceInfo.putConstraint(SpringLayout.NORTH, JLbl_InsuredMiddleName, 0, SpringLayout.NORTH, JLbl_InsuredName);
		sl_JPanel_InsuranceInfo.putConstraint(SpringLayout.WEST, JLbl_InsuredMiddleName, 0, SpringLayout.WEST, JTxtField_GroupNumber);
		JPanel_InsuranceInfo.add(JLbl_InsuredMiddleName);
		
		JLabel JLbl_InsuredAddress2 = new JLabel("Apt/Ste");
		sl_JPanel_InsuranceInfo.putConstraint(SpringLayout.WEST, JTxtField_InsuredAddress2, 6, SpringLayout.EAST, JLbl_InsuredAddress2);
		sl_JPanel_InsuranceInfo.putConstraint(SpringLayout.NORTH, JLbl_InsuredAddress2, 3, SpringLayout.NORTH, JTxtField_InsuredAddress2);
		sl_JPanel_InsuranceInfo.putConstraint(SpringLayout.WEST, JLbl_InsuredAddress2, 0, SpringLayout.WEST, JLbl_InsuranceType);
		JLbl_InsuredAddress2.setFont(new Font("Tahoma", Font.BOLD, 11));
		JPanel_InsuranceInfo.add(JLbl_InsuredAddress2);
		
		JLabel lblStreet = new JLabel("Street");
		sl_JPanel_InsuranceInfo.putConstraint(SpringLayout.NORTH, lblStreet, 3, SpringLayout.NORTH, JTxtField_InsuredAddress1);
		sl_JPanel_InsuranceInfo.putConstraint(SpringLayout.WEST, lblStreet, 10, SpringLayout.WEST, JLbl_InsuredAddress);
		lblStreet.setFont(new Font("Tahoma", Font.BOLD, 11));
		JPanel_InsuranceInfo.add(lblStreet);
		
		JLbl_InsuredCity = new JLabel("City");
		sl_JPanel_InsuranceInfo.putConstraint(SpringLayout.WEST, JTxtField_InsuredCity, 6, SpringLayout.EAST, JLbl_InsuredCity);
		sl_JPanel_InsuranceInfo.putConstraint(SpringLayout.EAST, JLbl_InsuredCity, -347, SpringLayout.EAST, JPanel_InsuranceInfo);
		sl_JPanel_InsuranceInfo.putConstraint(SpringLayout.NORTH, JLbl_InsuredCity, 3, SpringLayout.NORTH, JTxtField_InsuredCity);
		JLbl_InsuredCity.setFont(new Font("Tahoma", Font.BOLD, 11));
		JPanel_InsuranceInfo.add(JLbl_InsuredCity);
		
		JLbl_InsuredState = new JLabel("State");
		sl_JPanel_InsuranceInfo.putConstraint(SpringLayout.WEST, JComBox_InsuredState, 6, SpringLayout.EAST, JLbl_InsuredState);
		sl_JPanel_InsuranceInfo.putConstraint(SpringLayout.WEST, JLbl_InsuredState, 197, SpringLayout.WEST, JPanel_InsuranceInfo);
		sl_JPanel_InsuranceInfo.putConstraint(SpringLayout.EAST, JTxtField_InsuredCity, -6, SpringLayout.WEST, JLbl_InsuredState);
		sl_JPanel_InsuranceInfo.putConstraint(SpringLayout.NORTH, JLbl_InsuredState, 3, SpringLayout.NORTH, JTxtField_InsuredCity);
		JLbl_InsuredState.setFont(new Font("Tahoma", Font.BOLD, 11));
		JPanel_InsuranceInfo.add(JLbl_InsuredState);
		
		JLbl_InsuredZip = new JLabel("Zip");
		sl_JPanel_InsuranceInfo.putConstraint(SpringLayout.EAST, JLbl_InsuredZip, -93, SpringLayout.EAST, JPanel_InsuranceInfo);
		sl_JPanel_InsuranceInfo.putConstraint(SpringLayout.WEST, JTxtField_InsuredZip, 6, SpringLayout.EAST, JLbl_InsuredZip);
		sl_JPanel_InsuranceInfo.putConstraint(SpringLayout.EAST, JComBox_InsuredState, -6, SpringLayout.WEST, JLbl_InsuredZip);
		sl_JPanel_InsuranceInfo.putConstraint(SpringLayout.NORTH, JLbl_InsuredZip, 3, SpringLayout.NORTH, JTxtField_InsuredCity);
		JLbl_InsuredZip.setFont(new Font("Tahoma", Font.BOLD, 11));
		JPanel_InsuranceInfo.add(JLbl_InsuredZip);
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
	 * Returns all US states.
	 * @return String[] of all states.
	 */
	private String[] getAllUSStates() {
		return new String[] {"AL", "AK", "AZ", "AR", "CA", "CO", "CT", "DE", "FL", "GA", "HI", "ID", "IL", "IN", "IA", "KS", "KY", "LA", "ME", "MD", "MA", "MI", "MN", "MS", "MO", "MT", "NE", "NV", "NH", "NJ", "NM", "NY", "NC", "ND", "OH", "OK", "OR", "PA", "RI", "SC", "SD", "TN", "TX", "UT", "VT", "VA", "WA", "WV", "WI", "WY"};
		
	}
	
	
	/**
	 * Returns all months.
	 * @return String[] of all months
	 */
	private String[] getAllMonths() {
//		return new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"};
		return new String[] {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
	}
	
	
	/**
	 * Returns all the days in a month
	 * @return String[] of all days in a month.
	 */
	private String[] getDaysOfMonth() {
		return new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"};
	}
	
	
	/**
	 * This method returns a NumberFormmatter which will typically
	 * be used in a JFormattedTextField. This will set restrictions
	 * on what number values will be entered.
	 * 
	 * @param classType Number class type (Integer.class, Short.class, etc)
	 * @param minValue Minimum value allowed. Should use class minimums if unsure (Integer.MIN_VALUE, SomeClass.MIN_VALUE, etc)
	 * @param maxValue Maximum value allowed. Should use class maximums if unsure (Integer.MAX_VALUE, SomeClass.MAX_VALUE, etc)
	 * @param allowInvalidNumber Allow invalid numbers. Should be set to false.
	 * @param validateKeyStroke Set true if you want the value to be committed on each keystroke instead of focus lost.
	 * @return NumberFormatter 
	 */
	private NumberFormatter getNumberFormatter(Class<?> classType, int minValue, int maxValue, boolean allowInvalidNumber, boolean validateKeyStroke) {
		NumberFormatter nf = new NumberFormatter(NumberFormat.getInstance());
		nf.setValueClass(classType);
		nf.setMinimum(minValue);
		nf.setMaximum(maxValue);
		nf.setAllowsInvalid(allowInvalidNumber);
		nf.setCommitsOnValidEdit(validateKeyStroke);
		
		
		return nf;
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
	public JButton getCopyClientInfoChkBox() {
		return JBtn_copyClientInfo;
	}

	/**
	 * @return the jTxtField_firstName
	 */
	public JTextField getJTxtField_clientFirstName() {
		return JTxtField_clientFirstName;
	}

	
	/**
	 * @return the jTxtField_lastName
	 */
	public JTextField getJTxtField_clientLastName() {
		return JTxtField_clientLastName;
	}


	/**
	 * @return the jTxtField_middleName
	 */
	public JTextField getJTxtField_clientMiddleName() {
		return JTxtField_clientMiddleName;
	}

	

	/**
	 * @return the jTxtField_Address1
	 */
	public JTextField getJTxtField_clientAddress1() {
		return JTxtField_clientAddress1;
	}



	/**
	 * @return the jTxtField_Address2
	 */
	public JTextField getJTxtField_clientAddress2() {
		return JTxtField_clientAddress2;
	}



	/**
	 * @return the jTxtField_City
	 */
	public JTextField getJTxtField_clientCity() {
		return JTxtField_clientCity;
	}



	/**
	 * @return the jComBox_ClientState
	 */
	public JComboBox<String> getJComBox_ClientState() {
		return JComBox_ClientState;
	}



	/**
	 * @return the jTxtField_Zip
	 */
	public JTextField getJTxtField_clientZip() {
		return JTxtField_clientZip;
	}



	/**
	 * @return the jComBox_ClientBirthMonth
	 */
	public JComboBox<String> getJComBox_ClientBirthMonth() {
		return JComBox_ClientBirthMonth;
	}



	/**
	 * @return the jComBox_ClientBirthDay
	 */
	public JComboBox<String> getJComBox_ClientBirthDay() {
		return JComBox_ClientBirthDay;
	}



	/**
	 * @return the jComBox_BirthYear
	 */
	public JComboBox<String> getJComBox_BirthYear() {
		return JComBox_ClientBirthYear;
	}

	

	/**
	 * @return the jTxtField_ClientPhone
	 */
	public JTextField getJTxtField_ClientPhone() {
		return JTxtField_ClientPhone;
	}



	/**
	 * @return the jTxtField_ClientEmail
	 */
	public JTextField getJTxtField_ClientEmail() {
		return JTxtField_ClientEmail;
	}



	/**
	 * @return the jFormatTxtField_ClientFee
	 */
	public JFormattedTextField getJFormatTxtField_ClientFee() {
		return JFormatTxtField_ClientFee;
	}

	

	/**
	 * @return the jTxtField_SecondaryFirstName
	 */
	public JTextField getJTxtField_SecondaryFirstName() {
		return JTxtField_SecondaryFirstName;
	}


	/**
	 * @return the jTxtField_SecondaryLastName
	 */
	public JTextField getJTxtField_SecondaryLastName() {
		return JTxtField_SecondaryLastName;
	}

	

	/**
	 * @return the jTxtField_SecondaryMiddleName
	 */
	public JTextField getJTxtField_SecondaryMiddleName() {
		return JTxtField_SecondaryMiddleName;
	}

	

	/**
	 * @return the jTxtField_insuranceType
	 */
	public JTextField getJTxtField_insuranceType() {
		return JTxtField_insuranceType;
	}

	/**
	 * @return the jTxtField_IdNumber
	 */
	public JTextField getJTxtField_IdNumber() {
		return JTxtField_IdNumber;
	}



	/**
	 * @return the jTxtField_GroupNumber
	 */
	public JTextField getJTxtField_GroupNumber() {
		return JTxtField_GroupNumber;
	}


	/**
	 * @return the jTxtField_InsuredFirstName
	 */
	public JTextField getJTxtField_InsuredFirstName() {
		return JTxtField_InsuredFirstName;
	}


	/**
	 * @return the jTxtField_InsuredLastName
	 */
	public JTextField getJTxtField_InsuredLastName() {
		return JTxtField_InsuredLastName;
	}



	/**
	 * @return the jTxtField_InsuredMiddleName
	 */
	public JTextField getJTxtField_InsuredMiddleName() {
		return JTxtField_InsuredMiddleName;
	}



	/**
	 * @return the jTxtField_InsuredAddress1
	 */
	public JTextField getJTxtField_InsuredAddress1() {
		return JTxtField_InsuredAddress1;
	}


	/**
	 * @return the jTxtField_InsuredAddress2
	 */
	public JTextField getJTxtField_InsuredAddress2() {
		return JTxtField_InsuredAddress2;
	}



	/**
	 * @return the jTxtField_InsuredCity
	 */
	public JTextField getJTxtField_InsuredCity() {
		return JTxtField_InsuredCity;
	}


	/**
	 * @return the jComBox_InsuredState
	 */
	public JComboBox<String> getJComBox_InsuredState() {
		return JComBox_InsuredState;
	}



	/**
	 * @return the jTxtField_InsuredZip
	 */
	public JTextField getJTxtField_InsuredZip() {
		return JTxtField_InsuredZip;
	}



	/**
	 * @return the jComBox_InsuredBirthMonth
	 */
	public JComboBox<String> getJComBox_InsuredBirthMonth() {
		return JComBox_InsuredBirthMonth;
	}



	/**
	 * @return the jComBox_InsuredBirthDay
	 */
	public JComboBox<String> getJComBox_InsuredBirthDay() {
		return JComBox_InsuredBirthDay;
	}


	/**
	 * @return the jComBox_InsuredBirthYear
	 */
	public JComboBox<String> getJComBox_InsuredBirthYear() {
		return JComBox_InsuredBirthYear;
	}

	

	/**
	 * @return the jTxtField_InsuredPhone
	 */
	public JTextField getJTxtField_InsuredPhone() {
		return JTxtField_InsuredPhone;
	}


	

	
}
