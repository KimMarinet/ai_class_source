package exam05;

public class Ex04 {
    public static void main(String[] args) {
        Book b1 = new Book(1000, "책1", "저자1", "출판사1");
        Book b2 = new Book(1000, "책1", "저자1", "출판사1");

        System.out.println(b2.equals(b1));
    }
}
