package com.study.server.ex1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
//@RequestMapping("/board") 메소드마다 보드가 중복되있어서 클래스 위에 하나로 연결하는 역활을 한다. 저걸 통해서
public class BoardController {
    @GetMapping("/board")
    public String getBoard() {
        return "board/index";
    }

    @GetMapping("/board/echo")
    public ModelAndView getEcho(@RequestParam("title") String title, //타이틀로 온 파라미터 값을 메인에 넣어줌
                          @RequestParam String content) {
        ModelAndView result = new ModelAndView("board/echo");//페이지로 넣을 수 있는 곳
        result.getModel().put("title", title);
        result.getModel().put("content", content);

        return result;
    }

    @PostMapping("/board/echo")
    public ModelAndView postEcho(@RequestParam String title,
                                 @RequestParam String content) {
        ModelAndView result = new ModelAndView("board/echo");//응답을 하면 사용되는 객체
        result.getModel().put("title", title); //변수부분도 바꿔줘야 함
        result.getModel().put("content", content);

        return result;
    }

    /*@GetMapping("")
    public String getBoard() {
        return "board/index";
    }

    @GetMapping("/echo")
    public String getEcho() {
        return "board/echo";
    }*/
    //그냥 보드로 오면 여기 주석처리 되있는 부분의 메소드를 실행해라 라는 뜻
}
