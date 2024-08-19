package edu.soumyadeep.collectionessentials;

import java.util.ArrayList;
import java.util.List;

public class ArrayListConstructorDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Grapes");

        List<String> demoArrayListConstructor = new ArrayList<>(list);
        demoArrayListConstructor.add("'Apple' added by demoArrayListConstructor variable");
        System.out.println(demoArrayListConstructor);
    }
}
