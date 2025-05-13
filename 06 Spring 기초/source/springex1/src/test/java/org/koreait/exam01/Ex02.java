package org.koreait.exam01;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.koreait.configs.AppCtx2;
import org.koreait.member.RequestJoin;
import org.koreait.member.RequestLogin;
import org.koreait.member.dao.MemberDao;
import org.koreait.member.entities.MemberVO;
import org.koreait.member.services.JoinService;
import org.koreait.member.services.LoginService;
import org.koreait.person.Greeter;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

@DisplayName("컨테이너 확인")
public class Ex02 {

    @Test
    void test1(){
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx2.class);

        JoinService service = ctx.getBean(JoinService.class);
        LoginService loginService = ctx.getBean(LoginService.class);
        MemberDao memberDao = ctx.getBean(MemberDao.class);

        RequestJoin form = new RequestJoin();
        form.setEmail("user01@test.org");
        form.setName("user01");
        form.setPassword("123456789");

        service.process(form); // 회원 가입 처리

        List<MemberVO> memberVOS = memberDao.getlist();
        memberVOS.forEach(System.out::println);

        RequestLogin requestLogin = new RequestLogin();
        requestLogin.setEmail(form.getEmail());
        loginService.process(requestLogin);

        ctx.close();
    }

    @Test
    void test2(){
        //AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx2.class, DBConfig.class);

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx2.class);

        JoinService service = ctx.getBean(JoinService.class);
        Greeter g1 = ctx.getBean(Greeter.class);

        System.out.println(service);
        System.out.println(g1);

        ctx.close();
    }
}
