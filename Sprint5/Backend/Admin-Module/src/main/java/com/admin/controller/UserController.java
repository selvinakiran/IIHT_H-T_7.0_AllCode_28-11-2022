package com.admin.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

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

import com.admin.entity.Compensation;
import com.admin.entity.User;
import com.admin.models.JwtRequest;
import com.admin.models.JwtResponse;
import com.admin.services.ICompensationService;
import com.admin.services.IUserService;
import com.admin.services.UserDataService;
import com.admin.utility.CompensationExcelExporter;
import com.admin.utility.JWTUtility;

@RestController
@RequestMapping("/api/adminmodule")
//@CrossOrigin(origins = "*", allowedHeaders = "*")

@CrossOrigin
public class UserController {
	
	@Autowired
	private IUserService userService;
	
	@Autowired
	private ICompensationService compService;
	
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
	

	@CrossOrigin("http://localhost:4200")
	@GetMapping("/alluser")
	public ResponseEntity<List<User>> getAllBooks() {
		return new ResponseEntity<>(userService.getAllUser(), HttpStatus.OK);
	}
	
	//Added compensation Plan 
	
	
	@PostMapping("/add-compensation")
	public ResponseEntity<?> createcompensation(@RequestBody Compensation user) {
		return new ResponseEntity<>(compService.createcompensation(user), HttpStatus.OK);
	}
	
	@CrossOrigin("http://localhost:4200")
	@GetMapping("/allcompensation")
	public ResponseEntity<List<Compensation>> getAllCompensation() {
		return new ResponseEntity<>(compService.getAllCompensation(), HttpStatus.OK);
	}
	
	
	
	@CrossOrigin("http://localhost:4200")
	@GetMapping("/export/compensations")
	public void exportCompsToExcel(HttpServletResponse response) throws IOException{
	    response.setContentType("application/octet-stream");
	    String headerKey = "Content-Disposition";
	    String headerValue = "attachment; fileName=comps_info.xlsx";

	    response.setHeader(headerKey,headerValue);
	    CompensationExcelExporter excelExporter = new CompensationExcelExporter(this.getAllCompensation().getBody());
	    excelExporter.export(response);
	}
	
	
}