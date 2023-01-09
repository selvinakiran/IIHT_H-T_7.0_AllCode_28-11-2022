package com.admin.services;

import java.util.List;

import com.admin.entity.User;

public interface IUserService {

	public User signup(User newUser);
	
	public User getUserByName(String username);
	
	public User createuser(User newUser);

	public List<User> getAllUser();

}
