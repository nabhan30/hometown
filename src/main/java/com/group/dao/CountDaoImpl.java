package com.group.dao;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.group.model.Information;

@Repository
public class CountDaoImpl implements CountDao {

	@Autowired
	private EntityManager entityManager;
	
	@Override
	public int getCount(int id_information) {
		Session session = entityManager.unwrap(Session.class);
		Information inf = session.get(Information.class, id_information);
		session.close();
		return (Integer) null;
	}

}
