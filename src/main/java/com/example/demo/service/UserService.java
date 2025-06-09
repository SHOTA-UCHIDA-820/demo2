package com.example.demo.service;

import org.springframework.stereotype.Service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.repository.UserRepository;
import com.example.demo.entity.UserEntity;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public String createUser() {
        UserEntity userEntity = new UserEntity();
        userEntity.setName("太郎 田中");
        userEntity.setEmail("hoge@hoge.com");
        userEntity.setPhoneNumber("090-1234-5678");
        userRepository.save(userEntity);
        return "ユーザ追加をしました。";
    }

    public List<UserEntity> getUser() {
        return userRepository.findAll();
    }
}



