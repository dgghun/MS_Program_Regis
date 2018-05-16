/**
 * 
 */
package com.sessionnotes.model.domain;

import java.util.ArrayList;


/**
 *	Will require
 * a.	Full name (required)
 * b.	Phone number (required)
 * c.	Street address 
 * d.	Email address
 * e.	Hourly fee amount
 * f.	Any secondary patients names (family therapy, couple therapy)
 * g.	Insurance information
 * h.	Attach any forms or documents (not a priority as of yet)
 * @author David_Garcia
 *
 */
public class Client {
	
	private Name name;
	private String phoneNumber;
	private StreetAddress streetAddress;
	private String email;
	private short fee;
	private ArrayList<Name> secondaryClients;
	private InsuranceCard insuranceCard;
	
	
	
	
	/**
	 * 
	 * @param name
	 * @param phoneNumber
	 * @param streetAddress
	 * @param email
	 * @param fee
	 * @param secondaryClients
	 * @param insuranceCard
	 * 
	 * Full information constructor
	 */
	public Client(Name name, String phoneNumber, StreetAddress streetAddress, String email, short fee,
			ArrayList<Name> secondaryClients, InsuranceCard insuranceCard) {
		super();
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.streetAddress = streetAddress;
		this.email = email;
		this.fee = fee;
		this.secondaryClients = secondaryClients;
		this.insuranceCard = insuranceCard;
	}




	/**
	 * @return the name
	 */
	public Name getName() {
		return name;
	}




	/**
	 * @param name the name to set
	 */
	public void setName(Name name) {
		this.name = name;
	}




	/**
	 * @return the phoneNumber
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}




	/**
	 * @param phoneNumber the phoneNumber to set
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}




	/**
	 * @return the streetAddress
	 */
	public StreetAddress getStreetAddress() {
		return streetAddress;
	}




	/**
	 * @param streetAddress the streetAddress to set
	 */
	public void setStreetAddress(StreetAddress streetAddress) {
		this.streetAddress = streetAddress;
	}




	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}




	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}




	/**
	 * @return the fee
	 */
	public short getFee() {
		return fee;
	}




	/**
	 * @param fee the fee to set
	 */
	public void setFee(short fee) {
		this.fee = fee;
	}




	/**
	 * @return the secondaryClients
	 */
	public ArrayList<Name> getSecondaryClients() {
		return secondaryClients;
	}




	/**
	 * @param secondaryClients the secondaryClients to set
	 */
	public void setSecondaryClients(ArrayList<Name> secondaryClients) {
		this.secondaryClients = secondaryClients;
	}




	/**
	 * @return the insuranceCard
	 */
	public InsuranceCard getInsuranceCard() {
		return insuranceCard;
	}




	/**
	 * @param insuranceCard the insuranceCard to set
	 */
	public void setInsuranceCard(InsuranceCard insuranceCard) {
		this.insuranceCard = insuranceCard;
	}
	
	

}
