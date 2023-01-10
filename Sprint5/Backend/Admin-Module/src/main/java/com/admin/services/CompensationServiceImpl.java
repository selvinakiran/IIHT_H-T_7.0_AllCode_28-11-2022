package com.admin.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.admin.entity.Compensation;
import com.admin.entity.User;
import com.admin.repository.CompensationRepository;
import com.admin.repository.UserRepository;

@Service
public class CompensationServiceImpl implements ICompensationService{
	
	@Autowired
	private CompensationRepository comRepo;
	
//	@Autowired
//	private PasswordEncoder encoder;


//	@Override
//	public Compensation getUserByName(String username) {
//		// TODO Auto-generated method stub
//		return null;
//	}

	@Override
	public Compensation createcompensation(Compensation newUser) {
		return comRepo.save(newUser);
	}
	
	

	@Override
	public List<Compensation> getAllCompensation() {
		return comRepo.findAll();
	}


}
