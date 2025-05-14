package org.koreait.member.services;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.koreait.member.RequestJoin;
import org.koreait.member.dao.MemberDao;
import org.koreait.member.entities.MemberVO;
import org.koreait.member.validators.JoinValidator;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class JoinService {
    @NonNull
    private JoinValidator validator;
    private final MemberDao memberDao;

//    public JoinService(JoinValidator validator, MemberDao memberDao) {
//        this.validator = validator;
//        this.memberDao = memberDao;
//    }

    //    @Autowired
//    public void setValidator(JoinValidator validator){
//        this.validator = validator;
//    }
//
//    @Autowired
//    public void setMemberDao(MemberDao memberDao){
//        this.memberDao = memberDao;
//    }

    public void process(RequestJoin form){
        validator.validate(form); // 유효성 검사

        MemberVO member = new MemberVO();
        member.setEmail(form.getEmail());
        member.setName(form.getName());
        member.setPassword(form.getPassword());

        memberDao.register(member); // 회원 데이터를 데이터베이스에 추가
    }
}
