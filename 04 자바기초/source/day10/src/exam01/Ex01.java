package exam01;

import java.util.Comparator;
import java.util.List;

public class Ex01 {
    public static void main(String[] args) {
        List<String> items = List.of("Apple", "Orange", "Orange", "Melon", "Mango");
        items.stream().sorted(Comparator.reverseOrder()).distinct().forEach(System.out::println);
    }
}
