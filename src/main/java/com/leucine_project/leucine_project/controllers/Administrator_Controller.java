package com.leucine_project.leucine_project.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.leucine_project.leucine_project.repositories.Administrator_Repository;

@RestController
@RequestMapping("/admin")
public class Administrator_Controller {
	
	
	@Autowired
	private Administrator_Repository administrator_repository;
	
	
	
}
