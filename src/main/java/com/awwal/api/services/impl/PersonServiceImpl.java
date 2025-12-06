package com.awwal.api.services.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.awwal.api.exceptions.ResourceNotFoundException;
import com.awwal.api.payloads.Person;
import com.awwal.api.payloads.PersonDto;
import com.awwal.api.repositories.PersonRepo;
import com.awwal.api.services.PersonService;

@Service
public class PersonServiceImpl implements PersonService{
	
	@Autowired
	private PersonRepo personRepo;
	
	@Override
	public PersonDto createPerson(PersonDto personDto) {
		Person person = this.dtoToPerson(personDto);
		Person savePerson = this.personRepo.save(person);
		return this.personToDto(savePerson);
	}
	
	@Override
	public PersonDto findPerson(int personId) {
		Person person = this.personRepo.findById(personId)
				.orElseThrow(() -> new ResourceNotFoundException("Person", "ID", personId));
		return this.personToDto(person);
	}
	@Override
	public List<PersonDto> findAllPerson() {
		List<Person> listPerson = this.personRepo.findAll();
		List<PersonDto> listPersonDto = listPerson.stream().map(person ->this.personToDto(person)).collect(Collectors.toList());
		return listPersonDto;
	}
	
	private Person dtoToPerson(PersonDto personDto) {
		Person person = new Person();
		person.setId(person.getId());
		person.setExperience(personDto.getExperience());
		person.setPerson_name(personDto.getPerson_name());
		person.setPerson_email(personDto.getPerson_email());
		person.setOccupation(personDto.getOccupation());
		person.setCtcInLpa(personDto.getCtcInLpa());
		return person;
	}
	
	private PersonDto personToDto(Person person) {
		PersonDto personDto = new PersonDto();
		personDto.setExperience(person.getExperience());
		personDto.setId(person.getId());
		personDto.setCtcInLpa(person.getCtcInLpa());
		personDto.setPerson_name(person.getPerson_name());
		personDto.setPerson_email(person.getPerson_email());
		personDto.setOccupation(person.getOccupation());
		return personDto;
	}
}
