package javaLang.collections;

import javaLang.functional.interfaces.MyData;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class MyList {

    public static void main(String[] args) {

        MyData m1 = new MyData(1, "A");
        MyData m2 = new MyData(2, "B");
        ArrayList<MyData> al = new ArrayList<>(Arrays.asList(m1, m2));

        System.out.println(al.removeIf(x -> x.getS().equalsIgnoreCase("A")));
        al.add(1, m1);
        //al.forEach(System.out::println);
        System.out.println(al.get(1));
        System.out.println(al.indexOf(new MyData(2, "B")));
        al.set(1, new MyData(3, "C"));


        // содержит методы очереди

        LinkedList<MyData> ll = new LinkedList<>();
        ll.addFirst(m1);
        ll.addLast(m2);
        System.out.println(ll.getFirst());
    }
}
