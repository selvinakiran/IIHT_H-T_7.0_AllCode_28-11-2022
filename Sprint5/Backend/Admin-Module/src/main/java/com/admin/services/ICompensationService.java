package com.admin.services;

import java.util.List;

import com.admin.entity.Compensation;


public interface ICompensationService {

	
//	public Compensation getUserByName(String username);
	
	public Compensation createcompensation(Compensation newUser);

	public List<Compensation> getAllCompensation();

}
