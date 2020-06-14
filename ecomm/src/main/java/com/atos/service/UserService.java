package com.atos.service;

import com.atos.model.User;

public interface UserService {
	
	public User findUserByEmail(String email);
	
	public void saveUser(User user);

}
