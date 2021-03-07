package javaLang.functional.interfaces;

import java.util.Objects;

public class MyData {

    int i;
    String s;

    public MyData(int i, String s) {
        this.i = i;
        this.s = s;
    }

    public MyData() {
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

    @Override
    public String toString() {
        return "MyData{" +
                "i=" + i +
                ", s='" + s + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyData myData = (MyData) o;
        return i == myData.i &&
                Objects.equals(s, myData.s);
    }

    @Override
    public int hashCode() {
        return Objects.hash(i, s);
    }
}
