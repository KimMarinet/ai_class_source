package exam01;

public class Ex01 {
    public static void main(String[] args) {
        Book b1 = new Book(1000, "책1", "저자1", "출판사1");
        Book b2 = new Book(1000, "책1", "저자1", "출판사1");
        System.out.println(b1 == b2);
        System.out.println(b1.equals(b2));

        System.out.printf("b1 address: %d%n", System.identityHashCode(b1));
        System.out.printf("b2 address: %d%n", System.identityHashCode(b2));
    }
}
