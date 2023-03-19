package com.bsms.Businessservicemanagementsystem.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BusinessServiceManagementSystemController {
    
    @RequestMapping("/")
    public String homePage(){
        return "Welcome to Business Service Management System!";
    }
}
