package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller //@RestController
public class testController {
    
    @GetMapping("/")
    public String indexPage() { //welcomepage interccetptor
        return "index.html";
    }

    @GetMapping("/blog")
    public String blogPage() { //mapping bolg page
        return "blog.html";
    }

 

}
