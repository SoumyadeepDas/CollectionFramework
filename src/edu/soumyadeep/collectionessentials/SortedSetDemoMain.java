package edu.soumyadeep.collectionessentials;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetDemoMain {
    public static void main(String[] args) {
        //SortedSet is an interface and TreeSet is the implementation class.
        SortedSet<String> vocab = new TreeSet<>();
        vocab.add("mango");
        vocab.add("banana");
        vocab.add("pineapple");
        vocab.add("apple");
        vocab.add("zebra");
        System.out.println("vocab = " + vocab);
        //The first(), last(), headSet(),tailSet(); these are the methods declared in the SortedSet interface.
        String firstWord = vocab.first();
        String lastWord = vocab.last();
        //Finding all the words upto (before) pineapple
        SortedSet<String> subset1 = vocab.headSet("pineapple"); // exclusive of pineapple
        SortedSet<String> subset2 = vocab.tailSet("pineapple"); // inclusive of pineapple

        System.out.println("firstWord = " + firstWord);
        System.out.println("lastWord = " + lastWord);
        System.out.println("subset1 upto pineapple =  " + subset1);
        System.out.println("subset2 after pineapple = " + subset2);
    }
}
