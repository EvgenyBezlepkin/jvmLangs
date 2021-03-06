package javaLang.class_design.about_variables;

/**
 * В джава классы обладают состоянием и поведением
 * состояние - это переменные класса, поведение - это методы класса
 * перемнные класса имеют разный уровень видимости -
 * публичные (видимые всем),
 * приватные (видимые только внутри класса)
 * пакетные (видимые внутри пакета)
 * protected (видимые внутр пакета если класс наследует другой класс)
 *
 * статические переменные принадлежат не объекту а классу и вызываются через имя класса
 * как public static final обычно определяются константы
 */

public class Test extends ProtectedSuper{

    public static void main(String[] args) {

        Private p = new Private();
        p.getI();

        Public pub = new Public();
        int i = pub.i;

    }

    void method() {
        boolean b = super.b;                // public
        String s = super.s;                 // protected
        int i = new ProtectedSuper().getI();// private

        char ch1 = ProtectedSuper.ch;       // static public
        char ch2 = ProtectedSuper.ch2;      // static protected
        char ch3 = ProtectedSuper.getCh3(); // static private
    }

}
