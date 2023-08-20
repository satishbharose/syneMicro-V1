package com.ecom.app.service;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecom.app.model.Order;
import com.ecom.app.repo.OrderRepository;

@Service
public class OrderServiceImpl implements OrderService{
	
	@Autowired
	private OrderRepository orderRepository;
	
	List<Order> orderLst = List.of(
			new Order(111L, "1010", new Date(), "iPhone", 101L),
			new Order(112L, "1011", new Date(), "Samsung", 101L),
			new Order(113L, "1012", new Date(), "1Plus", 102L));

	@Override
	public List<Order> getOrdersOfUser(Long userId) {
		return orderLst.stream()
				.filter(order -> order.getOrdUsr() == userId)
				.collect(Collectors.toList());
	}

	@Override
	public Order addOrder(Order order) {
		System.out.println("order service");
		order.setOrdDte(new Date());
		Order orderFromDb = orderRepository.save(order);
		if(orderFromDb != null) {
			return orderFromDb;
		}
		return new Order();
	}

	@Override
	public Order getOrderById(Long orderId) {
		return orderRepository.findById(orderId).get();
	}

	@Override
	public List<Order> getAllOrders() {
		return orderRepository.findAll();
	}
	
	@Override
	public void deleteOrderById(Long orderId) {
		orderRepository.deleteById(orderId);
	}
	
	/*
	 * public void updateOrder(){ orderRepository.sav }
	 */
}