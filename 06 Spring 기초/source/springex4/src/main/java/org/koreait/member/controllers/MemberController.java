package org.koreait.member.controllers;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.koreait.member.service.JoinService;
import org.koreait.member.validators.JoinValidator;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/member")
@RequiredArgsConstructor
public class MemberController {

    private final JoinValidator joinValidator;
    private final JoinService joinService;

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
    public String JoinPs(@Valid RequestJoin form, Errors errors) {

        joinValidator.validate(form, errors);

        //검증 실패
        if (errors.hasErrors()){
            return "member/join";
        }

        //회원 가입 검증 성공, 가입 처리
        joinService.process(form);

        //회원 가입 후 로그인 페이지로 이동
        return "redirect:/member/login";
        //버퍼만 바꿈
        //return "forward:/member/login";
    }

    @GetMapping("/login")
    public String login(){
        return "member/login";
    }

    @PostMapping("/login")
    public String loginPs(){
        return "member/login";
    }
}
