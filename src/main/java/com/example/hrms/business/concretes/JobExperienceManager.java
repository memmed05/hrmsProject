package com.example.hrms.business.concretes;

import com.example.hrms.business.abstracts.JobExperienceService;
import com.example.hrms.core.utilities.results.DataResult;
import com.example.hrms.core.utilities.results.Result;
import com.example.hrms.core.utilities.results.SuccessDataResult;
import com.example.hrms.core.utilities.results.SuccessResult;
import com.example.hrms.dataAccess.JobExperienceRepository;
import com.example.hrms.entities.concretes.JobExperience;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobExperienceManager implements JobExperienceService {
    private JobExperienceRepository jobExperienceRepository;

    @Autowired
    public JobExperienceManager(JobExperienceRepository jobExperienceRepository) {
        this.jobExperienceRepository = jobExperienceRepository;
    }

    @Override
    public DataResult<List<JobExperience>> getAll() {
        return new SuccessDataResult<List<JobExperience>>("data listed", this.jobExperienceRepository.findAll());
    }

    @Override
    public Result add(JobExperience jobExperience) {
        this.jobExperienceRepository.save(jobExperience);
        return new SuccessResult("data added");
    }
}
