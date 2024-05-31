package com.crud.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.model.School;
import com.crud.repository.SchoolRepository;
import com.crud.servicei.SchoolServiceI;
@Service
public class SchoolServiceImpl implements SchoolServiceI{

	@Autowired
	SchoolRepository sr;
	
	@Override
	public School saveSchoolDetails(School s) 
	{
		return sr.save(s);
	}

}
