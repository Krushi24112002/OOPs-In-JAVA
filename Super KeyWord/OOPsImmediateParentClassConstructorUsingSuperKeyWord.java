//  immediate parent class Constructor (Using Super Key Word)

import java.util.*;

// Creating Parent Class
class Animal {

    // Creating Parent Class Constructor
    Animal() {
        System.out.println("Animal Is Very Important For World");
    }
}

// Creating Sub Class
class Dog extends Animal {

    // Creating Sub Class Constructor
    Dog() {

        super();// Calling Parent Class Constructor
        System.out.println("Dog Is Very Funny Animal");
    }
}

public class OOPsImmediateParentClassConstructorUsingSuperKeyWord {

    public static void main(String[] args) {

        Dog d = new Dog();

    }

}