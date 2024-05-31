package com.crud.controller;

import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.crud.model.School;
import com.crud.servicei.SchoolServiceI;

@RestController
public class HomeController 
{
	@Autowired
	SchoolServiceI ssi;
	

	@PostMapping("/saveSchool")
	public ResponseEntity<School> saveSchoolDetails(@RequestBody School s)
	{
		School sch=ssi.saveSchoolDetails(s);
		return new ResponseEntity<School>(sch,HttpStatus.CREATED);
	}
	
	@GetMapping("/getSchool/{id}")
	public ResponseEntity<School> getSchoolDetails(@PathVariable("id")int id)
	{
		School school = ssi.getSchoolDetailsById(id);
		if(school!=null)
		{
			return new ResponseEntity<School>(school, HttpStatus.ACCEPTED); 
		}
		else
		{
			return new ResponseEntity<School>(HttpStatus.BAD_REQUEST);
		}
	}
}