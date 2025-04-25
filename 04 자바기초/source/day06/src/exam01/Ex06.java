package exam01;

public class Ex06 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 2;

        try {
            int result = num1 / num2; // ArithmethicException

            String str = null;
            str = str.toUpperCase(); // 소문자를 대문자로 NullPointerException
            System.out.println(str);

        } catch (ArithmeticException e) {
            String message = e.getMessage();
            System.out.println(message);
        } catch (Exception e) {
            System.out.println("모르는 예외를 처리할 때 꿀팁!");
        }
    }
}
