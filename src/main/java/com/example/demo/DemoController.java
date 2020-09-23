package com.example.demo;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {

    @GetMapping("/")
    @ResponseBody
    public String defaultPage() {
        return "index";
    }
    
    // RequestMapping is ?older? style annotation
    @RequestMapping("/hello")
    @ResponseBody
    public String sayHello() {
        return "Hello World";
    }
    
    
}
