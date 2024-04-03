package com.karthicodes.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Hellocontroller {

    @RequestMapping("/Hello")
    public String hello ()
    {
        return "Hello world...its me karthick and how are you...";
    }
    
}
