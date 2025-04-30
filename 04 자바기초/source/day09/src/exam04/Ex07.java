package exam04;

import java.util.function.ToIntFunction;

public class Ex07 {
    public static void main(String[] args) {
        ToIntFunction<String> func = Integer::parseInt;
        int val = func.applyAsInt("1234");
        System.out.println(val);
    }
}
