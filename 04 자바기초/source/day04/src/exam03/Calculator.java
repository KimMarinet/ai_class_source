package exam03;

public abstract class Calculator {
    int num = 100;

    public void commonMethod(){
        System.out.println("하위 클래스가 공유하는 기능");
    }

    public abstract int add(int num1, int num2);
}
