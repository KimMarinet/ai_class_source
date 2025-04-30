package exam05;

import java.util.function.IntSupplier;

public class Ex03 {
    public static void main(String[] args) {
        Book book = new Book();
        //book.setIsbn(1000);

        IntSupplier func = book::getIsbn;
    }
}
