package exam05;

import java.util.List;

public class Ex04 {
    public static void main(String[] args) {
        List<String> items = List.of("이름1", "이름2", "이름3");

        items.forEach(System.out::println);
    }
}
