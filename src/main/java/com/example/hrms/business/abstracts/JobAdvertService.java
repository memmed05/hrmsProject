package com.example.hrms.business.abstracts;

import com.example.hrms.core.utilities.results.DataResult;
import com.example.hrms.core.utilities.results.Result;
import com.example.hrms.entities.concretes.JobAdvert;

import java.util.Date;
import java.util.List;

public interface JobAdvertService {
    DataResult<List<JobAdvert>> getAll();

    Result add(JobAdvert jobAdvert);

    DataResult<List<JobAdvert>> getBySorted();

    DataResult<List<JobAdvert>> getAllAdverts(String companyName);
}
