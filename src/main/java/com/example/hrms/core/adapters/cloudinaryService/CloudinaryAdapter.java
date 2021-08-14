package com.example.hrms.core.adapters.cloudinaryService;

import com.example.hrms.core.utilities.results.DataResult;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.Map;

public interface CloudinaryAdapter {

    DataResult<Map> uploadImageToCloudinary(File file);

}
