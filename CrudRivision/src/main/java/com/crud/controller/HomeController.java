package com.crud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.crud.servicei.SchoolServiceI;

@RestController
public class HomeController 
{
	@Autowired
	SchoolServiceI ssi;
}
