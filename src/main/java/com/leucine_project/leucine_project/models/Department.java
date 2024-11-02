package com.leucine_project.leucine_project.models;

import jakarta.persistence.*;
import java.util.Set;

@Entity
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(columnDefinition = "TEXT")
    private String description;

    @OneToMany(mappedBy = "department", cascade = CascadeType.ALL)
    private Set<StudentProfile> studentProfiles;

    @OneToMany(mappedBy = "department", cascade = CascadeType.ALL)
    private Set<FacultyProfile> facultyProfiles;

    @OneToMany(mappedBy = "department", cascade = CascadeType.ALL)
    private Set<AdministratorProfile> administratorProfiles;

    @OneToMany(mappedBy = "department", cascade = CascadeType.ALL)
    private Set<Course> courses;

    // Getters and setters
}
