package com.sessionnotes.model.domain;

import java.util.Calendar;


/**
 * <h1>InsuranceCard</h1>
 * This class contains information a client/patient
 * would need to provide so that the private practice
 * business owner could bill insurance.
 * 
 * @author David_Garcia
 * @version 1.0
 * @since 5-17-2018
 *
 */
public class InsuranceCard {
	private String insuranceType; // This will be Medicare, Medicaid, GroupHealthPlan (id#), ETC.
	private String idNumber;
	private String groupNumber;
	private Name insuredName;
	private Address insuredAddess;
	private String insuredPhoneNumber;
	private Calendar insuredBirthdate;

	/**
	 * Default constructor
	 */
	public InsuranceCard() {}
	
	
	/**
	 * @param insuranceType
	 * @param idNumber
	 * @param groupNumber
	 * @param insuredName
	 * @param insuredAddess
	 * @param insuredPhoneNumber
	 * @param insuredBirthdate
	 */
	public InsuranceCard(String insuranceType, String idNumber, String groupNumber, Name insuredName,
			Address insuredAddess, String insuredPhoneNumber, Calendar insuredBirthdate) {
		this.insuranceType = insuranceType;
		this.idNumber = idNumber;
		this.groupNumber = groupNumber;
		this.insuredName = insuredName;
		this.insuredAddess = insuredAddess;
		this.insuredPhoneNumber = insuredPhoneNumber;
		this.insuredBirthdate = insuredBirthdate;
	}

	/**
	 * Validates that the objects data members are not null.
	 * 
	 * @return Boolean This returns true if the object attributes are not null/empty;
	 */
	public Boolean validate() {
		if (insuranceType == null)
			return false;
		if (idNumber == null)
			return false;
		if (groupNumber == null)
			return false;
		if (insuredName == null)
			return false;
		if (insuredAddess == null)
			return false;
		if (insuredPhoneNumber == null)
			return false;
		if (insuredBirthdate == null)
			return false;
		return true;
	}

	/**
	 * @return the insuranceType
	 */
	public String getInsuranceType() {
		return insuranceType;
	}

	/**
	 * @param insuranceType
	 *            the insuranceType to set
	 */
	public void setInsuranceType(String insuranceType) {
		this.insuranceType = insuranceType;
	}

	/**
	 * @return the idNumber
	 */
	public String getIdNumber() {
		return idNumber;
	}

	/**
	 * @param idNumber
	 *            the idNumber to set
	 */
	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}

	/**
	 * @return the groupNumber
	 */
	public String getGroupNumber() {
		return groupNumber;
	}

	/**
	 * @param groupNumber
	 *            the groupNumber to set
	 */
	public void setGroupNumber(String groupNumber) {
		this.groupNumber = groupNumber;
	}

	/**
	 * @return the insuredName
	 */
	public Name getInsuredName() {
		return insuredName;
	}

	/**
	 * @param insuredName
	 *            the insuredName to set
	 */
	public void setInsuredName(Name insuredName) {
		this.insuredName = insuredName;
	}

	/**
	 * @return the insuredAddess
	 */
	public Address getInsuredAddess() {
		return insuredAddess;
	}

	/**
	 * @param insuredAddess
	 *            the insuredAddess to set
	 */
	public void setInsuredAddess(Address insuredAddess) {
		this.insuredAddess = insuredAddess;
	}

	/**
	 * @return the insuredPhoneNumber
	 */
	public String getInsuredPhoneNumber() {
		return insuredPhoneNumber;
	}

	/**
	 * @param insuredPhoneNumber
	 *            the insuredPhoneNumber to set
	 */
	public void setInsuredPhoneNumber(String insuredPhoneNumber) {
		this.insuredPhoneNumber = insuredPhoneNumber;
	}

	/**
	 * @return the insuredBirthdate
	 */
	public Calendar getInsuredBirthdate() {
		return insuredBirthdate;
	}

	/**
	 * @param insuredBirthdate
	 *            the insuredBirthdate to set
	 */
	public void setInsuredBirthdate(Calendar insuredBirthdate) {
		this.insuredBirthdate = insuredBirthdate;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((groupNumber == null) ? 0 : groupNumber.hashCode());
		result = prime * result + ((idNumber == null) ? 0 : idNumber.hashCode());
		result = prime * result + ((insuranceType == null) ? 0 : insuranceType.hashCode());
		result = prime * result + ((insuredAddess == null) ? 0 : insuredAddess.hashCode());
		result = prime * result + ((insuredBirthdate == null) ? 0 : insuredBirthdate.hashCode());
		result = prime * result + ((insuredName == null) ? 0 : insuredName.hashCode());
		result = prime * result + ((insuredPhoneNumber == null) ? 0 : insuredPhoneNumber.hashCode());
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
		InsuranceCard other = (InsuranceCard) obj;
		if (groupNumber == null) {
			if (other.groupNumber != null)
				return false;
		} else if (!groupNumber.equals(other.groupNumber))
			return false;
		if (idNumber == null) {
			if (other.idNumber != null)
				return false;
		} else if (!idNumber.equals(other.idNumber))
			return false;
		if (insuranceType == null) {
			if (other.insuranceType != null)
				return false;
		} else if (!insuranceType.equals(other.insuranceType))
			return false;
		if (insuredAddess == null) {
			if (other.insuredAddess != null)
				return false;
		} else if (!insuredAddess.equals(other.insuredAddess))
			return false;
		if (insuredBirthdate == null) {
			if (other.insuredBirthdate != null)
				return false;
		} else if (!insuredBirthdate.equals(other.insuredBirthdate))
			return false;
		if (insuredName == null) {
			if (other.insuredName != null)
				return false;
		} else if (!insuredName.equals(other.insuredName))
			return false;
		if (insuredPhoneNumber == null) {
			if (other.insuredPhoneNumber != null)
				return false;
		} else if (!insuredPhoneNumber.equals(other.insuredPhoneNumber))
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
		return "InsuranceCard [insuranceType=" + insuranceType + ", idNumber=" + idNumber + ", groupNumber="
				+ groupNumber + ", insuredName=" + insuredName + ", insuredAddess=" + insuredAddess
				+ ", insuredPhoneNumber=" + insuredPhoneNumber + ", insuredBirthdate=" + insuredBirthdate + "]";
	}

}
