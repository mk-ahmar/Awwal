package com.awwal.api.contollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.awwal.api.payloads.PersonDto;
import com.awwal.api.payloads.UserDto;
import com.awwal.api.services.PersonService;

@RestController
@RequestMapping("/api/persons")
public class PersonController {
	
	@Autowired
	private PersonService personService;
	
	@PostMapping("/")
    public ResponseEntity<PersonDto> createPerson(@RequestBody PersonDto personDto) {
    	PersonDto person = this.personService.createPerson(personDto);
        return new ResponseEntity<>(person, HttpStatus.CREATED);
    }
	
	@GetMapping("/")
	public ResponseEntity<List<PersonDto>> getAllUser() {
		List<PersonDto> person = this.personService.findAllPerson();
		return new ResponseEntity<>(person, HttpStatus.OK);
	}
}
