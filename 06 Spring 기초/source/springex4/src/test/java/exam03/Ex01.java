package exam03;

import org.junit.jupiter.api.Test;
import org.koreait.global.configs.MVCConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.test.context.junit.jupiter.web.SpringJUnitWebConfig;

import java.util.Locale;

@SpringJUnitWebConfig(MVCConfig.class)
public class Ex01 {
    @Autowired
    private MessageSource ms;
    private Locale locale = Locale.ENGLISH;

    @Test
    void test1(){
        String email = ms.getMessage("email", null, locale);
        System.out.println(email);
    }

    @Test
    void test2(){
        //commons.properties 내 login의 0번과 1번에 각각 치환될 값
        Object[] args = {"사용자01", "user01@test.org"};

        String loginMsg = ms.getMessage("LOGIN_MSG", args, locale);
        System.out.println(loginMsg);
    }
}
