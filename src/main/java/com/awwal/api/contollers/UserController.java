package com.awwal.api.contollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;			
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;					
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.awwal.api.payloads.UserDto;
import com.awwal.api.services.UserService;

@RestController
@RequestMapping("/api/users")
public class UserController {

	@Autowired
	private UserService userService;

	@PostMapping("/")
	public ResponseEntity<UserDto> createUser(@RequestBody UserDto userDto) {
		UserDto createUserDto = this.userService.createUser(userDto);
		return new ResponseEntity<>(createUserDto, HttpStatus.CREATED);
	}

	@GetMapping("/{userId}")
	public ResponseEntity<UserDto> searchUser(@PathVariable int userId) {
		UserDto searchUserDto = this.userService.getUserById(userId);
		return new ResponseEntity<>(searchUserDto, HttpStatus.OK);
	}

	@PutMapping("/{userId}")
	public ResponseEntity<UserDto> updateUser(@RequestBody UserDto userDto, @PathVariable int userId) {
		UserDto updatedUser = this.userService.updateUser(userDto, userId);
		return new ResponseEntity<>(updatedUser, HttpStatus.OK);
	}

	@DeleteMapping("/{userId}")
	public ResponseEntity<UserDto> deleteUser(@PathVariable int userId) {
		userService.deleteUser(userId);
		return new ResponseEntity<>(HttpStatus.ACCEPTED);
	}

	@GetMapping("/")
	public ResponseEntity<List<UserDto>> getAllUser() {
		List<UserDto> users = this.userService.getAllUsers();
		return new ResponseEntity<>(users, HttpStatus.OK);
	}
}
