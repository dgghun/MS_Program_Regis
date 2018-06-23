package com.sessionnotes.view.createsessionjframe;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.text.NumberFormat;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.SpringLayout;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.text.NumberFormatter;

import com.github.lgooddatepicker.components.DatePicker;
import com.github.lgooddatepicker.components.DatePickerSettings;
import com.github.lgooddatepicker.components.TimePicker;
import com.github.lgooddatepicker.components.TimePickerSettings;
import com.sessionnotes.view.createclientjframe.CreateClientJFrameController;


public class CreateSessionJFrame extends JFrame {

	
	//My attribute declarations
	JLabel jLblClientFullName;
	JLabel jLblClientId;
	JLabel jLblClientPhone;
	DatePicker datePickSessionDate;
	TimePicker timePickSessionTime;
	JFormattedTextField jFormatTxtFldClientFee;
	JTextField jFormatTxtFldFeePaid;
	JTextField jTxtFldPaymenType;
	JTextArea jTxtAreaNotes;
	JButton jBtnSave;
	JButton jBtnCancel;
	CreateSessionJFrameController sessionJFrameController;
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private SpringLayout sl_contentPane;
	private JPanel JPanel_Labels;
	private JFormattedTextField JFormatTxtField_ClientFee;
	private JFormattedTextField JFormatTxtField_FeePaid;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					@SuppressWarnings("unused")
					CreateSessionJFrame frame = new CreateSessionJFrame();
//					frame.setVisible(true);
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
		setBounds(100, 100, 616, 485);
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
		sl_contentPane.putConstraint(SpringLayout.EAST, JPanel_Labels, 544, SpringLayout.WEST, JLbl_NewSessionForm);
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
		sl_JPanel_Labels.putConstraint(SpringLayout.NORTH, JLbl_ClientPhone, 2, SpringLayout.NORTH, JLbl_ClientFullName);
		sl_JPanel_Labels.putConstraint(SpringLayout.EAST, JLbl_ClientPhone, 0, SpringLayout.EAST, JPanel_Labels);
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
		
		TimePicker TimePicker_SessionTime = new TimePicker(getTimePickerSettings());
		JPanel_SessionDate.add(TimePicker_SessionTime);
		
		JPanel JPanel_SessionDateTime = new JPanel();
		sl_contentPane.putConstraint(SpringLayout.NORTH, JPanel_SessionDateTime, 6, SpringLayout.SOUTH, JPanel_Labels);
		sl_contentPane.putConstraint(SpringLayout.WEST, JPanel_SessionDateTime, 0, SpringLayout.WEST, JLbl_NewSessionForm);
		JPanel_SessionDateTime.setBackground(Color.WHITE);
		contentPane.add(JPanel_SessionDateTime);
		
		
		JLabel JLbl_DateTime = new JLabel("Session Date and Time ");
		JPanel_SessionDateTime.add(JLbl_DateTime);
		sl_contentPane.putConstraint(SpringLayout.NORTH, JLbl_DateTime, 10, SpringLayout.SOUTH, JPanel_Labels);
		sl_contentPane.putConstraint(SpringLayout.NORTH, JPanel_SessionDate, 6, SpringLayout.SOUTH, JLbl_DateTime);
		sl_contentPane.putConstraint(SpringLayout.WEST, JLbl_DateTime, 0, SpringLayout.WEST, JLbl_NewSessionForm);
		JLbl_DateTime.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JPanel JPanel_FeePayment = new JPanel();
		sl_contentPane.putConstraint(SpringLayout.NORTH, JPanel_FeePayment, 6, SpringLayout.SOUTH, JPanel_Labels);
		sl_contentPane.putConstraint(SpringLayout.WEST, JPanel_FeePayment, 73, SpringLayout.EAST, JPanel_SessionDate);
		sl_contentPane.putConstraint(SpringLayout.EAST, JPanel_FeePayment, 306, SpringLayout.EAST, JPanel_SessionDate);
		JPanel_FeePayment.setBackground(Color.WHITE);
		contentPane.add(JPanel_FeePayment);
		SpringLayout sl_JPanel_FeePayment = new SpringLayout();
		JPanel_FeePayment.setLayout(sl_JPanel_FeePayment);
		
		JFormatTxtField_ClientFee = new JFormattedTextField(getNumberFormatter(Integer.class, 0, Integer.MAX_VALUE, true, false));
		sl_JPanel_FeePayment.putConstraint(SpringLayout.NORTH, JFormatTxtField_ClientFee, 7, SpringLayout.NORTH, JPanel_FeePayment);
		sl_JPanel_FeePayment.putConstraint(SpringLayout.EAST, JFormatTxtField_ClientFee, -10, SpringLayout.EAST, JPanel_FeePayment);
		JPanel_FeePayment.add(JFormatTxtField_ClientFee);
		JFormatTxtField_ClientFee.setFont(new Font("Tahoma", Font.PLAIN, 12));
		JFormatTxtField_ClientFee.setToolTipText("Enter Fee");
		JFormatTxtField_ClientFee.setColumns(10);
		
		JLabel lblClientFee = new JLabel("Client Fee $");
		sl_JPanel_FeePayment.putConstraint(SpringLayout.NORTH, lblClientFee, 10, SpringLayout.NORTH, JPanel_FeePayment);
		sl_JPanel_FeePayment.putConstraint(SpringLayout.EAST, lblClientFee, -6, SpringLayout.WEST, JFormatTxtField_ClientFee);
		JPanel_FeePayment.add(lblClientFee);
		lblClientFee.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JLabel lblPaymentType = new JLabel("Payment Type");
		JPanel_FeePayment.add(lblPaymentType);
		lblPaymentType.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JFormatTxtField_FeePaid = new JFormattedTextField(getNumberFormatter(Integer.class, 0, Integer.MAX_VALUE, true, false));
		sl_JPanel_FeePayment.putConstraint(SpringLayout.NORTH, JFormatTxtField_FeePaid, 6, SpringLayout.SOUTH, JFormatTxtField_ClientFee);
		sl_JPanel_FeePayment.putConstraint(SpringLayout.WEST, JFormatTxtField_FeePaid, 0, SpringLayout.WEST, JFormatTxtField_ClientFee);
		sl_JPanel_FeePayment.putConstraint(SpringLayout.EAST, JFormatTxtField_FeePaid, -10, SpringLayout.EAST, JPanel_FeePayment);
		JPanel_FeePayment.add(JFormatTxtField_FeePaid);
		JFormatTxtField_FeePaid.setFont(new Font("Tahoma", Font.PLAIN, 12));
		JFormatTxtField_FeePaid.setColumns(10);
		

		
		JScrollPane JScrollPane_NotesArea = new JScrollPane();
		sl_contentPane.putConstraint(SpringLayout.NORTH, JScrollPane_NotesArea, 223, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, JPanel_FeePayment, -6, SpringLayout.NORTH, JScrollPane_NotesArea);
		sl_contentPane.putConstraint(SpringLayout.WEST, JScrollPane_NotesArea, 0, SpringLayout.WEST, JLbl_NewSessionForm);
		sl_contentPane.putConstraint(SpringLayout.EAST, JScrollPane_NotesArea, -15, SpringLayout.EAST, contentPane);
		JScrollPane_NotesArea.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		contentPane.add(JScrollPane_NotesArea);
		
		JTextArea JTxtArea_Notes = new JTextArea();
		JTxtArea_Notes.setBackground(new Color(255, 250, 240));
		JTxtArea_Notes.setToolTipText("Enter notes here.");
		JTxtArea_Notes.setFont(new Font("Tahoma", Font.PLAIN, 14));
		JTxtArea_Notes.setLineWrap(true);
		JScrollPane_NotesArea.setViewportView(JTxtArea_Notes);
		
		JLabel lblNotes = new JLabel("Notes");
		lblNotes.setFont(new Font("Tahoma", Font.BOLD, 12));
		sl_contentPane.putConstraint(SpringLayout.WEST, lblNotes, 0, SpringLayout.WEST, JLbl_NewSessionForm);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, lblNotes, -6, SpringLayout.NORTH, JScrollPane_NotesArea);
		contentPane.add(lblNotes);
		
		JPanel JPanel_SaveCancelBtns = new JPanel();
		sl_contentPane.putConstraint(SpringLayout.NORTH, JPanel_SaveCancelBtns, 390, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, JScrollPane_NotesArea, -6, SpringLayout.NORTH, JPanel_SaveCancelBtns);
		JPanel_SaveCancelBtns.setBackground(Color.WHITE);
		sl_contentPane.putConstraint(SpringLayout.EAST, JPanel_SaveCancelBtns, 0, SpringLayout.EAST, JScrollPane_NotesArea);
		contentPane.add(JPanel_SaveCancelBtns);
		
		JButton btnSave = new JButton("Save");
		btnSave.setFocusPainted(false);
		btnSave.setPreferredSize(new Dimension(80, 23));
		btnSave.setFont(new Font("Tahoma", Font.BOLD, 12));
		JPanel_SaveCancelBtns.add(btnSave);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setFocusPainted(false);
		btnCancel.setPreferredSize(new Dimension(80, 23));
		btnCancel.setFont(new Font("Tahoma", Font.BOLD, 12));
		JPanel_SaveCancelBtns.add(btnCancel);
		
	
		
		JTextField JTxtField_PaymentType = new JTextField();
		sl_JPanel_FeePayment.putConstraint(SpringLayout.NORTH, JTxtField_PaymentType, 6, SpringLayout.SOUTH, JFormatTxtField_FeePaid);
		JTxtField_PaymentType.setFont(new Font("Tahoma", Font.PLAIN, 12));
		sl_JPanel_FeePayment.putConstraint(SpringLayout.NORTH, lblPaymentType, 2, SpringLayout.NORTH, JTxtField_PaymentType);
		sl_JPanel_FeePayment.putConstraint(SpringLayout.EAST, lblPaymentType, -6, SpringLayout.WEST, JTxtField_PaymentType);
		sl_JPanel_FeePayment.putConstraint(SpringLayout.WEST, JTxtField_PaymentType, 0, SpringLayout.WEST, JFormatTxtField_ClientFee);
		sl_JPanel_FeePayment.putConstraint(SpringLayout.EAST, JTxtField_PaymentType, 0, SpringLayout.EAST, JFormatTxtField_ClientFee);
		JPanel_FeePayment.add(JTxtField_PaymentType);
		
		JLabel lblFeePaid = new JLabel("Fee Paid $");
		lblFeePaid.setFont(new Font("Tahoma", Font.BOLD, 12));
		sl_JPanel_FeePayment.putConstraint(SpringLayout.NORTH, lblFeePaid, 6, SpringLayout.SOUTH, JFormatTxtField_ClientFee);
		sl_JPanel_FeePayment.putConstraint(SpringLayout.EAST, lblFeePaid, 0, SpringLayout.EAST, lblClientFee);
		JPanel_FeePayment.add(lblFeePaid);
		jTxtAreaNotes = JTxtArea_Notes;
		jBtnCancel = btnCancel;
		jBtnSave = btnSave;

		
		// get components reference
		jLblClientFullName = JLbl_ClientFullName;
		jLblClientId = JLbl_ClientID;
		jLblClientPhone = JLbl_ClientPhone;
		datePickSessionDate = DatePicker_SessoinDate;
		timePickSessionTime = TimePicker_SessionTime;
		jFormatTxtFldClientFee = JFormatTxtField_ClientFee;
		jFormatTxtFldFeePaid = JFormatTxtField_FeePaid;
		jTxtFldPaymenType = JTxtField_PaymentType;
		setControllerAndVisibility();	//set frame visibility.
		
		
	}
	
	
	
	/**
	 * Basic method to set controller and frame visibility
	 */
	private void setControllerAndVisibility() {
		sessionJFrameController = new CreateSessionJFrameController(this);	//sets up controller for this view
		this.setVisible(true);	//show frame
	}

	/**
	 * Settings for a DatePicker class
	 * @return DatePickerSettings
	 */
	private DatePickerSettings getDatePickerSettings() {
		DatePickerSettings dateSettings = new DatePickerSettings();
		dateSettings.setAllowKeyboardEditing(false);

		return dateSettings;
	}

	/**
	 * Settings for a TimePicker class
	 * @return TimePickerSettings
	 */
	private TimePickerSettings getTimePickerSettings() {
		TimePickerSettings timeSettings = new TimePickerSettings();
		timeSettings.setInitialTimeToNow();
		
		return timeSettings;
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
	 * @return the jLblClientFullName
	 */
	public JLabel getjLblClientFullName() {
		return jLblClientFullName;
	}

	/**
	 * @return the jLblClientId
	 */
	public JLabel getjLblClientId() {
		return jLblClientId;
	}

	/**
	 * @return the jLblClientPhone
	 */
	public JLabel getjLblClientPhone() {
		return jLblClientPhone;
	}

	/**
	 * @return the datePickSessionDate
	 */
	public DatePicker getDatePickSessionDate() {
		
		return datePickSessionDate;
	}

	/**
	 * @return the timePickSessionTime
	 */
	public TimePicker getTimePickSessionTime() {
		return timePickSessionTime;
	}

	/**
	 * @return the jFormatTxtFldClientFee
	 */
	public JFormattedTextField getjFormatTxtFldClientFee() {
		return jFormatTxtFldClientFee;
	}

	/**
	 * @return the jTxtFldPaymentType
	 */
	public JTextField getjTxtFldPaymentType() {
		return jFormatTxtFldFeePaid;
	}

	/**
	 * @return the jChkBoxFeePaid
	 */
	public JFormattedTextField getjFormTxtFldFeePaid() {
		return JFormatTxtField_FeePaid;
	}

	/**
	 * @return the jTxtAreaNotes
	 */
	public JTextArea getjTxtAreaNotes() {
		return jTxtAreaNotes;
	}

	/**
	 * @return the jBtnSave
	 */
	public JButton getjBtnSave() {
		return jBtnSave;
	}

	/**
	 * @return the jBtnCancel
	 */
	public JButton getjBtnCancel() {
		return jBtnCancel;
	}

	/**
	 * @param jLblClientFullName the jLblClientFullName to set
	 */
	public void setjLblClientFullName(String clientFullName) {
		this.jLblClientFullName.setText(clientFullName);
	}

	/**
	 * @param jLblClientId the jLblClientId to set
	 */
	public void setjLblClientId(String clientId) {
		this.jLblClientId.setText(clientId);
	}

	/**
	 * @param jLblClientPhone the jLblClientPhone to set
	 */
	public void setjLblClientPhone(String clientPhone) {
		this.jLblClientPhone.setText(clientPhone);
	}

	/**
	 * @param datePickSessionDate the datePickSessionDate to set
	 */
	public void setDatePickSessionDate(DatePicker datePickSessionDate) {
		this.datePickSessionDate = datePickSessionDate;
	}

	/**
	 * @param timePickSessionTime the timePickSessionTime to set
	 */
	public void setTimePickSessionTime(TimePicker timePickSessionTime) {
		this.timePickSessionTime = timePickSessionTime;
	}

	/**
	 * @param jFormatTxtFldClientFee the jFormatTxtFldClientFee to set
	 */
	public void setjFormatTxtFldClientFee(JFormattedTextField jFormatTxtFldClientFee) {
		this.jFormatTxtFldClientFee = jFormatTxtFldClientFee;
	}

	/**
	 * @param jTxtFldPaymentType the jTxtFldPaymentType to set
	 */
	public void setjTxtFldPaymentType(JTextField jTxtFldPaymentType) {
		this.jFormatTxtFldFeePaid = jTxtFldPaymentType;
	}

	/**
	 * @param jChkBoxFeePaid the jChkBoxFeePaid to set
	 */
	public void setjFormTxtFldFeePaid(String feePaid) {
		this.jFormatTxtFldClientFee.setText(feePaid);
	}

	/**
	 * @param jTxtAreaNotes the jTxtAreaNotes to set
	 */
	public void setjTxtAreaNotes(JTextArea jTxtAreaNotes) {
		this.jTxtAreaNotes = jTxtAreaNotes;
	}

	/**
	 * @param jBtnSave the jBtnSave to set
	 */
	public void setjBtnSave(JButton jBtnSave) {
		this.jBtnSave = jBtnSave;
	}

	/**
	 * @param jBtnCancel the jBtnCancel to set
	 */
	public void setjBtnCancel(JButton jBtnCancel) {
		this.jBtnCancel = jBtnCancel;
	}

	/**
	 * @return the jTxtFldPaymenType
	 */
	public JTextField getjTxtFldPaymenType() {
		return jTxtFldPaymenType;
	}

	/**
	 * @param jTxtFldPaymenType the jTxtFldPaymenType to set
	 */
	public void setjTxtFldPaymenType(String paymentType) {
		this.jTxtFldPaymenType.setText(paymentType);
	}
	
	
}
