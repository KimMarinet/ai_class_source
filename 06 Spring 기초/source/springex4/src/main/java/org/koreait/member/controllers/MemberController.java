package org.koreait.member.controllers;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.koreait.global.excaptions.CommonException;
import org.koreait.member.entities.MemberVO;
import org.koreait.member.exceptions.MemberNotFoundException;
import org.koreait.member.repositories.MemberRepository;
import org.koreait.member.service.JoinService;
import org.koreait.member.service.LoginService;
import org.koreait.member.validators.JoinValidator;
import org.koreait.member.validators.LoginValidator;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

@Controller
@RequestMapping("/member")
@RequiredArgsConstructor
public class MemberController {

    private final JoinValidator joinValidator;
    private final JoinService joinService;

    private final LoginValidator loginValidator;
    private final LoginService loginService;

    private final MemberRepository repository;

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
    public String login(RequestLogin form, @CookieValue(name="savedEmail", required = false) String email){

        if (email!=null){
            form.setEmail(email);
            form.setSaveEmail(true);
        }

        return "member/login";
    }

    @PostMapping("/login")
    public String loginPs(@Valid RequestLogin form, Errors errors){

        //검증 단계
        loginValidator.validate(form, errors);

        if(errors.hasErrors()){
            return  "member/login";
        }

        // 검증 성공 시 로그인 처리

        loginService.process(form);

        //로그인 성공 시 이동
        String redirectUrl = form.getRedirectUrl();

        return "redirect:" + (StringUtils.hasText(redirectUrl) ? redirectUrl : "/");
    }

    @GetMapping("/list")
    public String memberList(@ModelAttribute MemberSearch memberSearch, @Valid Errors errors, Model model){
        LocalDate sDate = Objects.requireNonNullElse(memberSearch.getSDate(), LocalDate.now());
        LocalDate eDate = Objects.requireNonNullElse(memberSearch.getEDate(), LocalDate.now());

        LocalDateTime _sDate = sDate.atStartOfDay(); // 지정된 날짜의 자정
        LocalDateTime _eDate = eDate.atTime(23,59,59);

        List<MemberVO> items = repository.findByRegDtBetween(_sDate, _eDate);
        model.addAttribute("items", items);

        return  "member/list";
    }

    @ResponseBody
    @GetMapping({"/view/{seq}", "/view/info/{email}"})
    public void view(@PathVariable(name = "seq", required = false) Long mSeq,
                     @PathVariable(name = "email", required = false) String email){
        System.out.println("seq : "+ mSeq);

        if(StringUtils.hasText(email)){
            MemberVO member = repository.findByEmail(email).orElseThrow(MemberNotFoundException::new);
            System.out.println(member);
        }
    }

    //@ResponseStatus(HttpStatus.NOT_FOUND)
//    @ExceptionHandler(Exception.class)
//    public ModelAndView errorHandler(Exception e, Model model) {
//
//        model.addAttribute("message", e.getMessage());
//
//        HttpStatus status = HttpStatus.INTERNAL_SERVER_ERROR;
//        if(e instanceof CommonException commonException){
//            status = commonException.getStatus();
//        }
//
//        e.printStackTrace();
//
//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.setViewName("error/error");
//        modelAndView.setStatus(status);
//
//        return modelAndView;
//    }
}