package com.example.hrms.api.controllers;

import com.example.hrms.business.abstracts.EducationInfoService;
import com.example.hrms.business.abstracts.ForeignLanguageService;
import com.example.hrms.core.utilities.results.DataResult;
import com.example.hrms.core.utilities.results.Result;
import com.example.hrms.entities.concretes.ForeignLanguage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/ForeignLanguages")
public class ForeignLanguageController {
    private ForeignLanguageService foreignLanguageService;

    @Autowired
    public ForeignLanguageController(ForeignLanguageService foreignLanguageService) {
        this.foreignLanguageService = foreignLanguageService;
    }

    @GetMapping("/getAll")
    public DataResult<List<ForeignLanguage>> getAll() {
        return this.foreignLanguageService.getAll();
    }

    @PostMapping("/add")
    public Result add(@RequestBody ForeignLanguage foreignLanguage) {
        return this.foreignLanguageService.add(foreignLanguage);
    }
}
