package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class testController {
    
    @GetMapping("/")
    public String test() {
        return "index.html";
    }

    @GetMapping("/loginResistForm")
    public String loginResistForm() {
        return "loginResistForm.html";
    }

    @GetMapping("/getIdTest")
    public String getIdTest(){

        return "blog.html";
    }


}
