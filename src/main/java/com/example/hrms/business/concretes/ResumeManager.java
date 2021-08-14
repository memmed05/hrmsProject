package com.example.hrms.business.concretes;

import com.example.hrms.business.abstracts.ResumeService;
import com.example.hrms.core.utilities.results.DataResult;
import com.example.hrms.core.utilities.results.Result;
import com.example.hrms.core.utilities.results.SuccessDataResult;
import com.example.hrms.core.utilities.results.SuccessResult;
import com.example.hrms.dataAccess.ResumeRepository;
import com.example.hrms.entities.concretes.Resume;
import com.example.hrms.entities.dtos.ResumeDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResumeManager implements ResumeService {
    private ResumeRepository resumeRepository;

    @Autowired
    public ResumeManager(ResumeRepository resumeRepository) {
        this.resumeRepository = resumeRepository;
    }

    @Override
    public DataResult<List<Resume>> getAll() {
        return new SuccessDataResult<List<Resume>>("data listed", this.resumeRepository.findAll());
    }

    @Override
    public Result add(Resume resume) {
        this.resumeRepository.save(resume);
        return new SuccessResult("data added");
    }

    @Override
    public DataResult<ResumeDto> getResume(Integer id) {
        return new SuccessDataResult<ResumeDto>("data listed",this.resumeRepository.getResumeDto(id));
    }
}
