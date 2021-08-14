package com.example.hrms.business.concretes;

import com.example.hrms.business.abstracts.UserService;
import com.example.hrms.core.utilities.results.*;
import com.example.hrms.dataAccess.UserRepository;
import com.example.hrms.entities.concretes.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserManager implements UserService {
    private UserRepository userRepository;

    @Autowired
    public UserManager(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    public DataResult<List<User>> getAll() {
        return new SuccessDataResult<List<User>>("data listed", this.userRepository.findAll());
    }

    @Override
    public Result add(User user) {
        if (!user.getEmail().equals("") && user.getPassword().equals(user.getRePassword()) && user.getPassword().length() >= 8) {
            this.userRepository.save(user);
            return new SuccessResult("data added");
        } else {
            return new ErrorResult("wrong data");
        }
    }
}
