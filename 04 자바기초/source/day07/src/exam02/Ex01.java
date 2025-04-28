package exam02;

public class Ex01 {
    public static void main(String[] args) {
        String str1 = "ABC";
        String str2 = "ABC";

        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));

        System.out.printf("str1 hash : %d%n", System.identityHashCode(str1));
        System.out.printf("str2 hash : %d%n", System.identityHashCode(str2));
    }
}
