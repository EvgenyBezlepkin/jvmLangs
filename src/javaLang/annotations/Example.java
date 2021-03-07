package javaLang.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Target - аннотация ставится над аннотацией, показывает над какими элементами можно ставить аннотацию
 */

/**
 * @Retention - аннотация ставится над аннотацией и определяет что делать с последней аннотацией во время компиляции
 * SOURCE - будет отброшено компилятором
 * CLASS - хранится в .class, но недоступно в рантайме
 * RUNTIME - хранится в .class и доступно в рантайме
 */

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
public @interface Example {

    // константа
    public int cons = 1;

    // элементы
    public abstract int i();// required
    int i2() default 10;    // optional

    // value element
    String value() default "root";


}
