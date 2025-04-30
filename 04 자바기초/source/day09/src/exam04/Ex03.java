package exam04;

import java.util.function.Function;

public class Ex03 {
    public static void main(String[] args) {
        // 둘다 항등 함수 표현 방법!!
        Function<String, String> func1 = x -> x;
        Function<String, String> func2 = Function.identity();
    }
}
