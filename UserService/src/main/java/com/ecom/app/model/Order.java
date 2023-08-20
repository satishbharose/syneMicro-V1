package com.ecom.app.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Order {

	@Id
	@GeneratedValue
	private Long orderId;
	private String number;
	private Date date;
	private String itemName;
	public Order() {
		super();
	}
	public Order(Long id) {
		super();
		this.orderId = id;
	}
	public Order(Long orderId, String number, Date date, String itemName) {
		super();
		this.orderId = orderId;
		this.number = number;
		this.date = date;
		this.itemName = itemName;
	}
	public Long getOrderId() {
		return orderId;
	}
	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", number=" + number + ", date=" + date + ", itemName=" + itemName + "]";
	}
	
}