package exam02;

import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.toMap;

public class Ex03 {
    public static void main(String[] args) {
        List<Book> items = List.of(
            new Book(1000, "책1", "저자1"),
            new Book(1001, "책2", "저자2"),
            new Book(1002, "책3", "저자2"),
            new Book(1003, "책4", "저자3"),
            new Book(1004, "책5", "저자3")
        );

        Map<Integer, Book> items2 = items.stream().collect(toMap(Book::getIdbn, b->b));

        items2.forEach((k, v) -> System.out.printf("%s, %s%n", k, v));
    }
}
