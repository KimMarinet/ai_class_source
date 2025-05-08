package exam01;

import java.util.stream.IntStream;

public class Ex05 {
    public static void main(String[] args) {
        IntStream.range(0,10).forEach(i -> System.out.println((i+1)+"번"));
    }
}
