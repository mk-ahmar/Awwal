package com.awwal.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.awwal.api.payloads.Person;

public interface PersonRepo extends JpaRepository<Person, Integer>{

}
