package exam03;

public class Ex05 {
    public static void main(String[] args) {
        A a = new A(){
            @Override
            void methodA() {
                System.out.println("재정의 methodA");
            }
        };
        a.methodA();
    }
}