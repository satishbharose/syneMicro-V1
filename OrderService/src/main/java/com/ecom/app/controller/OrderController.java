package com.ecom.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ecom.app.model.Order;
import com.ecom.app.service.OrderService;

@RestController
@RequestMapping("/order")
public class OrderController {
	
	@Autowired
	private OrderService orderService;

	@GetMapping("/user/{userId}")
	public List<Order> getOrderDetails(@PathVariable("userId") Long userId){
		return orderService.getOrdersOfUser(userId);
	}
	
	@PostMapping
	public Order addOrder(@RequestBody Order order) {
		return orderService.addOrder(order);
	}
	
	@GetMapping("/{orderId}")
	public Order getOrderById(@PathVariable Long orderId) {
		return orderService.getOrderById(orderId);
	}
	
	@GetMapping("/getAll")
	public List<Order> getAllOrders(){
		return orderService.getAllOrders();
	}
	
	@DeleteMapping("/{/orderId}")
	public void deleteOrderById(@PathVariable Long orderId) {
		orderService.deleteOrderById(orderId);
	}

}