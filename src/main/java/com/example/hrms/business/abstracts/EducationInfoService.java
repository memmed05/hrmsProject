package com.example.hrms.business.abstracts;

import com.example.hrms.core.utilities.results.DataResult;
import com.example.hrms.core.utilities.results.Result;
import com.example.hrms.entities.concretes.EducationInfo;

import java.util.List;

public interface EducationInfoService {
    DataResult<List<EducationInfo>>getAll();

    Result add(EducationInfo educationInfo);

}
