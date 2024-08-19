package edu.soumyadeep.collectionessentials;

import java.util.ArrayList;
import java.util.List;

public class SubListDemoMain {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        list.add("F");
        list.add("G");
        list.add("H");
        
        List<String> subList = list.subList(1, 4);
        System.out.println("subList = " + subList);

        //Innovative way to remove a range of elements:
        list.subList(1, 4).clear();
        System.out.println("After removal NewList = " + list);
    }
}
