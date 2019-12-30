package com.group.dao;

import com.group.model.User;

public interface UserDao {
	public void save(User user);
	public User getUser(int id_user);
	public User userLogin(User user);
}
