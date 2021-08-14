package com.example.hrms.business.concretes;

import com.example.hrms.business.abstracts.SkillService;
import com.example.hrms.core.utilities.results.DataResult;
import com.example.hrms.core.utilities.results.Result;
import com.example.hrms.core.utilities.results.SuccessDataResult;
import com.example.hrms.core.utilities.results.SuccessResult;
import com.example.hrms.dataAccess.SkillRepository;
import com.example.hrms.entities.concretes.Skill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SkillManager implements SkillService {
    private SkillRepository skillRepository;

    @Autowired
    public SkillManager(SkillRepository skillRepository) {
        this.skillRepository = skillRepository;
    }

    @Override
    public DataResult<List<Skill>> getAll() {
        return new SuccessDataResult<List<Skill>>("data listed",this.skillRepository.findAll());
    }

    @Override
    public Result add(Skill skill) {
        this.skillRepository.save(skill);
        return new SuccessResult("data added");
    }
}
