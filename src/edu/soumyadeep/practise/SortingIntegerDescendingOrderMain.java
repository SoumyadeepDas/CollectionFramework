package edu.soumyadeep.practise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class TakeInput{
    private List<Integer> list;
    public void takeInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of integers: ");
        int noOfElements = sc.nextInt();
        list = new ArrayList<>();
        for (int i = 0; i < noOfElements; i++) {
            System.out.println("Enter element " + (i + 1) + ": ");
            int element = sc.nextInt();
            list.add(element);
        }
        SortListInDescendingOrder.sortList(list);
    }
}

class SortListInDescendingOrder{
    public static void sortList(List<Integer> list){
        Collections.sort(list,(a,b)->b-a);
        ListPrinterService<Integer> obj = new ListPrinterService<>(list);
        obj.print();
    }

}

class ListPrinterService<E>{
    private List<E> list;
    public ListPrinterService(List<E> list){
        this.list = list;
    }
    public void print(){
        System.out.println("List after operation: "+list);
    }
}
public class SortingIntegerDescendingOrderMain {
    public static void main(String[] args) {
        TakeInput takeInput = new TakeInput();
        takeInput.takeInput();
    }

}
