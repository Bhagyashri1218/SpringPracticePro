package com.cdac.curdoperation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cdac.curdoperation.controller.service.UserService;
import com.cdac.curdoperation.entity.Users;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService service;

	@GetMapping
	public List<Users> getAllUser() {
		return service.getAll();
	}

	@PostMapping
	public void cresteUser(@RequestBody Users user) {
		service.saveEntry(user);
	}
	
	@PutMapping("/{username}")
	public ResponseEntity<?> updateUser(@RequestBody Users user,@PathVariable String username){
		Users userN = service.getrecordByid(username);
		if(userN != null) {
			userN.setUsername(user.getUsername());
			userN.setPassword(user.getPassword());
			service.saveEntry(userN);
		}
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
}
