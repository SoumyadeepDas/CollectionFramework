package edu.soumyadeep.objectequality;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class StudentNew implements Comparable<StudentNew>{
    private String name;
    private int id;
    private String dept;

    public StudentNew(String name, int id, String dept) {
        this.name = name;
        this.id = id;
        this.dept = dept;
    }

    public String getName() {
        return name;
    }


    public int getId() {
        return id;
    }

    public String getDept() {
        return dept;
    }

    @Override
    public String toString() {
        return "StudentNew{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", dept='" + dept + '\'' +
                '}';
    }

    @Override
    public int compareTo(StudentNew o) {
        return this.id - o.id;
    }
}

public class UnderstandingComparableMain {
    public static void main(String[] args) {
        StudentNew student1 = new StudentNew("Foo",1,"CSE");
        StudentNew student2 = new StudentNew("Bar",2,"ECE");
        StudentNew student3 = new StudentNew("Charlie",3,"IT");
        StudentNew student4 = new StudentNew("Denver",4,"AIML");

        List<StudentNew> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);

        students.sort(new StudentNewDeptComparator());

        System.out.println(students);


    }
}

class StudentNewDeptComparator implements Comparator<StudentNew> {
    @Override
    public int compare(StudentNew o1, StudentNew o2) {
        return o1.getDept().compareTo(o2.getDept());
    }
}

