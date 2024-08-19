package edu.soumyadeep.collectionessentials;

import java.util.HashSet;
import java.util.Set;

public class SetDemoMain {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("A");
        set.add("B");
        System.out.println("set = " + set);
        set.add("A");
        System.out.println("set = " + set);
        boolean result = set.add("A"); // this is the reason why the add method of a set has a boolean return type.
        System.out.println("result = " + result);

        set.remove("A");
        System.out.println("set = " + set);

        //there's no get() in set !

        System.out.println(set.contains("B"));//just says whether an element is there in the set !
    }
}
