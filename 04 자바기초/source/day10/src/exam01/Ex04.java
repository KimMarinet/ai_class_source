package exam01;

import java.util.Arrays;
import java.util.Comparator;

public class Ex04 {
    public static void main(String[] args) {
        int[] scores = {90, 88, 100, 60, 55, 78};
        int[] scores2 = Arrays.stream(scores).sorted().toArray();
        System.out.println(Arrays.toString(scores2));

        int[] scores3 = Arrays.stream(scores).boxed().sorted(Comparator.reverseOrder()).mapToInt(s->s).toArray();
        System.out.println(Arrays.toString(scores3));
    }
}
