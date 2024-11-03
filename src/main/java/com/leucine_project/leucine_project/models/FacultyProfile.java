package com.leucine_project.leucine_project.models;



import jakarta.persistence.*;
import java.util.Set;

@Entity
public class FacultyProfile {
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

    private String officeHours;

    @OneToMany(mappedBy = "faculty", cascade = CascadeType.ALL)
    private Set<Course> courses;

	public Long getUserId() {
		// TODO Auto-generated method stub
		return userId;
	}

    // Getters and setters
}
