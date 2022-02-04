// Java Copy Constructor By Constructor
// Here we are copying the values from one object to the other using the copy constructor

import java.util.*;

public class OOPsCopyConstructor {

    // Creating Class

    static class Person {

        // Creating Properties
        String name;
        int age;

        // Creating Parameterized Constructor
        Person(String PersonName, int PersonAge) {
            name = PersonName;
            age = PersonAge;
        }

        // Creating Copy Constructer
        Person(Person c) {
            name = c.name;
            age = c.age;
        }

        // Creating Class Function
        void PersonDetail() {
            System.out.println(name + " " + age);
        }
    }

    public static void main(String[] args) {

        // Creating Object
        Person FirstPerson = new Person("KRUSHI", 19);

        Person SecondPerson = new Person(FirstPerson);

        Person ThirdPerson = SecondPerson;

        ThirdPerson.PersonDetail();

    }
}