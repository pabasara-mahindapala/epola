/**
 * 
 */
package org.fyp.marketplace.model;

import java.util.Date;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

/**
 * @author
 *
 */
@Document(collection = "account")
public class Account {
	@Id
	@Field(value = "_id")
	private ObjectId _id;

	private Date insertDate;
	private Date lastUpdateDate;
	private Boolean isActive;
	private String name;
	private String userType;
	private String address;
	private String company;
	private String password;
	private String emailId;
	private String mobileNumber;

	/**
	 * @param _id
	 * @param insertDate
	 * @param isActive
	 * @param name
	 * @param emailId
	 * @param user_type
	 * @param address
	 * @param company
	 * @param password
	 * @param emailId;
	 * @param mobileNumber
	 */

	public Account(ObjectId _id, Date insertDate, Boolean isActive, String name, String userType, String address,
			String company, String password, String emailId, String mobileNumber) {
		super();
		this._id = _id;
		this.insertDate = insertDate;
		this.isActive = isActive;
		this.name = name;
		this.userType = userType;
		this.address = address;
		this.company = company;
		this.password = password;
		this.emailId = emailId;
		this.mobileNumber = mobileNumber;
	}

	public ObjectId get_id() {
		return _id;
	}

	public void set_id(ObjectId _id) {
		this._id = _id;
	}

	public Date getInsertDate() {
		return insertDate;
	}

	public void setInsertDate(Date insertDate) {
		this.insertDate = insertDate;
	}

	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getLastUpdateDate() {
		return lastUpdateDate;
	}

	public void setLastUpdateDate(Date lastUpdateDate) {
		this.lastUpdateDate = lastUpdateDate;
	}
}
