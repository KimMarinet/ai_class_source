package org.koreait.exam01;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.koreait.configs.AppCtx;
import org.koreait.person.Greeter;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@DisplayName("스프링 컨테이너")
public class Ex01 {

    @Test
    @DisplayName("스프링 컨테이너 내부 객체를 활용하기")
    void test1(){
        //스프링 컨테이너
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx.class);

        Greeter g1 = ctx.getBean(Greeter.class);
        Greeter g2 = ctx.getBean("greeter", Greeter.class);

        System.out.println(g1 == g2);
        //g1.hello("안녕하세요.");

        ctx.close();
    }
}
