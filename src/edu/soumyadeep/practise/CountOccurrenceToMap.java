package edu.soumyadeep.practise;

import java.util.*;

public class CountOccurrenceToMap {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of words: ");
        int noOfElements = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < noOfElements; i++) {
            System.out.println("Enter element "+(i+1)+": ");
            String element = sc.nextLine();
            list.add(element);
        }

        Map<String,Integer> map = new HashMap<>();

        Collections.sort(list);

        while(!list.isEmpty()) { //list.size()>0
            String element = list.get(0);
            int count = 0;
            for (int j = 0; j < list.size(); j++){
                if(element.equals(list.get(j))){
                    count++;
                }
            }
            map.put(element,count);
            list.subList(0,count).clear();
        }

        System.out.println(map);
    }
}

class GptSolved{
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "apple", "apple", "banana", "cherry");

        // Create a map to store the frequency of each word
        Map<String, Integer> wordCount = new HashMap<>();

        // Iterate over the list and count the occurrences of each word
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        // Print the result
        System.out.println(wordCount);
    }
}
