package org.jsp.restaurant.repository;

import org.jsp.restaurant.dto.Order_dto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order_dto, Long> {

}
