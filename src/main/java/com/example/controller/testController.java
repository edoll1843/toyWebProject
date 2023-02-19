package com.example.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.example.model.userVo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

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

    @RequestMapping(value = "/loginResistForm/userLoginButton", method = {RequestMethod.POST})
    public void userLoginButton(@RequestBody userVo userVo){
        String userId = userVo.getLoginId(); //유저가 입력한 id
        String userPw = userVo.getLoginPw(); //유저가 입력한 pw

        Logger logger = LoggerFactory.getLogger("com.example.controller.testController");
        logger.debug(userId);
        logger.debug(userPw);
        logger.debug("sajifgejpgenoiaejgpea");
    }


}
