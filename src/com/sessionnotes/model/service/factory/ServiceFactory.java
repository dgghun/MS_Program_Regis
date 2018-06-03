/**
 * 
 */
package com.sessionnotes.model.service.factory;

import com.sessionnotes.model.business.exception.ServiceLoadException;
import com.sessionnotes.model.service.IService;

/**
 * <h1>Factory</h1>
 * This version of the factory is responsible instantiating and returning services
 * that this application requires.
 * 
 * A string value of the service wanted is taken in and an 
 * IService interface is returned. The calling class only gets a
 * handle on the interface without knowing the logic behind the 
 * services implementation. 
 * 
 * This factory follows the singleton pattern of only allowing a single instance
 * of this class.
 * 
 * @author David_Garcia
 * @version 2.0
 * @since 6-2-2018
 */
public class ServiceFactory {

	// Singleton pattern for only one serviceFactory
	private ServiceFactory() {}
	private static ServiceFactory serviceFactory = new ServiceFactory();
	public static ServiceFactory getInstance() { return serviceFactory;}
	
	/**
	 * This is the method gets the service from the received string, 
	 * looks for the class name in the properties file and returns
	 * an instantiated service. Throws a custom exception if there are
	 * any issues loading the service.
	 * 
	 * @param serviceName This is a string of the requested service class name.
	 * @return IService Returns an instantiated service.
	 * @throws ServiceLoadException If there is any issues loading the service.
	 */
	public IService getService(String serviceName) throws ServiceLoadException{
		
		try {		
			Class<?> c = Class.forName(getImplName(serviceName));	//get class name from properties file.
			return (IService) c.newInstance();	// return instance of IService class requested.
			
		}catch(Exception exception) {
			throw new ServiceLoadException(serviceName + " could not load.", exception);
		}
		
	}
	
	/**
	 * 
	 * @param serviceName This is a string of the requested service class name.
	 * @return serviceImpl The implementation of the requested service.
	 * @throws Exception Any issues with loading the properties file.
	 */
	private String getImplName(String serviceName) throws Exception{
		
		java.util.Properties properties = new java.util.Properties();
		final String fileName = System.getProperty("application.properties");
//		java.io.FileInputStream fileInputStream = new java.io.FileInputStream(System.getProperty("application.properties"));
		java.io.FileInputStream fileInputStream = new java.io.FileInputStream(fileName);

		properties.load(fileInputStream);
		fileInputStream.close();
		return properties.getProperty(serviceName);
	}
	
	
	
//	/**
//	 * Validates that the ServiceFactory was able to return service objects
//	 * @return Returns false if any service object is null, else returns true;
//	 */
//	public boolean validate() {
//		if(this.getClientSvc() == null) 
//			return false;
//		if(this.getSessionSvc() == null)
//			return false;
//		return true;
//	}
//	
//	/**
//	 * 
//	 * @return ClientSvcImpl()	Returns a new Client service implementation. 
//	 */
//	public IClientSvc getClientSvc() {
//		return new ClientSvcImpl();
//	}
//	
//	/**
//	 * 
//	 * @return Returns a new Session service implementation.
//	 */
//	public ISessionSvc getSessionSvc() {
//		return new SessionSvcImpl();
//	}
	
	

}
