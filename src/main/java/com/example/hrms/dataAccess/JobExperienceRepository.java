package com.example.hrms.dataAccess;

import com.example.hrms.entities.concretes.JobExperience;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobExperienceRepository extends JpaRepository<JobExperience, Integer> {
}
