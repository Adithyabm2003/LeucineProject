package com.leucine_project.leucine_project.repositories;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;

import com.leucine_project.leucine_project.models.FacultyProfile;
import com.leucine_project.leucine_project.models.StudentProfile;

public class Student_Repository {

    @PersistenceContext
    private EntityManager entityManager;

    // Fetch all students under a specific faculty by faculty ID
    public List<StudentProfile> findbyfacultyid(Long facultyId) {
        TypedQuery<StudentProfile> query = entityManager.createQuery(
            "SELECT s FROM StudentProfile s WHERE s.faculty.id = :facultyId", 
            StudentProfile.class);
        query.setParameter("facultyId", facultyId);
        return query.getResultList();
    }

    // Fetch a student by their ID
    public StudentProfile findbyid(Long id) {
        return entityManager.find(StudentProfile.class, id);
    }

    // Fetch faculties assigned to a specific student by student ID
    public List<FacultyProfile> findfaculties(Long studentId) {
        TypedQuery<FacultyProfile> query = entityManager.createQuery(
            "SELECT f FROM FacultyProfile f JOIN f.students s WHERE s.id = :studentId", 
            FacultyProfile.class);
        query.setParameter("studentId", studentId);
        return query.getResultList();
    }

    // Fetch all students
    public List<StudentProfile> findallstudents() {
        TypedQuery<StudentProfile> query = entityManager.createQuery("SELECT s FROM StudentProfile s", StudentProfile.class);
        return query.getResultList();
    }

    // Save a new student profile to the database
    public StudentProfile save(StudentProfile student) {
        entityManager.persist(student); // Save the student entity
        return student; // Return the saved entity
    }
}
