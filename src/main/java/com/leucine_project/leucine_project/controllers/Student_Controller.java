package com.leucine_project.leucine_project.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.leucine_project.leucine_project.models.FacultyProfile;
import com.leucine_project.leucine_project.models.StudentProfile;
import com.leucine_project.leucine_project.repositories.Student_Repository;

@RestController
@RequestMapping("/student")
public class Student_Controller {
	
	
	 @Autowired
	 private Student_Repository student_repository;
	 
	 
	 //to get all the students with the respective faculty id
	 @GetMapping(value="/under_faculty/{faculty_id}",produces="application/json")
	 public List<StudentProfile> getStudentbyfaculty(@PathVariable Long faculty_id) {
		 return student_repository.findbyfacultyid(faculty_id);
	 }
	 
	 
	 //to get the details of the student by his/her id for showing it in their profile
	 @GetMapping(value="/get_by_id/{id}",produces="application/json")
	 public StudentProfile getStudentByid (@PathVariable Long id) {
		 return student_repository.findbyid(id);
	 }
	 
	 
	 //to get the details of the faculties who are assigned for a student by student id
	 @GetMapping(value="/get_assigned_faculties/{id}",produces="application/json")
	 public List<FacultyProfile> getfacultiesofStudent(@PathVariable Long id){
		 return student_repository.findfaculties(id);
	 }
	 
	 
	 //to get all the students data
	 @GetMapping(value="/get_all_students",produces="application/json")
	 public List<StudentProfile> getallstudents(){
		 return student_repository.findallstudents();
	 }
	 
}
