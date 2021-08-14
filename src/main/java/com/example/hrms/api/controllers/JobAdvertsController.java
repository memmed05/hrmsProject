package com.example.hrms.api.controllers;

import com.example.hrms.business.abstracts.JobAdvertService;
import com.example.hrms.core.utilities.results.DataResult;
import com.example.hrms.core.utilities.results.Result;
import com.example.hrms.entities.concretes.Job;
import com.example.hrms.entities.concretes.JobAdvert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/jobAdverts")
public class JobAdvertsController {
    private JobAdvertService jobAdvertService;

    @Autowired
    public JobAdvertsController(JobAdvertService jobAdvertService) {
        this.jobAdvertService = jobAdvertService;
    }

    @GetMapping("/getAll")
    public DataResult<List<JobAdvert>> getAll() {
        return this.jobAdvertService.getAll();
    }

    @PostMapping("/add")
    public Result add(@RequestBody JobAdvert jobAdvert) {
        return this.jobAdvertService.add(jobAdvert);
    }

    @GetMapping("/getSortedByDate")
    public DataResult<List<JobAdvert>> getSorted(){
        return this.jobAdvertService.getBySorted();
    }
    @GetMapping("/getAllAdverts")
    public DataResult<List<JobAdvert>>getAllAdverts(@RequestParam String companyName){
        return this.jobAdvertService.getAllAdverts(companyName);
    }

}
