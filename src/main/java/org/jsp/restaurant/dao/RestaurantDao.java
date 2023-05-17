package org.jsp.restaurant.dao;

import java.util.List;

import org.jsp.restaurant.dto.Restaurant_dto;
import org.jsp.restaurant.repository.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class RestaurantDao {
	@Autowired
	RestaurantRepository repository;

	public Restaurant_dto save(Restaurant_dto restaurant) {
		return repository.save(restaurant);
	}

	public List<Restaurant_dto> findAll() {
		return repository.findAll();
	}

	public Restaurant_dto findById(Long id) {
		return repository.findById(id).orElse(null);
	}

	public void deleteById(Long id) {
		repository.deleteById(id);
	}

	public void deleteAll() {
		repository.deleteAll();
	}
}
