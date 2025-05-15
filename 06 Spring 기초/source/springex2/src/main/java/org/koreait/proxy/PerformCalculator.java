package org.koreait.proxy;

public class PerformCalculator implements Calculator{
    private Calculator calculator;

    public PerformCalculator(Calculator calculator){
        this.calculator = calculator;
    }

    @Override
    public long factorial(long num) {
        long stime = System.nanoTime();
        try{
            long result = calculator.factorial(num);

            return result;
        }finally {
            long etime = System.nanoTime();
            System.out.println(etime - stime);
        }
    }
}
