package org.koreait.member.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MemberController {

    @GetMapping("/member/join")
    public String joinPage(){
        return "member/join";
    }

    @PostMapping("member/join")
    public String JoinPs(RequestJoin2 form){
        System.out.println(form);
        return "member/join_ps";
//            @RequestParam(name = "email", defaultValue = "기본 이메일...") String email,
//            @RequestParam(name = "agree", required = false) Boolean agree){
//        System.out.println("POST 요청 유입...");
//        System.out.println(email);
//        System.out.println(agree);
//        return "member/join_ps";
    }

//    @GetMapping("/member/register")
//    public String joinPage(@RequestParam("agree") boolean agree,
//                           @RequestParam("email") String email,
//                           Model model){
//        System.out.println(email);
//        System.out.println(agree);
//        model.addAttribute("message", "안녕하세요");
//
//        return "member/join";
//    }
//    @GetMapping("member/register")
//    public ModelAndView joinPage(){
//        ModelAndView mv = new ModelAndView();
//        mv.addObject("message", "안녕하세요.");
//        mv.setViewName("member/join");
//
//        return mv;
//    }
}
