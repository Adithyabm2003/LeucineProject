package com.leucine_project.leucine_project.models;

import jakarta.persistence.*;
import java.util.Set;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String username;

    @Column(nullable = false)
    private String password;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Role role;

    private String name;

    @Column(unique = true, nullable = false)
    private String email;

    private String phone;

    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
    private StudentProfile studentProfile;

    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
    private FacultyProfile facultyProfile;

    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
    private AdministratorProfile administratorProfile;

    // Getters and setters
    // Enum Role with values STUDENT, FACULTY_MEMBER, ADMINISTRATOR
}

