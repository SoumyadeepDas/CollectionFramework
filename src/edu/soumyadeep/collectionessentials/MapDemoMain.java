package edu.soumyadeep.collectionessentials;


import java.util.HashMap;
import java.util.Map;

/*1. Map and EntrySet: A Map<K, V> is a collection of key-value pairs. The entrySet() method of a Map returns a
     Set<Map.Entry<K, V>>, where each Map.Entry<K, V> represents one key-value pair in the map.
  2. Map.Entry<K, V>: Map.Entry<K, V> is a nested interface within Map. It represents a single key-value pair in the Map.
     Each Map.Entry<K, V> has methods like getKey() and getValue() to access the key and value, respectively.
  3. toString() Method in Map.Entry<K, V>: The toString() method is defined in the Object class and is usually overridden
     in many classes to provide a meaningful string representation of the object. In the case of Map.Entry<K, V>, it provides
     a string representation in the format key=value.
  4. Putting It All Together: When you iterate over the entrySet() and use System.out::println, this is what happens:
                              students.entrySet().forEach(System.out::println);
                               Internally:

                                1.	entrySet():
                                    •	students.entrySet() returns a Set<Map.Entry<String, Integer>>.
                                    •	This set contains objects of type Map.Entry<String, Integer>.
                                2.	forEach Loop:
                                    •	forEach(System.out::println) iterates over each Map.Entry<String, Integer> in the set.
                                    •	For each Map.Entry, it passes the entry to System.out::println.
                                3.	System.out::println:
                                    •	System.out::println receives an object of type Map.Entry<String, Integer>.
                                    •	It calls the toString() method of the Map.Entry object.
                                    •	The toString() method of Map.Entry returns a string in the format key=value.
                                4.	Output:
                                    •	The string returned by toString() (e.g., "Alice=85", "Bob=90", etc.) is printed to
                                        the console.
 */

public class MapDemoMain {
    public static void main(String[] args) {
        Map<Integer, NewStudent> students = new HashMap<>();
        
        NewStudent student1 = new NewStudent("Foo",1,"CSE");
        NewStudent student2 = new NewStudent("Zoo",2,"BSE");
        NewStudent student3 = new NewStudent("Koo",3,"ESE");
       
        students.put(student1.getId(),student1);
        students.put(student2.getId(),student2);
        students.put(student3.getId(),student3);

        System.out.println("students = " + students);

        System.out.println(students.get(1));

        //students.put(4,null);// this is a very bad practice as it doesn't clearly indicate whether the key is present
                                // and no value is mapped or any key is not present only.

        //System.out.println(students.get(4));//both case returns null
        //System.out.println(students.get(5));// this also returns null

        //Iterating via keys & getting the value
        System.out.println("The values are: ");
        for (Integer key : students.keySet()) {
            System.out.println(students.get(key));
        }

        //Iterating via keys & getting the key itself
        System.out.println("The keys are: ");
        for (Integer key : students.keySet()){
            System.out.println(key);
        }

        //Iterating via direct values:
        System.out.println("The values are using the value method: ");
        for (Integer key : students.keySet()) {
            System.out.println(students.values());
        }

        //Getting both the keys and values:
        System.out.println("Printing both the key and values: ");
        for (Map.Entry<Integer,NewStudent> entry : students.entrySet()){
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        System.out.println();
        System.out.println();
        System.out.println("Printing both the key and values: "); //In the entrySet() approach, System.out::println
        // works because each entry is a Map.Entry<K, V>, and the toString() method of Map.Entry already formats the
        // output as key=value.
        students.entrySet().forEach(System.out::println);
        System.out.println();
        System.out.println();

        //It tries to find the key 100/whatever is provided, if no such key is found, it returns the value newly initialised
        System. out. println(students.getOrDefault(100, new NewStudent("Test", 100,"Commerce")));

        //first it searches for the key 5/whatever, if it is not found, it puts the key value pair in the map
        students.putIfAbsent(5, new NewStudent("Test", 5,"RCE"));
        System.out.println("Printing the new Map: ");
        System.out.println(students);

        //Printing using foreach loop
        System.out.println("Printing both the key and values using for each: ");
        students.forEach((key, value) -> System.out.println(key + " -> " + value));

        //if the key 4/whatever is not found, java runs the lambda expression mapped to key variable and create a new key with 4.
        students.computeIfAbsent (4, key -> new NewStudent("Test",key,"BCA"));
        System.out.println(students.get(4));
    }
}

class NewStudent {
    private String name;
    private int id;
    private String course;

    public NewStudent(String name, int id, String course) {
        this.name = name;
        this.id = id;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }


    public String getCourse() {
        return course;
    }

    @Override
    public String toString() {
        return "NewStudent{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", course='" + course + '\'' +
                '}';
    }
}
