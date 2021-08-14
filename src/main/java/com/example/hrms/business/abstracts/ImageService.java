package com.example.hrms.business.abstracts;

import com.example.hrms.core.utilities.results.DataResult;
import com.example.hrms.core.utilities.results.Result;
import com.example.hrms.entities.concretes.Image;

import java.io.File;
import java.util.List;


public interface ImageService {

    DataResult<List<Image>>getAll();

    Result addImage(File image,Integer id);
}
