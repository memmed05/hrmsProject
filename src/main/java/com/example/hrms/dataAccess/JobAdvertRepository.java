package com.example.hrms.dataAccess;

import com.example.hrms.core.utilities.results.DataResult;
import com.example.hrms.entities.concretes.JobAdvert;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface JobAdvertRepository extends JpaRepository<JobAdvert, Integer> {
    @Query("From JobAdvert where employer.companyName=:companyName")
    List<JobAdvert> getAllAdverts(String companyName);
}
