package com.admin.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.admin.entity.User;
import com.admin.repository.UserRepository;

@Service
public class UserServiceImpl implements IUserService{
	
	@Autowired
	private UserRepository userRepo;
	
	@Autowired
	private PasswordEncoder encoder;

	@Override
	public User signup(User newUser) {
		newUser.setPassword(encoder.encode(newUser.getPassword()));
		return userRepo.save(newUser);
	}

	@Override
	public User getUserByName(String username) {
		return userRepo.findByUsername(username);
	}

	@Override
	public User createuser(User newUser) {
		return userRepo.save(newUser);
	}

	@Override
	public List<User> getAllUser() {
		return userRepo.findAll();
	}

}
