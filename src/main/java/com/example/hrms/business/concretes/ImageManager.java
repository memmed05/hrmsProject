package com.example.hrms.business.concretes;

import com.example.hrms.business.abstracts.ImageService;
import com.example.hrms.core.adapters.cloudinaryService.CloudinaryAdapter;
import com.example.hrms.core.utilities.results.DataResult;
import com.example.hrms.core.utilities.results.Result;
import com.example.hrms.core.utilities.results.SuccessDataResult;
import com.example.hrms.core.utilities.results.SuccessResult;
import com.example.hrms.dataAccess.ImageRepository;
import com.example.hrms.dataAccess.ResumeRepository;
import com.example.hrms.entities.concretes.Image;
import com.example.hrms.entities.concretes.Resume;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.util.List;
import java.util.Map;


@Service
public class ImageManager implements ImageService {
    private ImageRepository imageRepository;
    private CloudinaryAdapter cloudinaryAdapter;
    private ResumeRepository resumeRepository;

    @Autowired
    public ImageManager(ImageRepository imageRepository, CloudinaryAdapter cloudinaryAdapter, ResumeRepository resumeRepository) {
        this.imageRepository = imageRepository;
        this.cloudinaryAdapter=cloudinaryAdapter;
        this.resumeRepository=resumeRepository;
    }

    @Override
    public DataResult<List<Image>> getAll() {
        return new SuccessDataResult<List<Image>>("data listed",this.imageRepository.findAll());
    }

    @Override
    public Result addImage(File image,Integer id) {
        Map<String ,String> uploadImage=cloudinaryAdapter.uploadImageToCloudinary(image).getData();
        Image img=new Image();
        Resume resume=this.resumeRepository.getById(id);
        img.setResume(resume);
        String url= uploadImage.get("url");
        img.setImageLink(url);
        this.imageRepository.save(img);
        return new SuccessResult("data added");
    }
}
