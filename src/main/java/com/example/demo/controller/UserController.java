package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.service.UserService;
import com.example.demo.entity.UserEntity;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/user/create")
    public String create() {
        return userService.createUser();  // "ユーザ追加をしました。" を表示
    }

    @GetMapping("/user/get")
    public List<UserEntity> get() {
        return userService.getUser();
    }
}
