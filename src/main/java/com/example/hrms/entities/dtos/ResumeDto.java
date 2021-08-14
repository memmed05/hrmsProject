package com.example.hrms.entities.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResumeDto {
    private Integer id;
    private String githubAddress;
    private String linkedInAddress;
    private String school;
    private Date startDate;
    private Date graduateDate;
    private Boolean isContinuing;
    private String companyName;
    private String position;
    private String language;
    private Integer level;
    private String skill;
}

