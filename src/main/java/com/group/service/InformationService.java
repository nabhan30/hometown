package com.group.service;

import java.util.List;

import com.group.model.Information;


public interface InformationService {
	List<Information> getInformations();
	List<Information> getEvents();
	List<Information> getDestinations();
	Information getInformation(int id_information);
	void save(Information inf);
	void delete(int id_information);
}
