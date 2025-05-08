package exam03;

import java.time.LocalDate;
import java.time.Period;

public class Ex01 {
    public static void main(String[] args) {
        LocalDate tdoay = LocalDate.now();

        LocalDate date = LocalDate.of(2025,4,2);

        System.out.println(tdoay);
        System.out.println(date);

        Period p = Period.between(tdoay, date);
        System.out.printf("%d, %d, %d", p.getYears(), p.getMonths(), p.getDays());

    }
}
