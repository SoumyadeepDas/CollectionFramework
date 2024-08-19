package edu.soumyadeep.objectequality;

/*Objects Class

The Objects class is part of the java.util package and was introduced in Java 7. It consists of static utility methods
for operating on objects. These methods include null-safe operations and other helpful methods to reduce boilerplate
code, such as:
    •	equals(Object a, Object b): Returns true if the arguments are equal to each other and false otherwise.
	•	hashCode(Object o): Returns the hash code of a non-null argument and 0 for a null argument.
	•	toString(Object o): Returns the string representation of the object or “null” if the object is null.
    •	requireNonNull(Object obj): Checks that the specified object reference is not null and throws a customized
                                    NullPointerException if it is. */

import java.util.Objects;

class Student{
    private String name;
    private int id;
    private String dept;

    public Student(String name, int id, String dept) {
        this.name = name;
        this.id = id;
        this.dept = dept;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student student)) return false;
        //•	This line checks if the object o is an instance of the Student class.
        // If o is not a Student, the method returns false because the two objects cannot be equal if they are of different types.
        //	•	If o is a Student, it uses pattern matching for instanceof (a feature introduced in Java 16) to cast
        //	o to a Student and binds it to the variable student.

        return getId() == student.getId() && Objects.equals(getName(),
                student.getName()) && Objects.equals(getDept(),
                student.getDept());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getId(), getDept());
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

}

public class UnderstandingObjectEqualityMain {
    public static void main(String[] args) {
        Student student1 = new Student("Foo",1,"CSE");
        Student student2 = new Student("Foo",1,"CSE");

        System.out.println(student1 == student2);
        System.out.println(student1.equals(student2));
    }
}
