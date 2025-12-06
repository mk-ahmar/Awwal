package com.awwal.api.services;

import java.util.List;

import com.awwal.api.payloads.PersonDto;

public interface PersonService {
	PersonDto createPerson(PersonDto personDto);
	PersonDto findPerson(int id);
	List<PersonDto> findAllPerson();
}
