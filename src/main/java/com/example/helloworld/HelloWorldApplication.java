package com.example.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class HelloWorldApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloWorldApplication.class, args);
    }

    @RestController
    static class HelloController {

        @GetMapping("/")
        public String hello() {
            return "<!DOCTYPE html>"
                    + "<html>"
                    + "<head><meta charset=\"UTF-8\"><title>Hello World</title></head>"
                    + "<body>"
                    + "<h1>Hello World</h1>"
                    + "<p>This Java web app is running with Spring Boot.</p>"
                    + "</body>"
                    + "</html>";
        }
    }
}
