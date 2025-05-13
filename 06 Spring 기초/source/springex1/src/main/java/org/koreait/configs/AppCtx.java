package org.koreait.configs;

import org.koreait.person.Greeter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration //객체를 관리할 컨테이너 객체임을 알려주는 애너테이션
public class AppCtx {

    @Bean
    public Greeter greeter(){
        return new Greeter();
    }
}
