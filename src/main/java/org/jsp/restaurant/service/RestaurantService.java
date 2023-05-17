package org.jsp.restaurant.service;

import org.jsp.restaurant.dto.Restaurant_dto;
import org.jsp.restaurant.repository.RestaurantRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RestaurantService {

	@Autowired
	RestaurantRepository restaurantRepository;

	public Restaurant_dto save(Restaurant_dto restaurant) {
		return restaurantRepository.save(restaurant);
	}

	public Restaurant_dto findById(Long id) {
		return restaurantRepository.findById(id).orElse(null);
	}

	public void deleteById(Long id) {
		restaurantRepository.deleteById(id);
	}

	public Restaurant_dto update(Long id, Restaurant_dto restaurant) {
		Restaurant_dto existingRestaurant = restaurantRepository.findById(id).orElse(null);
		if (existingRestaurant != null) {
			BeanUtils.copyProperties(restaurant, existingRestaurant, "id");
			return restaurantRepository.save(existingRestaurant);
		}
		return null;
	}
}
