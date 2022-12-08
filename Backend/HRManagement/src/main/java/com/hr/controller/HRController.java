package com.hr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import java.util.List;
import com.hr.entity.HR;
import com.hr.service.IhrService;


@RestController
@RequestMapping("/hr")
public class HRController {
	
	@Autowired
	private IhrService hrservice;
	
	//Connecting two microservices
	@Autowired
	private RestTemplate restTemplate;
	
	// OLD CODE
//	@GetMapping("/{userID}")
//	public HR getHr(@PathVariable("userID") Long userID) {
//		HR hr = this.hrservice.getHR(userID);
//		return hr;
//		
//	}
	
	// New Code with Rest changes
	@GetMapping("/{userID}")
	public HR getHr(@PathVariable("userID") Long userID) {
		HR hr = this.hrservice.getHR(userID);
		//Newly added lines
		List resourse =this.restTemplate.getForObject("http://RESOURCE-SERVICE/resourse/hr/" +userID, List.class);
		hr.setResource(resourse);
		return hr;
	
		
	}

}
