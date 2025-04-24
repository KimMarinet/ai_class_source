package exam03;

public class Ex09 {
    public static void main(String[] args) {
        byte num1 = 100;
        int num2 = num1;

        int num3 = 10000;
        byte num4 = (byte) num3; // 강제 형변환

        System.out.println(num4);
    }
}
