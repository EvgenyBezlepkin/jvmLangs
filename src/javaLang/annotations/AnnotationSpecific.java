package javaLang.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.Inherited;
import java.lang.annotation.Repeatable;

/**
 * @Inherited - метааннотация, наследуемый класс будет содержать те же аннотации
 */

/**
 * @Repeatable - метааннотация,
 * 1 создать контейнер
public @interface AnnotationSpecifics {
AnnotationSpecific[] value();
}
 * 2 создать аннотацию
@Repeatable(AnnotationSpecifics.class)
public @interface AnnotationSpecific {
String value() default "";
}
 */


//@Documented
//@Inherited
@Repeatable(AnnotationSpecifics.class)
public @interface AnnotationSpecific {
    String value() default "";
}
