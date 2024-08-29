package edu.soumyadeep.practise;

import java.util.*;

public class ConvertListToSet {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("Anna");
        list.add("Bob");
        list.add("Carl");
        list.add("Dan");
        list.add("Dan");
        list.add("Dan");
        list.add("Anna");
        list.add("Bob");

        Set<String> set = new LinkedHashSet<>(list);
        System.out.println(set);
    }
}
