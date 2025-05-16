package exam01;

import org.junit.jupiter.api.Test;
import org.koreait.member.controllers.RequestJoin2;

public class Ex01 {
    @Test
    void test1(){
        RequestJoin2 data = new RequestJoin2("user01@test.org", "1234", "user01", true);
        System.out.println(data. email());
        System.out.println(data.name());
    }
}
