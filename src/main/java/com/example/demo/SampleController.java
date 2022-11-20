package com.example.demo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    @GetMapping("/helloworld")
    public String helloworld(){
        return "Hello GCP!";
    }
}
