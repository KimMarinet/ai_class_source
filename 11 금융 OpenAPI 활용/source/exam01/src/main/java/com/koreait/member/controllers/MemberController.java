package com.koreait.member.controllers;

import com.koreait.global.exceptions.BadRequestException;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/member")
public class MemberController {

    @PostMapping("/join2")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void join(@Valid RequestJoin form, Errors errors) {
        if (errors.hasErrors()) {
            throw new BadRequestException(errors);
        }

        System.out.println(form);
    }

    @PostMapping("/login")
    public void login() {
        boolean result = false;
        if (!result) {
            throw new IllegalArgumentException("잘못된 요청...");
        }
    }
}