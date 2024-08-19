package edu.soumyadeep.objectequality;

import java.util.Objects;

class Employee{
    private String name;
    private int age;
    public Employee(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o){
            return true;
        }
        if (o==null || getClass()!= o.getClass()){
            return false;
        }
        Employee employee = (Employee) o;
        return age == employee.age && name.equals(employee.name);

        //if (this == o) return true;
//        if (!(o instanceof Employee employee)) return false; INTELLIJ's IMPLEMENTATION
//        return age == employee.age && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}

public class UnderstandingEqualMethod {
    public static void main(String[] args) {
        Employee employee1 = new Employee("John", 20);
        Employee employee2 = new Employee("John", 20);
        System.out.println(employee1.equals(employee2));
    }
}


