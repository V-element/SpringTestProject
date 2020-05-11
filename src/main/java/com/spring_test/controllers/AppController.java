package com.spring_test.controllers;

import com.spring_test.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {

    @Autowired
    UserService userService;

    @GetMapping(value = "/")
    public String index(Model model) {
        model.addAttribute("users", userService.getUsers());
        return "index";
    }




}
