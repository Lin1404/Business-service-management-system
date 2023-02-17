package com.business_service_management_system.aws_bsms;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AwsBsmsController {

    @RequestMapping("/hello")
    public String hello(){
        return "Hello World!";
    }
}
