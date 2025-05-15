package exam01;

import org.junit.jupiter.api.Test;
import org.koreait.proxy.Calculator;
import org.koreait.proxy.ImpCalculator;
import org.koreait.proxy.PerformCalculator;
import org.koreait.proxy.RecCalculator;

public class Ex02 {
    @Test
    void test1(){
        long stime = System.nanoTime();
        ImpCalculator cal1 = new ImpCalculator();
        long result1 = cal1.factorial(20L);
        long etime = System.nanoTime();

        System.out.println(result1);
        System.out.println(etime-stime);

        stime = System.nanoTime();
        RecCalculator cal2 = new RecCalculator();
        long result2 = cal2.factorial(20L);
        etime = System.nanoTime();

        System.out.println(result2);
        System.out.println(etime-stime);
    }

    @Test
    void test2(){
        Calculator cal1 = new PerformCalculator(new ImpCalculator());
        Calculator cal2 = new PerformCalculator(new RecCalculator());

        System.out.println(cal1.factorial(10L));
        System.out.println(cal2.factorial(10L));
    }
}
