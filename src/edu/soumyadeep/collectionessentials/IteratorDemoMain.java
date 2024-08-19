package edu.soumyadeep.collectionessentials;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemoMain {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
