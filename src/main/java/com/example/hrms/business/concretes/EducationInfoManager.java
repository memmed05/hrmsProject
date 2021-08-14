package com.example.hrms.business.concretes;

import com.example.hrms.business.abstracts.EducationInfoService;
import com.example.hrms.core.utilities.results.DataResult;
import com.example.hrms.core.utilities.results.Result;
import com.example.hrms.core.utilities.results.SuccessDataResult;
import com.example.hrms.core.utilities.results.SuccessResult;
import com.example.hrms.dataAccess.EducationInfoRepository;
import com.example.hrms.entities.concretes.EducationInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EducationInfoManager implements EducationInfoService {
    private EducationInfoRepository educationInfoRepository;

    @Autowired
    public EducationInfoManager(EducationInfoRepository educationInfoRepository) {
        this.educationInfoRepository = educationInfoRepository;
    }


    @Override
    public DataResult<List<EducationInfo>> getAll() {
        return new SuccessDataResult<List<EducationInfo>>("data listed",this.educationInfoRepository.findAll());
    }

    @Override
    public Result add(EducationInfo educationInfo) {
        this.educationInfoRepository.save(educationInfo);
        return new SuccessResult("data added");
    }
}
