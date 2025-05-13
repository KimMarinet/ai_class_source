package org.koreait.member.dao;

import org.koreait.member.entities.MemberVO;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class MemberDao {
    private Map<String, MemberVO> members = new HashMap<>();

    public void register(MemberVO member){
        member.setRegDt(LocalDateTime.now());
        members.putIfAbsent(member.getEmail(), member);
    }

    public MemberVO get(String email){
        return members.get(email);
    }

    public List<MemberVO> getlist(){
        return new ArrayList<>(members.values());
    }
}
