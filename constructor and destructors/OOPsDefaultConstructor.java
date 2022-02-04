
// Default Constructor
/*
Basically, the purpose of the default constructor is to provide the default values to the
objects like null, 0, etc. according to the type.
*/

// Basic Important Key Points Related To Constructor Always Remember.
/*
1.A constructor’s name must be exactly the same as the name of its class.
2.The constructor is a special method because it does not have a return type. We
do not even need to write void as the return type
*/

// NOTE:constructor is called as soon as the object is created as constructor initializes the object.
import java.util.*;

public class OOPsDefaultConstructor {

    // Create A Class
    static class Person {

        // Create Class Properties
        int age;
        String name;

        // Create Class Function
        void PersonDetail() {
            System.out.println(age + " " + name);
        }
    }

    public static void main(String[] args) {

        // Creating Object
        Person FirstPerson = new Person();
        FirstPerson.PersonDetail();

    }
}