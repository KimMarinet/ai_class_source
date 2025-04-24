package exam02;

public class Ex01 {
    public static void main(String[] args) {
        Outer1 out = new Outer1(); // 외부 클래스의 객체화 = 이제 내부 클래스 객체화 가능
        Outer1.Inner in = out.new Inner();
        in.method();
    }
}
