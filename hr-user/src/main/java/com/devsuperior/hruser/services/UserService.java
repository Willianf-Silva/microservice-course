package com.devsuperior.hruser.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.hruser.entities.User;
import com.devsuperior.hruser.repositories.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;

	public User findById(Long id) {
		return userRepository.findById(id).get();
	}

	public User findByEmail(String email) {
		return userRepository.findByEmail(email);
	}
}