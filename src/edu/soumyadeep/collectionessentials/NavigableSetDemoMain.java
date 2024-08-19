package edu.soumyadeep.collectionessentials;

import java.time.LocalDateTime;
import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetDemoMain {
    /*NavigableSet is an interface that extends the SortedSet interface. */
    public static void main(String[] args) {
        NavigableSet<LocalDateTime> appointments = new TreeSet<>();
        appointments.add(LocalDateTime.of(2024, 8, 11, 10, 30));
        appointments.add(LocalDateTime.of(2024, 8, 11, 12, 32));
        appointments.add(LocalDateTime.of(2024, 8, 11, 11, 40));

        System.out.println(appointments.ceiling(LocalDateTime.of(2024, 8, 11, 11, 32)));

    }
}