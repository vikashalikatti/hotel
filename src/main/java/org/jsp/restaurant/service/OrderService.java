package org.jsp.restaurant.service;


import org.jsp.restaurant.dto.Order_dto;
import org.jsp.restaurant.repository.OrderRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

	@Autowired
	OrderRepository orderRepository;

	public Order_dto save(Order_dto order) {
		return orderRepository.save(order);
	}

	public Order_dto findById(Long id) {
		return orderRepository.findById(id).orElse(null);
	}

	public void deleteById(Long id) {
		orderRepository.deleteById(id);
	}

	public Order_dto update(Long id, Order_dto order) {
		Order_dto existingOrder = orderRepository.findById(id).orElse(null);
		if (existingOrder != null) {
			BeanUtils.copyProperties(order, existingOrder, "id");
			return orderRepository.save(existingOrder);
		}
		return null;
	}
}
