package exam03;

public class Ex06 {
    public static void main(String[] args) {
        int num1 = 1000000000;// 정수면 무조건 int부터 자료형을 결정 -> int가 아니면 long으로 변환

        long num2 = 10000000000L; // 기본적으로 처음에는 long 선언 후에도 int로 인식하고 있어서 오류 처리가 적용됨 -> L을 뒤에 붙여 처음부터 long으로 선언하면 간단 처리~!
        long num3 = 10_000_000_000L; // 가독성을 높히기 위한 선언 방법
    }
}
