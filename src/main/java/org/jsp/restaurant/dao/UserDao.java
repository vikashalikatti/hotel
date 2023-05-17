package org.jsp.restaurant.dao;

import java.util.List;

import org.jsp.restaurant.dto.User_dto;
import org.jsp.restaurant.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {
	@Autowired
	UserRepository repository;

	public User_dto save(User_dto user) {
		return repository.save(user);
	}

	public List<User_dto> findAll() {
		return repository.findAll();
	}

	public User_dto findById(Long id) {
		return repository.findById(id).orElse(null);
	}

	public void deleteById(Long id) {
		repository.deleteById(id);
	}

	public void deleteAll() {
		repository.deleteAll();
	}
}
