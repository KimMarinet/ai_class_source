package exam02;

public class Ex04 {
    public static void main(String[] args) {
        String str1 = "ABC"; // 공간한정 상태 fianl 선언되어 있음
        System.out.println(System.identityHashCode(str1));

        String str2 = "DEF";
        System.out.println(System.identityHashCode(str2));

        str1 += str2;
        str1 += "GHI";

        System.out.println(str1);
        System.out.println(System.identityHashCode(str1));
    }
}
