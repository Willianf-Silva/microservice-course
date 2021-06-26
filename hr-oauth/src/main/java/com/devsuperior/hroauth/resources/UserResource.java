package com.devsuperior.hroauth.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.hroauth.entities.User;
import com.devsuperior.hroauth.services.UserService;

@RequestMapping("/users")
@RestController
public class UserResource {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/search")
	public ResponseEntity<User> findByEmail(@RequestParam String email){
		User response = userService.findByEmail(email);
		return ResponseEntity.ok(response);
	}
}
