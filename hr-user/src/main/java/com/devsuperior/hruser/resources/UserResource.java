package com.devsuperior.hruser.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.hruser.entities.User;
import com.devsuperior.hruser.services.UserService;

@RequestMapping("/users")
@RestController
public class UserResource {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/{id}")
	public ResponseEntity<User> findById(@PathVariable Long id){
		User response = userService.findById(id);
		return ResponseEntity.ok(response );
	}
	
	@GetMapping("/search")
	public ResponseEntity<User> findByEmail(@RequestParam String email){
		User response = userService.findByEmail(email);
		return ResponseEntity.ok(response );
	}
}
