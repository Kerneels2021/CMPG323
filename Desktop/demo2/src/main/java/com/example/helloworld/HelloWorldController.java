package com.example.helloworld;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HelloWorldController {
    @RequestMapping("/")
    public String helloWorld(){
        return "Hel ek is moeg gesukkel!!!";
    }
}