package com.ecom.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.ecom.app.model.Contact;
import com.ecom.app.model.Order;
import com.ecom.app.model.User;
import com.ecom.app.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;
	
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/{userId}")	
	public User getUserById(@PathVariable("userId") Long userId) {
		User user = userService.getUserById(userId);
		//List<Contact> contacts = this.restTemplate.getForObject("http://localhost:9002/contact/user/" + userId, List.class);
		List<Contact> contLst = restTemplate.getForObject("http://contact-service/contact/user/" + userId, List.class);
		List<Order> ordLst =  restTemplate.getForObject("http://order-service/order/user/" + userId, List.class);
		user.setUsrContLst(contLst);
		user.setUsrOrdLst(ordLst);
		return user;
	}
	
	@GetMapping("getAll")
	public List<User> getAllUsers(){
		return userService.getAllUsers();
	}
	
	@DeleteMapping
	public void deleteUserById(@PathVariable Long userId){
		userService.deleteUserById(userId);
	}
}
