package com.example.hrms.business.concretes;

import com.example.hrms.business.abstracts.ForeignLanguageService;
import com.example.hrms.core.utilities.results.DataResult;
import com.example.hrms.core.utilities.results.Result;
import com.example.hrms.core.utilities.results.SuccessDataResult;
import com.example.hrms.core.utilities.results.SuccessResult;
import com.example.hrms.dataAccess.ForeignLanguageRepository;
import com.example.hrms.entities.concretes.ForeignLanguage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ForeignLanguageManager implements ForeignLanguageService {
    private ForeignLanguageRepository foreignLanguageRepository;

    @Autowired
    public ForeignLanguageManager(ForeignLanguageRepository foreignLanguageRepository) {
        this.foreignLanguageRepository = foreignLanguageRepository;
    }

    @Override
    public DataResult<List<ForeignLanguage>> getAll() {
        return new SuccessDataResult<List<ForeignLanguage>>("data listed", this.foreignLanguageRepository.findAll());
    }

    @Override
    public Result add(ForeignLanguage foreignLanguage) {
        this.foreignLanguageRepository.save(foreignLanguage);
        return new SuccessResult("data added");
    }
}
