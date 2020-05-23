package com.jasaiz.example.springboothelloworld;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import org.springframework.core.env.Environment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

@RestController
public class HelloController {

   final String hostname = System.getenv().getOrDefault("HOSTNAME", "unknown");

   private int count = 0; // simple counter to see lifecycle

    @RequestMapping("/")
    public String index() {
        return "Hello World with Spring Boot!! " + count++ + " from " + hostname +"\n";
    }


}