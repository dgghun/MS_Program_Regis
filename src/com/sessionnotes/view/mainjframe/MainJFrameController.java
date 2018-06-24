/**
 * 
 */
package com.sessionnotes.view.mainjframe;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JInternalFrame;

import com.sessionnotes.view.createclientjframe.CreateClientJFrame;
import com.sessionnotes.view.createsessionjframe.CreateSessionJFrame;

/**
 * <h1>MainJFrameController.java</h1>
 * 
 *
 * @author David Garcia
 * @version 1.0
 * @since 06-24-2018
 *
 */
public class MainJFrameController implements ActionListener{
	
	private MainJFrame mainJFrame;
	
	/**
	 * Default constructor
	 */
	public MainJFrameController() {
	}
	
	
	/**
	 * Constructor that sets the actionListeners 
	 * @param mainJFrame The frame to control
	 */
	public MainJFrameController(MainJFrame mainJFrame) {
		this.mainJFrame = mainJFrame;
		
		//Set listeners
		mainJFrame.getjMenuItmCreateClient().addActionListener(this);
		mainJFrame.getjMenuItmCreateSession().addActionListener(this);
		mainJFrame.getjMenuItmExit().addActionListener(this);
		
		mainJFrame.setVisible(true);
	}


	/**
	 * 
	 */
	@Override
	public void actionPerformed(ActionEvent e) {

		if(e.getSource().equals(mainJFrame.getjMenuItmCreateClient()))
			actionPerformed_menuCreateClient(e);
		else if(e.getSource().equals(mainJFrame.getjMenuItmCreateSession()))
			actionPerformed_menuCreateSession(e);
		else if(e.getSource().equals(mainJFrame.getjMenuItmExit()))
			actionPerformed_menuExit(e);
	}
	
	
	/**
	 * This method centers the JFrame inside of the desktop
	 * @param frame The frame to center.
	 */
	private void centerFrameInDesktop(JInternalFrame frame) {
		
		Dimension desktopSize = mainJFrame.getjDesktopPane().getSize();
		Dimension internalFrameSize = frame.getSize();
		frame.setLocation(
				(desktopSize.width - internalFrameSize.width)/2, 
				(desktopSize.height - internalFrameSize.height)/2
				);
	}
	
	
	/**
	 * 
	 * @param actionEvent
	 */
	private void actionPerformed_menuCreateClient(ActionEvent actionEvent) {
		CreateClientJFrame frame = new CreateClientJFrame();
		frame.setVisible(true);
		mainJFrame.getjDesktopPane().add(frame);
		centerFrameInDesktop(frame);
	}
	
	
	/**
	 * 
	 * @param actionEvent
	 */
	private void actionPerformed_menuCreateSession(ActionEvent actionEvent) {
		CreateSessionJFrame frame = new CreateSessionJFrame();
		frame.setVisible(true);
		mainJFrame.getjDesktopPane().add(frame);
		centerFrameInDesktop(frame);
	}
	
	
	
	private void actionPerformed_menuExit(ActionEvent actionEvent) {
		mainJFrame.setVisible(false);
		mainJFrame.dispose();
	}
	
	
}
