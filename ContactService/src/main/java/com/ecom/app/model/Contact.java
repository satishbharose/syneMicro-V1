package com.ecom.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Contact {

	@Id
	@GeneratedValue
	private Long contId;
	private String contEmail;
	private String contName;
	private Long contUsr;
	public Contact() {
		super();
	}
	public Contact(Long contId) {
		super();
		this.contId = contId;
	}
	public Contact(Long contId, String contEmail, String contName, Long contUsr) {
		super();
		this.contId = contId;
		this.contEmail = contEmail;
		this.contName = contName;
		this.contUsr = contUsr;
	}
	public Long getContId() {
		return contId;
	}
	public void setContId(Long contId) {
		this.contId = contId;
	}
	public String getContEmail() {
		return contEmail;
	}
	public void setContEmail(String contEmail) {
		this.contEmail = contEmail;
	}
	public String getContName() {
		return contName;
	}
	public void setContName(String contName) {
		this.contName = contName;
	}
	public Long getContUsr() {
		return contUsr;
	}
	public void setContUsr(Long contUsr) {
		this.contUsr = contUsr;
	}
	@Override
	public String toString() {
		return "Contact [contId=" + contId + ", contEmail=" + contEmail + ", contName=" + contName + ", contUsr="
				+ contUsr + "]";
	}
	
	
}