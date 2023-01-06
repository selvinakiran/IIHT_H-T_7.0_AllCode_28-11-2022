package com.admin.services;

import com.admin.entity.User;

public interface IUserService {

	public User signup(User newUser);
	
	public User getUserByName(String username);

}
