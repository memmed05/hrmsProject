package com.example.hrms.core.adapters.cloudinaryService;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;
import com.example.hrms.core.utilities.results.DataResult;
import com.example.hrms.core.utilities.results.ErrorDataResult;
import com.example.hrms.core.utilities.results.SuccessDataResult;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.Map;

@Service
public class CloudinaryManager implements CloudinaryAdapter {
    private Cloudinary cloudinary;

    public CloudinaryManager() {
        this.cloudinary = new Cloudinary(ObjectUtils.asMap(
                "cloud_name", "drtqtujnv",
                "api_key", "839946942299748",
                "api_secret", "H-qrSMRjjfs8THvZihgbFQjsjt8",
                "secure", true));
    }

    @Override
    public DataResult<Map> uploadImageToCloudinary(File file) {
        try {
            Map<String ,String> uploadResult =(Map<String,String>) cloudinary.uploader().upload(file, ObjectUtils.emptyMap());
            return new SuccessDataResult<Map>(uploadResult);

        } catch (IOException e) {
             e.printStackTrace();
        }
        return new ErrorDataResult<Map>();
    }
}
