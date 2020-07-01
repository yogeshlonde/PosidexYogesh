package com.hba.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "singer")
public class Singer implements Serializable{

	@Id 
	@Column(name = "singer_id")
	protected int singerId;

	@Column(name = "singer_nm")
	protected String singerName;

	protected Date dob;
	protected String gender;

	@Column(name = "mobile_nbr")
	protected String mobileNo;

	@Column(name = "email_addrs")
	protected String emailAddress;

	@Column(name = "gener_type")
	protected String generType;

	protected String language;

	public int getSingerId() {
		return singerId;
	}
	public void setSingerId(int singerId) {
		this.singerId = singerId;
	}
	public String getSingerName() {
		return singerName;
	}
	public void setSingerName(String singerName) {
		this.singerName = singerName;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public String getGenerType() {
		return generType;
	}
	public void setGenerType(String generType) {
		this.generType = generType;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}


	public Singer() {}

	public Singer(int singerId, String singerName, Date dob, String gender, String mobileNo, String emailAddress,
			String generType, String language) {
		this.singerId = singerId;
		this.singerName = singerName;
		this.dob = dob;
		this.gender = gender;
		this.mobileNo = mobileNo;
		this.emailAddress = emailAddress;
		this.generType = generType;
		this.language = language;
	}

	@Override
	public String toString() {
		return "Singer [singerId=" + singerId + ", singerName=" + singerName + ", dob=" + dob + ", gender=" + gender
				+ ", mobileNo=" + mobileNo + ", emailAddress=" + emailAddress + ", generType=" + generType
				+ ", language=" + language + "]";
	}
}
