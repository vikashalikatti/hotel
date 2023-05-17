package org.jsp.restaurant.dao;

import org.jsp.restaurant.dto.Order_dto;
import org.jsp.restaurant.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class OrderDao {
	@Autowired 
	OrderRepository repository;
	
	public Order_dto save(Order_dto order) {
		return repository.save(order);
	}
	public List<Order_dto> findAll() {
		return repository.findAll();
	}
	public Order_dto findById(Long id) {
		return repository.findById(id).orElse(null);
	}
	public void deleteById(Long id) {
		 repository.deleteById(id);
	}
	public void deleteAll() {
		repository.deleteAll();
	}
}

