/**
 * 
 */
package com.sessionnotes.model.domain;

import java.sql.Time;
import java.util.Calendar;

/**
* <h1>Session</h1>
* This class represents the information that is required
* by a private practice business when a therapy
* session is conducted.  
* 
* @author David_Garcia
* @version 1.0
* @since 5-17-2018
*
*/
public class Session {
	private Client client;
	private Calendar date;
	private Time time;
	private short feeAmount;
	private short feePaid;
	private String paymentType;
	private String note;

	private final short mMIN_FEE_AMOUNT = 0;

	/**
	 * @param client
	 * @param date
	 * @param time
	 * @param feeAmount
	 * @param feePaid
	 * @param paymentType
	 * @param note
	 */
	public Session(Client client, Calendar date, Time time, short feeAmount, short feePaid, String paymentType,
			String note) {
		this.client = client;
		this.date = date;
		this.time = time;
		this.feeAmount = feeAmount;
		this.feePaid = feePaid;
		this.paymentType = paymentType;
		this.note = note;
	}

	/**
	 * 
	 * @return Boolean This returns true if the object attributes are not empty/null.
	 */
	public Boolean validate() {
		if (client == null)
			return false;
		if (date == null)
			return false;
		if (time == null)
			return false;
		if (feeAmount < mMIN_FEE_AMOUNT)
			return false;
		if (feePaid < mMIN_FEE_AMOUNT)
			return false;
		if (paymentType == null)
			return false;
		if (note == null)
			return false;
		return true;
	}

	/**
	 * @return the client
	 */
	public Client getClient() {
		return client;
	}

	/**
	 * @param client
	 *            the client to set
	 */
	public void setClient(Client client) {
		this.client = client;
	}

	/**
	 * @return the date
	 */
	public Calendar getDate() {
		return date;
	}

	/**
	 * @param date
	 *            the date to set
	 */
	public void setDate(Calendar date) {
		this.date = date;
	}

	/**
	 * @return the time
	 */
	public Time getTime() {
		return time;
	}

	/**
	 * @param time
	 *            the time to set
	 */
	public void setTime(Time time) {
		this.time = time;
	}

	/**
	 * @return the feeAmount
	 */
	public short getFeeAmount() {
		return feeAmount;
	}

	/**
	 * @param feeAmount
	 *            the feeAmount to set
	 */
	public void setFeeAmount(short feeAmount) {
		this.feeAmount = feeAmount;
	}

	/**
	 * @return the feePaid
	 */
	public short getFeePaid() {
		return feePaid;
	}

	/**
	 * @param feePaid
	 *            the feePaid to set
	 */
	public void setFeePaid(short feePaid) {
		this.feePaid = feePaid;
	}

	/**
	 * @return the paymentType
	 */
	public String getPaymentType() {
		return paymentType;
	}

	/**
	 * @param paymentType
	 *            the paymentType to set
	 */
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	/**
	 * @return the note
	 */
	public String getNote() {
		return note;
	}

	/**
	 * @param note
	 *            the note to set
	 */
	public void setNote(String note) {
		this.note = note;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((client == null) ? 0 : client.hashCode());
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + feeAmount;
		result = prime * result + feePaid;
		result = prime * result + mMIN_FEE_AMOUNT;
		result = prime * result + ((note == null) ? 0 : note.hashCode());
		result = prime * result + ((paymentType == null) ? 0 : paymentType.hashCode());
		result = prime * result + ((time == null) ? 0 : time.hashCode());
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
		Session other = (Session) obj;
		if (client == null) {
			if (other.client != null)
				return false;
		} else if (!client.equals(other.client))
			return false;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (feeAmount != other.feeAmount)
			return false;
		if (feePaid != other.feePaid)
			return false;
		if (mMIN_FEE_AMOUNT != other.mMIN_FEE_AMOUNT)
			return false;
		if (note == null) {
			if (other.note != null)
				return false;
		} else if (!note.equals(other.note))
			return false;
		if (paymentType == null) {
			if (other.paymentType != null)
				return false;
		} else if (!paymentType.equals(other.paymentType))
			return false;
		if (time == null) {
			if (other.time != null)
				return false;
		} else if (!time.equals(other.time))
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Session [client=" + client + ", date=" + date + ", time=" + time + ", feeAmount=" + feeAmount
				+ ", feePaid=" + feePaid + ", paymentType=" + paymentType + ", note=" + note + ", mMIN_FEE_AMOUNT="
				+ mMIN_FEE_AMOUNT + "]";
	}

	
}
