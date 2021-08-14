package com.example.hrms.dataAccess;

import com.example.hrms.entities.concretes.Resume;
import com.example.hrms.entities.dtos.ResumeDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Date;
import java.util.List;

public interface ResumeRepository extends JpaRepository<Resume, Integer> {
    @Query("select new com.example.hrms.entities.dtos.ResumeDto(r.resumeId,r.githubAddress,r.linkedInAddress,e.school,e.startDate,e.graduateDate,e.isContinuing,ex.companyName,ex.position,fl.language,fl.level,s.skill) from Resume r " +
            "inner join r.educationInfos e inner join r.jobExperiences ex inner join r.foreignLanguages fl inner join r.skills s where r.resumeId=:id ")
    ResumeDto getResumeDto(Integer id);
}
