package com.leucine_project.leucine_project.models;

import jakarta.persistence.*;

@Entity
public class AdministratorProfile {
    @Id
    private Long userId;

    @OneToOne
    @MapsId
    @JoinColumn(name = "user_id")
    private User user;

    private String photo;

    @ManyToOne
    @JoinColumn(name = "department_id", nullable = false)
    private Department department;

    // Getters and setters
}

