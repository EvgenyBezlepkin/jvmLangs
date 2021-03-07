package javaLang.functional.interfaces;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class Test {

    public static void main(String[] args) {

        // реализация функционального интерфейса с помощью анонимного класса

        MyFI func = new MyFI() {
            @Override
            public MyData test(int i, String s) {
                return new MyData(i, s);
            }
        };

        // с помощью лямбды

        MyFI func1 = (int i, String s) -> new MyData(i, s);

        //  с помощью ссылки на метод

        MyFI func2 = MyData::new;

        System.out.println(func1.test(1, "new"));
        System.out.println(func2.test(1, "new"));

        MyFI func3 = Test::method;
        System.out.println(func3.test(2, "g"));
    }

    static MyData method(int i, String s) {
        return new MyData(i, s);
    }
}
