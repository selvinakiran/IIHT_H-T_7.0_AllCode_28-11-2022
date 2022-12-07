package com.hr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hr.entity.HR;
import com.hr.service.IhrService;


@RestController
@RequestMapping("/hr")
public class HRController {
	
	@Autowired
	private IhrService hrservice;
	
	@GetMapping("/{userID}")
	public HR getHr(@PathVariable("userID") Long userID) {
		HR hr = this.hrservice.getHR(userID);
		return hr;
		
	}

}
