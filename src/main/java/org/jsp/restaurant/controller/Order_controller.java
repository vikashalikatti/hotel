package org.jsp.restaurant.controller;

import org.jsp.restaurant.dto.Order_dto;
import org.jsp.restaurant.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.persistence.criteria.Order;

@RestController
@RequestMapping("/orders")
public class Order_controller {

	@Autowired
	OrderService orderService;

	@PostMapping
	public Order_dto save(@RequestBody Order_dto order) {
		return orderService.save(order);
	}

	@GetMapping("/{id}")
	public Order_dto findById(@PathVariable Long id) {
		return orderService.findById(id);
	}

	@DeleteMapping("/{id}")
	public void deleteById(@PathVariable Long id) {
		orderService.deleteById(id);
	}

	@PutMapping("/{id}")
	public Order_dto update(@PathVariable Long id, @RequestBody Order_dto order) {
		return orderService.update(id, order);
	}
}
