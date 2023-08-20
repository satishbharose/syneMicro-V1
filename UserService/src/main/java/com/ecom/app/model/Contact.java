package com.ecom.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Contact {

	@Id
	@GeneratedValue
	private long cId;
	private String email;
	private String contactName;
	private long user;
	public Contact() {
		super();
	}
	public Contact(long cId) {
		super();
		this.cId = cId;
	}
	public Contact(long cId, String email, String contactName, long user) {
		super();
		this.cId = cId;
		this.email = email;
		this.contactName = contactName;
		this.user = user;
	}
	public long getcId() {
		return cId;
	}
	public void setcId(long cId) {
		this.cId = cId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContactName() {
		return contactName;
	}
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}
	public long getUser() {
		return user;
	}
	public void setUser(long user) {
		this.user = user;
	}
	@Override
	public String toString() {
		return "Contact [cId=" + cId + ", email=" + email + ", contactName=" + contactName + ", user=" + user + "]";
	}
	
}
