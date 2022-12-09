package com.token.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.token.entity.JWTRequest;
import com.token.entity.JWTResponse;
import com.token.service.UserService;
import com.token.utility.JWTUtility;

@RestController
public class SecurityController {
	
	@Autowired
	private JWTUtility jwtUtility;
	
	@Autowired
	private AuthenticationManager authenticateManager;
	
	@Autowired
	private UserService userService;
	
	
	@GetMapping("/")
	public String home() {
		return "Hello and welcome to home page";
	}
	
	@PostMapping("/auth")
	public JWTResponse authenticate(@RequestBody JWTRequest  jwtRequest)
	{
		try {
			authenticateManager.authenticate(new UsernamePasswordAuthenticationToken(jwtRequest.getUsername(), jwtRequest.getPassword()));
		
		} catch (BadCredentialsException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		final UserDetails userDetails = userService.loadUserByUsername(jwtRequest.getUsername());
		final String token = jwtUtility.generateToken(userDetails);
		return new JWTResponse(token);
	}
	
	
	
	
	
	
}
