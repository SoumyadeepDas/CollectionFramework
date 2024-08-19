package edu.soumyadeep.collectionessentials;


import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class DeDupingUsingHashSetConstructorDemoMain {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add ("Anna");
        list.add ("Bob");
        list.add ("Craig");
        list.add ("Anna");
        list.add ("Bob");
        System.out.println("list = " + list);
        Collection<String> noDuplicates = new HashSet<>(list);
        System.out.println("noDuplicates as set = " + noDuplicates);
        List<String> noDuplicatesSetToListAgain = new ArrayList<>(noDuplicates);
        System.out.println("noDuplicatesSetToListAgain as a list again = " + noDuplicatesSetToListAgain);

    }
}
