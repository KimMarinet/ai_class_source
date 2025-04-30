package exam01;

import java.util.ArrayList;
import java.util.List;


public class Ex01 {
    public static void main(String[] args) {
//        Calculator cal = new Calculator() {
//            @Override
//            public int add(int num1, int num2) {
//                return num1 + num2;
//            }
//        };

        Calculator cal = (num1, num2) -> num1 + num2;

        List<String> items = List.of("Apple", "Orange", "Melon");

        int result = cal.add(10, 20);
        System.out.println(result);
    }
}
