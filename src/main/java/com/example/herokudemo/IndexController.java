package com.example.herokudemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @GetMapping("/")
    public String index() {
        return "Hello there! I'm running. Running where you may ask well I don't know.";
    }
    @GetMapping("/look")
    public String look() { return "Here is an original page.";}
}
