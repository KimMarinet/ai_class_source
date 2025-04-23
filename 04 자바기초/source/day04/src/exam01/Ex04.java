package exam01;

public class Ex04 {
    public static void main(String[] args) {
        C c = new C();
        B b = c;
        A a = c;
        System.out.println(a == c);
        System.out.println(b == c);

        System.out.printf("a instanceof C : %s%n", a instanceof C);
        System.out.printf("a instanceof B : %s%n", a instanceof B);
        System.out.printf("a instanceof A : %s%n", a instanceof A);
    }
}
