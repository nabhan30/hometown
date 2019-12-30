package com.group.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.group.model.Information;

@Repository
public class InformationDaoImpl implements InformationDao {
	
	@Autowired
	private EntityManager entityManager;

	@Override
	public List<Information> getAllInformations() {
		Session session = entityManager.unwrap(Session.class);
		Query<Information> query = session.createQuery("from Information ", Information.class);
		List<Information> listInforms = query.getResultList();
		session.close();
		return listInforms;
	}

	@Override
	public List<Information> getEvents() {
		Session session = entityManager.unwrap(Session.class);
		Query<Information> query = session.createQuery("from Information where category='events'", Information.class);
		List<Information> listEvents = query.getResultList();
		session.close();
		return listEvents;
	}
	
	@Override
	public List<Information> getDestinations() {
		Session session = entityManager.unwrap(Session.class);
		Query<Information> query = session.createQuery("from Information where category='destination'", Information.class);
		List<Information> listDestinations = query.getResultList();
		session.close();
		return listDestinations;
	}

	@Override
	public List<Information> getInformation(int id_information) {
		Session session = entityManager.unwrap(Session.class);
		Query<Information> query = session.createQuery("from Information where id_user=?", Information.class);
		List<Information> listDestinations = query.getResultList();
		session.close();
		return listDestinations;
	}

	@Override
	public void save(Information inf) {
		Session session = entityManager.unwrap(Session.class);
		session.save(inf);
		session.close();
	}

	@Override
	public void delete(int id_information) {
		Session session = entityManager.unwrap(Session.class);
		Information inf = session.get(Information.class, id_information);
		session.delete(inf);
		session.close();
	}

	@Override
	public Information findInformation(int id_information) {
		Session session = entityManager.unwrap(Session.class);
		Information inf = session.get(Information.class, id_information);
		session.close();
		return inf;
	}
}
