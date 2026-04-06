package com.cab.cbs.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
@Entity
public class UserRegistration {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;

	@NotNull(message = "Username should not be null")
	String username;

	@NotNull(message = "Password should not be null")
	String password;

	@NotNull(message = "Name should not be null")
	String name;

	@NotNull(message = "Email should not be null")
	@Email(message = "Enter valid email")
	String email;

	String role;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	
	
	
	

}
