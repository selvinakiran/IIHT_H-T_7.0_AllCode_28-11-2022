package com.hr.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hr.entity.HR;




@Service
public class HRServiceImpl implements IhrService {
	
	// Facke HR List
	
	List<HR> list = List.of(
			new HR(1000L,"Robi","86523726546"),
			new HR(2000L,"Ricko","9652372653"),
			new HR(3000L,"Rocky","7652372654"),
			new HR(4000L,"Pappu","6652372654"),
			new HR(5000L,"Liya","9952372654"));

	@Override
	public HR getHR(Long id) {
		
		return list.stream().filter(hr -> hr.getUserID().equals(id)).findAny().orElse(null);
	}
	
	


	

	

}
