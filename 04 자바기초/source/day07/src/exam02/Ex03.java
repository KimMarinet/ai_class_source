package exam02;

public class Ex03 {
    public static void main(String[] args) {
        String s1 = "ABC";
        //String s2 = "ABC";
        String s2 = new String("ABC");

        checkEqual(s1, s2);
    }

    public static void checkEqual(String s1, String s2){
        System.out.println(s1 == s2); // X 주소를 비교하므로 상수가 아닌 경우는 false
        System.out.println(s1.equals(s2)); // O 문자열이 생성되는 출처가 다양하므로 동등성 비교를 해야한다.

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
    }
}
