package exam02;

public class Outer1 {
    private int num1 = 150;
    private int num2 = 200;
    // 인스턴스 내부 클래스
    class Inner{
        private int num1 = 100;
        public void method(){
            System.out.println("인스턴스 내부 클래스");
            System.out.println(num1);
            System.out.println(num2);
            System.out.println(Outer1.this.num1);
        }
    }
}
