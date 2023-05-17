package org.jsp.restaurant.repository;

import org.jsp.restaurant.dto.User_dto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User_dto, Long> {

}
