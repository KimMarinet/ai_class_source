package org.koreait.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestController {
    @RequestMapping(path = "/member/test1", method = RequestMethod.GET)
    public String test1(){
        return  "member/test";
    }
}