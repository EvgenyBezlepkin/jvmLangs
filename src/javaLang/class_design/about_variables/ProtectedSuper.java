package javaLang.class_design.about_variables;

public class ProtectedSuper {

    // basic

    protected String s;
    private int i;
    public boolean b;

    // static

    static char ch;
    static protected char ch2;
    static private char ch3;

    // static final

    static final byte by = 3;
    static final byte by2;
    static {
        by2 = 4;
    }


    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public boolean isB() {
        return b;
    }

    public void setB(boolean b) {
        this.b = b;
    }

    public static char getCh() {
        return ch;
    }

    public static void setCh(char ch) {
        ProtectedSuper.ch = ch;
    }

    public static char getCh2() {
        return ch2;
    }

    public static void setCh2(char ch2) {
        ProtectedSuper.ch2 = ch2;
    }

    public static char getCh3() {
        return ch3;
    }

    public static void setCh3(char ch3) {
        ProtectedSuper.ch3 = ch3;
    }
}
