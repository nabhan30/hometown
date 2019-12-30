package com.group.dao;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.group.model.User;

@Repository
public class UserDaoImpl implements UserDao {
	
	@Autowired
	private EntityManager entityManager;

	@Override
	public User userLogin(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(User user) {
		Session session = entityManager.unwrap(Session.class);
		session.saveOrUpdate(user);
		session.close();
	}

	@Override
	public User getUser(int id_user) {
		Session session = entityManager.unwrap(Session.class);
		User user = session.get(User.class, id_user);
		session.close();
		return user;
	}
}
