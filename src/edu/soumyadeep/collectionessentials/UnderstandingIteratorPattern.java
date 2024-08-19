package edu.soumyadeep.collectionessentials;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*Concept of Fail-fast iterators.
   1. iterators not tolerant to underlying changes.
   2. uses an internal modification counter
   3. throws ConcurrentModificationException if modified since last 'next()'. */

class FruitSupplier{
    public Collection<String> getFruits(){
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        return fruits;
    }
}


public class UnderstandingIteratorPattern {
    public static void main(String[] args) {
        FruitSupplier fruitSupplier = new FruitSupplier();
        Collection<String> fruits = fruitSupplier.getFruits();
        Iterator<String> iterator = fruits.iterator();
        while(iterator.hasNext()){
            String getFruitFromIterator = iterator.next();
            if (getFruitFromIterator.equals("Banana")){
                iterator.remove();
            }
            else
                System.out.println(getFruitFromIterator);
        }
    }
}
