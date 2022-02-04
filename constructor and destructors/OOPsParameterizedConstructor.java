
// Parameterized Constructor

// Definition:A constructor which has a certain number of parameters is called a
// parameterized constructor.

// Purpose of a parameterized constructor:
// The parameterized constructor is used to initialize the object with different-different values.

import java.util.*;

public class OOPsParameterizedConstructor {

    // Creating Class
    static class Person {
        String name;
        int age;

        // Creating Parameterized Constructor
        Person(String Personname, int PersonAge) {
            name = Personname;
            age = PersonAge;
        }

        // Creating Class Function
        void PersonDetail() {
            System.out.println(name + " " + age);
        }

    }

    public static void main(String[] args) {

        // Creating Object
        Person FirstPerson = new Person("KRUSHI", 19);
        Person SecondPerson = new Person("ASHRUTA", 23);

        FirstPerson.PersonDetail();
        SecondPerson.PersonDetail();
    }

}