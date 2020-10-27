package com.study.server.ex1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
    @RequestMapping(method = RequestMethod.GET, value = "/main") //디테일하게 설정을 많이 할 수 있음 REQUESTMAPPING
    public String getMain() {
        return "main/index";
    }
}
