package com.leucine_project.leucine_project.controllers;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.leucine_project.leucine_project.models.FacultyProfile;
import com.leucine_project.leucine_project.models.StudentProfile;
import com.leucine_project.leucine_project.repositories.Administrator_Repository;
import com.leucine_project.leucine_project.repositories.Faculty_Repository;
import com.leucine_project.leucine_project.repositories.Student_Repository;

@RestController
@RequestMapping("/admin")
public class Administrator_Controller {

    @Autowired
    private Administrator_Repository administrator_repository;
    
    @Autowired
    private Student_Repository student_repository;

    @Autowired
    private Faculty_Repository faculty_repository;

    // Add new student - Accessible only to ADMIN
    @PostMapping(value="/add_student", consumes="application/json")
    public StudentProfile addStudent(@RequestBody StudentProfile student) {
        return student_repository.save(student);
    }

    // Add new faculty - Accessible only to ADMIN
    
    @PostMapping(value="/add_faculty", consumes="application/json")
    public FacultyProfile addFaculty(@RequestBody FacultyProfile faculty) {
        return faculty_repository.save(faculty);
    }

    // Remove faculty - Accessible only to ADMIN
    
    @DeleteMapping(value="/remove_faculty/{fac_id}")
    public void removeFaculty(@PathVariable Long fac_id) {
        administrator_repository.remove_fac(fac_id);
    }
}
