package edu.soumyadeep.collectionessentials;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("John");
        names.add("Jane");

        System.out.println("names = " + names);

        names.add("John");
        System.out.println("names = " + names);

        names.set(2,"Soumya");
        System.out.println("names = " + names);

        System.out.println(names.get(2));

        //System.out.println(names.get(100)); throws index out of bounds exception
        
        names.add(1,"Shirsak");

        System.out.println("names = " + names);

        names.remove(3);
        System.out.println("names = " + names);

        names.remove("Jane");
        System.out.println("names = " + names);
    }
}
