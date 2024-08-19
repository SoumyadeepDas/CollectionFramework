package edu.soumyadeep.collectionessentials;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemoMain {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("Anna");
        list.add("Bob");
        list.add("Charlie");
        list.add("David");

        System.out.println("Old list = " + list);

        replace(list,"Anna","Soumyadeep");
    }

    public static <String> void replace(List<String> list, String value, String newValue) {
        for (ListIterator<String> iterator = list.listIterator(); iterator.hasNext();) {
            if (value.equals(iterator.next())) {
                iterator.set(newValue);
            }
        }
        System.out.println("New after replace: list = " + list);
    }
}
