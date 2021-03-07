package javaLang.annotations;

import java.lang.reflect.Method;

/**
 * JVM создает элементы как методы интерфейсов,
 * и аннотации как имплементации этих интерфейсов
 */

@AnnotationSpecific("a")
@AnnotationSpecific("b")
public class Test {

    public static void main(String[] args) {

        // обработчик аннотации
        Method[] methods = Test.class.getDeclaredMethods();
        for (Method m : methods) {
            Example annotation = m.getAnnotation(Example.class);
            if (annotation != null) {
                System.out.println(m.getName());
                System.out.println(annotation.i());
            }
        }
    }

    int i;
    String s;

    @Example(value = "qwe", i = 1)  // constructor
    public Test(int i, String s) {
        this.i = i;
        this.s = s;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

    @Example(i = 1, value = "qwe")
    void method() {
        int k = 0;
        System.out.println(k);
    }
}
