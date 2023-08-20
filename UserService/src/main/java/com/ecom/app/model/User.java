package com.ecom.app.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;

@Entity
public class User {

	@Id
	@GeneratedValue
	private Long usrId;
	private String usrNme;
	private String usrPhNum;
	
	@OneToMany(cascade = CascadeType.ALL)  
	@JoinColumn(name="usrId")  
	@OrderColumn(name="type")  
	private List<Contact> usrContLst;
	
	@OneToMany(cascade = CascadeType.ALL)  
	@JoinColumn(name="usrId")  
	@OrderColumn(name="type")  
	private List<Order> usrOrdLst;
	public User() {
		super();
	}
	public User(Long usrId) {
		super();
		this.usrId = usrId;
	}
	public User(Long usrId, String usrNme, String usrPhNum) {
		super();
		this.usrId = usrId;
		this.usrNme = usrNme;
		this.usrPhNum = usrPhNum;
	}
	public User(Long usrId, String usrNme, String usrPhNum, List<Contact> usrContLst, List<Order> usrOrdLst) {
		super();
		this.usrId = usrId;
		this.usrNme = usrNme;
		this.usrPhNum = usrPhNum;
		this.usrContLst = usrContLst;
		this.usrOrdLst = usrOrdLst;
	}
	public Long getUsrId() {
		return usrId;
	}
	public void setUsrId(Long usrId) {
		this.usrId = usrId;
	}
	public String getUsrNme() {
		return usrNme;
	}
	public void setUsrNme(String usrNme) {
		this.usrNme = usrNme;
	}
	public String getUsrPhNum() {
		return usrPhNum;
	}
	public void setUsrPhNum(String usrPhNum) {
		this.usrPhNum = usrPhNum;
	}
	public List<Contact> getUsrContLst() {
		return usrContLst;
	}
	public void setUsrContLst(List<Contact> usrContLst) {
		this.usrContLst = usrContLst;
	}
	public List<Order> getUsrOrdLst() {
		return usrOrdLst;
	}
	public void setUsrOrdLst(List<Order> usrOrdLst) {
		this.usrOrdLst = usrOrdLst;
	}
	@Override
	public String toString() {
		return "User [usrId=" + usrId + ", usrNme=" + usrNme + ", usrPhNum=" + usrPhNum + ", usrContLst=" + usrContLst
				+ ", usrOrdLst=" + usrOrdLst + "]";
	}
}