package com.awwal.api.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class User {
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return user_name;
	}

	public void setName(String user_name) {
		this.user_name = user_name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return user_password;
	}

	public void setPassword(String user_password) {
		this.user_password = user_password;
	}

	public String getAbout() {
		return about;
	}

	public void setAbout(String about) {
		this.about = about;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int a_id;
	
	@Column(nullable =false, length = 100)
	private int id;
	
	@Column(nullable = false, length = 255)
	private String user_name;
	
	@Column(nullable = false, length = 255)
	private String email;
	
	@Column(nullable = false, length = 255)
	private String user_password;
	
	private String about;
}
