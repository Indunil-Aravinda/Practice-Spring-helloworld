package com.creativesoftware.helloworld;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @RequestMapping
    public String helloWorld(){
        return "Hello World works perfectly";
    }

    @RequestMapping("/goodbye")
        public String goodbye(){
            return "See you later";
        }

}
