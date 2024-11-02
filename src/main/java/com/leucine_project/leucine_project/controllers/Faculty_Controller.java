package com.leucine_project.leucine_project.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.leucine_project.leucine_project.models.FacultyProfile;
import com.leucine_project.leucine_project.repositories.Faculty_Repository;

@RequestMapping("/faculty")
public class Faculty_Controller {
	
	@Autowired
	private Faculty_Repository faculty_repository;
	
	//to get all the faculty data
	@GetMapping(value="/get_all_faculty",produces="application/json")
	public List<FacultyProfile> getallfaculty(){
		return faculty_repository.getallfaculty();
	}
	
	//to get the faculty profile by his/her id
	@GetMapping(value="/get_faculty_byid/{id}",produces="application/json")
	public FacultyProfile getfacultybyid(@PathVariable Long id) {
		return faculty_repository.getbyid(id);
	}
	
	
	
	
}
