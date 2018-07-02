/**
 * 
 */
package com.sessionnotes.view;

import javax.swing.JOptionPane;
import javax.swing.UIManager;

import com.sessionnotes.model.business.manager.SessionNotesManager;
import com.sessionnotes.view.mainjframe.MainJFrame;



/**
 * <h1>ViewDriver.java</h1>
 * 
 *
 * @author David Garcia
 * @version 1.0
 * @since 06-28-2018
 *
 */
public class ViewDriver {
	
	/** Creates a new instance of ViewDriver */
	public ViewDriver() 
	{
		try 
		{
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			SessionNotesManager.getInstance();	// Will attempt to load properties file on application start.

		}
		catch (Exception e) 
		{
			e.printStackTrace();

		}
		finally 
		{
			if(SessionNotesManager.getInstance().isLoadError())
			{
				JOptionPane.showMessageDialog(null, "INTERNAL ERROR: Unable to start application.", "ERROR", JOptionPane.NO_OPTION);
				System.exit(1);	//exit application
			}
			else 
			{
				@SuppressWarnings("unused")
				MainJFrame mainJFrame = new MainJFrame();	// Launch main view
			}
		}

	}
    
    
    /**
     * 
     * @param args
     */
    public static void main(String[] args) {
    	   new ViewDriver();
    	 }

}
