package exam01;

public class Ex02 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 0;

        try {
            int result = num1/num2;
            System.out.println(result);
        }catch (ArithmeticException e){
            //System.out.println("예외처리");
            String message = e.getMessage();
            System.out.println(message);
            e.printStackTrace();
        }
        System.out.println("매우 중요한 코드");
    }
}
