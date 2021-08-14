package com.example.hrms.api.controllers;

import com.example.hrms.business.abstracts.EducationInfoService;
import com.example.hrms.business.abstracts.ResumeService;
import com.example.hrms.core.utilities.results.DataResult;
import com.example.hrms.core.utilities.results.Result;
import com.example.hrms.entities.concretes.EducationInfo;
import com.example.hrms.entities.concretes.Resume;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/EducationalInfos")
public class EducationInfosController {
    private EducationInfoService educationInfoService;

    @Autowired
    public EducationInfosController(EducationInfoService educationInfoService) {
        this.educationInfoService = educationInfoService;
    }

    @GetMapping("/getAll")
    public DataResult<List<EducationInfo>> getAll() {
        return this.educationInfoService.getAll();
    }

    @PostMapping("/add")
    public Result add(@RequestBody EducationInfo educationInfo) {
        return this.educationInfoService.add(educationInfo);
    }
}
