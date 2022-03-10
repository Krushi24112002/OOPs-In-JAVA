// Single Inheritance in Java(OOPS)

import java.util.*;

// Creating  Class A
class Animal {

    // Creating Class A Properties
    public int Weight;
    public int Age;

    // Creating Class A Function
    public void AnimalDetails() {
        System.out.println(Weight + " " + Age);
    }
}

// Creating Class B Using extend KeyWord
class Dog extends Animal {

}

public class OOPsSingleInheritance {

    public static void main(String[] args) {

        // Creating Class B Object Using New KeyWord
        Dog obj1 = new Dog();
        obj1.Weight = 78;
        obj1.Age = 45;

        obj1.AnimalDetails();

    }
}