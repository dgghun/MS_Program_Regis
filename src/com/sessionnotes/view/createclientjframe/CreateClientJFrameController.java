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
		System.out.println("CreateClientJFrameController: action performed method start");
		
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
					Client client = getClientFromUserInput();	// populate Client with text fields
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
	 * 
	 * @param e
	 */
	private void chkBoxCopyClientInfo_actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(clientJFrame, "No working yet!","Copy client info CheckBox clicked", JOptionPane.NO_OPTION);

	}
	
	
	/**
	 * Checks if the text fields needed to create a new client are populated.
	 * @return True if the text fields needed contain input.
	 */
	private boolean checkRequiredInput() {
		return (!clientJFrame.getJTxtField_firstName().getText().trim().isEmpty() && 
				!clientJFrame.getJTxtField_lastName().getText().trim().isEmpty() &&
				!clientJFrame.getJTxtField_ClientPhone().getText().trim().isEmpty() &&
				!clientJFrame.getJTxtField_ClientFee().getText().trim().isEmpty());		
	}
	
	
	/**
	 * Method to create a new client with text field user input.
	 * @return A new Client object populated with user input.
	 */
	private Client getClientFromUserInput() {
		
		Name clientName = new Name(
				clientJFrame.getJTxtField_firstName().getText().trim(), 
				clientJFrame.getJTxtField_lastName().getText().trim(), 
				clientJFrame.getJTxtField_middleName().getText().trim());
		Name secondaryClientName = new Name(
				clientJFrame.getJTxtField_SecondaryFirstName().getText().trim(), 
				clientJFrame.getJTxtField_SecondaryLastName().getText().trim(), 
				clientJFrame.getJTxtField_SecondaryMiddleName().getText().trim());		
		Name insuredName = new Name(
				clientJFrame.getJTxtField_InsuredFirstName().getText().trim(), 
				clientJFrame.getJTxtField_InsuredLastName().getText().trim(), 
				clientJFrame.getJTxtField_InsuredMiddleName().getText().trim());
		Address clientAddress = new Address(	
				clientJFrame.getJTxtField_Address1().getText().trim(),
				clientJFrame.getJTxtField_Address2().getText().trim(),
				clientJFrame.getJTxtField_Zip().getText().trim(),
				clientJFrame.getJTxtField_City().getText().trim(),
				clientJFrame.getJTxtField_State().getText().trim());
		Address insuredAddress = new Address(
				clientJFrame.getJTxtField_InsuredAddress1().getText(),
				clientJFrame.getJTxtField_InsuredAddress2().getText(),
				clientJFrame.getJTxtField_InsuredZip().getText(),
				clientJFrame.getJTxtField_InsuredCity().getText(),
				clientJFrame.getJTxtField_InsuredState().getText());
		
		// Check if birthday is entered, if not, create an empty one.
		GregorianCalendar clientBirthdate;
		String clientYear = clientJFrame.getJTxtField_BirthYear().getText().trim();
		String clientMonth = clientJFrame.getJTxtFIeld_BirthMonth().getText().trim();
		String clientDay = clientJFrame.getJTxtField_BirthDay().getText().trim();
		if(clientYear.isEmpty() || clientMonth.isEmpty() || clientDay.isEmpty())
			clientBirthdate = new GregorianCalendar();
		else
			clientBirthdate = new GregorianCalendar(Integer.parseInt(clientYear), Integer.parseInt(clientMonth), Integer.parseInt(clientDay));
		
		// Check if birthday is entered, if not, create an empty one.
		GregorianCalendar insuredBirthdate;
		String insuredYear = clientJFrame.getJTxtField_InsuredBirthYear().getText().trim();
		String insuredMonth = clientJFrame.getJTxtField_InsuredBirthMonth().getText().trim();
		String insuredDay = clientJFrame.getJTxtField_InsuredBirthDay().getText().trim();
		if(insuredYear.isEmpty() || insuredMonth.isEmpty() || insuredDay.isEmpty())
			insuredBirthdate = new GregorianCalendar();
		else
			insuredBirthdate = new GregorianCalendar(Integer.parseInt(insuredYear), Integer.parseInt(insuredMonth), Integer.parseInt(insuredDay));
		
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
		
		short fee = Short.parseShort(clientJFrame.getJTxtField_ClientFee().getText().trim());
		String clientPhone = clientJFrame.getJTxtField_ClientPhone().getText().trim();
		String clientEmail = clientJFrame.getJTxtField_ClientEmail().getText().trim();
		
		int tempIdNumber = (int) Math.random();	//TODO temp for now until id  method is implemented.
		Client client = new Client(tempIdNumber, clientName, clientPhone, clientAddress, clientEmail, fee, secondaryClients, insurance, clientBirthdate);
		return client;
	}
}
