package com.pk.rest.ws.controllers;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.pk.rest.ws.beans.User;
import com.pk.rest.ws.services.UserService;

@RestController
public class UsersController {

	@Autowired
	private UserService service;

	@GetMapping(path = "/getAllUsers")
	public List<User> getAll() {
		return service.getAllUsers();
	}

	@GetMapping(path = "/getUser/{id}")
	public User getUser(@PathVariable int id) {
		return service.getUser(id);
	}

	@PostMapping("/users")
	public ResponseEntity addUser(@RequestBody User user) {
		User newUser = service.setUser(user);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("{id}").buildAndExpand(newUser.getId())
				.toUri();
		return ResponseEntity.created(location).build();

	}

}
