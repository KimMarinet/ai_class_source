package exam02;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ex04 {
    public static void main(String[] args) {
        List<Book> items = List.of(
                new Book(1000, "책1", "저자1"),
                new Book(1001, "책2", "저자2"),
                new Book(1002, "책3", "저자2"),
                new Book(1003, "책4", "저자3"),
                new Book(1004, "책5", "저자3")
        );

        Map<Boolean, List<Book>> items2 = items.stream().collect(Collectors.partitioningBy(b -> b.getIdbn() <= 1002));

        List<Book> items3 = items2.get(true);
        items3.forEach(System.out::println);
    }
}
