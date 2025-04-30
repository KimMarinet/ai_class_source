package exam04;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Ex05 {
    public static void main(String[] args) {

        Function<String, Integer> func4 = new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return s.length();
            }
        };

        Function<String, Integer> func1 = s -> s.length();
        UnaryOperator<Integer> fun2 = x -> x*x;

        //위 두 메서드의 기능을 합쳐서 문자열 -> 길이 -> 정수 제곱 결과를 가져오는 함수 생성
        Function<String, Integer> fun3 = func4.andThen(fun2);

        int val = fun3.apply("굿바이");
        System.out.println(val);
    }
}
