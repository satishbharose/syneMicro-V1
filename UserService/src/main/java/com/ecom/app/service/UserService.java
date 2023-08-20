package com.ecom.app.service;

import java.util.List;

import com.ecom.app.model.User;

public interface UserService {

	public User getUserById(Long id);
	public List<User> getAllUsers();
	public void deleteUserById(Long id);
}
