package com.example.userservice.controller;


import com.example.userservice.service.UserService;
import com.example.userservice.vo.Greeting;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;

import org.springframework.web.bind.annotation.*;




@RestController
@RequestMapping("/")
public class UserController {
    private Environment env;
    private UserService userService;


}