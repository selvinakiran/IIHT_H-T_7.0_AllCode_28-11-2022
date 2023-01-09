package com.admin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.admin.entity.User;
import com.admin.models.JwtRequest;
import com.admin.models.JwtResponse;
import com.admin.services.IUserService;
import com.admin.services.UserDataService;
import com.admin.utility.JWTUtility;

@RestController
@RequestMapping("/api/adminmodule")
//@CrossOrigin(origins = "*", allowedHeaders = "*")

@CrossOrigin
public class UserController {
	
	@Autowired
	private IUserService userService;
	
	@Autowired
	private JWTUtility jwtUtil;

	@Autowired
	private AuthenticationManager authenticationManager;

	@Autowired
	private UserDataService userDataService;

	
	@PostMapping("/sign-up")
	public ResponseEntity<?> createUser(@RequestBody User user) {
		return new ResponseEntity<>(userService.signup(user), HttpStatus.OK);
	}

	@PostMapping("/sign-in")
	public ResponseEntity<?> login(@RequestBody JwtRequest request) throws Exception {
		try {
			authenticationManager.authenticate(
					new UsernamePasswordAuthenticationToken(request.getUsername(), request.getPassword()));
		} catch (BadCredentialsException ex) {
			throw new Exception("INVALID CREDENTIALS", ex);
		}
		final UserDetails userDetails = userDataService.loadUserByUsername(request.getUsername());
		final String token = jwtUtil.generateToken(userDetails);
		User loggedUser = userService.getUserByName(request.getUsername());
		return new ResponseEntity<>(new JwtResponse(token, loggedUser.getUsername(), loggedUser.getRole().toString()),
				HttpStatus.OK);
	}
	
	
	@PostMapping("/add-user")
	public ResponseEntity<?> createBook(@RequestBody User user) {
		return new ResponseEntity<>(userService.createuser(user), HttpStatus.OK);
	}
	
	@CrossOrigin("http://localhost:4200")
	@GetMapping("/alluser")
	public ResponseEntity<List<User>> getAllBooks() {
		return new ResponseEntity<>(userService.getAllUser(), HttpStatus.OK);
	}
}