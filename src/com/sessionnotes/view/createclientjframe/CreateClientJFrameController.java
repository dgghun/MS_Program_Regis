/**
 * 
 */
package com.sessionnotes.view.createclientjframe;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.GregorianCalendar;

import javax.swing.JOptionPane;

import com.sessionnotes.model.business.manager.SessionNotesManager;
import com.sessionnotes.model.domain.Address;
import com.sessionnotes.model.domain.Client;
import com.sessionnotes.model.domain.InsuranceCard;
import com.sessionnotes.model.domain.Name;

/**
 * <h1>CreateClientJFrameController.java</h1>
 * 
 * This class is the controller that handles all the logic
 * and requests and communications from the UI and the business 
 * manager.
 * 
 * As of right now there isn't any input error or input type checking besides
 * making sure the required fields are entered. This will be implemented
 * at a later date. As of now these errors are captured in a general exception
 * try catch block.
 * 
 * 
 * @author David Garcia
 * @version 1.0
 * @since 06-17-2018
 *
 */
public class CreateClientJFrameController implements ActionListener{

	private CreateClientJFrame clientJFrame;
	
	
	public CreateClientJFrameController() {
		
	}
	
	/**
	 * Constructor
	 * @param clientJFrame The UI JFrame that will be controlled
	 */
	public CreateClientJFrameController(CreateClientJFrame clientJFrame) {
		
		this.clientJFrame = clientJFrame;
		
		//Set action listeners
		clientJFrame.getSaveClientBtn().addActionListener(this);
		clientJFrame.getCancelButton().addActionListener(this);
		clientJFrame.getCopyClientInfoChkBox().addActionListener(this);
		
		clientJFrame.setVisible(true);
	}

	
	/* (non-Javadoc)
	 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource().equals(clientJFrame.getSaveClientBtn()))
			saveClientBtn_actionPerformed(e);
		else if(e.getSource().equals(clientJFrame.getCancelButton()))
			cancelButton_actionPerformed(e);
		else if(e.getSource().equals(clientJFrame.getCopyClientInfoChkBox()))
			chkBoxCopyClientInfo_actionPerformed(e);
	}
	
	
	/**
	 * The save button is clicked so save the new client
	 * @param e
	 */
	private void saveClientBtn_actionPerformed(ActionEvent e) {
		int confirmSaveNewClient = JOptionPane.showConfirmDialog(clientJFrame, "Save new client?", "Confirmation Window", JOptionPane.YES_NO_OPTION);
		
		try {
			// If user selects Yes, attempt to save new Client
			if(confirmSaveNewClient == JOptionPane.YES_OPTION) {

				//Check required input fields before creating Client
				if(checkRequiredInput()) {				
					Client client = getClientFormInput();	// populate Client with text fields
					SessionNotesManager sessionNotesManager = SessionNotesManager.getInstance();

					//If session business manager returns with no errors, try to persist new client
					if(sessionNotesManager != null) {
						boolean success = sessionNotesManager.performAction(SessionNotesManager.CREATE_CLIENT,client);

						//If able to create new client, let user know success
						if(success) {

							JOptionPane.showMessageDialog(
									clientJFrame, 
									"Successfully created client:\n" + client.getName().getFirstName() + ".", 
									"New Client ID: " + Integer.toString(client.getIdNumber()), 
									JOptionPane.NO_OPTION);

							clientJFrame.setVisible(false);
							clientJFrame.dispose();
						}
						else 
							JOptionPane.showMessageDialog(clientJFrame, "Internal error. Unable to create new client.", "ERROR", JOptionPane.NO_OPTION);
					}
				}
				else {
					JOptionPane.showMessageDialog(clientJFrame, "Client First Name, Last Name, Phone and Fee is required.", "Notification", JOptionPane.NO_OPTION);
				}				
			}
			else {
				//No is selected so don't do anything
			}
		}catch(Exception exception) {
			exception.printStackTrace();
			JOptionPane.showMessageDialog(clientJFrame, "Internal Error. The application will close now.", "ERROR", JOptionPane.NO_OPTION);
			clientJFrame.setVisible(false);
			clientJFrame.dispose();

		}
		}// END of saveClientBtn_actionPerformed()
		
	
	
	/**
	 * The cancel button is clicked so close the window
	 * @param e
	 */
	private void cancelButton_actionPerformed(ActionEvent e) {
		int cancel = JOptionPane.showConfirmDialog(clientJFrame, "Cancel new client?", "Confirmation Window", JOptionPane.YES_NO_OPTION);
		
		if(cancel == JOptionPane.YES_OPTION) {
			clientJFrame.setVisible(false);
			clientJFrame.dispose();
		}
	}
	
	
	/**
	 * If the button is pressed then this method will copy
	 * the clients name, address, phone and birth date to the 
	 * insured area of the form.
	 * 
	 * @param e
	 */
	private void chkBoxCopyClientInfo_actionPerformed(ActionEvent e) {
			clientJFrame.getJTxtField_InsuredFirstName().setText(clientJFrame.getJTxtField_clientFirstName().getText());
			clientJFrame.getJTxtField_InsuredLastName().setText(clientJFrame.getJTxtField_clientLastName().getText());
			clientJFrame.getJTxtField_InsuredMiddleName().setText(clientJFrame.getJTxtField_clientMiddleName().getText());
			clientJFrame.getJTxtField_InsuredAddress1().setText(clientJFrame.getJTxtField_clientAddress1().getText());
			clientJFrame.getJTxtField_InsuredAddress2().setText(clientJFrame.getJTxtField_clientAddress2().getText());
			clientJFrame.getJTxtField_InsuredCity().setText(clientJFrame.getJTxtField_clientCity().getText());
			clientJFrame.getJComBox_InsuredState().setSelectedIndex(clientJFrame.getJComBox_ClientState().getSelectedIndex());
			clientJFrame.getJTxtField_InsuredZip().setText(clientJFrame.getJTxtField_clientZip().getText());
			clientJFrame.getJTxtField_InsuredPhone().setText(clientJFrame.getJTxtField_ClientPhone().getText());
			clientJFrame.getJComBox_InsuredBirthMonth().setSelectedIndex(clientJFrame.getJComBox_ClientBirthMonth().getSelectedIndex());
			clientJFrame.getJComBox_InsuredBirthDay().setSelectedIndex(clientJFrame.getJComBox_ClientBirthDay().getSelectedIndex());
			clientJFrame.getJComBox_InsuredBirthYear().setSelectedIndex(clientJFrame.getJComBox_BirthYear().getSelectedIndex());
	}
	
	
	/**
	 * Checks if the text fields needed to create a new client are populated.
	 * @return True if the text fields needed contain input.
	 */
	private boolean checkRequiredInput() {
		return (!clientJFrame.getJTxtField_clientFirstName().getText().trim().isEmpty() && 
				!clientJFrame.getJTxtField_clientLastName().getText().trim().isEmpty() &&
				!clientJFrame.getJTxtField_ClientPhone().getText().trim().isEmpty() &&
				!clientJFrame.getJFormatTxtField_ClientFee().getText().trim().isEmpty());		
	}
	
	
	
	/**
	 * Returns a formatted calendar for this application. 
	 * @param year String numeric number i.e. "2018"
	 * @param month String English language of the month i.e. "January"
	 * @param day String numeric value of the day of month i.e. "1"
	 * @return a GregorianCalendar.
	 */
	private GregorianCalendar getFormattedCalenderFromClientForm(String year, String month, String day) {
		String[] months = new String[] {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
		int monthInt = 0;
		
		// loop to find number value of Enlish month value
		for(int i = 0; i < months.length; i++) {
			
			if(months[i].equals(month)) {
				monthInt = i + 1;	// set month to 
				i = months.length +1;	// break loop
			}
		}
		
		return new GregorianCalendar(Integer.parseInt(year), monthInt, Integer.parseInt(day));
	}
	
	
	
	/**
	 * Method to create a new client with text field user input.
	 * @return A new Client object populated with user input.
	 */
	private Client getClientFormInput() {
		
		Name clientName = new Name(
				clientJFrame.getJTxtField_clientFirstName().getText().trim(), 
				clientJFrame.getJTxtField_clientLastName().getText().trim(), 
				clientJFrame.getJTxtField_clientMiddleName().getText().trim());
		Name secondaryClientName = new Name(
				clientJFrame.getJTxtField_SecondaryFirstName().getText().trim(), 
				clientJFrame.getJTxtField_SecondaryLastName().getText().trim(), 
				clientJFrame.getJTxtField_SecondaryMiddleName().getText().trim());		
		Name insuredName = new Name(
				clientJFrame.getJTxtField_InsuredFirstName().getText().trim(), 
				clientJFrame.getJTxtField_InsuredLastName().getText().trim(), 
				clientJFrame.getJTxtField_InsuredMiddleName().getText().trim());
		Address clientAddress = new Address(	
				clientJFrame.getJTxtField_clientAddress1().getText().trim(),
				clientJFrame.getJTxtField_clientAddress2().getText().trim(),
				clientJFrame.getJTxtField_clientZip().getText().trim(),
				clientJFrame.getJTxtField_clientCity().getText().trim(),
				String.valueOf(clientJFrame.getJComBox_ClientState().getSelectedItem()));
		Address insuredAddress = new Address(
				clientJFrame.getJTxtField_InsuredAddress1().getText().trim(),
				clientJFrame.getJTxtField_InsuredAddress2().getText().trim(),
				clientJFrame.getJTxtField_InsuredZip().getText().trim(),
				clientJFrame.getJTxtField_InsuredCity().getText().trim(),
				String.valueOf(clientJFrame.getJComBox_InsuredState().getSelectedItem()).trim());
		
		// Check if birthday is entered, if not, create an empty one.
		GregorianCalendar clientBirthdate;
		String clientYear = String.valueOf(clientJFrame.getJComBox_BirthYear().getSelectedItem()).trim();
		String clientMonth = String.valueOf(clientJFrame.getJComBox_ClientBirthMonth().getSelectedItem()).trim();
		String clientDay = String.valueOf(clientJFrame.getJComBox_ClientBirthDay().getSelectedItem()).trim();
		clientBirthdate = getFormattedCalenderFromClientForm(clientYear, clientMonth, clientDay);
		
		// Check if birthday is entered, if not, create an empty one.
		GregorianCalendar insuredBirthdate;
		String insuredYear = String.valueOf(clientJFrame.getJComBox_InsuredBirthYear().getSelectedItem()).trim();
		String insuredMonth = String.valueOf(clientJFrame.getJComBox_InsuredBirthMonth().getSelectedItem()).trim();
		String insuredDay = String.valueOf(clientJFrame.getJComBox_InsuredBirthDay().getSelectedItem()).trim();
		insuredBirthdate = getFormattedCalenderFromClientForm(insuredYear, insuredMonth, insuredDay);
		
		InsuranceCard insurance = new InsuranceCard(
				clientJFrame.getJTxtField_insuranceType().getText().trim(),
				clientJFrame.getJTxtField_IdNumber().getText().trim(),
				clientJFrame.getJTxtField_GroupNumber().getText().trim(), 
				insuredName,
				insuredAddress, 
				clientJFrame.getJTxtField_InsuredPhone().getText().trim(),
				insuredBirthdate);
		
		ArrayList<Name> secondaryClients = new ArrayList<Name>();
		secondaryClients.add(secondaryClientName);
		
		short fee = Short.parseShort(clientJFrame.getJFormatTxtField_ClientFee().getText().trim());
		String clientPhone = clientJFrame.getJTxtField_ClientPhone().getText().trim();
		String clientEmail = clientJFrame.getJTxtField_ClientEmail().getText().trim();
		
		int tempIdNumber = (int) Math.random();	//TODO temp for now until id  method is implemented.
		Client client = new Client(tempIdNumber, clientName, clientPhone, clientAddress, clientEmail, fee, secondaryClients, insurance, clientBirthdate);
		return client;
	}
}
