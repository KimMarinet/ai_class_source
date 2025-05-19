package org.koreait.member.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/member")
public class MemberController {

    // MemberController에서 공통으로 공유할 수 있는 속성
    @ModelAttribute("commonTitle")
    public String commonTitle(){
        return "회원 공통 제목...";
    }

    @GetMapping("/join")
    public String Join(@ModelAttribute RequestJoin form){
        return "member/join";
    }

    @PostMapping("/join")
    public String JoinPs(RequestJoin form) {

        return "member/join";
    }
}
