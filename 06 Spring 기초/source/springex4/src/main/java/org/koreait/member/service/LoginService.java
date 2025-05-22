package org.koreait.member.service;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.koreait.member.controllers.RequestLogin;
import org.koreait.member.entities.MemberVO;
import org.koreait.member.exceptions.MemberNotFoundException;
import org.koreait.member.repositories.MemberRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LoginService {

    private final MemberRepository repository;
    private final HttpSession session;
    private final HttpServletResponse response;

    public void process(RequestLogin form){
        /**
         * 1. 회원 정보 조회
         * 2. 세션에 회원 정보 유지(로그인 처리)
         * 3. 이메일 기억하기 처리
         */

        String email = form.getEmail();
        // 1. 회원 정보 조회
        MemberVO member = repository.findByEmail(email).orElseThrow(MemberNotFoundException::new);

        // 2. 세션에 회원 정보 유지
        session.setAttribute("loggedMember", member);

        // 3. 이메일 기억하기 처리
        Cookie cookie = new Cookie("savedEmail", email);
        if(form.isSaveEmail()){
            cookie.setMaxAge(60*60*24*7);
        }else {
            cookie.setMaxAge(0);
        }

        response.addCookie(cookie);
    }
}
