package com.group.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.group.dao.InformationDao;
import com.group.model.Information;

@Service
public class InformationServiceImpl implements InformationService {
	
	@Autowired
	private InformationDao informationDao;

	@Transactional
	@Override
	public List<Information> getInformations() {
		return informationDao.getAllInformations();
	}

	@Transactional
	@Override
	public Information getInformation(int id_information) {
		return informationDao.findInformation(id_information);
	}

	@Transactional
	@Override
	public void save(Information inf) {
		informationDao.save(inf);
	}

	@Transactional
	@Override
	public void delete(int id_information) {
		informationDao.delete(id_information);
	}

	@Override
	public List<Information> getEvents() {
		return informationDao.getEvents();
	}

	@Override
	public List<Information> getDestinations() {
		return informationDao.getDestinations();
	}

}
