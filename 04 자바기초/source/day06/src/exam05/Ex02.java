package exam05;

public class Ex02 {
    public static void main(String[] args) {
        Book b1 = new Book(1000, "책1", "저자1", "출판사1");
        int hashcode = b1.hashCode();
        System.out.println(hashcode);
        System.out.println(System.identityHashCode(b1));
    }
}
