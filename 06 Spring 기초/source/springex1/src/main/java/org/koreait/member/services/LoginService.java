package org.koreait.member.services;

import org.koreait.member.RequestLogin;
import org.koreait.member.dao.MemberDao;
import org.koreait.member.entities.MemberVO;
import org.koreait.member.validators.LoginValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.format.DateTimeFormatter;

@Service
public class LoginService {
    @Autowired
    private LoginValidator validator;
    @Autowired
    private MemberDao memberDao;

    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM.dd");

    @Autowired(required = false)
    public void setFormatter(DateTimeFormatter formatter) {
        this.formatter = formatter;
    }

    public void process(RequestLogin form){
        validator.validate(form);
        MemberVO memberVO = memberDao.get(form.getEmail());

        if(memberVO != null && formatter != null){
            String dateStr = formatter.format(memberVO.getRegDt());
            memberVO.setRegDtStr(dateStr);
        }

        System.out.println(memberVO);
        System.out.println("로그인 완료");
    }
}
