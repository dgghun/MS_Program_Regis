package com.sessionnotes.model.domain;

import java.io.Serializable;

/**
 * <h1>Address</h1>
 * The Address class holds basic street address information.
 * 
 * @author David_Garcia
 * @version 1.0
 * @since 5-17-2018
 */
public class Address implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String streetAddress1;
	private String streetAddress2;
	private String zipCode;
	private String city;
	private String state;

	
	/**
	 * Default constructor
	 */
	public Address() {}
	
	
	/**
	 * @param streetAddress
	 * @param zipCode
	 * @param city
	 * @param state
	 */
	public Address(String streetAddress, String zipCode, String city, String state) {
		this.streetAddress1 = streetAddress;
		this.zipCode = zipCode;
		this.city = city;
		this.state = state;
		this.streetAddress2 = "";
	}
	
	

	/**
	 * @param streetAddress1
	 * @param streetAddress2
	 * @param zipCode
	 * @param city
	 * @param state
	 */
	public Address(String streetAddress1, String streetAddress2, String zipCode, String city, String state) {
		super();
		this.streetAddress1 = streetAddress1;
		this.streetAddress2 = streetAddress2;
		this.zipCode = zipCode;
		this.city = city;
		this.state = state;
	}


	/**
	 * Validates that the objects data members are not null.
	 * 
	 * @return Boolean This returns true if the object attributes are not null/empty;
	 */
	public Boolean validate() {
		if (streetAddress1 == null)
			return false;
		if (zipCode == null)
			return false;
		if (city == null)
			return false;
		if (state == null)
			return false;
		return true;
	}

	/**
	 * @return the streetAddress
	 */
	public String getStreetAddress1() {
		return streetAddress1;
	}

	/**
	 * @param streetAddress
	 *            the streetAddress to set
	 */
	public void setStreetAddress1(String streetAddress) {
		this.streetAddress1 = streetAddress;
	}

	/**
	 * @return the streetAddress2
	 */
	public String getStreetAddress2() {
		return streetAddress2;
	}


	/**
	 * @param streetAddress2 the streetAddress2 to set
	 */
	public void setStreetAddress2(String streetAddress2) {
		this.streetAddress2 = streetAddress2;
	}


	/**
	 * @return the zipCode
	 */
	public String getZipCode() {
		return zipCode;
	}

	/**
	 * @param zipCode
	 *            the zipCode to set
	 */
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city
	 *            the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * @param state
	 *            the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((state == null) ? 0 : state.hashCode());
		result = prime * result + ((streetAddress1 == null) ? 0 : streetAddress1.hashCode());
		result = prime * result + ((streetAddress2 == null) ? 0 : streetAddress2.hashCode());
		result = prime * result + ((zipCode == null) ? 0 : zipCode.hashCode());
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
		Address other = (Address) obj;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (state == null) {
			if (other.state != null)
				return false;
		} else if (!state.equals(other.state))
			return false;
		if (streetAddress1 == null) {
			if (other.streetAddress1 != null)
				return false;
		} else if (!streetAddress1.equals(other.streetAddress1))
			return false;
		if (streetAddress2 == null) {
			if (other.streetAddress2 != null)
				return false;
		} else if (!streetAddress2.equals(other.streetAddress2))
			return false;
		if (zipCode == null) {
			if (other.zipCode != null)
				return false;
		} else if (!zipCode.equals(other.zipCode))
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Address [streetAddress1=" + streetAddress1 + ", streetAddress2=" + streetAddress2 + ", zipCode="
				+ zipCode + ", city=" + city + ", state=" + state + "]";
	}

}
