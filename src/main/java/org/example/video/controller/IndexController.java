package org.example.video.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class IndexController {

    @GetMapping("/regret")
    public String sayHello(){
        return "Hello,Hikvision!";
    }
}
