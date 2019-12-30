package com.group.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.group.dao.UserDao;
import com.group.model.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	@Override
	public User getUser(int id) {
		return userDao.getUser(id);
	}

	@Override
	public void save(User user) {
		userDao.save(user);
	}

	@Override
	public User userLogin(String username, String password) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
