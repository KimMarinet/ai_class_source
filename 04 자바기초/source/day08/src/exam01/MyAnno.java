package exam01;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD, ElementType.TYPE, ElementType.CONSTRUCTOR})
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnno {
    int min() default 10; // 최솟값 추가 정보(설정)
    int[] max() default {100, 200}; // 최대값 추가 정보(설정)

    String value();
}
