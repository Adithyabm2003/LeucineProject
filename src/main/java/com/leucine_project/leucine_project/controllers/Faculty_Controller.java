package com.leucine_project.leucine_project.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import com.leucine_project.leucine_project.repositories.Faculty_Repository;

@RequestMapping("/faculty")
public class Faculty_Controller {
	
	@Autowired
	private Faculty_Repository faculty_repository;
	
	
	
}
