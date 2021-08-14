package com.example.hrms.api.controllers;

import com.example.hrms.business.abstracts.ForeignLanguageService;
import com.example.hrms.business.abstracts.JobExperienceService;
import com.example.hrms.core.utilities.results.DataResult;
import com.example.hrms.core.utilities.results.Result;
import com.example.hrms.entities.concretes.ForeignLanguage;
import com.example.hrms.entities.concretes.JobExperience;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/JobExperiences")
public class JobExperiencesController {
    private JobExperienceService jobExperienceService;

    @Autowired
    public JobExperiencesController(JobExperienceService jobExperienceService) {
        this.jobExperienceService = jobExperienceService;
    }

    @GetMapping("/getAll")
    public DataResult<List<JobExperience>> getAll() {
        return this.jobExperienceService.getAll();
    }

    @PostMapping("/add")
    public Result add(@RequestBody JobExperience jobExperience) {
        return this.jobExperienceService.add(jobExperience);
    }
}
