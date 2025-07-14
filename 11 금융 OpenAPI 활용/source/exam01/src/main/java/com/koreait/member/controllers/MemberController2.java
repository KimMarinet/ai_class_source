package com.koreait.member.controllers;

import com.koreait.member.entities.Member;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.IntStream;

@RestController
@RequestMapping("/api/v1/member")
public class MemberController2 {
    @GetMapping
    public List<Member> info() {
        List<Member> members = IntStream.rangeClosed(1, 10)
                .mapToObj(i -> Member.builder()
                        .seq(Long.valueOf(i))
                        .email("user" + i + "@test.org")
                        .password("12345678")
                        .name("사용자" + i)
                        .createdAt(LocalDateTime.now())
                        .build()).toList();


        return members;
    }
//    @GetMapping("")
//    private Member info(){
//        return Member.builder()
//                .seq(1L)
//                .email("user01@test.org")
//                .name("user01")
//                .password("12345678")
//                .createdAt(LocalDateTime.now())
//                .build();
//    }
}