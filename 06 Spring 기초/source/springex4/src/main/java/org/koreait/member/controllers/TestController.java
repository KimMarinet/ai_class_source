package org.koreait.member.controllers;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestController {
    @RequestMapping(path = "/member/test1", method = RequestMethod.GET)
    public String test1(){
        return  "member/test";
    }

    // 요청 헤더 중에서 test6이 포함된 경우
    @GetMapping(path = "/member/test5", headers = "test6")
    public String test6(){
        System.out.println("test6");

        return "member/test";
    }

    // 요청 헤더 중에서 test7이 포함된 경우
    @GetMapping(path = "/member/test5", headers = "test7")
    public String test7(){
        System.out.println("test7");

        return "member/test";
    }

    @PostMapping(path = "/member/test6", consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    public String test8(){
        System.out.println("test8");
        return "member/test";
    }

    @PostMapping(path = "/member/test6", consumes = MediaType.APPLICATION_JSON_VALUE)
    public String test9(){
        System.out.println("test8");
        return "member/test";
    }
}