package com.awwal.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.awwal.api.entities.User;

public interface UserRepo extends JpaRepository<User, Integer> {
	java.util.Optional<User> findByEmail(String email);
}
