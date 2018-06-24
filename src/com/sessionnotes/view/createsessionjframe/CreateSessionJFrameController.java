/**
 * 
 */
package com.sessionnotes.view.createsessionjframe;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Time;
import java.util.GregorianCalendar;

import javax.swing.JOptionPane;

import com.sessionnotes.model.business.manager.SessionNotesManager;
import com.sessionnotes.model.domain.Client;
import com.sessionnotes.model.domain.Session;

/**
 * <h1>CreateSessionJFrameController.java</h1>
 * 
 * This class is the controller that handles all the logic
 * and requests and communications from the UI and the business 
 * manager.
 * 
 * As of right now there input error checking and format checking
 * but still more testing needs to be done.
 * 
 *
 * @author David Garcia
 * @version 1.0
 * @since 06-23-2018
 *
 */
public class CreateSessionJFrameController implements ActionListener{
	
	private CreateSessionJFrame sessionJFrame;
	
	/**
	 * Default constructor
	 */
	public CreateSessionJFrameController() {
		
	}
	
	
	/**
	 * Constructor
	 * @param sessoinJFrame The UI JFrame that will be controlled
	 */
	public CreateSessionJFrameController(CreateSessionJFrame sessionJFrame, Client client) {
		
		this.sessionJFrame = sessionJFrame;
		
		//Set action listeners
		sessionJFrame.getjBtnCancel().addActionListener(this);
		sessionJFrame.getjBtnSave().addActionListener(this);
		
		setClientInfoToForm(client);	// Set client info on form
		sessionJFrame.setVisible(true);
	}


	/* (non-Javadoc)
	 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource().equals(sessionJFrame.getjBtnSave())) {
			System.out.println("Save Btn pressed");
			actionPerformed_SaveButton(e);
		}
		else if(e.getSource().equals(sessionJFrame.getjBtnCancel())) {
			System.out.println("Cancel Btn pressed");
			actionPerformed_CancelButton(e);
		}
	}
	
	
	/**
	 * The save button is clicked so save the new session
	 * @param actionEvent
	 */
	private void actionPerformed_SaveButton(ActionEvent actionEvent) {
		
		// If required input is entered, proceed with confirmation window.
		if(checkRequiredInput()) {
			
			int confirmSaveNewSession = JOptionPane.showConfirmDialog(sessionJFrame, "Save new session?", "Confirmation Window", JOptionPane.YES_NO_OPTION);	
			
			//If user selects yes, attempt to save session
			if(confirmSaveNewSession == JOptionPane.YES_OPTION) {
				
				try {
					Session session = getSessionFormInput();	// Get session with populated user input.
					SessionNotesManager sessionNotesManager = SessionNotesManager.getInstance();
					
					// If manager isn't null, try to persist new session
					if(sessionNotesManager != null) {
						boolean success = sessionNotesManager.performAction(SessionNotesManager.CREATE_SESSION, session);
						
						//If able to create new session, let user know success
						if(success) {

							JOptionPane.showMessageDialog(sessionJFrame, "Successfully added new sesion!", "Success", JOptionPane.NO_OPTION);
							sessionJFrame.setVisible(false);
							sessionJFrame.dispose();
						}
						else {
							JOptionPane.showMessageDialog(sessionJFrame, "Internal error. Unable to create new sessoin. Try again later.", "ERROR", JOptionPane.NO_OPTION);
						}// END if else (success)
					}
					else {
						JOptionPane.showMessageDialog(sessionJFrame, "Internal error. Unable to create new sessoin. Try again later.", "ERROR", JOptionPane.NO_OPTION);
					}// END if else (sessionNotesManager != null)
				}catch (Exception e) {
					JOptionPane.showMessageDialog(sessionJFrame, "Internal error. Unable to create new sessoin. Try again later.", "ERROR", JOptionPane.NO_OPTION);
				}
			}
			
		}
		else {
			JOptionPane.showMessageDialog(sessionJFrame, "Sessoin date, time, fee and payment type is required.", "Notification", JOptionPane.NO_OPTION);
		}
	}
	
	
	/**
	 * The cancel button is clicked so close the window
	 * @param actionEvent
	 */
	private void actionPerformed_CancelButton(ActionEvent actionEvent){
		int cancel = JOptionPane.showConfirmDialog(sessionJFrame, "Cancel new session?", "Confirmation Window", JOptionPane.YES_NO_OPTION);
		
		if(cancel == JOptionPane.YES_OPTION) {
			sessionJFrame.setVisible(false);
			sessionJFrame.dispose();
		}
	}
	
	
	/**
	 * Checks if the text fields needed to create a new session are populated.
	 * @return True if the text fields needed contain input.
	 */
	private boolean checkRequiredInput() {
		
		return (
				!sessionJFrame.getDatePickSessionDate().getText().trim().isEmpty() &&
				!sessionJFrame.getTimePickSessionTime().getText().trim().isEmpty() &&
				!sessionJFrame.getjFormatTxtFldClientFee().getText().trim().isEmpty() &&
				!sessionJFrame.getjTxtFldPaymentType().getText().trim().isEmpty() &&
				!sessionJFrame.getjTxtFldPaymenType().getText().trim().isEmpty()
				);
	}
	
	
	/**
	 * This method sets the form labels with the clients
	 * full name, id and phone number.
	 */
	private void setClientInfoToForm(Client client) {
		String fullName = client.getName().getFirstName() + " " + client.getName().getLastName().charAt(0);
		
		sessionJFrame.setjLblClientFullName(fullName);
		sessionJFrame.setjLblClientId("ID:" + Integer.toString(client.getIdNumber()));
		sessionJFrame.setjLblClientPhone("Ph. " + client.getPhoneNumber());
		
	}
	
	
	/**
	 * Method to creates a new Session from form field user input.
	 * @return A new Session object populated with user input.
	 */
	@SuppressWarnings("deprecation")
	private Session getSessionFormInput() {
		
		Session session = new Session();
		
		session.setDate(new GregorianCalendar(
				sessionJFrame.getDatePickSessionDate().getDate().getYear(), 
				sessionJFrame.getDatePickSessionDate().getDate().getDayOfMonth(),
				sessionJFrame.getDatePickSessionDate().getDate().getMonthValue()));
		session.setTime(new Time(
				sessionJFrame.getTimePickSessionTime().getTime().getHour(), 
				sessionJFrame.getTimePickSessionTime().getTime().getMinute(), 
				sessionJFrame.getTimePickSessionTime().getTime().getSecond()
				));
		session.setFeeAmount(Short.parseShort(sessionJFrame.getjFormatTxtFldClientFee().getText().trim()));
		session.setFeePaid(Short.parseShort(sessionJFrame.getjFormTxtFldFeePaid().getText().trim()));
		session.setPaymentType(sessionJFrame.getjTxtFldPaymentType().getText().trim());
		session.setNote(sessionJFrame.getjTxtAreaNotes().getText().trim());
		
		return session;
	}
	

}
