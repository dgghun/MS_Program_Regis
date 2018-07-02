/**
 * 
 */
package com.sessionnotes.model.service.manager;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import com.sessionnotes.model.business.exception.PropertyFileNotFoundException;

/**
 * <h1>PropertyManager</h1>
 * 
 * This class loads a properties file into memory and makes it available for
 * used by other classes.
 *
 * @author David Garcia
 * @version 1.0
 * @since 06-08-2018
 *
 */
public class PropertyManager {

	private static Properties properties;
	
	
	/**
	 * This method opens a connection to a properties file and loads
	 * it into memory.
	 * 
	 * @param propertiesFileLocation Location of the property file.
	 * @throws PropertyFileNotFoundException 
	 */
	public static void loadProperties(String propertiesFileLocation) throws PropertyFileNotFoundException{
		System.out.println("PropertyManager: Entering loadProperties() method");
		properties = new Properties();
		FileInputStream fileInputStream = null;
		
		try {
			
			fileInputStream = new FileInputStream(propertiesFileLocation);	// open connection to file.
			properties.load(fileInputStream);	// read property file
			System.out.println("Successfully loaded file! File contents:\n" + properties.toString());
			
		}catch(FileNotFoundException fileNotFoundException) {
			final String MESSAGE = "Can't find application properties file.";
			System.out.println(MESSAGE);
			throw new PropertyFileNotFoundException(MESSAGE, fileNotFoundException);
		}catch(IOException ioException) {
			final String MESSAGE = "IOException while trying to load application properties file.";
			System.out.println(MESSAGE);
			throw new PropertyFileNotFoundException(MESSAGE, ioException);
		}catch(Exception exception) {
			final String MESSAGE = "Exception while tyring to load application properties file.";
			System.out.println(MESSAGE);
			throw new PropertyFileNotFoundException(MESSAGE, exception);
		}finally {
			if(fileInputStream != null) {
				try {
					fileInputStream.close();
				}catch(Exception e) {
					e.printStackTrace(); //Log exception if can't close stream
				}
			}
		}
		
	}
	
	
	/**
	 * The key that is returned by this method is retrieved from a
	 * properties file that is the format:
	 * 
	 * 		key1 = somePropertyValue
	 * 		key2 = someOtherPropertyValue
	 * 		className = locationOfClass
	 * 		etc....
	 * 
	 * @param key A string value to look for in the loaded properties file.
	 * @return String A string key from the loaded properties files. 
	 */
	static public String getPropertyValue(String key) {
		return properties.getProperty(key);	//get property of specified key from loaded property file
	}
}
