package org.jsp.restaurant.controller;

import org.jsp.restaurant.dto.User_dto;
import org.jsp.restaurant.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class User_controller {

	@Autowired
	UserService userService;

	@PostMapping("save")
	public User_dto save(@RequestBody User_dto user) {
		return userService.save(user);
	}

	@GetMapping("/{id}")
	public User_dto findById(@PathVariable Long id) {
		return userService.findById(id);
	}

	@DeleteMapping("/{id}")
	public void deleteById(@PathVariable Long id) {
		userService.deleteById(id);
	}

	@PutMapping("/{id}")
	public User_dto update(@PathVariable Long id, @RequestBody User_dto user) {
		return userService.update(id, user);
	}
}
