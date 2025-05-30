package org.koreait.member.controllers;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/test3")
@RequiredArgsConstructor
public class Test3Controller {
    private final HttpServletRequest request;
    private final HttpServletResponse response;

    @ResponseBody // 응답 형태가 js 문자로 바뀜
    @GetMapping("/sub/ex01")
    public void exam1(){
        Cookie cookie1 = new Cookie("key1", "value1");
        response.addCookie(cookie1);
    }

    @ResponseBody // 응답 형태가 js 문자로 바뀜
    @GetMapping("/sub2/ex01")
    public void exam2(){
        Cookie cookie1 = new Cookie("key2", "value2");
        response.addCookie(cookie1);
    }

    @ResponseBody
    @GetMapping("/sub3")
    public void exam3(){
        Cookie cookie = new Cookie("key3", "value3");
        cookie.setPath(request.getContextPath()+"/test3");
        response.addCookie(cookie);
    }

    @ResponseBody
    @GetMapping("/sub3/ex01")
    public void exam4(){
//        Cookie cookie = new Cookie("key4", "value4");
//        cookie.setPath(request.getContextPath()+"/test3");
//        cookie.setMaxAge(60 * 60 * 24 * 7);// 일주일
//        cookie.setHttpOnly(true); // JS에서 조회 불가
//        response.addCookie(cookie);
        Cookie[] cookies = request.getCookies();
        for(Cookie cookie : cookies){
            System.out.println(cookie.getName());
            System.out.println(cookie.getValue());
        }
    }
}
