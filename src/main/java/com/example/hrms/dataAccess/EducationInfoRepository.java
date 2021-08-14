package com.example.hrms.dataAccess;

import com.example.hrms.entities.concretes.EducationInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EducationInfoRepository extends JpaRepository<EducationInfo,Integer> {

}
