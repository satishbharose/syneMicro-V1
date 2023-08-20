package com.ecom.app.service;

import java.util.List;

import com.ecom.app.model.Order;

public interface OrderService {

	public List<Order> getOrdersOfUser(Long userId);
	public Order addOrder(Order order);
	public Order getOrderById(Long orderId);
	public List<Order> getAllOrders();
	public void deleteOrderById(Long orderId);
 }