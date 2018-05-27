/**
 * 
 */
package com.sessionnotes.model.domain;

import java.util.ArrayList;

/**
 * <h1>Client</h1>
 * The Client class represents information a
 * typical client/patient would need to provide
 * to the private practice business owner.
 * 
 * @author David_Garcia
 * @version 1.0
 * @since 5--17-2018
 *
 */
public class Client {
	private int idNumber;
	private Name name;
	private String phoneNumber;
	private Address address;
	private String email;
	private short fee;
	private ArrayList<Name> secondaryClients;
	private InsuranceCard insuranceCard;

	private final byte mMIN_ID_NUMBER = 0;
	private final short mMIN_FEE_AMOUNT = 0;

	/**
	 * Default constructor
	 */
	public Client() {}
	
	
	/**
	 * @param idNumber
	 * @param name
	 * @param phoneNumber
	 * @param address
	 * @param email
	 * @param fee
	 * @param secondaryClients
	 * @param insuranceCard
	 */
	public Client(int idNumber, Name name, String phoneNumber, Address address, String email, short fee,
			ArrayList<Name> secondaryClients, InsuranceCard insuranceCard) {
		this.idNumber = idNumber;
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.email = email;
		this.fee = fee;
		this.secondaryClients = secondaryClients;
		this.insuranceCard = insuranceCard;
	}

	/**
	 * Validates that the objects data members are not null.
	 * 
	 * @return Boolean This returns true if the object attributes are not null/empty;
	 */
	public Boolean validate() {
		if (idNumber < mMIN_ID_NUMBER)
			return false;
		if (name == null)
			return false;
		if (phoneNumber == null)
			return false;
		if (address == null)
			return false;
		if (email == null)
			return false;
		if (fee < mMIN_FEE_AMOUNT)
			return false;
		if (secondaryClients == null)
			return false;
		if (insuranceCard == null)
			return false;
		return true;
	}

	/**
	 * @return the idNumber
	 */
	public int getIdNumber() {
		return idNumber;
	}

	/**
	 * @param idNumber
	 *            the idNumber to set
	 */
	public void setIdNumber(int idNumber) {
		this.idNumber = idNumber;
	}

	/**
	 * @return the name
	 */
	public Name getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
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
	 * @param phoneNumber
	 *            the phoneNumber to set
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	/**
	 * @return the address
	 */
	public Address getAddress() {
		return address;
	}

	/**
	 * @param address
	 *            the address to set
	 */
	public void setAddress(Address address) {
		this.address = address;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email
	 *            the email to set
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
	 * @param fee
	 *            the fee to set
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
	 * @param secondaryClients
	 *            the secondaryClients to set
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
	 * @param insuranceCard
	 *            the insuranceCard to set
	 */
	public void setInsuranceCard(InsuranceCard insuranceCard) {
		this.insuranceCard = insuranceCard;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + fee;
		result = prime * result + idNumber;
		result = prime * result + ((insuranceCard == null) ? 0 : insuranceCard.hashCode());
		result = prime * result + mMIN_FEE_AMOUNT;
		result = prime * result + mMIN_ID_NUMBER;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((phoneNumber == null) ? 0 : phoneNumber.hashCode());
		result = prime * result + ((secondaryClients == null) ? 0 : secondaryClients.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Client other = (Client) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (fee != other.fee)
			return false;
		if (idNumber != other.idNumber)
			return false;
		if (insuranceCard == null) {
			if (other.insuranceCard != null)
				return false;
		} else if (!insuranceCard.equals(other.insuranceCard))
			return false;
		if (mMIN_FEE_AMOUNT != other.mMIN_FEE_AMOUNT)
			return false;
		if (mMIN_ID_NUMBER != other.mMIN_ID_NUMBER)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (phoneNumber == null) {
			if (other.phoneNumber != null)
				return false;
		} else if (!phoneNumber.equals(other.phoneNumber))
			return false;
		if (secondaryClients == null) {
			if (other.secondaryClients != null)
				return false;
		} else if (!secondaryClients.equals(other.secondaryClients))
			return false;
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Client [idNumber=" + idNumber + ", name=" + name + ", phoneNumber=" + phoneNumber + ", address="
				+ address + ", email=" + email + ", fee=" + fee + ", secondaryClients=" + secondaryClients
				+ ", insuranceCard=" + insuranceCard + "]";
	}

}
