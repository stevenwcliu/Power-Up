package com.example.starbucksapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class PingController {

    class Ping {
        private String test;
        public Ping(String msg) { this.test = msg; }
        public String getTest() { return this.test; }
    }

    @GetMapping("/ping")
    public Ping ping() {
        return new Ping( "Starbucks API version 1.0 alive!" );
    }    
}