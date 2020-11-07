package com.study.server.ex1.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Random;
import java.util.Scanner;

@Controller
public class OneController {
    @GetMapping("/one")
    public String one (){
        return "main/one";
    }

    @GetMapping("/one/user")
    public ModelAndView view(@RequestParam int user)
    {
        int computer =(int)(Math.random()*3)+1;
        ModelAndView result = new ModelAndView("main/user");//페이지로 넣을 수 있는 곳

        if((computer == 1 && user == 2) || (computer == 2 && user == 3) || (computer == 3 && user == 1)) {
            result.getModel().put("user","당신의 승리");
        }else if(computer == user) {
            result.getModel().put("user","이거슨 무승부");
        }else {
            result.getModel().put("user","당신의 패배");
        }
        return result;
    }

}
