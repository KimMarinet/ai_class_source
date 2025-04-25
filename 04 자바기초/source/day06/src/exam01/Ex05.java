package exam01;

public class Ex05 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 2;

        try {
            int result = num1 / num2; // ArithmethicException

            String str = null;
            str = str.toUpperCase(); // 소문자를 대문자로 NullPointerException
            System.out.println(str);
        } catch (RuntimeException e) {
            String message = e.getMessage();
            System.out.println(message);

            if(e instanceof NullPointerException){
                System.out.println("NullPointerException 별도 처리");
            }
        }
    }
}
