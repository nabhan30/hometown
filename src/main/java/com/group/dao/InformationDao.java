package com.group.dao;

import java.util.List;

import com.group.model.Information;

public interface InformationDao {
	public List<Information> getAllInformations();
	public List<Information> getEvents();
	public List<Information> getDestinations();
	public List<Information> getInformation(int id_information);
	public void save(Information inf);
	public void delete(int id_information);
	public Information findInformation(int id_information);
}
