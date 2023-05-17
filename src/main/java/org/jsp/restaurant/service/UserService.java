package org.jsp.restaurant.service;

import org.jsp.restaurant.dto.User_dto;
import org.jsp.restaurant.repository.UserRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	@Autowired
	UserRepository userRepository;

	public User_dto save(User_dto user) {
		return userRepository.save(user);
	}

	public User_dto findById(Long id) {
		return userRepository.findById(id).orElse(null);
	}

	public void deleteById(Long id) {
		userRepository.deleteById(id);
	}

	public User_dto update(Long id, User_dto user) {
		User_dto existingUser = userRepository.findById(id).orElse(null);
		if (existingUser != null) {
			BeanUtils.copyProperties(user, existingUser, "id");
			return userRepository.save(existingUser);
		}
		return null;
	}
}
