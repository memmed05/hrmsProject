package com.example.hrms.api.controllers;

import com.example.hrms.business.abstracts.ImageService;
import com.example.hrms.core.utilities.results.DataResult;
import com.example.hrms.core.utilities.results.Result;
import com.example.hrms.entities.concretes.Image;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.File;
import java.util.List;

@RestController
@RequestMapping("/api/image")
public class ImageController {
    private ImageService imageService;

    @Autowired
    public ImageController(ImageService imageService) {
        this.imageService = imageService;
    }

    @GetMapping("/getAll")
    public DataResult<List<Image>> getAll(){
        return this.imageService.getAll();
    }

    @PostMapping("/addImage")
    public Result addImage(@RequestBody File image, @RequestParam Integer id) {
        return this.imageService.addImage(image,id);
    }

}
