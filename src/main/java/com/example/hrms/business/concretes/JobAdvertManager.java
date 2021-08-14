package com.example.hrms.business.concretes;

import com.example.hrms.business.abstracts.JobAdvertService;
import com.example.hrms.core.utilities.results.DataResult;
import com.example.hrms.core.utilities.results.Result;
import com.example.hrms.core.utilities.results.SuccessDataResult;
import com.example.hrms.core.utilities.results.SuccessResult;
import com.example.hrms.dataAccess.JobAdvertRepository;
import com.example.hrms.entities.concretes.JobAdvert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobAdvertManager implements JobAdvertService {

    private JobAdvertRepository jobAdvertRepository;

    @Autowired
    public JobAdvertManager(JobAdvertRepository jobAdvertRepository) {
        this.jobAdvertRepository = jobAdvertRepository;
    }

    @Override
    public DataResult<List<JobAdvert>> getAll() {
        return new SuccessDataResult<List<JobAdvert>>("data listed", this.jobAdvertRepository.findAll());
    }

    @Override
    public Result add(JobAdvert jobAdvert) {
        this.jobAdvertRepository.save(jobAdvert);
        return new SuccessResult("data added");
    }

    @Override
    public DataResult<List<JobAdvert>> getBySorted() {
        Sort sort=Sort.by(Sort.Direction.DESC,"deadLine");
        return new SuccessDataResult<List<JobAdvert>>(this.jobAdvertRepository.findAll(sort));
    }

    @Override
    public DataResult<List<JobAdvert>> getAllAdverts(String companyName) {
        return new SuccessDataResult<List<JobAdvert>>("data listed",this.jobAdvertRepository.getAllAdverts(companyName));
    }


}
