/*
1. If a class is public then the name of .java file should be the name of public class
   if no public class it can be named anything
2. public class means it can be accessed from other classes
3 . import statement are used to add other classes and interfaces in given class
     explicit using import statement should be used to in readability
     explicit means -->import java.util.ArrayList(highly preferable)  implicit---> import java.utli.*;
 4. class is named group of properties and functions. object is the isntance of that class to which
    we assign real values, class is basically a template.
 */

public class Basics {
    public static void main(String[] args) {
        Student ayush = new Student();
        ayush.roll = 12;
        ayush.name = "singh";
        System.out.println(ayush.roll + ayush.name);

        Student a = new Student(2, "a");
        System.out.println(a.name + a.roll);
    }


}

class Student {
    int roll;
    String name;

    Student() { //default constructure
        this.roll = 0;
        this.name = name;
        System.out.println("default c is called");
    }

    Student(int roll, String name) { //parameterised constructor
        this.roll = roll;
        this.name = name;
        System.out.println("parameterised c is called");
    }

}
