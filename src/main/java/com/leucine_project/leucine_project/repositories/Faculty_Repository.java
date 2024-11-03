package com.leucine_project.leucine_project.repositories;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;

import com.leucine_project.leucine_project.models.FacultyProfile;

public class Faculty_Repository {

    @PersistenceContext
    private EntityManager entityManager;

    // Fetch all faculty profiles
    public List<FacultyProfile> getallfaculty() {
        TypedQuery<FacultyProfile> query = entityManager.createQuery("SELECT f FROM FacultyProfile f", FacultyProfile.class);
        return query.getResultList();
    }

    // Fetch a faculty profile by id
    public FacultyProfile getbyid(Long id) {
        return entityManager.find(FacultyProfile.class, id);
    }

    // Save a faculty profile
    public FacultyProfile save(FacultyProfile faculty) {
        if (faculty.getUserId() == null) {
            // New entity, persist it
            entityManager.persist(faculty);
            return faculty;
        } else {
            // Existing entity, merge it
            return entityManager.merge(faculty);
        }
    }

    // Method to remove a faculty profile by id (if needed)
    public void remove(Long id) {
        FacultyProfile faculty = getbyid(id);
        if (faculty != null) {
            entityManager.remove(faculty);
        }
    }
}
