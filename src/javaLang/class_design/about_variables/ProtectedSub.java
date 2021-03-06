package javaLang.class_design.about_variables;

public class ProtectedSub extends ProtectedSuper {

    void method() {
        boolean b = super.b;
        String s = super.s;
        int i = new ProtectedSuper().getI();
    }
}
