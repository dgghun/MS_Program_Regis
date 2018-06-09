/**
 * 
 */
package com.sessionnotes.model.business.manager;

import com.sessionnotes.model.business.exception.PropertyFileNotFoundException;
import com.sessionnotes.model.service.manager.PropertyManager;

/**
 * <h1>ManagerSuperType</h1>
 *
 * This is class is a business layer abstract manager that 
 * contains a static block that loads the properties file
 * and a generic method that will execute commands from the
 * presentation layer.
 *
 * @author David Garcia
 * @version 1.0
 * @since 06-08-2018
 *
 */
public abstract class ManagerSuperType {
	
	/**
	 * This static block is ran once when this class
	 * is instantiated. If loading of the properties 
	 * file is unsuccessful the application will close. 
	 */
	static {
		try {
			ManagerSuperType.loadProperties();
			
		}catch(PropertyFileNotFoundException exception) {
			System.out.println("Failed to load critical application properties. Exiting application...");
			System.exit(1);
		}
	}
	
	
	/**
	 * This is a generic abstract method that will be overridden
	 * by other business manager classes.
	 * 
	 * @param command Generic string to indicate what action to perform.
	 * @param object Generic object that should be overridden to fit 
	 * the inherited classes needs.
	 * @return Boolean if successful in action (command string).
	 */
	public abstract boolean performAction(String command, Object object);
	
	
	/**
	 * This method attempts to load the application properties file
	 * through the PropertyManager class.
	 * 
	 * @throws PropertyFileNotFoundException
	 */
	public static void loadProperties() throws PropertyFileNotFoundException{
		String propertyFileLocation = System.getProperty("application.properties");	// get properties path.
		
		if(propertyFileLocation != null) {
			PropertyManager.loadProperties(propertyFileLocation);
		}
		else {
			final String MESSAGE = "Property file path not found. (filePath = null)";
			System.out.println(MESSAGE);
			throw new PropertyFileNotFoundException(MESSAGE);
		}
	}

}
