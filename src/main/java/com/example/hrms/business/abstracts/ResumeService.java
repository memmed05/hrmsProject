package com.example.hrms.business.abstracts;

import com.example.hrms.core.utilities.results.DataResult;
import com.example.hrms.core.utilities.results.Result;
import com.example.hrms.entities.concretes.Resume;
import com.example.hrms.entities.dtos.ResumeDto;

import java.util.List;

public interface ResumeService {
    DataResult<List<Resume>> getAll();

    Result add(Resume resume);

    DataResult<ResumeDto> getResume(Integer id);
}
