package exam06;

import java.util.Arrays;
import java.util.Comparator;

public class Ex01 {
    public static void main(String[] args) {
        String[] fruits = {"사과", "오렌지", "멜론", "망고"};

        Arrays.sort(fruits, Comparator.reverseOrder());
        System.out.println(Arrays.toString(fruits));
    }
}
