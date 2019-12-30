package com.group.service;

import com.group.model.User;


public interface UserService {
	User getUser(int id);
	void save(User user);
	User userLogin(String username, String password);
}
