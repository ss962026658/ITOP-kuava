package com.itop.kuava.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {

    @RequestMapping("sss")
    public String say(){
        return "1111" ;
    }

}
