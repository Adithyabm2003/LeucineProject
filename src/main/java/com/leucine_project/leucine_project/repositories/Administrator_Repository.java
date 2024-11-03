package com.leucine_project.leucine_project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.leucine_project.leucine_project.models.FacultyProfile;

@Repository
public interface Administrator_Repository extends JpaRepository<FacultyProfile, Long> {

    @Modifying
    @Transactional
    @Query("DELETE FROM FacultyProfile f WHERE f.user_id = :fac_id")
    void remove_fac(Long fac_id);
}
