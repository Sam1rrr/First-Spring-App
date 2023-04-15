package com.gradiant.firstspringapp.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/gradiant")
public class EmployeeInfoController {
    @GetMapping("info")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public String infoMethod(){
        return "Samir Orucov\n\nSoftware Developer";
    }


}
//package com.gradiant.firstspringapp.controller;
//
//import org.springframework.http.HttpStatus;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseStatus;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@RequestMapping("/gradiant")//localhost:8080.gradiant//**
//public class EmployeeInfoController {
//    @GetMapping("home")
//    @ResponseStatus(HttpStatus.ACCEPTED)
//    public String companyMethod(){
//        return "Gradiant Company";
//    }
//
//}

