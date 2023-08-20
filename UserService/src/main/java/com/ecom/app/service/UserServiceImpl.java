package com.ecom.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecom.app.model.User;
import com.ecom.app.repo.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepository;

	List<User> userLst = List.of(
			new User(101L, "Satish Bharose", "7588155165"),
			new User(102L, "Mahesh Joshi", "1234567890"), 
			new User(103L, "Rajesh Pandhare", "1122334455"));

	@Override
	public User getUserById(Long userId) {
		/*return userLst.stream()
				.filter(user -> user.getUsrId().equals(id))
				.findAny()
				.orElse(null);*/
		return userRepository.findById(userId).get();
	}

	@Override
	public List<User> getAllUsers() {
		return userRepository.findAll();
	}

	@Override
	public void deleteUserById(Long id) {
		userRepository.deleteById(id);
	}

}
