package com.ecom.app.model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Order {

	@Id
	@GeneratedValue
	private Long ordId;
	private String ordNum;
	private Date ordDte;
	private String ordItmNme;
	private Long ordUsr;
	public Order() {
		super();
	}
	public Order(Long ordId) {
		super();
		this.ordId = ordId;
	}
	public Order(Long ordId, String ordNum, Date ordDte, String ordItmNme, Long ordUsr) {
		super();
		this.ordId = ordId;
		this.ordNum = ordNum;
		this.ordDte = ordDte;
		this.ordItmNme = ordItmNme;
		this.ordUsr = ordUsr;
	}
	public Long getOrdId() {
		return ordId;
	}
	public void setOrdId(Long ordId) {
		this.ordId = ordId;
	}
	public String getOrdNum() {
		return ordNum;
	}
	public void setOrdNum(String ordNum) {
		this.ordNum = ordNum;
	}
	public Date getOrdDte() {
		return ordDte;
	}
	public void setOrdDte(Date ordDte) {
		this.ordDte = ordDte;
	}
	public String getOrdItmNme() {
		return ordItmNme;
	}
	public void setOrdItmNme(String ordItmNme) {
		this.ordItmNme = ordItmNme;
	}
	public Long getOrdUsr() {
		return ordUsr;
	}
	public void setOrdUsr(Long ordUsr) {
		this.ordUsr = ordUsr;
	}
	@Override
	public String toString() {
		return "Order [ordId=" + ordId + ", ordNum=" + ordNum + ", ordDte=" + ordDte + ", ordItmNme=" + ordItmNme
				+ ", ordUsr=" + ordUsr + "]";
	}
	
	
}