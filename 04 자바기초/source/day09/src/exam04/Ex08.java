package exam04;

import java.util.function.BiPredicate;

public class Ex08 {
    public static void main(String[] args) {
        BiPredicate<String, String> a = (s1, s2) -> s1.equals(s2);
        BiPredicate<String, String> b = String::equals;

        boolean result = b.test("안녕", "안2녕");
        System.out.println(result);
    }
}
