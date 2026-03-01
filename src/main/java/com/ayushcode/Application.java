package com.ayushcode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);

        System.out.println(java.util.TimeZone.getDefault());
    }


    @GetMapping
    public String hello(){
        return "Hello World Spring Boot!";
    }


}
