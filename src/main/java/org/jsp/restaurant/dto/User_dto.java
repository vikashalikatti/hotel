package org.jsp.restaurant.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class User_dto {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long id;

	String name;
	String email;

	
}
