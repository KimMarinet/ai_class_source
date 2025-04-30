package exam04;

import java.util.function.IntPredicate;

public class Ex06 {
    public static void main(String[] args) {
        IntPredicate cond1 = x -> x >= 130;
        IntPredicate cond2 = x -> x <= 190;

        IntPredicate cond3 = cond1.and(cond2);

        IntPredicate cond4 = cond3.negate(); // 연산 결과를 반대로 바꿔~

        boolean result1 = cond3.test(120);
        boolean result2 = cond3.test(200);
        boolean result3 = cond3.test(160);

        System.out.printf("%s, %s, %s", result1, result2, result3);
    }
}
