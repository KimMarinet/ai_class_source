package exam01;

import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex03 {
    public static void main(String[] args) {
        List<Integer> scores = List.of(90, 88, 100, 60, 55, 78);
        Stream<Integer> stmt = scores.stream();

        IntStream stm2 = stmt.mapToInt(s->s);
        double avg = stm2.average().getAsDouble();
    }
}
