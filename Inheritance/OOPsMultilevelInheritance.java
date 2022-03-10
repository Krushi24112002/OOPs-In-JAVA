// Multi-level Inheritance

import java.util.*;

// Creating calss A
class Animal {

    // Creating Class A Properties
    public int Weight;
    public int Age;

    // Creating Class A Function
    public void AnimalDetails() {
        System.out.println(Weight + " " + Age);
    }
}

// Creating Class B
class Dog extends Animal {

}

// Creating Class C
class GermanShepherd extends Dog {

}

public class OOPsMultilevelInheritance {

    public static void main(String[] args) {

        // Creating Class C Object Using New KeyWord
        GermanShepherd obj1 = new GermanShepherd();

        obj1.Weight = 90;
        obj1.Age = 34;

        obj1.AnimalDetails();

    }
}
