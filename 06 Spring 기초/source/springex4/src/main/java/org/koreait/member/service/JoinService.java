package org.koreait.member.service;

import lombok.RequiredArgsConstructor;
import org.koreait.member.controllers.RequestJoin;
import org.koreait.member.entities.MemberVO;
import org.koreait.member.repositories.MemberRepository;
import org.mindrot.jbcrypt.BCrypt;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class JoinService {
    private final MemberRepository repository;

    public void process(RequestJoin form){
        MemberVO memberVO = new MemberVO();

        String hash = BCrypt.hashpw(form.getPassword(), BCrypt.gensalt(12));

        memberVO.setEmail(form.getEmail());
        memberVO.setPassword(hash);
        memberVO.setName(form.getName());
        memberVO.setMobile(form.getMobile());
        memberVO.setRegDt(LocalDateTime.now());

        repository.save(memberVO);
    }
}
