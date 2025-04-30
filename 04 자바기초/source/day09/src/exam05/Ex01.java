package exam05;

import java.util.function.Supplier;

public class Ex01 {
    public static void main(String[] args) {
        //Supplier<Book> func = () -> new Book();
        //생성자의 메서드 참조
        Supplier<Book> func = Book::new;
    }
}
