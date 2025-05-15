package org.koreait.proxy3;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;

@Aspect
@Order(2)
public class Performance3Calculator {

//    @Pointcut("excution(* org.koreait.proxy.*.*(long))")
//    public void publicTarget(){
//    }

    //@Around("publicTarget()")
    //@Around("org.koreait.proxy3.CommonPointcut.publicTarget()")
    @Around("CommonPointCut.publicTarget()") // 동일 패키지 내 있는 경우
    public Object process(ProceedingJoinPoint joinPoint) throws Throwable{
        long stime = System.nanoTime();
        try {
            Object result = joinPoint.proceed(); // 핵심 기능을 대신 수행
            return result;
        }finally {
            long etime = System.nanoTime();
            System.out.println(etime - stime);
        }
    }
}
