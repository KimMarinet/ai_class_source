package exam04;

import java.util.function.BinaryOperator;
import java.util.function.IntBinaryOperator;

public class Ex02 {
    public static void main(String[] args) {
        IntBinaryOperator cal = (a, b) -> a+b;
        System.out.println(cal.applyAsInt(10,20));

    }
}
