package com.group.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MimeTypeUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.group.model.Information;
import com.group.service.InformationService;

@RestController
@RequestMapping("information")
public class InformationController {
	
	@Autowired
	private InformationService informService;
	
	@RequestMapping(value = "findAll", method = RequestMethod.GET, produces = MimeTypeUtils.APPLICATION_JSON_VALUE, headers = "Accept=application/json")
	public ResponseEntity<List<Information>> findAll() {
		try {
			return new ResponseEntity<List<Information>>(informService.getInformations(), HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<List<Information>>(HttpStatus.BAD_REQUEST);
		}
	}
	
	@RequestMapping(value = "insert", method = RequestMethod.POST)
	public ResponseEntity<Information> save(@RequestBody Information inf) {
		try {
			informService.save(inf);
			return new ResponseEntity<Information>(HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<Information>(HttpStatus.BAD_REQUEST);
		}
	}
	
	@RequestMapping(value = "information/{id}", method = RequestMethod.GET, produces = MimeTypeUtils.APPLICATION_JSON_VALUE, headers = "Accept=application/json")
	public ResponseEntity<Information> get(@PathVariable int id_information) {
		try {
			return new ResponseEntity<Information>(informService.getInformation(id_information), HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<Information>(HttpStatus.BAD_REQUEST);
		}
	}

	@RequestMapping(value = "delete/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Void> delete(@PathVariable int id_information) {
		try {
			informService.delete(id_information);
			return new ResponseEntity<Void>(HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<Void>(HttpStatus.BAD_REQUEST);
		}
	}

	@RequestMapping(value = "update", method = RequestMethod.PUT)
	public  ResponseEntity<Information> update(@RequestBody Information inf) {
		try {
			informService.save(inf);
			return new ResponseEntity<Information>(HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<Information>(HttpStatus.BAD_REQUEST);
		}
	}
}
